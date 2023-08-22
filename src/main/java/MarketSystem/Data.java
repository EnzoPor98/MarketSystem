package MarketSystem;

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
        DateFormat dateFormat = new SimpleDateFormat("dd/m/yyyy");
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
    //-------------------------------------------------------------------------- 
    //--------------------------------------------------------------------------
    
    
}
