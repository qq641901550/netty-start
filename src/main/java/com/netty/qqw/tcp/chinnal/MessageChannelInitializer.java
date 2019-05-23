package com.netty.qqw.tcp.chinnal;

import com.netty.qqw.tcp.chinnal.handler.GameTcpInitInboundHandle;

import com.netty.qqw.tcp.chinnal.message.decoder.NetProtoBufMessageTCPDecoder;
import com.netty.qqw.tcp.chinnal.message.encoder.NetProtoBufMessageTCPEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;

public class MessageChannelInitializer extends ChannelInitializer<NioSocketChannel> {

    @Override
    protected void initChannel(NioSocketChannel ch) throws Exception {
        ChannelPipeline channelPipLine = ch.pipeline();
        int maxLength = 1200;//maxFrameLength：解码的帧的最大长度
        int lengthFieldOffset = 0;//lengthFieldOffset：长度属性的起始位（偏移位），包中存放有整个大数据包长度的字节，这段字节的其实位置
        int lengthFieldLength = 4;//lengthFieldLength：长度属性的长度，即存放整个大数据包长度的字节所占的长度
        int lengthAdjustmen = 0;//lengthAdjustmen：长度调节值，在总长被定义为包含包头长度时，修正信息长度。
        int initialBytesToStrip= 4;//initialBytesToStrip：跳过的字节数，根据需要我们跳过lengthFieldLength个字节，以便接收端直接接受到不含“长度属性”的内容
        boolean failFast = false;//failFast ：为true，当frame长度超过maxFrameLength时立即报TooLongFrameException异常，为false，读取完整个帧再报异常

        channelPipLine.addLast("frame", new LengthFieldBasedFrameDecoder(maxLength, lengthFieldOffset, lengthFieldLength, lengthAdjustmen, initialBytesToStrip,failFast));
        //channelPipLine.addLast("framer", new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));
        //channelPipLine.addLast("frame", new LengthFieldBasedFrameDecoder(20, 0, 8, 0, 0));
        //channelPipLine.addLast("frame",new LengthFieldBasedFrameDecoder(1024,5,2,10,0));
        //channelPipLine.addLast("encoder", new StringEncoder());
        //channelPipLine.addLast("decoder", new StringDecoder());
        channelPipLine.addLast("encoder", new NetProtoBufMessageTCPEncoder());
        channelPipLine.addLast("decoder", new NetProtoBufMessageTCPDecoder());
        channelPipLine.addLast("idleStateHandler", new IdleStateHandler(0, 0, 20));
        //channelPipLine.addLast("whResult",new ResultChannelInboundHandler());
        channelPipLine.addLast("GameTcpResult",new GameTcpInitInboundHandle());
        System.out.println("用户:"+ch.remoteAddress() +"连接上");
    }
}
