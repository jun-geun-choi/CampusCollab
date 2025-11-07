package com.example.grouvy.task.dto.response;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("ReceiveUserFeedback")
public class ReceiveUserFeedback {
    private int taskId;
    private int receiveUserId;
    private Date updatedDate;
    private int progressPercent;
    private String comment;
}
