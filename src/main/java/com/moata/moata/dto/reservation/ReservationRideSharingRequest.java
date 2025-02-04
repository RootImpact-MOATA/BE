package com.moata.moata.dto.reservation;

import lombok.Data;

@Data
public class ReservationRideSharingRequest {
    private long reservationId;
    private String pickUpPoint;
}