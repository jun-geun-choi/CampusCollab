package com.example.grouvy.user.vo;

import java.util.Date;
import lombok.Getter;
import org.apache.ibatis.type.Alias;

@Getter
@Alias("AttendanceHistory")
public class AttendanceHistory {

    private Long attendanceHistoryId;
    private Integer userId;
    private String status;
    private Date attendanceDate;
    private Double latitude;
    private Double longitude;
    private Double distance;

    User user;
}
