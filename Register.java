import java.io.IOException;  
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import java.sql.*;
public class Register extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("name");
        String regno=request.getParameter("regno");
        String department=request.getParameter("department"); 
        String mobileno=request.getParameter("mobileno");
        String mailid=request.getParameter("mailid");
        String password=request.getParameter("password"); 
        try (PrintWriter out = response.getWriter()) {

        if(name.isEmpty() || regno.isEmpty() || department.isEmpty() || mobileno.isEmpty() || mailid.isEmpty()||password.isEmpty()){
        RequestDispatcher req = request.getRequestDispatcher("registration.html");
                req.include(request, response);
    }
    else
        {

    Connection con; 
    PreparedStatement st=null;
    ResultSet rs;
    String dri="com.mysql.jdbc.Driver"; 
    String
DBUrl="jdbc:mysql://jdbc-db.mysql.database.azure.com:3306/register_form?useSSL=false& requireSSL=false"; 
    Class.forName(dri);
    con=DriverManager.getConnection(DBUrl,"poomala@jdbc-db","hr@332001");


String sql = "insert into register "+ " (name,regno,department,mobileno,mailid,password)" + " values (?,?,?,?,?,?)";
 
st = con.prepareStatement(sql);  
st.setString(1,name);

st.setString(1,name);
st.setString(2,regno); 
st.setString(3,department); 
st.setString(4,mobileno); 
st.setString(5,mailid);
st.setString(6,password);
st.executeUpdate();
    RequestDispatcher req = request.getRequestDispatcher("success.jsp");  
    req.forward(request,response);
}

}catch(Exception ex){ 
 System.err.println(ex);
}
}

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
processRequest(request, response);
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
processRequest(request, response);
}


@Override
public String getServletInfo() {  
 return "Short description";
}

}
