package com.moata.moata.dto.info;

import com.moata.moata.entity.info.Info;
import com.moata.moata.constant.InfoType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoResponse {
    private long infoId;
    private InfoType type;
    private String title;
    private String content;

    public InfoResponse from(Info info) {
        return InfoResponse.builder()
                .infoId(info.getInfoId())
                .type(info.getType())
                .title(info.getTitle())
                .content(info.getContent())
                .build();
    }
}
