package com.moata.moata.dto.article;

import com.moata.moata.domain.article.entity.Article;
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

    public ArticleDetailResponse from(Article article) {
        return ArticleDetailResponse.builder()
                .articleId(article.getArticleId())
                .content(article.getContent())
                .createdAt(article.getCreatedAt())
                .createdBy(article.getCreatedBy())
                .build();
    }
}
