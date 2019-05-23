package com.netty.qqw.tcp.EventLoopGroup;

import com.netty.qqw.tcp.threadFactory.ThreadNameFactory;
import io.netty.channel.nio.NioEventLoopGroup;

import java.util.concurrent.ThreadFactory;

public class WorkEventLoopGroup extends NioEventLoopGroup {
    private ThreadNameFactory workerThreadNameFactory;
    public WorkEventLoopGroup(){
        this(1, new ThreadNameFactory("net_tcp_work"));
    }
    public WorkEventLoopGroup(int nThreads, ThreadFactory threadFactory){
        super(nThreads,threadFactory);
    }
}
