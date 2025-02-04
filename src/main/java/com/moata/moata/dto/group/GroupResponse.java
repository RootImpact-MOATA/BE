package com.moata.moata.dto.group;

import com.moata.moata.domain.group.entity.Group;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GroupResponse {
    private long groupId;
    private long ownerId;
    private String favoriteArea;
    private int coOwnerMax;
    private int carUseFrequency;
    private String carType;

    public GroupResponse from(Group group) {
        return GroupResponse.builder()
                .groupId(group.getGroupId())
                .ownerId(group.getOwnerId().getUserId())
                .favoriteArea(group.getFavoriteArea())
                .coOwnerMax(group.getCoOwnerMax())
                .carUseFrequency(group.getCarUseFrequency())
                .carType(group.getCarType())
                .build();
    }
}
