package com.wuqingvika.handle;

import com.wuqingvika.domain.Girl;
import com.wuqingvika.domain.Result;
import com.wuqingvika.exception.GirlException;
import com.wuqingvika.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuqingvika on 2017/7/30.
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger= LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException= (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            logger.error(" [系统异常]{}"+e);
            return ResultUtil.error(-1, "未知错误");
        }
    }
}
