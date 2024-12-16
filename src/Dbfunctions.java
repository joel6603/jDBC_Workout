import java.sql.Connection;
import java.sql.DriverManager;

public class Dbfunctions {
    public Connection connect_to_db(String database,String user,String pass){
        Connection conn=null;
        try{
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/students",user,pass);
            if(conn!=null){
                System.out.println("mission success");
            }
            else{
                System.out.println("failed");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
//give necessary code and open module settings of the project
//go to libraries and add jar file