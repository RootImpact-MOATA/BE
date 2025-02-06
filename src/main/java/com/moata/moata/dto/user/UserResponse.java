package com.moata.moata.dto.user;

import com.moata.moata.entity.user.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private long userId;
    private String name;
    private long phone;
    private String telco;
    private String location;

    public UserResponse from(User user) {
        return UserResponse.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .phone(user.getPhone())
                .telco(user.getTelco())
                .location(user.getLocation())
                .build();
    }
}