package com.sample.adapter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.resource.ResourceException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//{codecitation class="brush: java; gutter: true;"}
@WebServlet("/TestRA")
public class TestRA extends HttpServlet {
  
    @Resource(mappedName = "java:/eis/SocketAdapter")
    private RAConnectionFactory connectionFactory;  
    public TestRA() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RAConnection connection=null;
        try {
            connection = connectionFactory.getConnection();
        } catch (ResourceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String result1 = connection.write("Message to the Adapter");
        PrintWriter out = response.getWriter();
        out.println(result1);
        out.flush();
        connection.close();
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}