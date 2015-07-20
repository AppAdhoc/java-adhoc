package net.appadhoc.demo;

import com.appadhoc.javasdk.AdhocSdk;
import com.appadhoc.javasdk.ExperimentFlags;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dongyuangui on 15/7/17.
 */
public class getFlagServerlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdhocSdk.getInstance().init("ADHOC_557009c04a9252b87f7b23c6");
        String client_id = (String) request.getSession().getAttribute("client_id");
        final PrintWriter writer = response.getWriter();


        // 设值编码格式
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        ExperimentFlags flag = AdhocSdk.getInstance().getExperimentFlags(client_id);

        writer.write(flag.getRawFlags().toString());
        for(int i=0;i<300000;i++){
            System.out.println(i);
            ExperimentFlags flag1 = AdhocSdk.getInstance().getExperimentFlags(AdhocSdk.getInstance().generateClientId());
            System.out.println(flag1.getRawFlags().toString());
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);

    }
}
