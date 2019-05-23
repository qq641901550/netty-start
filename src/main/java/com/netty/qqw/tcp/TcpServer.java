package com.netty.qqw.tcp;

import com.netty.qqw.tcp.EventLoopGroup.BossEventLoopGroup;
import com.netty.qqw.tcp.EventLoopGroup.WorkEventLoopGroup;
import com.netty.qqw.tcp.chinnal.MessageChannelInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

import io.netty.channel.ChannelOption;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;


public class TcpServer {

    int port = 9006;
    public boolean startServer(){
        //bootstrap
        ServerBootstrap serverBootstrap =new ServerBootstrap();
        //主线程连接组
        BossEventLoopGroup bossEventLoopGroup =new BossEventLoopGroup();
        //辅线程连接组
        WorkEventLoopGroup workEventLoopGroup =new WorkEventLoopGroup();
        try {
            ChannelFuture channelFuture = serverBootstrap
                    .group(bossEventLoopGroup, workEventLoopGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childOption(ChannelOption.SO_REUSEADDR, true)          //重用地址
                    .childOption(ChannelOption.SO_RCVBUF, 65536)
                    .childOption(ChannelOption.SO_SNDBUF, 65536)
                    .childOption(ChannelOption.ALLOCATOR, new PooledByteBufAllocator(false))
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .childOption(ChannelOption.TCP_NODELAY, true)
                    .handler(new LoggingHandler(LogLevel.INFO))                    //日志文件
                    .childHandler(new MessageChannelInitializer())
                    .bind(port).sync();
            System.out.println("服务器启动了");
            channelFuture.channel().closeFuture().addListener(ChannelFutureListener.CLOSE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
