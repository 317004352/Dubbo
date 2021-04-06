package com.txy.gmail.config;

import com.alibaba.dubbo.config.*;
import com.txy.gmail.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname MyDubboConfig
 * @Description TODO
 * @Date 2021/4/6 14:29
 * @Created by txy
 */
@Configuration
public class MyDubboConfig {
    //对应xml配置文件中的标签，一个标签一个Bean
    @Bean
    public ApplicationConfig applicationConfig (){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-user-service-provider");
        //其他规则可以以继续设置
        return applicationConfig;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }
    @Bean
    public ServiceConfig<UserService> userServiceServiceConfig(UserService userService){
        ServiceConfig<UserService> serviceServiceConfig = new ServiceConfig<>();
        serviceServiceConfig.setInterface(UserService.class);
        serviceServiceConfig.setRef(userService);
        serviceServiceConfig.setVersion("1");
        //配置每一个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(5000);
        //将method的设置保存到config中
        List<MethodConfig> methodConfigList = new ArrayList<>();
        methodConfigList.add(methodConfig);
        serviceServiceConfig.setMethods(methodConfigList);
        //providerConfig
       /* ProviderConfig providerConfig = new ProviderConfig();
        // ...
        MonitorConfig */

        return serviceServiceConfig;
    }
}
