package com.hwh.service;

import com.hwh.mapper.MenusMapper;
import com.hwh.mapper.PermissionMapper;
import com.hwh.vo.MenusVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author houwenhua
 * @Date 2018/10/3 13:08
 */
@Service
public class MenusService {

    @Autowired
    private MenusMapper menusMapper;

    public List<MenusVo> getMenus() {

        List<MenusVo> menusVos = menusMapper.getMenus();
        return null;
    }
}
