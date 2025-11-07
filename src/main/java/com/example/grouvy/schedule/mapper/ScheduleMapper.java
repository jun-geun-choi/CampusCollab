package com.example.grouvy.schedule.mapper;

import com.example.grouvy.schedule.vo.ConferenceRoom;
import com.example.grouvy.schedule.vo.ConferenceRoomReservation;
import com.example.grouvy.schedule.vo.DeleteHistory;
import com.example.grouvy.schedule.vo.Holiday;
import com.example.grouvy.schedule.vo.Schedule;
import com.example.grouvy.schedule.vo.ScheduleCategory;
import com.example.grouvy.schedule.vo.SimpleReservation;
import com.example.grouvy.schedule.vo.SimpleSchedule;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleMapper {

    Holiday getHolidayById(int holidayId);

    Schedule getScheduleByUserNo(int no);

    List<SimpleSchedule> getSimpleSchedule(int no, long departmentId);

    List<SimpleReservation> getConferenceRoomReservation();

    List<Holiday> getHoliday();

    List<ScheduleCategory> getScheduleCategory();

    List<ConferenceRoom> getMeetingRoom();

    List<ConferenceRoom> getConferenceRoom();

    String getUserDepartmentName(int no);

    void updateCategory(ScheduleCategory scheduleCategory);

    void insertSchedule(Schedule schedule);

    void insertHoliday(Holiday holiday);

    void deleteScheduleByUserNo(int no);

    void deleteScheduleById(int no);

    void deleteHolidayById(int no);

    void deleteMeetingroomById(int no);

    void insertConferenceRoom(ConferenceRoom conferenceRoom);

    void deleteScheduleAllResigned();

    void insertHistory(DeleteHistory deleteHistory);

    void insertReservation(ConferenceRoomReservation conferenceRoomReservation);

    List<DeleteHistory> getHistory();

}
