package com.netty.qqw.db;

import com.mongodb.MongoClient;

import com.netty.qqw.entity.ComponentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;
import org.springframework.data.mongodb.core.mapreduce.GroupByResults;
import org.springframework.stereotype.Component;

import java.util.Iterator;


@Component
public class MongoDBJDBC {
    @Autowired
    MongoTemplate mongoTemplate;
    public void test(){
        GroupBy id = GroupBy.key("id");
        GroupByResults<ComponentBean> group = mongoTemplate.group("",id , ComponentBean.class);
        Iterator<ComponentBean> iterator = group.iterator();
    }
    public void save(){
        ComponentBean componentBean =new ComponentBean();
        componentBean.setLocalX(10);
        componentBean.setLocalY(20);
        componentBean.setDelFlag('1');
        mongoTemplate.save(componentBean);
    }
}
