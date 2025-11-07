package com.example.grouvy.schedule.form;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@ToString
public class HolidayRegisterForm {

    private String holidayTitle;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date holidayDate;
}
