package com.wuqingvika.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.function.Consumer;

import static org.junit.Assert.*;

/**
 * Created by wuqingvika on 2017/7/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void girlList() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/girls"))
                .andExpect(MockMvcResultMatchers.status().isOk())//期望它请求状态返回为200
        .andExpect(MockMvcResultMatchers.content().string("abc"))//还期望它返回内容为abc
        ;//设置期望值
    }

    @Test
    public void TestLambda(){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello wuqing!");
            }
        };
        runnable.run();
        System.out.println("----------不听不听 王八念经-----------");
        Runnable runnable1=()->System.out.print("hello lambda");
        runnable1.run();
    }

    @Test
    public void TestLambda2(){
        //Consumer<String> consumer=(x)->System.out.print(x);
        Consumer<String> consumer=x->System.out.print(x);//如果只有一个参数小括号可以不写。
        consumer.accept("吴庆在学Lambda");
    }
}