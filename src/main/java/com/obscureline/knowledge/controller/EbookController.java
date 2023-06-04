package com.obscureline.knowledge.controller;


import com.obscureline.knowledge.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 电子书 前端控制器
 * </p>
 *
 * @author jiangke
 * @since 2023-06-04
 */
@Controller
@RequestMapping("/knowledge/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;


}

