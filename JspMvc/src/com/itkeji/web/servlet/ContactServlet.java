package com.itkeji.web.servlet;

import com.itkeji.web.entity.Contact;
import com.itkeji.web.service.ContactService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-18 15:22
 */
@WebServlet(name = "ContactServlet", urlPatterns = "/list")
public class ContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ContactService contactService = new ContactService();

        List<Contact> contacts = contactService.findAll();

        request.setAttribute("contacts",contacts);

        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
