package com.wuqingvika.controller;
import com.wuqingvika.domain.Girl;
import com.wuqingvika.domain.Result;
import com.wuqingvika.repository.GirlRepository;
import com.wuqingvika.service.GirlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by wuqingvika on 2017/7/22.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    private static final Logger logger= LoggerFactory.getLogger(GirlController.class);
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        logger.info("girlList");
        return girlRepository.findAll();
    }
    @GetMapping(value = "/girls/{id}")
    public Girl getGirlById(@PathVariable("id") Integer id){
        logger.info("getGirlById---");
        return  girlRepository.findOne(id);
    }
    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        /*Girl girl=new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);*/
        if(bindingResult.hasErrors()){
            //System.out.print( bindingResult.getFieldError().getDefaultMessage());
            Result result=new Result();
            result.setCode(0);
            result.setMessage(bindingResult.getFieldError().getDefaultMessage());
            return result;
            }
            Result result=new Result();
            result.setMessage("成功");
            result.setCode(1);
            result.setData(girlRepository.save(girl));

        return result;
    }
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,@RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }
    @DeleteMapping(value = "/girls/{id}")
    public void girlDel(@PathVariable("id") Integer id){
         girlRepository.delete(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> findByAge(@PathVariable("age") Integer age){
        return  girlRepository.findByAge(age);
    }
    @PostMapping(value = "/girls/two")
    public void insertTwo(){
        girlService.addTwoGirls();
    }
}
