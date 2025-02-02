package com.moata.moata.domain.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private long userId;

    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "phone", nullable = false)
    private long phone;

    @Column(name = "telco", nullable = false, length = 10)
    private String telco;

    @Column(name = "location", nullable = false)
    private String location;
}
