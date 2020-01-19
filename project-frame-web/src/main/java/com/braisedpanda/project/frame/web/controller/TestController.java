package com.braisedpanda.project.frame.web.controller;

import com.braisedpanda.base.common.constant.BizStatusConstant;
import com.braisedpanda.base.common.exception.BizException;
import com.braisedpanda.base.common.model.ObjectResponseStatus;
import com.braisedpanda.base.common.model.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: project-frame-test
 * @description:
 * @author: chenzhen
 * @create: 2020-01-19 11:05
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/response")
    public ResponseStatus testResponse(){
        throw new BizException(BizStatusConstant.FAILD, "自定义错误的异常信息");

    }

    @PostMapping("/response2")
    public ObjectResponseStatus testResponse2(){
        String jsonStr = "{usename: '张三',address:'中国安徽'}";

        return ObjectResponseStatus.success("测试成功",jsonStr);
    }


}
