package com.scj.foolRpcClient.configration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author suchangjie.NANKE
 * @Title: FoolRpcConfigura
 * @date 2023/8/23 13:09
 * @description 对外配置类
 */

@ComponentScan("com.scj.foolRpcClient")
@EnableConfigurationProperties(FoolRpcProperties.class)
public class FoolRpcConfigure {

}
