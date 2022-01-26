package com.jack.bikedata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/list")
    public String getList()
    {
        String list="test2";
        return list;
    }

    @RequestMapping("/updatebyid")
    public int updateById(int id)
    {
        int result=id;
        return result;
    }
}
