package cn.happy.freemarker1008_01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LY on 2017/10/8.
 */
public class HelloServlet extends HttpServlet {
    private static List<User> list=new ArrayList<User>();

    static{
        list.add(new User("小红","12"));
        list.add(new User("小明","21"));
        list.add(new User("小卡","22"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
         request.setAttribute("users",list);
         request.getRequestDispatcher("/index.ftl").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        if(null !=name && null != age ){
            synchronized (list) {
                list.add(new User(name,age));
            }
        }
        doGet(request, response);

    }
}
