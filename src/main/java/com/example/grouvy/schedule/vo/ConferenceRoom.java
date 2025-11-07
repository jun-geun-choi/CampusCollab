package com.example.grouvy.schedule.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("ConferenceRoom")
public class ConferenceRoom {
    private int conferenceRoomId;
    private String conferenceRoomTitle;
    private String conferenceRoomLocation;
    private String conferenceRoomExplanation;
    private String conferenceRoomEquipment;
    private int conferenceRoomLimit;
    private Date createdDate;
    private Date updatedDate;


}
