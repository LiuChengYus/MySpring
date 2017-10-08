package cn.happy.servlet;

import cn.happy.entity.Book;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LY on 2017/10/5.
 */
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action=request.getParameter("action");
       //接收客户端发送的数据
      /* if(action.equals("admin")){
           response.getWriter().write("true");
       }else{
           response.getWriter().write("false");
       }*/

       List<Book> list=new ArrayList<Book>();
       Book b1=new Book();
       b1.setName("小红");
       b1.setPrice(12);

        Book b2=new Book();
        b2.setName("小明");
        b2.setPrice(22);

        Book b3=new Book();
        b3.setName("小军");
        b3.setPrice(33);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        String json = JSON.toJSONString(list);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);

    }
}
