package cn.happy.spring1006_2;



/**
 * Created by LY on 2017/10/6.
 */
public class UserDAOImpl implements IUserDAO {

    public String add() {
        System.out.println("add");
        return "add";
    }

    public String edit() {
        System.out.println("edit");
        return "edit";
    }
}
