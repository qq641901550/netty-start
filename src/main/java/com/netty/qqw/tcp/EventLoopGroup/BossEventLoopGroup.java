package com.netty.qqw.tcp.EventLoopGroup;

import com.netty.qqw.tcp.threadFactory.ThreadNameFactory;
import io.netty.channel.nio.NioEventLoopGroup;

import java.util.concurrent.ThreadFactory;

public class BossEventLoopGroup extends NioEventLoopGroup {
    private ThreadNameFactory bossThreadNameFactory;
    public BossEventLoopGroup(){
        this(1, new ThreadNameFactory("net_tcp_boss"));
    }
    public BossEventLoopGroup(int nThreads, ThreadFactory threadFactory){
        super(nThreads,threadFactory);
    }
}
