
import com.netty.qqw.entity.WhResult;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;

public class NettyScoketClienTest {
    String host = "192.168.1.86";
    int port = 9006;
    int maxFrameLength = 10;
    public void show(){
        EventLoopGroup workGroup = new NioEventLoopGroup();
        Bootstrap bootstrap =new Bootstrap();
        try {
            ChannelFuture channelFuture = bootstrap
                    .group(workGroup)
                    .handler(new LoggingHandler(LogLevel.DEBUG))//设置日志
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .option(ChannelOption.SO_KEEPALIVE,true)
                    //.handler(gameClientChannleInitializer)
                    .handler(new ChannelInitializer<NioSocketChannel>() {
                        @Override
                        protected void initChannel(NioSocketChannel socketChannel) throws Exception {
                            int maxLength = 1200;//maxFrameLength：解码的帧的最大长度
                            int lengthFieldOffset = 0;//lengthFieldOffset：长度属性的起始位（偏移位），包中存放有整个大数据包长度的字节，这段字节的其实位置
                            int lengthFieldLength = 4;//lengthFieldLength：长度属性的长度，即存放整个大数据包长度的字节所占的长度
                            int lengthAdjustmen = 0;//lengthAdjustmen：长度调节值，在总长被定义为包含包头长度时，修正信息长度。
                            int initialBytesToStrip= 4;//initialBytesToStrip：跳过的字节数，根据需要我们跳过lengthFieldLength个字节，以便接收端直接接受到不含“长度属性”的内容
                            boolean failFast = false;//failFast ：为true，当frame长度超过maxFrameLength时立即报TooLongFrameException异常，为false，读取完整个帧再报异常
                            ChannelPipeline pipeline = socketChannel.pipeline();
                            //pipeline.addLast("framer", new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));
                            pipeline.addLast("frame", new LengthFieldBasedFrameDecoder(maxLength, lengthFieldOffset, lengthFieldLength, lengthAdjustmen, initialBytesToStrip,failFast));

                            pipeline.addLast("decoder", new StringDecoder());
                            pipeline.addLast("encoder", new StringEncoder());
                            pipeline.addLast("idleStateHandler", new IdleStateHandler(0, 0, 20));
                           /* pipeline.addLast("whResult", new SimpleChannelInboundHandler<String>() {
                                @Override
                                protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
                                    System.out.println(s);
                                }
                            });*/
                            pipeline.addLast("GameTcpResult",new ChannelInboundHandlerAdapter(){
                                @Override
                                public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                    System.out.println(msg);
                                }
                            });

                        }
                    })
                    .connect(host, port).sync();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            LengthFieldBasedFrameDecoder.Cumulator cumulator = new LengthFieldBasedFrameDecoder.Cumulator() {
                @Override
                public ByteBuf cumulate(ByteBufAllocator byteBufAllocator, ByteBuf byteBuf, ByteBuf byteBuf1) {
                    return null;
                }
            };
            Channel channel = channelFuture.channel();
            while(true){
                String s = in.readLine();
                //包头
                //channel.write((byte)0x55);
                //channel.write((byte)0x0AA);
                ByteBuffer byteBuffer =ByteBuffer.allocate(20);
                byteBuffer.put((byte)0xF0);
                byte[] hand = new byte[]{(byte)0xF0,(byte)0xFA};
                byteBuffer.put(hand);
                byteBuffer.put((byte)1);
                channel.write(byteBuffer.get()+"\r\n"); //设备
                //channel.write(s.length());
                WhResult<String> whResult = new WhResult<>();
                whResult.setDate(s);
                String s1 = whResult.toString();
                //int length = s.length();
                channel.write(s+"\r\n");
                channel.write(s1+"\r\n");
                //channel.write(new Date());
                //channel.write(s + "\r\n");
                //channel.write((byte)0x55);
                //channel.write((byte)0xAA);
                channel.flush();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] ar){
        NettyScoketClienTest nettyScoketClienTest =new NettyScoketClienTest();
        nettyScoketClienTest.show();
    }
}
