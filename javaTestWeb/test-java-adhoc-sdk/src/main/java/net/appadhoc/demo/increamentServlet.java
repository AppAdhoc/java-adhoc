package net.appadhoc.demo;
//
//import com.appadhoc.javasdk.AdhocSdk;
//import com.appadhoc.javasdk.T;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dongyuangui on 15/7/19.
 */
public class increamentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String client_id = (String) request.getSession().getAttribute("client_id");
        String inc_key = (String) request.getSession().getAttribute("key");
        // 设值编码格式
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
//
//        AdhocSdk.getInstance().init("ADHOC_557009c04a9252b87f7b23c6");
//        AdhocSdk.getInstance().incrementStat(client_id,inc_key,1);
//        AdhocSdk.getInstance().incrementStat(client_id, inc_key,1.0f);
//        AdhocSdk.getInstance().incrementStat(client_id, inc_key,1l);
//        AdhocSdk.getInstance().incrementStat(client_id, inc_key,"added");
//        AdhocSdk.getInstance().incrementStat(client_id,inc_key,1.0d);
//        T.i("client id : " + client_id);
        final PrintWriter writer = response.getWriter();

        writer.write("后台统计执行完成");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
