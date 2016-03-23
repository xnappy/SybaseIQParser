package de.analysis.compiler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AnalysisServlet/*")
public class AnalysisServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private String result;  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {      
        // Bean erzeugen und im Request-Scope ablegen
        MainVisitor mainVisitor = new MainVisitor();
        this.result = "";
        
        // get SQL from index.jsp
        mainVisitor.setSqlAndResult(request.getParameter("sqlContent"));
    
        // get result and print it into commentbox
        this.result = mainVisitor.getResult();
        
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(this.result);
    }
}
