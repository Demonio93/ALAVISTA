package Controlador;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="root";
    private static final String url="jdbc:mysql://localhost:3306/transparencia";
    
    public Conexion(){
        conn=null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
            if(conn!=null){
                System.out.println("Conexion establecida");
            }
        }catch(Exception e){
            System.out.println("Error de conexion");
        }
    }
    
    public Connection getConecction(){
        return conn;
    }
}
