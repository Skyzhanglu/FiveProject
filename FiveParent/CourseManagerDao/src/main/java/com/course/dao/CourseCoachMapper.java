package com.course.dao;

import com.course.pojo.CourseCoach;
import com.course.pojo.CourseCoachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseCoachMapper {
    int countByExample(CourseCoachExample example);

    int deleteByExample(CourseCoachExample example);

    int insert(CourseCoach record);

    int insertSelective(CourseCoach record);

    List<CourseCoach> selectByExample(CourseCoachExample example);

    int updateByExampleSelective(@Param("record") CourseCoach record, @Param("example") CourseCoachExample example);

    int updateByExample(@Param("record") CourseCoach record, @Param("example") CourseCoachExample example);
}