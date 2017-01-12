package com.tydic.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class CommonAction {

    @RequestMapping("/test")
    public String test() {
        try {
            return "hello";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "world";
    }
}
