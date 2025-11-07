package com.example.grouvy.user.vo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Alias("UserApproval")
@Builder
public class UserApproval {
    private int approvalId;
    private Date createdDate;
    private Date updatedDate;
    private String status;

    private int userId;
    private User user;
}
