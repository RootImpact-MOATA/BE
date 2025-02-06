package com.moata.moata.dto.reservation;

import com.moata.moata.constant.RideSharingRole;
import com.moata.moata.entity.group.Group;
import com.moata.moata.entity.reservation.Reservation;
import com.moata.moata.entity.user.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservationSaveRequest {
    private long groupId;
    private String startTime;
    private String endTime;
    private Boolean isRideSharing;
    private String rideSharingRole;
    private String departure;
    private String destination;

    public Reservation toModel(Group group, User reserver) {
        return Reservation.builder()
                .groupId(group)
                .reserverId(reserver)
                .startTime(LocalDateTime.parse(startTime))
                .endTime(LocalDateTime.parse(endTime))
                .isRideSharing(isRideSharing)
                .rideSharingRole(RideSharingRole.valueOf(rideSharingRole))
                .departure(departure)
                .destination(destination)
                .build();
    }
}
