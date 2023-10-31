package MarketSystem;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 * @author Enzo Portillo
 */
public class Cart extends javax.swing.JFrame {

    private String id;
    private int amount;

    public Cart() {
        initComponents();
        setLocationRelativeTo(null);
        userDBTable(Data.cartModel);
        setTotalPriceLabel();
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- TABLE METOD.
    //--------------------------------------------------------------------------
    private void userDBTable(DefaultTableModel model) {
        model = (DefaultTableModel) cartTable.getModel();

        if (model.getColumnCount() == 0) {
            model.addColumn("ID");
            model.addColumn("Producto");
            model.addColumn("Cant.");
            model.addColumn("Precio U.");
            model.addColumn("Precio T.");
        }

        String[] fila = new String[5];

        for (Product prod : Data.productList) {
            fila[0] = prod.getId();
            fila[1] = prod.getName();
            fila[2] = prod.getAmount();
            fila[3] = "$" + prod.getPrice();
            fila[4] = "$" + prod.getTotalPrice();

            model.addRow(fila);
        }
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- TOTAL PRICE LABEL.
    //--------------------------------------------------------------------------
    private void setTotalPriceLabel() {
        int totalPrice = 0;

        for (Product prod : Data.productList) {
            totalPrice += Integer.parseInt(prod.getTotalPrice());
        }

        totalPriceLabel.setText("Precio total: $" + totalPrice);
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalPriceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        emptyButton = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        deleteButton = new javax.swing.JLabel();
        refreshButton = new javax.swing.JLabel();
        decreaseButton = new javax.swing.JLabel();
        increaseButton = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarketSystem -  Carrito de Compras");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPriceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPriceLabel.setText("PRECIO TOTAL");
        totalPriceLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(totalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 310, 70));

        cartTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cantidad", "Precio U.", "Precio T."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cartTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, 470));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡ CARRITO DE COMPRAS !");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        emptyButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emptyButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/Cart (empty).png"))); // NOI18N
        emptyButton.setText("VACIAR");
        emptyButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        emptyButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emptyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emptyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        emptyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        emptyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptyButtonMouseClicked(evt);
            }
        });
        getContentPane().add(emptyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 60, 70));

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/Out.png"))); // NOI18N
        backButton.setText("VOLVER");
        backButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 60, 70));

        deleteButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deleteButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/Delete.png"))); // NOI18N
        deleteButton.setText("ELIMINAR");
        deleteButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 60, 70));

        refreshButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/Refresh.png"))); // NOI18N
        refreshButton.setText("ACTUALIZAR");
        refreshButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });
        getContentPane().add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 80, 70));

        decreaseButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        decreaseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decreaseButton.setText("-");
        decreaseButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        decreaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decreaseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decreaseButtonMouseClicked(evt);
            }
        });
        getContentPane().add(decreaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 20, 20));

        increaseButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        increaseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        increaseButton.setText("+");
        increaseButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        increaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        increaseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                increaseButtonMouseClicked(evt);
            }
        });
        getContentPane().add(increaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 20, 20));

        amountLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountLabel.setText("CANTIDAD");
        amountLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 90, 50));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MarketSystem/Images/Background (General).png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- BACK BUTTON.
    //--------------------------------------------------------------------------
    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_backButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- DELETE BUTTON.
    //--------------------------------------------------------------------------
    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        for (Product prod : Data.productList) {
            if (prod.getId().equals(id)) {
                Data.productList.remove(prod);

                Data.clearTable(Data.cartModel, cartTable);
                userDBTable(Data.cartModel);
                setTotalPriceLabel();
            }

            if (Data.productList.isEmpty() == true) {
                totalPriceLabel.setText("SIN PRODUCTOS.");
            }
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- EMPTY BUTTON.
    //--------------------------------------------------------------------------
    private void emptyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptyButtonMouseClicked
        Data.productList.clear();
        Data.clearTable(Data.cartModel, cartTable);
        userDBTable(Data.cartModel);
        totalPriceLabel.setText("SIN PRODUCTOS.");
    }//GEN-LAST:event_emptyButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- TABLE SELECTED ITEM.
    //--------------------------------------------------------------------------
    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        if (cartTable.getSelectedRowCount() > 0) {
            id = cartTable.getValueAt(cartTable.getSelectedRow(), 0).toString();
        }
    }//GEN-LAST:event_cartTableMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- REFRESH BUTTON.
    //--------------------------------------------------------------------------
    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        Data.clearTable(Data.cartModel, cartTable);
        userDBTable(Data.cartModel);
        setTotalPriceLabel();
    }//GEN-LAST:event_refreshButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- DECREASE BUTTON.
    //--------------------------------------------------------------------------
    private void decreaseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decreaseButtonMouseClicked
        for (Product prod : Data.productList) {
            if (prod.getId().equals(id)) {
                if (!prod.getAmount().equals("1")) {
                    amount = Integer.parseInt(prod.getAmount()) - 1;
                    prod.setAmount(Integer.toString(amount));
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes reducir más la cantidad de este producto.");
                }
            }
        }

        Data.clearTable(Data.cartModel, cartTable);
        userDBTable(Data.cartModel);
        setTotalPriceLabel();
    }//GEN-LAST:event_decreaseButtonMouseClicked

//--------------------------------------------------------------------------
//-------------------------------------------------------------------------- INCREASE BUTTON.
//--------------------------------------------------------------------------
    private void increaseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_increaseButtonMouseClicked
        for (Product prod : Data.productList) {
            if (prod.getId().equals(id)) {
                if (Integer.parseInt(prod.getStock()) > amount) {
                    amount = Integer.parseInt(prod.getAmount()) + 1;
                    prod.setAmount(Integer.toString(amount));
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede sumar otro producto, superarás el stock.");
                }
            }
        }

        Data.clearTable(Data.cartModel, cartTable);
        userDBTable(Data.cartModel);
        setTotalPriceLabel();
    }//GEN-LAST:event_increaseButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel decreaseButton;
    private javax.swing.JLabel deleteButton;
    private javax.swing.JLabel emptyButton;
    private javax.swing.JLabel increaseButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel refreshButton;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
