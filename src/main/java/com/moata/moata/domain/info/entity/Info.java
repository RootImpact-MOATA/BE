package com.moata.moata.domain.info.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "info_id", nullable = false)
    private long infoId;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private InfoType type;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false, length = 10000)
    private String content;
}
