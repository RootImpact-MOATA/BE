package com.moata.moata.dto.user;

import com.moata.moata.domain.user.entity.User;
import lombok.Data;

@Data
public class UserSaveRequest {
    private String name;
    private long phone;
    private String telco;
    private String location;

    public User toModel() {
        return User.builder()
                .name(name)
                .phone(phone)
                .telco(telco)
                .location(location)
                .build();
    }
}
