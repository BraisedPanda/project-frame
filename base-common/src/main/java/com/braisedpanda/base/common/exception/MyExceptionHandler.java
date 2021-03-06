//package com.braisedpanda.base.common.exception;
//
//import com.braisedpanda.base.common.model.ResponseStatus;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//
///**
// * @program: project-frame-test
// * @description: 捕获异常处理,此类在common层不起作用，在applicaiton中才能起作用，原因
//   *应该是bean没有被注入
// * @author: chenzhen
// * @create: 2020-01-19 14:55
// **/
//@Slf4j
//@ControllerAdvice
//@ResponseBody
//public class MyExceptionHandler {
//
//    @ExceptionHandler(BizException.class)
//    public ResponseStatus bizExHandler(BizException bizException){
//
//        return ResponseStatus.fail("请求失败了撒，你个憨批");
//    }
//
//
//}
