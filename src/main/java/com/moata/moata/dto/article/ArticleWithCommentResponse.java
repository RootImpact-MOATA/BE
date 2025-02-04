package com.moata.moata.dto.article;

import com.moata.moata.domain.article.entity.Article;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ArticleWithCommentResponse  {
    private long articleId;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;
    private List<ArticleCommentResponse> comments;

    public ArticleWithCommentResponse from(Article article, List<ArticleCommentResponse> commmentList) {
        return ArticleWithCommentResponse.builder()
                .articleId(article.getArticleId())
                .content(article.getContent())
                .createdAt(article.getCreatedAt())
                .createdBy(article.getCreatedBy())
                .comments(commmentList)
                .build();
    }
}
