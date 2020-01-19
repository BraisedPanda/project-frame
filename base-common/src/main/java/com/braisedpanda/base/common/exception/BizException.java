package com.braisedpanda.base.common.exception;

import com.braisedpanda.base.common.constant.BizStatusConstant;


/**
 * @program: project-frame-test
 * @description: 业务异常处理
 * @author: chenzhen
 * @create: 2020-01-19 14:23
 **/
public class BizException extends RuntimeException{


    private Integer code;
    private String message;


    public Integer getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


    public BizException(BizStatusConstant bizStatusConstant){
        this.code = bizStatusConstant.getCode();
        this.message = bizStatusConstant.getMessage();
    }

    public BizException(BizStatusConstant bizStatusConstant, String message){
        this.code = bizStatusConstant.getCode();
        this.message = message;
    }

}
