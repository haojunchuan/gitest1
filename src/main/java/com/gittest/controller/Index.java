package com.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack hao
 * @createTime 2020-06-09-0:34
 */

@RestController
public class Index {
    @GetMapping("index")
    public String index(){
        return "ok";
    }
}
