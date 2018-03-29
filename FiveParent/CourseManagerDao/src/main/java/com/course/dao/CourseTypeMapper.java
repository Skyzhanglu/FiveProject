package com.course.dao;

import com.course.pojo.CourseType;
import com.course.pojo.CourseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTypeMapper {
    int countByExample(CourseTypeExample example);

    int deleteByExample(CourseTypeExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    List<CourseType> selectByExampleWithBLOBs(CourseTypeExample example);

    List<CourseType> selectByExample(CourseTypeExample example);

    CourseType selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByExample(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKeyWithBLOBs(CourseType record);

    int updateByPrimaryKey(CourseType record);
}