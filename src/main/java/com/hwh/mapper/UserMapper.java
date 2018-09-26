package com.hwh.mapper;

import com.hwh.po.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * @author hwh
 * @create 2018/9/25 13:46
 */
@Repository
public interface UserMapper {

    public User getUserByUserCode(String usercode);
}
