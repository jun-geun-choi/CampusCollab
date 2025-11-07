package com.example.grouvy.message.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageSentResponseDto {
    private Long messageId;
    private int senderId;
    private String subject;
    private String messageContent;
    private Date sendDate;
    private String recallAble;
    private Long sendId;
    private boolean currentlyRecallable;
}
