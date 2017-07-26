package com.wuqingvika.controller;

import com.wuqingvika.properties.Girlproperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuqingvika on 2017/7/19.
 */
@RestController
public class HelloController {
    @Autowired
    private Girlproperties girlproperties;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return  girlproperties.getSize()+girlproperties.getAge();
    }
}
