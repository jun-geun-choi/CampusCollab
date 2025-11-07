package com.example.grouvy.user.vo;

import java.util.Date;
import lombok.Getter;
import org.apache.ibatis.type.Alias;

@Getter
@Alias("LoginHistory")
public class LoginHistory {

    private Long loginHistoryId;
    private Integer userId;
    private String ipAddress;
    private Date loginTime;
    private String loginStatus;

    User user;
}
