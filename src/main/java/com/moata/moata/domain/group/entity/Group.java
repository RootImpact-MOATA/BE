package com.moata.moata.domain.group.entity;

import com.moata.moata.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Getter
@Builder
@Table(name = "user_group")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id", nullable = false)
    private long groupId;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User ownerId;

    @Column(name = "favorite_area")
    private String favoriteArea;

    @Column(name = "co_owner_max")
    @ColumnDefault("0")
    private int coOwnerMax;

    @Column(name = "car_use_frequency")
    @ColumnDefault("0")
    private int carUseFrequency;

    @Column(name = "car_type")
    private String carType;
}
