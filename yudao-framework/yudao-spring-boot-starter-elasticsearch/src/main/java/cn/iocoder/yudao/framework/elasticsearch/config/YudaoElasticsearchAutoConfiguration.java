package cn.iocoder.yudao.framework.elasticsearch.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * Elasticsearch 配置类
 *
 * @author 芋道源码
 */
@Slf4j
@AutoConfiguration
@EnableElasticsearchRepositories(basePackages = "cn.iocoder.yudao")
public class YudaoElasticsearchAutoConfiguration {

    public YudaoElasticsearchAutoConfiguration() {
        log.info("[YudaoElasticsearchAutoConfiguration][初始化 Elasticsearch 成功]");
    }
}
