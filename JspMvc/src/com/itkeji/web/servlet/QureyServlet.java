package com.itkeji.web.servlet;

import com.itkeji.web.entity.Contact;
import com.itkeji.web.service.QueryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2019-04-18 17:03
 */
@WebServlet(name = "QureyServlet", urlPatterns = "/queryById")
public class QureyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        System.out.println(id);
        // 调用service的方法
        QueryService service = new QueryService();
           Contact contact = service.findById(id);

           request.setAttribute("contact", contact);

           request.getRequestDispatcher("/update.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
