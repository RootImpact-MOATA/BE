package com.moata.moata.domain.article.entity;

import com.moata.moata.domain.group.entity.Group;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "article")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id", nullable = false)
    private long articleId;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group groupId;

    @Column(name = "content", length = 10000)
    private String content;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "created_by", nullable = false, length = 10)
    private String createdBy;
}
