package com.wuqingvika.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wuqingvika on 2017/7/22.
 */
@Component
@ConfigurationProperties(prefix = "girl")//girl代表映射前缀，它会把配置文件中对应girl开头下的属性映射过来
public class Girlproperties {
    private String size;
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    private Integer age;
}
