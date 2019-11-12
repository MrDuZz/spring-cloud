package cn.ztuo.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dupinyan
 * @Description:
 * @Date: 2019/9/11 17:57
 * @Version: 1.0
 */
@RestController
@RequestMapping("eureka")
public class EurekaTestController {

    @RequestMapping(value = "test")
    public String testEureka(String s) {
        System.out.println("传入的值为："+s);
        return "传入的值为" + s;
    }

}
