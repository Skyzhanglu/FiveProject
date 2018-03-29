package com.five.service;

import com.course.dao.SiteMessageMapper;
import com.course.pojo.SiteMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/28.
 */
@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    private SiteMessageMapper siteMessageMapper;
    @Override
    public Long addSite(SiteMessage sitePojo) {
        siteMessageMapper.insert(sitePojo);
        return sitePojo.getSiteId();
    }
}
