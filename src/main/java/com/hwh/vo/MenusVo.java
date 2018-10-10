package com.hwh.vo;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author houwenhua
 * @Date 2018/10/3 13:05
 */
public class MenusVo {

    private Integer id;

    private String text;

    private String url;

    private String icon;

    private List<MenusVo> menus;

    public MenusVo() {
    }

    public MenusVo(Integer id, String text, String url, String icon, List<MenusVo> menus) {
        this.id = id;
        this.text = text;
        this.url = url;
        this.icon = icon;
        this.menus = menus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<MenusVo> getMenus() {
        return menus;
    }

    public void setMenus(List<MenusVo> menus) {
        this.menus = menus;
    }
}
