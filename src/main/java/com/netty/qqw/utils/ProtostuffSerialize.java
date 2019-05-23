package com.netty.qqw.utils;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import com.netty.qqw.entity.WhResult;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 序列化以及返序列化
 * @param <T>
 */
public class ProtostuffSerialize<T> {
    private long userTime;

    @Test
    public void show(){
        String mes = "你还啊飒飒大受打击阿里斯柯达";
        WhResult<String> whResult =new WhResult<>();
        whResult.setDate(mes);
        byte[] bytes = new ProtostuffSerialize<String>().serializeProtoStuffWhResult(whResult);
        WhResult<String> tWhResult = new ProtostuffSerialize<String>().deserializeProtoStuffDataToWhResul(bytes);
        String date = tWhResult.getDate();
    }
    public WhResult<T> deserializeProtoStuffDataToWhResul(byte[] bt){
        long start = System.currentTimeMillis() ;
        WhResult<T> whResult = new WhResult<>();
        try {
            Schema<WhResult> schema = RuntimeSchema.getSchema(WhResult.class);
            ProtostuffIOUtil.mergeFrom(bt, whResult, schema);
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis() ;
        this.userTime = end - start;
        return whResult;
    }
    public byte[] serializeProtoStuffWhResult(WhResult<T> whResult) {

        long start = System.currentTimeMillis() ;

        Schema<WhResult> schema = RuntimeSchema.getSchema(WhResult.class);
        LinkedBuffer buffer = LinkedBuffer.allocate(4096);
        byte[] protostuff = null;
        try {
            protostuff = ProtostuffIOUtil.toByteArray(whResult, schema, buffer);
        } finally {
            buffer.clear();
        }
        long end = System.currentTimeMillis() ;
        this.userTime = end - start;
        return protostuff;
    }
}
