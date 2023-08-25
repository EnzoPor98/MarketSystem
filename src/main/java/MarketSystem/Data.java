package MarketSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JOptionPane;

/**
 * @author Enzo Portillo.
 */
public class Data {
    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- USER NAME.
    //--------------------------------------------------------------------------

    protected static String user;

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- DATE.
    //--------------------------------------------------------------------------
    protected static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String date = dateFormat.format(new Date());
        return date;
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- SUPPORT INFO.
    //--------------------------------------------------------------------------
    protected static void getInfo() {
        JOptionPane.showMessageDialog(null, "Si tiene problemas o consultas sobre el programa, comuníquese con el técnico"
                + "\n" + "Nombre: Enzo Portillo"
                + "\n" + "Contacto: +54 9 345 4753433"
                + "\n" + "Correo: enzoarielportillo1@gmail.com");
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- CONNECTION TO JDBC.
    //--------------------------------------------------------------------------
    protected static Connection getConnection() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marketsystem", "root", "");
            return cn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la base de datos." + "\n" + e);
        }
        
        return null;
    }

}
