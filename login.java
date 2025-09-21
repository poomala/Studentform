import java.io.IOException;  
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException; 
 import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
 import javax.servlet.http.HttpServletResponse;  
 import java.sql.*;

public class login extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8"); 
String reg=request.getParameter("regno");
String pwd=request.getParameter("password"); 
 try (PrintWriter out = response.getWriter()) {
Connection con; Statement st; ResultSet rs;
String dri="com.mysql.cj.jdbc.Driver";  
String
DBUrl="jdbc:mysql://jdbc-db.mysql.database.azure.com:3306/register_form?useSSL=false& requireSSL=false";
Class.forName(dri);  
con=DriverManager.getConnection(DBUrl,"harishraja@jdbc-db","hr@332001");

st=con.createStatement();
String sql="SELECT * FROM register WHERE regno LIKE \'%" + reg+ "%\'" + " AND password LIKE \'%" + pwd + "%\'";

rs=st.executeQuery(sql);


if( !rs.isBeforeFirst()&& rs.getRow()==0){
RequestDispatcher req = request.getRequestDispatcher("loginun.jsp"); 
 req.include(request, response);
}
else
 
{
RequestDispatcher req = request.getRequestDispatcher("enroll.jsp");
 req.forward(request, response);
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
