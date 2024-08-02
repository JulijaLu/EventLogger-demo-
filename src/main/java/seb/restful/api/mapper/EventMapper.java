package seb.restful.api.mapper;

import org.apache.ibatis.annotations.*;
import seb.restful.api.model.Event;

import java.util.List;

@Mapper
public interface EventMapper {

    @Select("select * from events")
    List<Event> findAll();

    @Select("SELECT * from events WHERE id=#{id}")
    Event findById(int id);

    @Insert("INSERT INTO events (" +
            "id, time, type, message, userId, transactionId ) " +
            "VALUES (#{id}, #{time}, #{type}, #{message}, #{userId}, #{transactionId});")
    void createEvent(Event event);

    @Update("UPDATE events SET id = #{id}, type = #{type}, message = #{message}," +
            " userId = #{userId}, transactionId = #{transactionId} WHERE ID = #{id}")
    void updateEvent(int id);

    @Delete("DELETE from events WHERE ID = #{id}")
    void deleteEvent(int id);

}
