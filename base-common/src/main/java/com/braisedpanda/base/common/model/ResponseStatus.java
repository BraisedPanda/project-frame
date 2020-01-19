package com.braisedpanda.base.common.model;

import com.braisedpanda.base.common.constant.BizStatusConstant;

import java.io.Serializable;

/**
 * @program: project-frame-test
 * @description: 无数据的统一返回对象
 * @author: chenzhen
 * @create: 2020-01-19 10:29
 **/

public class ResponseStatus implements Serializable{

    private static final long serialVersionUID = -4070987623969820439L;

    private Integer code;
    private String message;

    public ResponseStatus() {
    }

    public ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    public Integer getCode() {
        return code;
    }



    public String getMessage() {
        return message;
    }



    /**
    * @Description: 请求成功
    * @Param: []
    * @Date: 2020/1/19 0019 
    */
    //默认返回成功信息
    public static ResponseStatus success(){
        return new ResponseStatus(BizStatusConstant.SUCCESS.getCode(), BizStatusConstant.SUCCESS.getMessage());
    }

    //自定义返回成功信息
    public static ResponseStatus success(String message){
        return new ResponseStatus(BizStatusConstant.SUCCESS.getCode(), message);
    }
    
    /** 
    * @Description: 请求失败
    * @Param: 
    * @Date: 2020/1/19 0019 
    */

    //默认返回失败信息
    public static ResponseStatus fail(){
        return new ResponseStatus(BizStatusConstant.FAILD.getCode(), BizStatusConstant.FAILD.getMessage());
    }

    //自定义返回失败信息
    public static ResponseStatus fail(String message){
        return new ResponseStatus(BizStatusConstant.FAILD.getCode(), message);
    }

}
