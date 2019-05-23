package com.netty.qqw.entity;

import java.io.Serializable;

public class WhResult<T> implements Serializable {
    //错误码(请求成功为0)
    private Integer code = 0;
    //错误信息或返回信息
    private String message = "请求成功";
    //请求内容
    private T date;
    //响应时间
    private long loadingTime;

    /**
     * 时间戳
     */
    private long timestamp = System.currentTimeMillis();



    /**
     * 返回错误信息
     * @param code
     * @param message
     * @return
     */
    public static WhResult errReturn(Integer code,String message){
        WhResult whResult =new WhResult();
        whResult.setCode(code);
        whResult.setMessage(message);
        return whResult;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(long loadingTime) {
        this.loadingTime = loadingTime;
    }
}
