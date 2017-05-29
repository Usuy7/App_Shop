package DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javier
 */
public class ConectDB {

    Connection con = null;

    public com.mysql.jdbc.Connection AbrirConexion() throws SQLException {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/app_shop";
            String user = "root";
            String pass = "";
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Abriendo Conexión con la Base de Datos");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR");
        }

        return (com.mysql.jdbc.Connection) con;
    }

    public void CerrarConexion(Connection con) {

        if (con != null) {

            try {
                con.close();
                System.out.println("Cerrando Conexión con la Base de Datos");
            } catch (SQLException ex) {
                Logger.getLogger(ConectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}