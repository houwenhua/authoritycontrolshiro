package com.hwh.controller;

import com.hwh.vo.ActiveUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author hwh
 * @create 2018/9/25 11:22
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {

    @RequestMapping(value = "/subLogin",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String subLogin(ActiveUser user) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsercode(),user.getPassword());
        try{
            subject.login(token);
        } catch (AuthenticationException e) {
            return e.getMessage();
        }
        try{
            subject.checkRole("用户管理员");
        } catch (Exception e) {
            return e.getMessage();
        }
        try{
            subject.checkPermission("user:create");
        } catch (Exception e) {
            return e.getMessage();
        }

        return "登录成功";
    }
}
