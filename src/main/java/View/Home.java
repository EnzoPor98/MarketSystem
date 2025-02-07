package View;

import Controller.CartJpaController;
import Controller.CustomerJpaController;
import Controller.ProdCartJpaController;
import Controller.ProductJpaController;
import Controller.SaleJpaController;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // *************************************************************************
    // ***************************************************** NETBEANS GENERATED.
    // *************************************************************************
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        boxTabBtn = new javax.swing.JLabel();
        customerTabBtn = new javax.swing.JLabel();
        inventoryTabBtn = new javax.swing.JLabel();
        salesTabBtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Tabs = new javax.swing.JTabbedPane();
        BoxTab = new javax.swing.JPanel();
        subtractBtn = new javax.swing.JLabel();
        subCostField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        addBtn = new javax.swing.JLabel();
        productField = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        virtualBtn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        finishSaleBtn = new javax.swing.JLabel();
        addToCartBtn = new javax.swing.JButton();
        emptyCartBtn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        dateBillField = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        dniField = new javax.swing.JTextField();
        removeProdBtn = new javax.swing.JButton();
        SubeBtn = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        paymentMethodBox = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        idBillField = new javax.swing.JTextField();
        totalCostField = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        MoneyDeliveredField = new javax.swing.JTextField();
        cancelSaleBtn = new javax.swing.JLabel();
        infoSaleLabel = new javax.swing.JLabel();
        CustomerTab = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        mailCustField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        idCustField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        nameCustField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        serachCustField = new javax.swing.JTextField();
        addCustBtn = new javax.swing.JLabel();
        editCustBtn = new javax.swing.JLabel();
        deleteCustBtn = new javax.swing.JLabel();
        infoCustLabel = new javax.swing.JLabel();
        cleanCustBtn = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        codCustField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        phoneCustField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        addressCustField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        dniCustField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        InventoryTab = new javax.swing.JPanel();
        cleanProdBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dateProdField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        stockProdField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        costProdField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        idProdField = new javax.swing.JTextField();
        addProdBtn = new javax.swing.JLabel();
        editProdBtn = new javax.swing.JLabel();
        deleteProdBtn = new javax.swing.JLabel();
        infoProdLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        nameProdField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        searchProdField = new javax.swing.JTextField();
        categProdField = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        removeCategBtn = new javax.swing.JButton();
        addCategBtn = new javax.swing.JButton();
        SalesTab = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        date2SalesField = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        dniSalesField = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        dateSalesField = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        date1SalesField = new javax.swing.JTextField();
        showProdBtn = new javax.swing.JButton();
        searchSalesBtn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        prodSalesTable = new javax.swing.JTable();
        jSeparator9 = new javax.swing.JSeparator();
        datesPdfBtn = new javax.swing.JLabel();
        todayPdfBtn = new javax.swing.JLabel();
        datePdfBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE VENTAS");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("SISTEMA DE VENTAS");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 1110, 30));

        minimizeBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        minimizeBtn.setForeground(new java.awt.Color(0, 0, 0));
        minimizeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeBtn.setText("-");
        minimizeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        minimizeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 30, 30));

        closeBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(0, 0, 0));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setText("X");
        closeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 30, 30));

        iconLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iconLabel.setForeground(new java.awt.Color(0, 0, 0));
        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLabel.setText("[ ]");
        iconLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iconLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1280, 10));

        boxTabBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        boxTabBtn.setForeground(new java.awt.Color(0, 0, 0));
        boxTabBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxTabBtn.setText("CAJA");
        boxTabBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boxTabBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxTabBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boxTabBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boxTabBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxTabBtnMouseClicked(evt);
            }
        });
        getContentPane().add(boxTabBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 90));

        customerTabBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerTabBtn.setForeground(new java.awt.Color(0, 0, 0));
        customerTabBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerTabBtn.setText("CLIENTES");
        customerTabBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        customerTabBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerTabBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customerTabBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        customerTabBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTabBtnMouseClicked(evt);
            }
        });
        getContentPane().add(customerTabBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 90));

        inventoryTabBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inventoryTabBtn.setForeground(new java.awt.Color(0, 0, 0));
        inventoryTabBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventoryTabBtn.setText("INVENTARIO");
        inventoryTabBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inventoryTabBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventoryTabBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inventoryTabBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inventoryTabBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryTabBtnMouseClicked(evt);
            }
        });
        getContentPane().add(inventoryTabBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 90));

        salesTabBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salesTabBtn.setForeground(new java.awt.Color(0, 0, 0));
        salesTabBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesTabBtn.setText("VENTAS");
        salesTabBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salesTabBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salesTabBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salesTabBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salesTabBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesTabBtnMouseClicked(evt);
            }
        });
        getContentPane().add(salesTabBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 100, 90));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 10, 650));

        Tabs.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        Tabs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        BoxTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtractBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subtractBtn.setForeground(new java.awt.Color(0, 0, 0));
        subtractBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtractBtn.setText("-");
        subtractBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        subtractBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtractBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subtractBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtractBtnMouseClicked(evt);
            }
        });
        BoxTab.add(subtractBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 30, 30));

        subCostField.setEditable(false);
        subCostField.setBackground(new java.awt.Color(255, 255, 255));
        subCostField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subCostField.setForeground(new java.awt.Color(0, 0, 0));
        subCostField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxTab.add(subCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 130, 30));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("FACTURACION...");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 790, 30));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("SUBTOTAL: $");
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 100, 30));

        addBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 0, 0));
        addBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtn.setText("+");
        addBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        BoxTab.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 30, 30));

        productField.setBackground(new java.awt.Color(255, 255, 255));
        productField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        productField.setForeground(new java.awt.Color(0, 0, 0));
        productField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxTab.add(productField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 350, 30));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("CANTIDAD:");
        jLabel44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 80, 30));

        amountField.setEditable(false);
        amountField.setBackground(new java.awt.Color(255, 255, 255));
        amountField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amountField.setForeground(new java.awt.Color(0, 0, 0));
        amountField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxTab.add(amountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 80, 30));

        cartTable.setBackground(new java.awt.Color(255, 255, 255));
        cartTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cartTable.setForeground(new java.awt.Color(0, 0, 0));
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Costo Unitario", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(cartTable);

        BoxTab.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 1140, 200));

        virtualBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        virtualBtn.setText("CARGA VIRTUAL");
        virtualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virtualBtnActionPerformed(evt);
            }
        });
        BoxTab.add(virtualBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        BoxTab.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 1140, 10));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("PRODUCTO:");
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, 30));

        prodTable.setBackground(new java.awt.Color(255, 255, 255));
        prodTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        prodTable.setForeground(new java.awt.Color(0, 0, 0));
        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Marca", "Categoria", "Costo", "Stock", "Ult. Ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(prodTable);

        BoxTab.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 1140, 180));

        finishSaleBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        finishSaleBtn.setForeground(new java.awt.Color(0, 0, 0));
        finishSaleBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        finishSaleBtn.setText("FINALIZAR OPERACION");
        finishSaleBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        finishSaleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        finishSaleBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        finishSaleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishSaleBtnMouseClicked(evt);
            }
        });
        BoxTab.add(finishSaleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 240, 60));

        addToCartBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addToCartBtn.setText("AGREGAR AL CARRITO");
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });
        BoxTab.add(addToCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 60, 170, 30));

        emptyCartBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emptyCartBtn.setText("VACIAR CARRITO");
        emptyCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyCartBtnActionPerformed(evt);
            }
        });
        BoxTab.add(emptyCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, -1, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        BoxTab.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 1140, 10));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("CARRITO DE COMPRAS...");
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 180, 30));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("DNI CLIENTE:");
        jLabel48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 100, 30));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("FECHA:");
        jLabel49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 60, 30));

        dateBillField.setEditable(false);
        dateBillField.setBackground(new java.awt.Color(255, 255, 255));
        dateBillField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dateBillField.setForeground(new java.awt.Color(0, 0, 0));
        dateBillField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxTab.add(dateBillField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 180, 30));

        jLabel51.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("ENTREGADO: $");
        jLabel51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 120, 30));

        dniField.setBackground(new java.awt.Color(255, 255, 255));
        dniField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dniField.setForeground(new java.awt.Color(0, 0, 0));
        dniField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxTab.add(dniField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 140, 30));

        removeProdBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        removeProdBtn.setText("DESCARTAR PRODUCTO");
        removeProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProdBtnActionPerformed(evt);
            }
        });
        BoxTab.add(removeProdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, -1, 30));

        SubeBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SubeBtn.setText("CARGA SUBE");
        SubeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubeBtnActionPerformed(evt);
            }
        });
        BoxTab.add(SubeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, 30));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("ID:");
        jLabel52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 30, 30));

        paymentMethodBox.setBackground(new java.awt.Color(255, 255, 255));
        paymentMethodBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        paymentMethodBox.setForeground(new java.awt.Color(0, 0, 0));
        paymentMethodBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta Virtual", "Tarjeta de Credito/Debito" }));
        BoxTab.add(paymentMethodBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 200, 30));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setText("FORMA DE PAGO:");
        jLabel53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 130, 30));

        idBillField.setEditable(false);
        idBillField.setBackground(new java.awt.Color(255, 255, 255));
        idBillField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idBillField.setForeground(new java.awt.Color(0, 0, 0));
        idBillField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxTab.add(idBillField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 210, 30));

        totalCostField.setEditable(false);
        totalCostField.setBackground(new java.awt.Color(255, 255, 255));
        totalCostField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        totalCostField.setForeground(new java.awt.Color(0, 0, 0));
        totalCostField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxTab.add(totalCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 130, 30));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("COSTO TOTAL: $");
        jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 120, 30));

        MoneyDeliveredField.setBackground(new java.awt.Color(255, 255, 255));
        MoneyDeliveredField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MoneyDeliveredField.setForeground(new java.awt.Color(0, 0, 0));
        MoneyDeliveredField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxTab.add(MoneyDeliveredField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 640, 130, 30));

        cancelSaleBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelSaleBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelSaleBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cancelSaleBtn.setText("CANCELAR OPERACION");
        cancelSaleBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancelSaleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelSaleBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cancelSaleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelSaleBtnMouseClicked(evt);
            }
        });
        BoxTab.add(cancelSaleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 240, 60));

        infoSaleLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoSaleLabel.setForeground(new java.awt.Color(0, 0, 0));
        infoSaleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoSaleLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infoSaleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoSaleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoxTab.add(infoSaleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, 500, 30));

        Tabs.addTab("tab3", BoxTab);

        CustomerTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("AGREGA, ACTUALIZA O ELIMINA CLIENTES DE TU BASE DE DATOS...");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 1140, 30));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("CODIGO POSTAL:");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 120, 30));

        mailCustField.setBackground(new java.awt.Color(255, 255, 255));
        mailCustField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mailCustField.setForeground(new java.awt.Color(0, 0, 0));
        mailCustField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTab.add(mailCustField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 430, 30));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("ID:");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 20, 30));

        idCustField.setEditable(false);
        idCustField.setBackground(new java.awt.Color(255, 255, 255));
        idCustField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idCustField.setForeground(new java.awt.Color(0, 0, 0));
        idCustField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTab.add(idCustField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, 30));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("NOMBRE:");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 70, 30));

        nameCustField.setBackground(new java.awt.Color(255, 255, 255));
        nameCustField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameCustField.setForeground(new java.awt.Color(0, 0, 0));
        nameCustField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTab.add(nameCustField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 350, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("DNI:");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 40, 30));

        serachCustField.setBackground(new java.awt.Color(255, 255, 255));
        serachCustField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        serachCustField.setForeground(new java.awt.Color(0, 0, 0));
        serachCustField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTab.add(serachCustField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 250, 30));

        addCustBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addCustBtn.setForeground(new java.awt.Color(0, 0, 0));
        addCustBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addCustBtn.setText("AGREGAR");
        addCustBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addCustBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCustBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        addCustBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCustBtnMouseClicked(evt);
            }
        });
        CustomerTab.add(addCustBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, 60));

        editCustBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editCustBtn.setForeground(new java.awt.Color(0, 0, 0));
        editCustBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editCustBtn.setText("MODIFICAR");
        editCustBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editCustBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editCustBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        editCustBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCustBtnMouseClicked(evt);
            }
        });
        CustomerTab.add(editCustBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 170, 60));

        deleteCustBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteCustBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteCustBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deleteCustBtn.setText("ELIMINAR");
        deleteCustBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteCustBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteCustBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deleteCustBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCustBtnMouseClicked(evt);
            }
        });
        CustomerTab.add(deleteCustBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 170, 60));

        infoCustLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoCustLabel.setForeground(new java.awt.Color(0, 0, 0));
        infoCustLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoCustLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infoCustLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoCustLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(infoCustLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 480, 60));

        cleanCustBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cleanCustBtn.setForeground(new java.awt.Color(0, 0, 0));
        cleanCustBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cleanCustBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cleanCustBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanCustBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cleanCustBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanCustBtnMouseClicked(evt);
            }
        });
        CustomerTab.add(cleanCustBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 200, 70, 60));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("DIRECCION:");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 90, 30));

        codCustField.setBackground(new java.awt.Color(255, 255, 255));
        codCustField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codCustField.setForeground(new java.awt.Color(0, 0, 0));
        codCustField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTab.add(codCustField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 150, 190, 30));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("TELEFONO:");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 30));

        phoneCustField.setBackground(new java.awt.Color(255, 255, 255));
        phoneCustField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phoneCustField.setForeground(new java.awt.Color(0, 0, 0));
        phoneCustField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTab.add(phoneCustField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 190, 30));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("CORREO:");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 70, 30));

        addressCustField.setBackground(new java.awt.Color(255, 255, 255));
        addressCustField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addressCustField.setForeground(new java.awt.Color(0, 0, 0));
        addressCustField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTab.add(addressCustField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 190, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        CustomerTab.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 1140, 10));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("LA BUSQUEDA SE REALIZA MEDIANTE EL DNI DEL CLIENTE...");
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 420, 30));

        dniCustField.setBackground(new java.awt.Color(255, 255, 255));
        dniCustField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dniCustField.setForeground(new java.awt.Color(0, 0, 0));
        dniCustField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTab.add(dniCustField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 140, 30));

        customerTable.setBackground(new java.awt.Color(255, 255, 255));
        customerTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        customerTable.setForeground(new java.awt.Color(0, 0, 0));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "DNI", "Direccion", "Cod. Postal", "Telefono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customerTable);

        CustomerTab.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 1140, 380));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("BUSCADOR:");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerTab.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 90, 30));

        Tabs.addTab("tab2", CustomerTab);

        InventoryTab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InventoryTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cleanProdBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cleanProdBtn.setForeground(new java.awt.Color(0, 0, 0));
        cleanProdBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cleanProdBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cleanProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanProdBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cleanProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanProdBtnMouseClicked(evt);
            }
        });
        InventoryTab.add(cleanProdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 200, 70, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("COSTO: $");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, 70, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("ULTIMO INGRESO:");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 130, 30));

        dateProdField.setEditable(false);
        dateProdField.setBackground(new java.awt.Color(255, 255, 255));
        dateProdField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dateProdField.setForeground(new java.awt.Color(0, 0, 0));
        dateProdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InventoryTab.add(dateProdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 150, 150, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("PRODUCTO:");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, 30));

        stockProdField.setBackground(new java.awt.Color(255, 255, 255));
        stockProdField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stockProdField.setForeground(new java.awt.Color(0, 0, 0));
        stockProdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InventoryTab.add(stockProdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 120, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("CATEGORIA:");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("ID:");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 20, 30));

        costProdField.setBackground(new java.awt.Color(255, 255, 255));
        costProdField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        costProdField.setForeground(new java.awt.Color(0, 0, 0));
        costProdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InventoryTab.add(costProdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 100, 150, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("STOCK:");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 60, 30));

        idProdField.setEditable(false);
        idProdField.setBackground(new java.awt.Color(255, 255, 255));
        idProdField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idProdField.setForeground(new java.awt.Color(0, 0, 0));
        idProdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InventoryTab.add(idProdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, 30));

        addProdBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addProdBtn.setForeground(new java.awt.Color(0, 0, 0));
        addProdBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addProdBtn.setText("AGREGAR");
        addProdBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProdBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        addProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProdBtnMouseClicked(evt);
            }
        });
        InventoryTab.add(addProdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, 60));

        editProdBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editProdBtn.setForeground(new java.awt.Color(0, 0, 0));
        editProdBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editProdBtn.setText("MODIFICAR");
        editProdBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProdBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        editProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProdBtnMouseClicked(evt);
            }
        });
        InventoryTab.add(editProdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 170, 60));

        deleteProdBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteProdBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteProdBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deleteProdBtn.setText("ELIMINAR");
        deleteProdBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteProdBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deleteProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProdBtnMouseClicked(evt);
            }
        });
        InventoryTab.add(deleteProdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 170, 60));

        infoProdLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoProdLabel.setForeground(new java.awt.Color(0, 0, 0));
        infoProdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoProdLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infoProdLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoProdLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(infoProdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 480, 60));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        InventoryTab.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 1140, 10));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("AGREGA, ACTUALIZA O ELIMINA LOS PRODUCTOS DE TU INVENTARIO...");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 1140, 30));

        nameProdField.setBackground(new java.awt.Color(255, 255, 255));
        nameProdField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameProdField.setForeground(new java.awt.Color(0, 0, 0));
        nameProdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InventoryTab.add(nameProdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 610, 30));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("BUSCADOR:");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryTab.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 90, 30));

        searchProdField.setBackground(new java.awt.Color(255, 255, 255));
        searchProdField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchProdField.setForeground(new java.awt.Color(0, 0, 0));
        searchProdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InventoryTab.add(searchProdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 630, 30));

        categProdField.setBackground(new java.awt.Color(255, 255, 255));
        categProdField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        categProdField.setForeground(new java.awt.Color(0, 0, 0));
        InventoryTab.add(categProdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 270, 30));

        productTable.setBackground(new java.awt.Color(255, 255, 255));
        productTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productTable.setForeground(new java.awt.Color(0, 0, 0));
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Marca", "Categoria", "Costo", "Stock", "Ult. Ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        InventoryTab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 1140, 380));

        removeCategBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        removeCategBtn.setText("ELIMINAR CAT.");
        removeCategBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCategBtnActionPerformed(evt);
            }
        });
        InventoryTab.add(removeCategBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 120, 30));

        addCategBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addCategBtn.setText("AGREGAR CAT.");
        addCategBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategBtnActionPerformed(evt);
            }
        });
        InventoryTab.add(addCategBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 120, 30));

        Tabs.addTab("InventoryTab", InventoryTab);

        SalesTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Y");
        jLabel50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SalesTab.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 20, 30));

        date2SalesField.setBackground(new java.awt.Color(255, 255, 255));
        date2SalesField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date2SalesField.setForeground(new java.awt.Color(0, 0, 0));
        date2SalesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SalesTab.add(date2SalesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 110, 30));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("OBSERVA TODAS LAS VENTAS QUE SE HAN ALMACENADO EN TU BASE DE DATOS...");
        jLabel54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SalesTab.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 1140, 30));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel57.setText("BUSCAR POR DNI:");
        jLabel57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SalesTab.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 130, 30));

        dniSalesField.setBackground(new java.awt.Color(255, 255, 255));
        dniSalesField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dniSalesField.setForeground(new java.awt.Color(0, 0, 0));
        dniSalesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SalesTab.add(dniSalesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 150, 30));

        jLabel58.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel58.setText("BUSCAR POR FECHA:");
        jLabel58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SalesTab.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 150, 30));

        dateSalesField.setBackground(new java.awt.Color(255, 255, 255));
        dateSalesField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dateSalesField.setForeground(new java.awt.Color(0, 0, 0));
        dateSalesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SalesTab.add(dateSalesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 110, 30));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel59.setText("BUSCAR ENTRE:");
        jLabel59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SalesTab.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 120, 30));

        date1SalesField.setBackground(new java.awt.Color(255, 255, 255));
        date1SalesField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date1SalesField.setForeground(new java.awt.Color(0, 0, 0));
        date1SalesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SalesTab.add(date1SalesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 110, 30));

        showProdBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        showProdBtn.setText("MOSTRAR PRODUCTOS DE LA VENTA SELECCIONADA");
        showProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProdBtnActionPerformed(evt);
            }
        });
        SalesTab.add(showProdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 520, 30));

        searchSalesBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        searchSalesBtn.setText("BUSCAR");
        searchSalesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSalesBtnActionPerformed(evt);
            }
        });
        SalesTab.add(searchSalesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 100, 90, 30));

        salesTable.setBackground(new java.awt.Color(255, 255, 255));
        salesTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salesTable.setForeground(new java.awt.Color(0, 0, 0));
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cart", "Cliente", "Forma de Pago", "Costo Total", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(salesTable);

        SalesTab.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 610, 490));

        prodSalesTable.setBackground(new java.awt.Color(255, 255, 255));
        prodSalesTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        prodSalesTable.setForeground(new java.awt.Color(0, 0, 0));
        prodSalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Costo Unitario", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(prodSalesTable);

        SalesTab.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 520, 450));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        SalesTab.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 1140, 10));

        datesPdfBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        datesPdfBtn.setForeground(new java.awt.Color(0, 0, 0));
        datesPdfBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datesPdfBtn.setText("PDF DE LAS VENTAS ENTRE FECHAS");
        datesPdfBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        datesPdfBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        datesPdfBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        datesPdfBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datesPdfBtnMouseClicked(evt);
            }
        });
        SalesTab.add(datesPdfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 650, 330, 60));

        todayPdfBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        todayPdfBtn.setForeground(new java.awt.Color(0, 0, 0));
        todayPdfBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        todayPdfBtn.setText("PDF DE LAS VENTAS DE HOY");
        todayPdfBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        todayPdfBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        todayPdfBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        todayPdfBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                todayPdfBtnMouseClicked(evt);
            }
        });
        SalesTab.add(todayPdfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, 280, 60));

        datePdfBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        datePdfBtn.setForeground(new java.awt.Color(0, 0, 0));
        datePdfBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datePdfBtn.setText("PDF DE LAS VENTAS DE TAL FECHA");
        datePdfBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        datePdfBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        datePdfBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        datePdfBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datePdfBtnMouseClicked(evt);
            }
        });
        SalesTab.add(datePdfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 330, 60));

        Tabs.addTab("tab4", SalesTab);

        getContentPane().add(Tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // *************************************************************************

    // *************************************************************************
    // ********************************************** CLOSE & MINIMIEZE BUTTONS.
    // *************************************************************************
    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked
    // *************************************************************************

    // *************************************************************************
    // ************************************************** TABBED PANE SELECTION.
    // *************************************************************************
    private void boxTabBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTabBtnMouseClicked
        Tabs.setSelectedIndex(0);
    }//GEN-LAST:event_boxTabBtnMouseClicked

    private void customerTabBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTabBtnMouseClicked
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_customerTabBtnMouseClicked

    private void inventoryTabBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTabBtnMouseClicked
        Tabs.setSelectedIndex(2);
    }//GEN-LAST:event_inventoryTabBtnMouseClicked

    private void salesTabBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesTabBtnMouseClicked
        Tabs.setSelectedIndex(3);
    }//GEN-LAST:event_salesTabBtnMouseClicked
    // *************************************************************************

    // *************************************************************************
    // **************************************************************** BOX TAB.
    // *************************************************************************
    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addToCartBtnActionPerformed

    private void subtractBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtractBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_subtractBtnMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnMouseClicked

    private void removeProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProdBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeProdBtnActionPerformed

    private void emptyCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyCartBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emptyCartBtnActionPerformed

    private void SubeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubeBtnActionPerformed

    private void virtualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virtualBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_virtualBtnActionPerformed

    private void cancelSaleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelSaleBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelSaleBtnMouseClicked

    private void finishSaleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishSaleBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_finishSaleBtnMouseClicked
    // *************************************************************************

    // *************************************************************************
    // ********************************************************* CUSTOMER PANEL.
    // *************************************************************************
    private void addCustBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCustBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addCustBtnMouseClicked

    private void editCustBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCustBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editCustBtnMouseClicked

    private void deleteCustBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCustBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCustBtnMouseClicked

    private void cleanCustBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanCustBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cleanCustBtnMouseClicked
    // *************************************************************************

    // *************************************************************************
    // ******************************************************** INVENTORY PANEL.
    // *************************************************************************
    private void addCategBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategBtnActionPerformed

    private void removeCategBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCategBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeCategBtnActionPerformed

    private void addProdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProdBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addProdBtnMouseClicked

    private void editProdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProdBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editProdBtnMouseClicked

    private void deleteProdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProdBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProdBtnMouseClicked

    private void cleanProdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanProdBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cleanProdBtnMouseClicked
    // *************************************************************************

    // *************************************************************************
    // ************************************************************ SALES PANEL.
    // *************************************************************************
    private void searchSalesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSalesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchSalesBtnActionPerformed

    private void showProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProdBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showProdBtnActionPerformed

    private void todayPdfBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayPdfBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_todayPdfBtnMouseClicked

    private void datePdfBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datePdfBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datePdfBtnMouseClicked

    private void datesPdfBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datesPdfBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datesPdfBtnMouseClicked
    // *************************************************************************

    // *************************************************************************
    // ******************************************************************* MAIN.
    // *************************************************************************
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
            
            CartJpaController cartCtrl = new CartJpaController();
            CustomerJpaController custCtrl = new CustomerJpaController();
            ProdCartJpaController prodCartCtrl = new ProdCartJpaController();
            ProductJpaController prodCtrl = new ProductJpaController();
            SaleJpaController saleCtrl = new SaleJpaController();
        });
    }
    // *************************************************************************

    // *************************************************************************
    // ***************************************************** NETBEANS GENERATED.
    // *************************************************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BoxTab;
    private javax.swing.JPanel CustomerTab;
    private javax.swing.JPanel InventoryTab;
    private javax.swing.JTextField MoneyDeliveredField;
    private javax.swing.JPanel SalesTab;
    private javax.swing.JButton SubeBtn;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JLabel addBtn;
    private javax.swing.JButton addCategBtn;
    private javax.swing.JLabel addCustBtn;
    private javax.swing.JLabel addProdBtn;
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JTextField addressCustField;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel boxTabBtn;
    private javax.swing.JLabel cancelSaleBtn;
    private javax.swing.JTable cartTable;
    private javax.swing.JComboBox<String> categProdField;
    private javax.swing.JLabel cleanCustBtn;
    private javax.swing.JLabel cleanProdBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JTextField codCustField;
    private javax.swing.JTextField costProdField;
    private javax.swing.JLabel customerTabBtn;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField date1SalesField;
    private javax.swing.JTextField date2SalesField;
    private javax.swing.JTextField dateBillField;
    private javax.swing.JLabel datePdfBtn;
    private javax.swing.JTextField dateProdField;
    private javax.swing.JTextField dateSalesField;
    private javax.swing.JLabel datesPdfBtn;
    private javax.swing.JLabel deleteCustBtn;
    private javax.swing.JLabel deleteProdBtn;
    private javax.swing.JTextField dniCustField;
    private javax.swing.JTextField dniField;
    private javax.swing.JTextField dniSalesField;
    private javax.swing.JLabel editCustBtn;
    private javax.swing.JLabel editProdBtn;
    private javax.swing.JButton emptyCartBtn;
    private javax.swing.JLabel finishSaleBtn;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JTextField idBillField;
    private javax.swing.JTextField idCustField;
    private javax.swing.JTextField idProdField;
    private javax.swing.JLabel infoCustLabel;
    private javax.swing.JLabel infoProdLabel;
    private javax.swing.JLabel infoSaleLabel;
    private javax.swing.JLabel inventoryTabBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField mailCustField;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JTextField nameCustField;
    private javax.swing.JTextField nameProdField;
    private javax.swing.JComboBox<String> paymentMethodBox;
    private javax.swing.JTextField phoneCustField;
    private javax.swing.JTable prodSalesTable;
    private javax.swing.JTable prodTable;
    private javax.swing.JTextField productField;
    private javax.swing.JTable productTable;
    private javax.swing.JButton removeCategBtn;
    private javax.swing.JButton removeProdBtn;
    private javax.swing.JLabel salesTabBtn;
    private javax.swing.JTable salesTable;
    private javax.swing.JTextField searchProdField;
    private javax.swing.JButton searchSalesBtn;
    private javax.swing.JTextField serachCustField;
    private javax.swing.JButton showProdBtn;
    private javax.swing.JTextField stockProdField;
    private javax.swing.JTextField subCostField;
    private javax.swing.JLabel subtractBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel todayPdfBtn;
    private javax.swing.JTextField totalCostField;
    private javax.swing.JButton virtualBtn;
    // End of variables declaration//GEN-END:variables
}
