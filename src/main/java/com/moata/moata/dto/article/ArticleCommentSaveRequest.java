package com.moata.moata.dto.article;

import com.moata.moata.domain.article.entity.Article;
import com.moata.moata.domain.article.entity.ArticleComment;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleCommentSaveRequest {
    private long articleId;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;

    public ArticleComment toModel(Article article) {
        return ArticleComment.builder()
                .articleId(article)
                .content(content)
                .createdAt(LocalDateTime.now())
                .createdBy(createdBy)
                .build();
    }
}
