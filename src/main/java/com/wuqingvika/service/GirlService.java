package com.wuqingvika.service;

import com.wuqingvika.domain.Girl;
import com.wuqingvika.enums.ResultEnum;
import com.wuqingvika.exception.GirlException;
import com.wuqingvika.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wuqingvika on 2017/7/23.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void addTwoGirls(){
        Girl girlA=new Girl();
        girlA.setCupSize("A");
        girlA.setAge(17);
        girlRepository.save(girlA);

        Girl girlB=new Girl();
        girlB.setCupSize("B");
        girlB.setAge(18);
        girlRepository.save(girlB);

    }
    public void getAge(Integer id) throws Exception{
        Girl girl=girlRepository.findOne(id);
        Integer age=girl.getAge();
        if(age<13){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age>10&&age<18){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }
}
