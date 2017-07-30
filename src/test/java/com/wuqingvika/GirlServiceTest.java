package com.wuqingvika;

import com.wuqingvika.domain.Girl;
import com.wuqingvika.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wuqingvika on 2017/7/30.
 */
@RunWith(SpringRunner.class)//此注解表示要在测试环境中跑
@SpringBootTest//此注解表示启动整个Spring工程
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;
    @Test
    public void findOneTest(){
        Girl girl=girlService.findOne(1);
        Assert.assertEquals(new Integer(15),girl.getAge());
    }
}
