package com.moata.moata.domain.group.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Getter
@Table(name = "user_group")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id", nullable = false)
    private long groupId;

    @Column(name = "owner_name", nullable = false, length = 10)
    private String ownerName;

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
