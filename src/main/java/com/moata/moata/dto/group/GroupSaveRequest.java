package com.moata.moata.dto.group;

import com.moata.moata.entity.group.Group;
import com.moata.moata.entity.user.User;
import lombok.Data;

@Data
public class GroupSaveRequest {
    private long ownerId;
    private String favoriteArea;
    private int coOwnerMax;
    private int carUseFrequency;
    private String carType;

    public Group toModel(User user) {
        return Group.builder()
                .ownerId(user)
                .favoriteArea(favoriteArea)
                .coOwnerMax(coOwnerMax)
                .carUseFrequency(carUseFrequency)
                .carType(favoriteArea)
                .build();
    }
}
