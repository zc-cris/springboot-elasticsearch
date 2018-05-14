package com.cris.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* @Author zc-cris
* @Description SpringBoot 默认支持两种方式来操作ElasticSearch
* 1. Jest（默认不生效）
*   所以需要导入jest的工具包：（io.searchbox.client.JestClient)
* 2. SpringData ElasticSearch(有可能版本不对应，要么升级springboot版本，要么docker安装对应版本的ES)
*   - Client 节点信息：clusterNodes，clusterName
*   - ElasticSearchTemplate 操作es
*   - 还可以编写一个ElasticSearchRepository 的子接口来操作es
* 3. 使用spring data 的方式来操作ES
*   - ES5.6.9版本默认无法从外部访问9300端口，2.xx 版本就可以，暂时未解决。。。
*   - ElasticSearchRepository 接口的子类可以根据方法名来进行数据的检索
*   - 注入 ElasticSearchTemplate 可以根据不同的条件方法来检索数据
* @Param
* @return
**/
@SpringBootApplication
public class SpringbootElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootElasticsearchApplication.class, args);
    }
}
