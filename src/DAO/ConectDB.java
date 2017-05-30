package DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javier
 */
public class ConectDB {

    static Statement s;
    
    Connection con = null;

    public Connection getCon() {
        return con;
    }

    public ConectDB() {
    }

    public void AbrirConexion() throws SQLException {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/app_shop";
            String user = "root";
            String pass = "";
            con =  (Connection) DriverManager.getConnection(url, user, pass);
            s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Abriendo Conexión con la Base de Datos");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR");
        }       
    } 
}