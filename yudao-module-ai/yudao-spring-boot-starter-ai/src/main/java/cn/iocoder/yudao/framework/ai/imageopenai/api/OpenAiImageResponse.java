package cn.iocoder.yudao.framework.ai.imageopenai.api;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * image 返回
 *
 * author: fansili
 * time: 2024/3/17 10:27
 */
@Data
@Accessors(chain = true)
public class OpenAiImageResponse {

    private long created;
    private List<Item> data;

    @Data
    @Accessors(chain = true)
    public static class Item {

        private String url;

    }
}
