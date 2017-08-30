package com.yjg;

import com.yjg.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weixin on 17-8-28.
 */
public interface UserDao {

    public User userInfo(String sid);

    public List<User> userlist(@Param("sid") String sid,
                               @Param("sname") String sname);
}
