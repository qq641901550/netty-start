package com.netty.qqw.tcp.chinnal.handler;

import com.netty.qqw.entity.WhResult;

import com.netty.qqw.utils.ProtostuffSerialize;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.util.logging.Logger;
@ChannelHandler.Sharable
public class GameTcpInitInboundHandle extends ChannelInboundHandlerAdapter {
    /**
     * A thread-safe Set  Using ChannelGroup, you can categorize Channels into a meaningful group.
     * A closed Channel is automatically removed from the collection,
     */
    public static ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    public static Logger logger = Logger.getLogger("this");

    private static ProtostuffSerialize<String> protostuffSerialize =new ProtostuffSerialize<>();
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {  // (2)
        Channel incoming = ctx.channel();

        // Broadcast a message to multiple Channels
        channels.writeAndFlush("[SERVER] - " + incoming.remoteAddress() + " 加入\n");

        channels.add(ctx.channel());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {  // (3)
        Channel incoming = ctx.channel();

        // Broadcast a message to multiple Channels
        channels.writeAndFlush("[SERVER] - " + incoming.remoteAddress() + " 离开\n");

        // A closed Channel is automatically removed from ChannelGroup,
        // so there is no need to do "channels.remove(ctx.channel());"
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
        WhResult<String> whResult = null;
        if (msg instanceof WhResult){
            whResult = (WhResult)msg;
        }
        String strMsg = whResult.getDate();
        //解析序列化'
        //AbstractNetProtoBufMessage netMessage = (AbstractNetProtoBufMessage) msg;
        //byte[] msg1 = (byte[]) msg;
        //WhResult<String> stringWhResult = protostuffSerialize.deserializeProtoStuffDataToWhResul(msg1);
        Channel incoming = ctx.channel();
        for (Channel channel : channels) {
            if (channel != incoming){
                whResult.setDate("[" + incoming.remoteAddress() + "]" + strMsg + "\n");
                channel.writeAndFlush(whResult);
            } else {
                whResult.setDate("[you]" + strMsg + "\n");
                channel.writeAndFlush(whResult);
            }
        }
        System.out.println("[" + incoming.remoteAddress() + "]"+strMsg);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception { // (5)
        Channel incoming = ctx.channel();
        System.out.println("ChannelInboundHandlerAdapter:"+incoming.remoteAddress()+"在线");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception { // (6)
        Channel incoming = ctx.channel();
        System.out.println("ChannelInboundHandlerAdapter:"+incoming.remoteAddress()+"掉线");
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        Channel incoming = ctx.channel();
        System.out.println("ChannelInboundHandlerAdapter:"+incoming.remoteAddress()+"异常");
        // 当出现异常就关闭连接 不需要报异常
        //cause.printStackTrace();
        ctx.close();
    }
}
