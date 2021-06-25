package src.com.itheima.servlet; /**
 * @author shkstart
 * @create 2021-06-04 18:34
 */

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.User;
import com.itheima.utills.JsonUtils;

import javax.jws.soap.SOAPBinding;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/user")
public class ServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("name");
        String like = request.getParameter("like");
        String city = request.getParameter("city");
        User user = new User(name, like, city);




        // User user = JSON.parseObject(request.getInputStream(), User.class);
        System.out.println(user);
        JsonUtils.printResult(response,user);
        // response.setContentType("application/json;charset=utf-8");
         //response.getWriter().write(jsonStr);
      // JsonUtils.printResult(response,user);
       // System.out.println("21111");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是post请求");
        doGet(request,response);
    }
}
