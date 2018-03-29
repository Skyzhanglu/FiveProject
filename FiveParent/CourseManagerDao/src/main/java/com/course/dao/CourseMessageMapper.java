package com.course.dao;

import com.course.pojo.CourseMessage;
import com.course.pojo.CourseMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMessageMapper {
    int countByExample(CourseMessageExample example);

    int deleteByExample(CourseMessageExample example);

    int deleteByPrimaryKey(Long courseId);

    int insert(CourseMessage record);

    int insertSelective(CourseMessage record);

    List<CourseMessage> selectByExampleWithBLOBs(CourseMessageExample example);

    List<CourseMessage> selectByExample(CourseMessageExample example);

    CourseMessage selectByPrimaryKey(Long courseId);

    int updateByExampleSelective(@Param("record") CourseMessage record, @Param("example") CourseMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseMessage record, @Param("example") CourseMessageExample example);

    int updateByExample(@Param("record") CourseMessage record, @Param("example") CourseMessageExample example);

    int updateByPrimaryKeySelective(CourseMessage record);

    int updateByPrimaryKeyWithBLOBs(CourseMessage record);

    int updateByPrimaryKey(CourseMessage record);
}