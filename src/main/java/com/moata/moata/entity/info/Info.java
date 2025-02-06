package com.moata.moata.entity.info;

import com.moata.moata.constant.InfoType;
import jakarta.persistence.*;
import lombok.*;

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
