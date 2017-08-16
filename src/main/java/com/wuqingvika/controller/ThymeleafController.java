package com.wuqingvika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wuqingvika on 2017/8/16.
 */
@Controller
public class ThymeleafController {
    @RequestMapping(value = "/thymeleaf",method = RequestMethod.GET)
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://weibo.com/wuqingvika/");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping(value = "/freemarker",method = RequestMethod.GET)
    public String freemarker(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://weibo.com/wuqingvika/freemarkder");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "freemarker";
    }
}
