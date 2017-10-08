package cn.happy.spring0930.service;

import cn.happy.spring0930.dao.IUserDao;
import cn.happy.spring0930.entity.User;

/**
 * Created by LY on 2017/9/30.
 */
public class UserServiceImpl implements  IUserService {
    private IUserDao dao;
    public void save2(User u) {
        dao.save(u);
    }

    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }
}
