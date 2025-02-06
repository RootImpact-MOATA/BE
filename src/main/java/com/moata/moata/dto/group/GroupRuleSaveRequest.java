package com.moata.moata.dto.group;

import com.moata.moata.entity.group.Group;
import com.moata.moata.entity.group.GroupRule;
import lombok.Data;

@Data
public class GroupRuleSaveRequest {
    private String washingFrequency;
    private String fuelManager;
    private String parkingLocation;
    private String etc;

    public GroupRule toModel(Group group) {
        return GroupRule.builder()
                .washingFrequency(washingFrequency)
                .fuelManager(fuelManager)
                .parkingLocation(parkingLocation)
                .etc(etc)
                .build();
    }

}
