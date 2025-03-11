package dao;


import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static Connection cnx;

    private DbConnection(){}

    public static Connection getCnx() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3307/GestionClient";
        String username = "root";
        String password = "";
        if(cnx==null){
            cnx = DriverManager.getConnection(url,username,password);
        }
        return cnx;
    }
}
