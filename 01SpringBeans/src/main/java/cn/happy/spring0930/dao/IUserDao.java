package cn.happy.spring0930.dao;

import cn.happy.spring0930.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


/**
 * Created by LY on 2017/9/30.
 */
@Component
@Repository
@Service
public interface IUserDao {
    public void save(User u);
}
