package com.zkhr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoshuai on 2017/1/19.
 */
@RestController
public class TestJsonController {

    @RequestMapping("/getJson")
    public String getJson(){
        return "hello World";
    }
}
