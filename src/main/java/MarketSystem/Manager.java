package MarketSystem;

/**
 * @author Enzo Portillo
 */

public class Manager extends javax.swing.JFrame {
    
    public Manager() {
        initComponents();
        setLocationRelativeTo(null);
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userButton = new javax.swing.JLabel();
        inventoryButton = new javax.swing.JLabel();
        salesButton = new javax.swing.JLabel();
        marketButton = new javax.swing.JLabel();
        supportButton = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        outButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        outButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Out.png")); // NOI18N
        outButton.setText("VOLVER");
        outButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        outButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        outButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        outButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outButtonMouseClicked(evt);
            }
        });
        getContentPane().add(outButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 100, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡ BIENVENIDO USUARIO !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Esta es la interfaz del administrador. Aquí podrás gestionar tus");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estas son las opciones disponibles para los administradores...");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, -1));

        userButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\UsersManager.png")); // NOI18N
        userButton.setText("USUARIOS");
        userButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        userButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userButtonMouseClicked(evt);
            }
        });
        getContentPane().add(userButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        inventoryButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        inventoryButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventoryButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Inventory.png")); // NOI18N
        inventoryButton.setText("INVENTARIO");
        inventoryButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inventoryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventoryButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inventoryButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inventoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryButtonMouseClicked(evt);
            }
        });
        getContentPane().add(inventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 100, -1));

        salesButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salesButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Sales.png")); // NOI18N
        salesButton.setText("VENTAS");
        salesButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesButtonMouseClicked(evt);
            }
        });
        getContentPane().add(salesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 100, -1));

        marketButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        marketButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marketButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Market.png")); // NOI18N
        marketButton.setText("NEGOCIOS");
        marketButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        marketButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        marketButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        marketButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        marketButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marketButtonMouseClicked(evt);
            }
        });
        getContentPane().add(marketButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

        supportButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        supportButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supportButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Help.png")); // NOI18N
        supportButton.setText("SOPORTE");
        supportButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        supportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supportButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supportButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        supportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supportButtonMouseClicked(evt);
            }
        });
        getContentPane().add(supportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 100, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("empleados, productos, negocios y ventas como quieras.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Background (Manager).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- ACTION BUTTONS.
    //--------------------------------------------------------------------------
    
    private void userButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseClicked
        this.setVisible(false);
        new Users().setVisible(true);
    }//GEN-LAST:event_userButtonMouseClicked

    private void inventoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryButtonMouseClicked
        this.setVisible(false);
        new Inventory().setVisible(true);
    }//GEN-LAST:event_inventoryButtonMouseClicked

    private void salesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesButtonMouseClicked
        this.setVisible(false);
        new Sales().setVisible(true);
    }//GEN-LAST:event_salesButtonMouseClicked

    private void marketButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marketButtonMouseClicked
        this.setVisible(false);
        new Markets().setVisible(true);
    }//GEN-LAST:event_marketButtonMouseClicked

    private void supportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supportButtonMouseClicked
        Data.getInfo();
    }//GEN-LAST:event_supportButtonMouseClicked

    private void outButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outButtonMouseClicked
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_outButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel inventoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel marketButton;
    private javax.swing.JLabel outButton;
    private javax.swing.JLabel salesButton;
    private javax.swing.JLabel supportButton;
    private javax.swing.JLabel userButton;
    // End of variables declaration//GEN-END:variables
}
