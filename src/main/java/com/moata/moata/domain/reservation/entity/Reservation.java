package com.moata.moata.domain.reservation.entity;

import com.moata.moata.domain.group.entity.Group;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

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
    private Group group;

    @Column(name = "reserver_name", nullable = false, length = 10)
    private String reserverName;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "is_ride_sharing", nullable = false)
    private Boolean isRideSharing;

    @Column(name = "ride_sharing_role", length = 10)
    private String rideSharingRole;

    @Column(name = "departure")
    private String departure;

    @Column(name = "destination")
    private String destination;
}
