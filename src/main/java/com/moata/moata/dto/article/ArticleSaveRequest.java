package com.moata.moata.dto.article;

import com.moata.moata.entity.article.Article;
import com.moata.moata.entity.group.Group;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleSaveRequest {
    private long groupId;
    private String content;
    private String createdBy;

    public Article toModel(Group group) {
        return Article.builder()
                .groupId(group)
                .content(content)
                .createdAt(LocalDateTime.now())
                .createdBy(createdBy)
                .build();
    }
}