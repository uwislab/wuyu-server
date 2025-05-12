package com.fiveup.core.performanceevaluation.utils;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * JSON数据返回类简单封装
 * 用法:return new result(0, "成功").toString();
 */
@Data
public class Result {

    private int code;         //状态码
    private String msg;       //消息
    private int  count;       //记录条数
    private Object data;      //数据对象

    /**
     * 无参构造器
     */
    public Result(){
        super();
    }

    /**
     * 只返回状态码，消息
     * @param code
     * @param msg
     */
    public Result(int code, String msg){
        super();
        this.code=code;
        this.msg=msg;
    }

    /**
     只返回状态码，消息，数据对象
     @param code
     @param msg
     @param data
     */
    public Result(int code, String msg, Object data){
        super();
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    /**
     * 返回全部信息即:状态码，消息，记录条数，数据对象
     * @param code
     * @param msg
     * @param count
     * @param data
     */
    public Result(int code, String msg, int count, Object data){
        super();
        this.code=code;
        this.msg=msg;
        this.count=count;
        this.data=data;
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}