package com.txy.gmail;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 1.导入依赖
 *  1）导入dubbo-starter
 *  2）导入dubbo的其他依赖
 *
 *  springboot与dubbo整合的三种方式
 *  1)导入dubbo-starter。在applicatiion。properties配置属性，
 *  使用@Service暴露服务使用@Refrence调用服务
 *  2）保留dubboxml配置文件
 *       导入dubbo-starter。使用@ImporResource(locations = "classpath:provider.xml")导入配置文件
 *  3）注解API方式
 *    将每一个组件手动创建到容器中
 */
@EnableDubbo //开启基于注解注解的dubbo功能
//@DubboComponentScan
//@ImportResource(locations = "classpath:provider.xml")
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}
