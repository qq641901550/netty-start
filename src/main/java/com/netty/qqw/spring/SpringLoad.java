package com.netty.qqw.spring;

import com.netty.qqw.db.MongoDBJDBC;
import org.springframework.beans.BeansException;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringLoad {
    private MongoDBJDBC mongoDBJDBC;
    AbstractApplicationContext ctx;
    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //mongoDBJDBC = (MongoDBJDBC) ctx.getBean("MongoDBJDBC");
        mongoDBJDBC = ctx.getBean(MongoDBJDBC.class);
        //ctx.close();
    }

    public MongoDBJDBC getMongoDbjdbc(){
        return mongoDBJDBC;
    }
    public void close(){
        ctx.close();
    }
}
