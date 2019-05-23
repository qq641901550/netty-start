package com.netty.qqw.tcp.threadFactory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadNameFactory implements ThreadFactory {
    /**
     * 线程组 group 赋予线程组的的概念
     *
     */
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(0);
    private final String namePrefix;
    private final boolean daemon;

    public ThreadNameFactory(String namePrefix, boolean daemon) {
        //获取当前线程
        SecurityManager securityManager = System.getSecurityManager();
        this.group = securityManager!=null?securityManager.getThreadGroup():Thread.currentThread().getThreadGroup();
        this.namePrefix = namePrefix + "-thread-";
        this.daemon = daemon;
    }
    public ThreadNameFactory(String namePrefix) {
        this(namePrefix,false);
    }

    public Thread newThread(Runnable r) {
        //线程名称由原子增量生成
        String name = namePrefix + threadNumber.getAndIncrement();
        Thread t =new Thread(group,r,name,0);
        //该线程是否为守护线程,注意:守护线程随主线程死亡而消失
        if(daemon) {
            t.setDaemon(daemon);
        }else{
            if (t.isDaemon()) {
                t.setDaemon(false);
            }
            if (t.getPriority() != Thread.NORM_PRIORITY) {
                t.setPriority(Thread.NORM_PRIORITY);
            }
        }
        return t;
    }
}
