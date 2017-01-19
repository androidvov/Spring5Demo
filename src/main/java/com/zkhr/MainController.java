package com.zkhr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhaoshuai on 2017/1/19.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model){

        return "index";
    }
}
