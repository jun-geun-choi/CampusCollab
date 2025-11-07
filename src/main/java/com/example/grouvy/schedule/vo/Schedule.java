package com.example.grouvy.schedule.vo;

import java.time.LocalDateTime;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("Schedule")
public class Schedule {
    private int scheduleId;
    private int fileId;
    private int userId;
    private Date scheduleDate;
    private LocalDateTime scheduleStarttime;
    private LocalDateTime scheduleEndtime;
    private String scheduleTitle;
    private String scheduleContent;
    private Date createdDate;
    private Date updatedDate;
    private int departmentId;
    private String scheduleLocation;
    private String isDeleted;
    private int categoryId;
}
