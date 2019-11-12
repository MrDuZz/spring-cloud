package cn.ztuo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: dupinyan
 * @Description:
 * @Date: 2019/9/11 17:53
 * @Version: 1.0
 */
@SpringBootApplication
// 代表自己是一个服务提供方
@EnableDiscoveryClient
public class EurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
