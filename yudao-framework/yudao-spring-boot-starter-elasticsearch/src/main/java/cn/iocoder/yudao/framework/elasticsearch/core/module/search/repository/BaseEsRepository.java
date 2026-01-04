package cn.iocoder.yudao.framework.elasticsearch.core.module.search.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseEsRepository<T, ID> extends ElasticsearchRepository<T, ID> {
    // 支持 CRUD、分页、排序、方法命名查询
    
    // 公共方法可以写在这里
}