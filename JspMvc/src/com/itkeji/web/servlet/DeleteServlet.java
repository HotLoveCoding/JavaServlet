package com.itkeji.web.servlet;

import com.itkeji.web.service.DeleteService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2019-04-18 20:25
 */
@WebServlet(name = "DeleteServlet", urlPatterns = "/deleteById")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id")) ;

        DeleteService service = new DeleteService();
         service.delete(id);


        response.sendRedirect( request.getContextPath() + "/list");
    }
}
