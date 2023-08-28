package MarketSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
        DateFormat dateFormat = new SimpleDateFormat("d/M/YYYY");
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

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- PROCESS LABEL MESSAGE.
    //--------------------------------------------------------------------------
    protected static void setProcess(JLabel processLabel, JTextField idField, String letter) {
        processLabel.setIcon(new ImageIcon("C:/Users/Usuario/OneDrive/Escritorio/Programación/Proyectos Personales/MarketSystem/Images/Done.png"));

        switch (letter) {
            case "C":
                processLabel.setText("SE AGREGÓ UN NUEVO ELEMENTO.");
                break;
            case "U":
                processLabel.setText("SE MODIFICÓ EL ELEMENTO [ID: " + idField.getText() + "]");
                break;
            case "D":
                processLabel.setText("SE ELIMINÓ EL ELEMENTO [ID: " + idField.getText() + "]");
                break;
            case "P":
                processLabel.setText("SE CREÓ UN ARCHIVO PDF.");
                break;
        }

        processLabel.setVisible(true);
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- TABLE MODELS.
    //--------------------------------------------------------------------------
    protected static DefaultTableModel userModel;
    protected static DefaultTableModel productModel;

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- CLEAR TABLE.
    //--------------------------------------------------------------------------
    protected static void clearTable(DefaultTableModel model, JTable table) {
        model = (DefaultTableModel) table.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- CONNECTION JDBC ERROR.
    //--------------------------------------------------------------------------
    protected static void errorDBMessage(SQLException e) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la base de datos." + "\n" + e);
    }

    
}
