package com.moata.moata.dto.reservation;

import com.moata.moata.domain.reservation.entity.Reservation;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReservationResponse {
    private long reservationId;
    private long groupId;
    private long reserverId;
    private String startTime;
    private String endTime;
    private Boolean isRideSharing;
    private String rideSharingRole;
    private String departure;
    private String destination;

    public ReservationResponse from(Reservation reservation, String rideSharingRole) {
        return ReservationResponse.builder()
                .reservationId(reservation.getReservationId())
                .groupId(reservation.getGroupId().getGroupId())
                .reserverId(reservation.getReserverId().getUserId())
                .startTime(reservation.getStartTime().toString())
                .endTime(reservation.getEndTime().toString())
                .isRideSharing(reservation.getIsRideSharing())
                .rideSharingRole(rideSharingRole)
                .departure(reservation.getDeparture())
                .destination(reservation.getDestination())
                .build();
    }
}
