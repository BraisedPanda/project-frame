package com.braisedpanda.project.frame.web.exception;

import com.braisedpanda.base.common.exception.BizException;
import com.braisedpanda.base.common.model.ResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * @program: project-frame-test
 * @description: 捕获异常处理
 * @author: chenzhen
 * @create: 2020-01-19 14:55
 **/
@Slf4j
@ControllerAdvice
@ResponseBody
public class MyExceptionHandler {

    @ExceptionHandler(BizException.class)
    public ResponseStatus bizExHandler(BizException bizException){

        return ResponseStatus.fail("请求失败了撒，你个憨批");
    }


}
