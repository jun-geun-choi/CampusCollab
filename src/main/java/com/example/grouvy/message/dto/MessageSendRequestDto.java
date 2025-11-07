package com.example.grouvy.message.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageSendRequestDto {
    private List<Integer> receiverIds = new ArrayList<>();
    private List<Integer> ccIds = new ArrayList<>();
    private List<Integer> bccIds = new ArrayList<>();
    private String subject;
    private String messageContent;

}
