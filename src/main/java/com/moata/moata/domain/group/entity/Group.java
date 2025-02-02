package com.moata.moata.domain.group.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
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
    private int coOwnerMax;

    @Column(name = "car_use_frequency")
    private int carUseFrequency;

    @Column(name = "car_type")
    private String carType;
}
