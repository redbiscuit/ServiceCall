package com.bj.basic.mock;


import com.bj.basic.utils.InputOutputs;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Liu Dong {@literal <dongliu@live.cn>}
 */
public class EchoBodyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String body = InputOutputs.readAll(request.getReader());

        response.setContentType("text/plain");
        response.setCharacterEncoding(request.getCharacterEncoding());
        PrintWriter out = response.getWriter();
        out.write(body);
        out.flush();
    }
}
