package com.braisedpanda.base.common.constant;

/**
 * @program: project-frame-test
 * @description: 业务常量
 * @author: chenzhen
 * @create: 2020-01-19 10:04
 **/

public enum BizStatusConstant {
    FAILD(-1, "业务处理失败"),
    SUCCESS(1000, "请求成功"),
    ;

    private final int code;
    private final String message;

    BizStatusConstant(int code, String message){
        this.code = code;
        this.message = message;
    }


    public Integer getCode() {
        return this.code;
    }


    public String getMessage() {
        return this.message;
    }
}
