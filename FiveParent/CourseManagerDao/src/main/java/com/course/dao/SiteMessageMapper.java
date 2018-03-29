package com.course.dao;

import com.course.pojo.SiteMessage;
import com.course.pojo.SiteMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteMessageMapper {
    int countByExample(SiteMessageExample example);

    int deleteByExample(SiteMessageExample example);

    int deleteByPrimaryKey(Long siteId);

    int insert(SiteMessage record);

    int insertSelective(SiteMessage record);

    List<SiteMessage> selectByExample(SiteMessageExample example);

    SiteMessage selectByPrimaryKey(Long siteId);

    int updateByExampleSelective(@Param("record") SiteMessage record, @Param("example") SiteMessageExample example);

    int updateByExample(@Param("record") SiteMessage record, @Param("example") SiteMessageExample example);

    int updateByPrimaryKeySelective(SiteMessage record);

    int updateByPrimaryKey(SiteMessage record);
}