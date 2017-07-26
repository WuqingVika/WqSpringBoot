package com.wuqingvika.repository;

import com.wuqingvika.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wuqingvika on 2017/7/22.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    public List<Girl> findByAge(Integer age);
}
