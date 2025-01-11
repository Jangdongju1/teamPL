package com.persnal.teampl.dto.obj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TeamMemberObj {
    private Integer regNum;
    private String email;
    private String profileImg;
    private String teamName;
}
