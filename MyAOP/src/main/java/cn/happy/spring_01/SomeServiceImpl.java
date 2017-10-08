package cn.happy.spring_01;

/**
 * Created by LY on 2017/10/7.
 */
public class SomeServiceImpl implements ISomeService {
    private ISomeDAO dao=new SomeDAOImpl();
    public void doSome() {
        dao.doSome();
    }

    public ISomeDAO getDao() {
        return dao;
    }

    public void setDao(ISomeDAO dao) {
        this.dao = dao;
    }
}
