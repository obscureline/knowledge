package com.obscureline.knowledge.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Value("${test.hello:默认值}")
    private String testHello;

    @RequestMapping("/")
    public String hello() {
        return "hello would";
    }

    @GetMapping("/hello")
    public String would(String name) {
        return name+" "+"hello would"+testHello;
    }

    @PostMapping("/hellod")
    public String wouldd() {
        return "hello would";
    }
}