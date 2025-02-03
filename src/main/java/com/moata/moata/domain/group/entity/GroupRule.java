package com.moata.moata.domain.group.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "group_rule")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class GroupRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_rule_id", nullable = false)
    private long groupRuleId;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group groupId;

    @Column(name = "washing_frequency", nullable = false, length = 30)
    private String washingFrequency;

    @Column(name = "fuel_manager", nullable = false, length = 10)
    private String fuelManager;

    @Column(name = "parking_location", nullable = false)
    private String parkingLocation;

    @Column(name = "etc", length = 5000)
    private String etc;
}
