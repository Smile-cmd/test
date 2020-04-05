package com.wh.gittest.com.wh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: WangHeng
 * @since: 2020-04-05 16:32
 **/
@RestController
public class TestController {

    @GetMapping("/git")
    public String Test(){

        return "hello Git";
    }

}
