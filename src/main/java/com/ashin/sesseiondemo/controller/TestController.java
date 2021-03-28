package com.ashin.sesseiondemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private HttpServletRequest httpServletRequest;

    @GetMapping("/getSessionInfo.do")
    public String getSessionInf(){
        String sessionId = httpServletRequest.getSession().getId();
        log.info("sessionId:{}",sessionId);
        return "ok";
    }
}
