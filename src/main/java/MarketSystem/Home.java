package MarketSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * @author Enzo Portillo
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        inButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarketSystem - Inicio");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡ BIENVENIDO A MARKET SYSTEM !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Con este programa podrás gestionar tu negocio en todos sus aspectos. Este sistema incluye:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 530, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText(">> MODO ADMINISTRADOR: puede gestionar usuarios, productos y ver las ventas realizadas.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 530, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText(">> MODO EMPLEADO: puede ver los productos disponibles, realizar ventas y visualizarlas.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 530, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText(">> GENERADOR PDF: crea un PDF en el escritorio. En el mismo se muestra un cuadro con las");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 530, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText(">> BASE DE DATOS: almacena usuarios, productos y las ventas con un año de de antiguedad.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 530, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("      Luego de un año, las ventas se eliminan de manera automática para ahorrar memoria.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 530, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Enzo Portillo | Derechos Reservados ©");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 230, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText(">> SISTEMA DE TURNOS: al iniciar sesión, comienza el turno automáticamente; y al cerrarla ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 530, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("      se finaliza el turno y muestra en pantalla cuánto tiempo duró y el monto recaudado.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 530, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("      ventas realizadas en cada turno, al finalizarlo. Esto se realiza automáticamente con el fin de");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 530, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 10, 280));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡ INGRESA AL SISTEMA !");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 230, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Contraseña: ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 100, 20));

        passField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 110, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("      almacenar la información indefinidamente hasta que el administrador desee eliminarla.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 530, -1));

        inButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/In.png"))); // NOI18N
        inButton.setText("INGRESAR");
        inButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        inButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inButtonMouseClicked(evt);
            }
        });
        getContentPane().add(inButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 90, 70));

        exitButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/Quit.png"))); // NOI18N
        exitButton.setText("CERRAR");
        exitButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        exitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 70, 70));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/Accout.png"))); // NOI18N
        jLabel17.setText("Inicia sesión para continuar...");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 230, 80));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/Background (Home).png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- IN BUTTON.
    //--------------------------------------------------------------------------

    private void inButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inButtonMouseClicked
        if (!passField.getText().equals("")) {
            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("select name, password, workstation, status from users");
                ResultSet rs = pst.executeQuery();

                boolean stop = false;

                while (rs.next() && !stop) {
                    String pass = rs.getString("password");
                    String status = rs.getString("status");

                    if (pass.equals(passField.getText()) && status.equals("Activo")) {
                        Data.user = rs.getNString("name");
                        String workstation = rs.getString("workstation");
                        this.setVisible(false);

                        if (workstation.equals("Administrador") || workstation.equals("Técnico")) {
                            new Manager().setVisible(true);
                        } else if (workstation.equals("Empleado")) {
                            new Employee().setVisible(true);
                        }

                        stop = true;
                    } else if (pass.equals(passField.getText()) && status.equals("Inactivo")) {
                        JOptionPane.showMessageDialog(null, "Usted se encuentra inactivo en el sistema.");
                        stop = true;
                    }
                }

                passField.setText("");
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes escribir una contraseña para continuar.");
        }
    }//GEN-LAST:event_inButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- EXIT BUTTON.
    //--------------------------------------------------------------------------

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- MAIN.
    //--------------------------------------------------------------------------
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel inButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passField;
    // End of variables declaration//GEN-END:variables
}
