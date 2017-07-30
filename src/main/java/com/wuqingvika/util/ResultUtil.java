package com.wuqingvika.util;

import com.wuqingvika.domain.Result;

/**
 * Created by wuqingvika on 2017/7/30.
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result=new Result();
        result.setCode(1);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static Result success(){
        Result result=new Result();
        result.setMessage("成功");
        result.setCode(1);
        return result;
    }
}
