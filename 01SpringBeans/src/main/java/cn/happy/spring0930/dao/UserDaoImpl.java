package cn.happy.spring0930.dao;

import cn.happy.spring0930.entity.User;

/**
 * Created by LY on 2017/9/30.
 */
public class UserDaoImpl implements  IUserDao{
    public void save(User u) {
        System.out.println("save success");
    }
}
