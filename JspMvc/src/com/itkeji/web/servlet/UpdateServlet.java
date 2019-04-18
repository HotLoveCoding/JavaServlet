package com.itkeji.web.servlet;

import com.itkeji.web.entity.Contact;
import com.itkeji.web.service.UpdateService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author shkstart
 * @create 2019-04-18 16:52
 */
@WebServlet(name = "UpdateServlet", urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

       Contact contact = new Contact();

        try {
            BeanUtils.populate(contact, request.getParameterMap());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        UpdateService service = new UpdateService();
        service.update(contact);

        request.setAttribute("contact", contact);
        request.getRequestDispatcher("/list").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
