package com.boot.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/6.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/{id}")
    public Long getTest(@PathVariable("id") Long id){
        System.out.println(id);
        return id;
    }
}
