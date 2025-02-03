package com.moata.moata.domain.reservation.entity;

import com.moata.moata.domain.group.entity.Group;
import com.moata.moata.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "reservation")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id", nullable = false)
    private long reservationId;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group groupId;

    @ManyToOne
    @JoinColumn(name = "reserver_id", nullable = false)
    private User reserverId;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "is_ride_sharing", nullable = false)
    private Boolean isRideSharing;

    @Enumerated(EnumType.STRING)
    @Column(name = "ride_sharing_role")
    private RideSharingRole rideSharingRole;

    @Column(name = "departure")
    private String departure;

    @Column(name = "destination")
    private String destination;
}
