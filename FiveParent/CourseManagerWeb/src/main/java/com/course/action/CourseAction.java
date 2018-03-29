package com.course.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/3/28.
 */
@Controller
public class CourseAction {
    @RequestMapping("/{page}")
    public String goToPage(@PathVariable String page){
        return page;
    }
}
