package com.braisedpanda.base.common.constant;

/**
 * @program: project-frame-test
 * @description: 服务请求常量
 * @author: chenzhen
 * @create: 2020-01-19 10:04
 **/
public enum HttpStatusConstant  {
    OK(200, "请求成功"),
    BAD_REQUEST(400, "请求错误"),
    NOT_FOUND(404, "请求页面没有找到"),
    SERVER_ERROR(500, "服务器错误"),
    ;

    private final Integer code;
    private final String message;

    HttpStatusConstant(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
