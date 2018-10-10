package com.hwh.controller;

import com.hwh.po.User;
import com.hwh.service.MenusService;
import com.hwh.vo.MenusVo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author houwenhua
 * @Date 2018/10/3 13:04
 */
@Controller
@RequestMapping("/menusController")
public class MenusController {

    @Autowired
    private MenusService menusService;

    @RequestMapping("/findMenus")
    @ResponseBody
    public List<MenusVo> findMenus() {

        Object user =  SecurityUtils.getSubject().getPrincipal();
        List<MenusVo> list = menusService.getMenus();
        return list;
    }
}
