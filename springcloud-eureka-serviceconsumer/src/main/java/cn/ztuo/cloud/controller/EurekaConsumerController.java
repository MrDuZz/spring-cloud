package cn.ztuo.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: dupinyan
 * @Description:
 * @Date: 2019/9/11 19:04
 * @Version: 1.0
 */
@RestController
@RequestMapping("consumer")
public class EurekaConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("hello")
    public String helloWorld(String s) {
        System.out.println("传入的值为："+s);
        // 第一种调用方式
        String forObject = new RestTemplate().getForObject("http://localhost:8701/eureka/test?s=" + s, String.class);

        // 第二种调用方式
        // 根据服务名 获取服务器列表 根据算法选取某个服务 并访问某个服务的网络位置
        //ServiceInstance serviceInstance = loadBalancerClient.choose("EUREKA-SERVICE");
        //String forObject = new RestTemplate().getForObject("http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/eureka/test?s=" + s, String.class);

        // 第三种调用方式 需要restTemplate注入的方式
        //String forObject = restTemplate.getForObject("http://EUREKA-SERVICE/eureka/test?s=" + s, String.class);
        return forObject;
    }


}
