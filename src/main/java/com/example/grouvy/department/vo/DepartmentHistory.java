package com.example.grouvy.department.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentHistory {

    private int historyId;
    private Long departmentId;
    private String changeType;
    private String oldValue;
    private String newValue;
    private int changerUserId;
    private Date changeDate;

    //조인해서 가져올 추가정보
    private String departmentName;
    private String changerUserName;
}
