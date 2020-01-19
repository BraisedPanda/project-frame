package com.braisedpanda.base.common.model;

import com.braisedpanda.base.common.constant.BizStatusConstant;

import java.io.Serializable;

/**
 * @program: project-frame-test
 * @description: 含数据的返回实体类
 * @author: chenzhen
 * @create: 2020-01-19 10:57
 **/
public class ObjectResponseStatus<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public ObjectResponseStatus(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }



    /**
    * @Description: 返回成功 
    * @Param: 
    * @Date: 2020/1/19 0019 
    */ 
    //默认返回成功
    public static <T> ObjectResponseStatus success(T data){
        return new ObjectResponseStatus(BizStatusConstant.SUCCESS.getCode(), BizStatusConstant.SUCCESS.getMessage(), data);
    }

    //带信息返回成功
    public static <T> ObjectResponseStatus success(String message, T data){
        return new ObjectResponseStatus(BizStatusConstant.SUCCESS.getCode(), message, data);
    }

    /** 
    * @Description: 返回失败
    * @Param: 
    * @Date: 2020/1/19 0019 
    */

    //默认返回失败
    public static <T> ObjectResponseStatus fail(T data){
        return new ObjectResponseStatus(BizStatusConstant.FAILD.getCode(), BizStatusConstant.FAILD.getMessage(), data);
    }

    //带信息返回失败
    public static <T> ObjectResponseStatus fail(String message, T data){
        return new ObjectResponseStatus(BizStatusConstant.FAILD.getCode(), message, data);
    }
}
