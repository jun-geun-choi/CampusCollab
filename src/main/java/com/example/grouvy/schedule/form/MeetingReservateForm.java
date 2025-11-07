package com.example.grouvy.schedule.form;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MeetingReservateForm {

    //private int userId;
    private int conferenceRoomId;
    private String reservationDate;
    private LocalDateTime reservationStarttime;
    private LocalDateTime reservationEndtime;
    private int userId;
}
