package cn.iocoder.yudao.framework.elasticsearch.core.module.search.document;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
//@Document(indexName = "")
public class BaseDoc {
    @Id
    private Long id;

    // getter/setter
}
