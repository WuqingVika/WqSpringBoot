package com.wuqingvika.exception;

import com.wuqingvika.enums.ResultEnum;

/**
 * 自定义异常
 * Created by wuqingvika on 2017/7/30.
 */
public class GirlException extends RuntimeException{// 继承了RuntimeException才能事务回滚。所以不能继承exception
    private Integer code;

    public GirlException(ResultEnum re) {
        super(re.getMessage());//传给父类
        this.code = re.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
