package com.moata.moata.dto.reservation;

import com.moata.moata.constant.RideSharingRole;
import com.moata.moata.domain.group.entity.Group;
import com.moata.moata.domain.reservation.entity.Reservation;
import com.moata.moata.domain.user.entity.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservationSaveRequest {
    private long groupId;
    private long reserverId;
    private String startTime;
    private String endTime;
    private Boolean isRideSharing;
    private String rideSharingRole;
    private String departure;
    private String destination;

    public Reservation toModel(Group group, User reserver, RideSharingRole rideSharingRole, String departure, String destination) {
        return Reservation.builder()
                .groupId(group)
                .reserverId(reserver)
                .startTime(LocalDateTime.parse(startTime))
                .endTime(LocalDateTime.parse(endTime))
                .isRideSharing(isRideSharing)
                .rideSharingRole(rideSharingRole)
                .departure(departure)
                .destination(destination)
                .build();
    }
}
