package com.obscureline.knowledge.controller;


import com.obscureline.knowledge.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试 前端控制器
 * </p>
 *
 * @author jiangke
 * @since 2023-06-04
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


}

