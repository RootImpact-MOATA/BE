package com.moata.moata.dto.article;

import com.moata.moata.entity.article.Article;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ArticleResponse {
    private long articleId;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;

    public ArticleResponse from(Article article) {
        return ArticleResponse.builder()
                .articleId(article.getArticleId())
                .content(article.getContent())
                .createdAt(article.getCreatedAt())
                .createdBy(article.getCreatedBy())
                .build();
    }
}
