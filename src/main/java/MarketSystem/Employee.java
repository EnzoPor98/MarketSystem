package MarketSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 * @author Enzo Portillo.
 */
public class Employee extends javax.swing.JFrame {

    private int cart = 0;
    private int amount = 0;
    private int newStock = 0;
    private Product prod;
    private Chronometer chrono = new Chronometer();

    public Employee() {
        initComponents();
        setLocationRelativeTo(null);
        Data.setWelcome(welcomeLabel);
        setCartNumber();
        userDBTable(Data.employeeModel);
        processLabel.setVisible(false);
        chrono.start();
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- TABLE METODS.
    //--------------------------------------------------------------------------
    private void userDBTable(DefaultTableModel model) {
        try {
            PreparedStatement pst = Data.getConnection().prepareStatement("select * from inventory");
            ResultSet rs = pst.executeQuery();

            model = (DefaultTableModel) employeeTable.getModel();

            if (model.getColumnCount() == 0) {
                model.addColumn("ID");
                model.addColumn("Producto");
                model.addColumn("Precio");
                model.addColumn("Stock");
                model.addColumn("Proveedor");
            }

            while (rs.next()) {
                if (!rs.getString("Stock").equals("0")) {
                    Object[] fila = new Object[5];

                    for (int i = 0; i < 5; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }

                    model.addRow(fila);
                }
            }

            Data.getConnection().close();
        } catch (SQLException e) {
            Data.errorDBMessage(e);
        }
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- CART NUMBER.
    //--------------------------------------------------------------------------
    private void setCartNumber() {
        try {
            PreparedStatement pst = Data.getConnection().prepareStatement("select cart from sales");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                if (!rs.getString("cart").equals("No")) {
                    cart = Integer.parseInt(rs.getString("cart"));
                }
            }

            cart++;
        } catch (SQLException e) {
            Data.errorDBMessage(e);
        }
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- LOWER STOCK.
    //--------------------------------------------------------------------------
    private void lowerStock(Product prod) {
        try {
            newStock = Integer.parseInt(prod.getStock()) - Integer.parseInt(prod.getAmount());

            PreparedStatement pst = Data.getConnection().prepareStatement("update inventory set stock=? where ID=" + prod.getId());
            pst.setString(1, Integer.toString(newStock));
            pst.executeUpdate();
        } catch (SQLException e) {
            Data.errorDBMessage(e);
        }
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- PROCESS LABEL.
    //--------------------------------------------------------------------------
    private void setProcessLabel(char letter) {
        processLabel.setVisible(true);
        processLabel.setIcon(new ImageIcon("C:/Users/Usuario/OneDrive/Escritorio/Programación/Proyectos Personales/MarketSystem/src/Images/Done.png"));

        switch (letter) {
            case 'S':
                processLabel.setText("Se realizó la venta con éxito.");
                break;
            case 'A':
                processLabel.setText("Se agregó un elemento al carrito.");
                break;
            case 'E':
                processLabel.setText("Se vació el carrito.");
                break;
            default:
                break;
        }
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- EMPTY FIELDS.
    //--------------------------------------------------------------------------
    private void emptyFields() {
        productField.setText("");
        amountField.setText("");
        totalField.setText("");
        searchField.setText("");
        searchBox.setSelectedIndex(0);
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- RAISED MONEY.
    //--------------------------------------------------------------------------
    private int getRaisedMoney() {
        String money;
        int total = 0;

        try {
            PreparedStatement pst = Data.getConnection().prepareStatement("select * from sales");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                if (rs.getString("date").equals(Data.getDate())) {
                    money = rs.getString("total").replace("$", "");

                    total += Integer.parseInt(money);
                }
            }
        } catch (SQLException e) {
            Data.errorDBMessage(e);
        }
        return total;
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        amountField = new javax.swing.JTextField();
        productField = new javax.swing.JTextField();
        totalField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        sellButton = new javax.swing.JLabel();
        viewButton = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        processLabel = new javax.swing.JLabel();
        emptyButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        searchBox = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        salesButton = new javax.swing.JLabel();
        addButton = new javax.swing.JLabel();
        refreshButton = new javax.swing.JLabel();
        searchButton = new javax.swing.JLabel();
        decreaseButton = new javax.swing.JLabel();
        increaseButton = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarketSystem -  Empleado");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("¡ BIENVENIDO USUARIO !");
        welcomeLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        welcomeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Este es el sistema de ventas, aquí podrás realizar ventas individuales o agregar elementos a un carrito.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 10));

        amountField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amountField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amountField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(amountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 50, 20));

        productField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        productField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(productField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 360, 20));

        totalField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        totalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 110, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Selecciona un producto de la tabla, indica cuántas unidades quieres y realiza la venta o sumalo al carrito...");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, -1));

        sellButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sellButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sellButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Sell.png")); // NOI18N
        sellButton.setText("VENDER");
        sellButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sellButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sellButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sellButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellButtonMouseClicked(evt);
            }
        });
        getContentPane().add(sellButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 50, 70));

        viewButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Cart.png")); // NOI18N
        viewButton.setText("VER");
        viewButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewButtonMouseClicked(evt);
            }
        });
        getContentPane().add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 50, 70));

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Quit.png")); // NOI18N
        backButton.setText("SALIR");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, 70));

        processLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        processLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        processLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        processLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        processLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(processLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, 70));

        emptyButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emptyButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Cart (empty).png")); // NOI18N
        emptyButton.setText("VACIAR");
        emptyButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emptyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emptyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        emptyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        emptyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptyButtonMouseClicked(evt);
            }
        });
        getContentPane().add(emptyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 50, 70));

        employeeTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.setSelectionBackground(new java.awt.Color(51, 204, 255));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 310));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Filtro:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 50, 25));

        searchBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "ID", "Stock", "Precio", "Producto" }));
        getContentPane().add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, 25));

        searchField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 423, 25));

        salesButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salesButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Sales.png")); // NOI18N
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
        getContentPane().add(salesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 60, 70));

        addButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Cart (add).png")); // NOI18N
        addButton.setText("AÑADIR");
        addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 50, 70));

        refreshButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refreshButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Refresh.png")); // NOI18N
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
        getContentPane().add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 80, 70));

        searchButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Search.png")); // NOI18N
        searchButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 30, 25));

        decreaseButton.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(decreaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 20, 20));

        increaseButton.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(increaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 20, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Producto:                                                                                             Cantidad:                               Total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 670, 20));

        calculateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        calculateButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculateButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Calculate.png")); // NOI18N
        calculateButton.setText("TOTAL");
        calculateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        calculateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calculateButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateButtonMouseClicked(evt);
            }
        });
        getContentPane().add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 50, 70));

        backgroundLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Background (General).png")); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- TABLE SELECT ROW.
    //--------------------------------------------------------------------------
    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        prod = new Product();

        if (employeeTable.getSelectedRowCount() > 0) {
            prod.setId(employeeTable.getValueAt(employeeTable.getSelectedRow(), 0).toString());
            prod.setName(employeeTable.getValueAt(employeeTable.getSelectedRow(), 1).toString());
            prod.setPrice(employeeTable.getValueAt(employeeTable.getSelectedRow(), 2).toString());
            prod.setStock(employeeTable.getValueAt(employeeTable.getSelectedRow(), 3).toString());
            prod.setAmount("1");

            productField.setText(prod.getName());
            amountField.setText("1");
            totalField.setText("$" + prod.getPrice());

            processLabel.setVisible(false);
        }
    }//GEN-LAST:event_employeeTableMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- SELL BUTTON.
    //--------------------------------------------------------------------------
    private void sellButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellButtonMouseClicked
        if (Data.productList.isEmpty() == true && productField.getText().equals("")
                || Data.productList.isEmpty() == true && amountField.getText().equals("")
                || Data.productList.isEmpty() == true && totalField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecciona un producto para venderlo o agregarlo al carrito.");
        } else {
            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("insert into sales values(?,?,?,?,?,?,?,?,?)");

                if (Data.productList.isEmpty() == true
                        && !prod.getStock().equals("0")
                        && Integer.parseInt(prod.getStock()) > Integer.parseInt(amountField.getText())) {
                    pst.setString(1, "0");
                    pst.setString(2, prod.getName());
                    pst.setString(3, "$" + prod.getPrice());
                    pst.setString(4, amountField.getText());
                    pst.setString(5, "$" + prod.getTotalPrice());
                    pst.setString(6, "No");
                    pst.setString(7, Data.user);
                    pst.setString(8, Data.getDate());
                    pst.setString(9, Data.getHour());

                    pst.executeUpdate();
                    lowerStock(prod);
                    setProcessLabel('S');
                } else if (Data.productList.isEmpty() == false) {
                    for (Product product : Data.productList) {
                        pst.setString(1, "0");
                        pst.setString(2, product.getName());
                        pst.setString(3, "$" + product.getPrice());
                        pst.setString(4, product.getAmount());
                        pst.setString(5, "$" + product.getTotalPrice());

                        if (Data.productList.size() == 1) {
                            pst.setString(6, "No");
                        } else {
                            pst.setString(6, Integer.toString(cart));
                        }

                        pst.setString(7, Data.user);
                        pst.setString(8, Data.getDate());
                        pst.setString(9, Data.getHour());

                        pst.executeUpdate();
                        lowerStock(product);
                    }

                    cart++;
                    Data.productList.clear();
                    setProcessLabel('S');
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la venta porque no hay stock suficiente para la cantidad solicitada.");
                }

                emptyFields();
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }
        }
    }//GEN-LAST:event_sellButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- ADD BUTTON.
    //--------------------------------------------------------------------------
    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        if (!prod.getStock().equals("0")) {
            Data.productList.add(prod);
            emptyFields();
            setProcessLabel('A');
        } else {
            JOptionPane.showMessageDialog(null, "No es posible agregar el producto al carrito, no hay stock");
        }
    }//GEN-LAST:event_addButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- VIEW CART BUTTON.
    //--------------------------------------------------------------------------
    private void viewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseClicked
        if (Data.productList.isEmpty() == false) {
            new Cart().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos en el carrito.");
        }
    }//GEN-LAST:event_viewButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- EMPTY CART BUTTON.
    //--------------------------------------------------------------------------
    private void emptyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptyButtonMouseClicked
        if (Data.productList.isEmpty() == false) {
            Data.productList.clear();
            emptyFields();
            setProcessLabel('E');
        } else {
            JOptionPane.showMessageDialog(null, "El carrito ya está vacío.");
        }
    }//GEN-LAST:event_emptyButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- REFRESH BUTTON.
    //--------------------------------------------------------------------------
    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        Data.clearTable(Data.productModel, employeeTable);
        userDBTable(Data.employeeModel);
        processLabel.setVisible(false);
        emptyFields();
    }//GEN-LAST:event_refreshButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- SALES BUTTON.
    //--------------------------------------------------------------------------
    private void salesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesButtonMouseClicked
        new Sales().setVisible(true);
    }//GEN-LAST:event_salesButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- BACK BUTTON.
    //--------------------------------------------------------------------------
    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        chrono.stop();
        int money = getRaisedMoney();
        
        JOptionPane.showMessageDialog(null, "Antes de cerrar sesión mira este pequeño informe:"
                + "\n\n" + "Duración del turno: " + chrono.getTime()
                + "\n" + "Dinero Recaudado: $" + money
                + "\n\n" + "¡Adiós " + Data.user + "!");

        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- SEARCH BUTTON.
    //--------------------------------------------------------------------------
    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        if (!searchField.getText().equals("") && searchBox.getSelectedIndex() != 0) {
            Data.clearTable(Data.employeeModel, employeeTable);
            String search = "";

            if (searchBox.getSelectedItem().equals("ID")) {
                search = "ID";
            } else if (searchBox.getSelectedItem().equals("Producto")) {
                search = "product";
            } else if (searchBox.getSelectedItem().equals("Precio")) {
                search = "price";
            } else if (searchBox.getSelectedItem().equals("Proveedor")) {
                search = "supplier";
            }

            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("select * from inventory");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    if (rs.getString(search).contains(searchField.getText())) {
                        Data.employeeModel = (DefaultTableModel) employeeTable.getModel();
                        Object[] fila = new Object[5];

                        for (int i = 0; i < 5; i++) {
                            fila[i] = rs.getObject(i + 1);
                        }

                        Data.employeeModel.addRow(fila);
                        Data.getConnection().close();
                    }
                }

                emptyFields();
                processLabel.setVisible(false);
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }
        } else if (searchField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo de búsqueda vacío.");
        } else if (searchBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una opción en la caja de FILTRO.");
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- INCREASE BUTTON.
    //--------------------------------------------------------------------------
    private void increaseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_increaseButtonMouseClicked
        if (Integer.parseInt(prod.getStock()) > amount) {
            amount = Integer.parseInt(prod.getAmount()) + 1;
            amountField.setText(Integer.toString(amount));
            prod.setAmount(amountField.getText());
            totalField.setText("$" + prod.getTotalPrice());
        } else {
            JOptionPane.showMessageDialog(null, "No puedes agregar " + amount + " unidades de este producto al carrito, superarás el stock del mismo.");
        }
    }//GEN-LAST:event_increaseButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- DECREASE BUTTON.
    //--------------------------------------------------------------------------
    private void decreaseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decreaseButtonMouseClicked
        if (!amountField.getText().equals("1")) {
            amount = Integer.parseInt(prod.getAmount()) - 1;
            amountField.setText(Integer.toString(amount));
            prod.setAmount(amountField.getText());
            totalField.setText("$" + prod.getTotalPrice());
        } else {
            JOptionPane.showMessageDialog(null, "No se puede disminuir más la cantidad.");
        }
    }//GEN-LAST:event_decreaseButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- CALCULATE BUTTON.
    //--------------------------------------------------------------------------
    private void calculateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseClicked
        prod.setAmount(amountField.getText());
        totalField.setText("$" + prod.getTotalPrice());
    }//GEN-LAST:event_calculateButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel calculateButton;
    private javax.swing.JLabel decreaseButton;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel emptyButton;
    private javax.swing.JLabel increaseButton;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel processLabel;
    private javax.swing.JTextField productField;
    private javax.swing.JLabel refreshButton;
    private javax.swing.JLabel salesButton;
    private javax.swing.JComboBox<String> searchBox;
    private javax.swing.JLabel searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel sellButton;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel viewButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
