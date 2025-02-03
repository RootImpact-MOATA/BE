package com.moata.moata.dto.article;

import com.moata.moata.domain.article.entity.ArticleComment;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ArticleCommentResponse {
    private long commentId;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;

    public ArticleCommentResponse from(ArticleComment articleComment) {
        return ArticleCommentResponse.builder()
                .commentId(articleComment.getCommentId())
                .content(articleComment.getContent())
                .createdAt(articleComment.getCreatedAt())
                .createdBy(articleComment.getCreatedBy())
                .build();
    }
}
