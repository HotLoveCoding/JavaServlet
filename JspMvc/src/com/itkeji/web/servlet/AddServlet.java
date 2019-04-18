package com.itkeji.web.servlet;

import com.itkeji.web.entity.Contact;
import com.itkeji.web.service.AddService;
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
 * @create 2019-04-18 16:06
 */
@WebServlet(name = "AddServlet", urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        //封装请求的数据
        Contact contact = new Contact();

        try {
            BeanUtils.populate(contact, request.getParameterMap());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        AddService service = new AddService();
        service.save(contact);

        // 从定向到list页面
        response.sendRedirect(request.getContextPath() + "/list");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
