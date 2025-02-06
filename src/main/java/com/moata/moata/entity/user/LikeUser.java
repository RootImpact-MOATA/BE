package com.moata.moata.entity.user;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "like_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class LikeUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id", nullable = false)
    private long likeId;

    @ManyToOne
    @JoinColumn(name = "liker_id", nullable = false)
    private User likerId;

    @ManyToOne
    @JoinColumn(name = "target_id", nullable = false)
    private User targetId;
}
