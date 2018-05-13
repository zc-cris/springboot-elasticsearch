package com.cris.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* @Author zc-cris
* @Description SpringBoot 默认支持两种方式来操作ElasticSearch
* 1. Jest（默认不生效）
*   所以需要导入jest的工具包：（io.searchbox.client.JestClient)
* 2. SpringData ElasticSearch
*   - Client 节点信息：clusterNodes，clusterName
*   - ElasticSearchTemplate 操作es
*   - 还可以编写一个ElasticSearchRepository 的子接口来操作es
* @Param
* @return
**/
@SpringBootApplication
public class SpringbootElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootElasticsearchApplication.class, args);
    }
}
