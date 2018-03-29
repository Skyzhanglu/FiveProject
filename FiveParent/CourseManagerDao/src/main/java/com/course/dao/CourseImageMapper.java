package com.course.dao;

import com.course.pojo.CourseImage;
import com.course.pojo.CourseImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseImageMapper {
    int countByExample(CourseImageExample example);

    int deleteByExample(CourseImageExample example);

    int deleteByPrimaryKey(Long cimageId);

    int insert(CourseImage record);

    int insertSelective(CourseImage record);

    List<CourseImage> selectByExample(CourseImageExample example);

    CourseImage selectByPrimaryKey(Long cimageId);

    int updateByExampleSelective(@Param("record") CourseImage record, @Param("example") CourseImageExample example);

    int updateByExample(@Param("record") CourseImage record, @Param("example") CourseImageExample example);

    int updateByPrimaryKeySelective(CourseImage record);

    int updateByPrimaryKey(CourseImage record);
}