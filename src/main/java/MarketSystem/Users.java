package MarketSystem;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Enzo Portillo.
 */
public class Users extends javax.swing.JFrame {

    public Users() {
        initComponents();
        setLocationRelativeTo(null);
        userDBTable(Data.userModel);
        processLabel.setVisible(false);
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- EMPTY FIELDS METOD.
    //--------------------------------------------------------------------------
    private void emptyFields() {
        idField.setText("");
        nameField.setText("");
        passField.setText("");
        workBox.setSelectedIndex(0);
        statusBox.setSelectedIndex(0);
        contField.setText("");
        searchBox.setSelectedIndex(0);
        searchField.setText("");
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- TABLE METODS.
    //--------------------------------------------------------------------------
    private void userDBTable(DefaultTableModel model) {
        try {
            PreparedStatement pst = Data.getConnection().prepareStatement("select * from users");
            ResultSet rs = pst.executeQuery();

            model = (DefaultTableModel) userTable.getModel();

            if (model.getColumnCount() == 0) {
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Contraseña");
                model.addColumn("Cargo");
                model.addColumn("Estado");
                model.addColumn("Fecha");
                model.addColumn("Contacto");
            }

            while (rs.next()) {
                Object[] fila = new Object[7];

                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }

                model.addRow(fila);
            }

            Data.getConnection().close();
        } catch (SQLException e) {
            Data.errorDBMessage(e);
        }
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        passField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        contField = new javax.swing.JTextField();
        statusBox = new javax.swing.JComboBox<>();
        searchBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JLabel();
        editButton = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        workBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        processLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JLabel();
        refreshButton = new javax.swing.JLabel();
        pdfButton = new javax.swing.JLabel();
        searchButton = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡ ADMINISTRADOR DE USUARIOS !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aquí podrás agregar nuevos usuarios y ver, modificar o eliminar los ya existentes en la base de datos.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, -1));

        searchField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 423, 25));

        passField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 160, 20));

        idField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 60, 20));

        contField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(contField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 170, 20));

        statusBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------", "Activo", "Inactivo" }));
        getContentPane().add(statusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, 20));

        searchBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "ID", "Fecha", "Cargo", "Estado", "Nombre", "Contacto", "Contraseña" }));
        getContentPane().add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, 25));

        addButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Add.png")); // NOI18N
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
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 60, 70));

        editButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        editButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Edit.png")); // NOI18N
        editButton.setText("EDITAR");
        editButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 60, 70));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 10));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Completa los campos para agregar un nuevo usuario o selecciona uno de la tabla para modificar sus datos...");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, -1));

        workBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        workBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "Técnico", "Empleado", "Proveedor", "Repartidor", "Distribuidor", "Administrador" }));
        getContentPane().add(workBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Filtro:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 50, 25));

        nameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 290, 20));

        processLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        processLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        processLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        processLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(processLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 270, 70));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ID:                         Nombre:                                                                                Contacto:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 570, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Contraseña:                                                      Cargo:                                                   Estado:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 610, 20));

        userTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Contraseña", "Cargo", "Estado", "Fecha", "Contacto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.setSelectionBackground(new java.awt.Color(51, 204, 255));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 760, 270));

        deleteButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deleteButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Delete.png")); // NOI18N
        deleteButton.setText("ELIMINAR");
        deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 70, 70));

        refreshButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refreshButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Refresh.png")); // NOI18N
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
        getContentPane().add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 80, 70));

        pdfButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pdfButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdfButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\PDF.png")); // NOI18N
        pdfButton.setText("CREAR PDF");
        pdfButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pdfButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdfButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pdfButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pdfButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfButtonMouseClicked(evt);
            }
        });
        getContentPane().add(pdfButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 70, 70));

        searchButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Search.png")); // NOI18N
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

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Out.png")); // NOI18N
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
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 190, 70, 70));

        backgroundLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\Images\\Background (General).png")); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- ADD BUTTON.
    //--------------------------------------------------------------------------

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        if (nameField.getText().equals("") || contField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Completa el formulario para poder agregar un nuevo usuario.");
        } else if (passField.getText().equals("") && workBox.getSelectedItem().equals("Administrador")
                || workBox.getSelectedItem().equals("Empleado")) {
            JOptionPane.showMessageDialog(null, "Debes asignarle una contraseña al usuario para el cargo seleccionado.");
        } else if (workBox.getSelectedIndex() == 0 || statusBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una opción en las cajas de CARGO y ESTADO.");
        } else {
            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("insert into users values(?,?,?,?,?,?,?)");

                pst.setString(1, "0");
                pst.setString(2, nameField.getText());
                pst.setString(3, passField.getText());
                pst.setString(4, (String) workBox.getSelectedItem());
                pst.setString(5, (String) statusBox.getSelectedItem());
                pst.setString(6, Data.getDate());
                pst.setString(7, contField.getText());

                pst.executeUpdate();

                Data.setProcess(processLabel, idField, "C");
                emptyFields();
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }
        }
    }//GEN-LAST:event_addButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- EDIT BUTTON.
    //--------------------------------------------------------------------------

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        if (nameField.getText().equals("") || contField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Completa el formulario para poder editar los datos del usuario.");
        } else if (passField.getText().equals("") && workBox.getSelectedItem().equals("Administrador")
                || workBox.getSelectedItem().equals("Empleado")) {
            JOptionPane.showMessageDialog(null, "Debes asignarle una contraseña al usuario para el cargo seleccionado.");
        } else if (workBox.getSelectedIndex() == 0 || statusBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una opción en las cajas de CARGO y ESTADO.");
        } else {
            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("update users set name=?, password=?, workstation=?, contact=?, status=? where ID=" + idField.getText());

                pst.setString(1, nameField.getText());
                pst.setString(2, passField.getText());
                pst.setString(3, (String) workBox.getSelectedItem());
                pst.setString(4, contField.getText());
                pst.setString(5, (String) statusBox.getSelectedItem());

                pst.executeUpdate();

                Data.setProcess(processLabel, idField, "U");
                emptyFields();
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }
        }
    }//GEN-LAST:event_editButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- DELETE BUTTON.
    //--------------------------------------------------------------------------

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        if (idField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un usuario de la lista antes de presionar el boton de eliminar.");
        } else {
            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("delete from users where ID=" + idField.getText());
                pst.executeUpdate();

                Data.setProcess(processLabel, idField, "D");
                emptyFields();
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- REFRESH BUTTON.
    //--------------------------------------------------------------------------

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        Data.clearTable(Data.userModel, userTable);
        userDBTable(Data.userModel);
        emptyFields();
        processLabel.setVisible(false);
    }//GEN-LAST:event_refreshButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- PDF BUTTON.
    //--------------------------------------------------------------------------

    private void pdfButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfButtonMouseClicked
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Lista de Usuarios.pdf"));

            Paragraph text = new Paragraph();
            text.setAlignment(Paragraph.ALIGN_CENTER);
            text.add("Formato creado por Enzo Portillo ©" + "\n\n");
            text.setFont(FontFactory.getFont("Arial", 18, Font.BOLD, BaseColor.BLACK));
            text.add("Lista de Usuarios..." + "\n\n");

            documento.open();

            documento.add(text);

            PdfPTable table = new PdfPTable(7);
            table.addCell("ID");
            table.addCell("Nombre");
            table.addCell("Contraseña");
            table.addCell("Cargo");
            table.addCell("Contacto");
            table.addCell("Fecha de Ingreso");
            table.addCell("Estado");

            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("select * from users");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {
                        table.addCell(rs.getString(1));
                        table.addCell(rs.getString(2));
                        table.addCell(rs.getString(3));
                        table.addCell(rs.getString(4));
                        table.addCell(rs.getString(5));
                        table.addCell(rs.getString(6));
                        table.addCell(rs.getString(7));
                    } while (rs.next());

                    documento.add(table);
                }
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }

            documento.close();
            Data.setProcess(processLabel, idField, "P");
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear al archivo PDF." + "\n" + e);
        }
    }//GEN-LAST:event_pdfButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- SEARCH BUTTON.
    //--------------------------------------------------------------------------

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        if (!searchField.getText().equals("") && searchBox.getSelectedIndex() != 0) {
            Data.clearTable(Data.userModel, userTable);
            String search = "";

            if (searchBox.getSelectedItem().equals("ID")) {
                search = "ID";
            } else if (searchBox.getSelectedItem().equals("Nombre")) {
                search = "name";
            } else if (searchBox.getSelectedItem().equals("Contraseña")) {
                search = "password";
            } else if (searchBox.getSelectedItem().equals("Cargo")) {
                search = "workstation";
            } else if (searchBox.getSelectedItem().equals("Estado")) {
                search = "status";
            } else if (searchBox.getSelectedItem().equals("Fecha")) {
                search = "date";
            } else if (searchBox.getSelectedItem().equals("Contacto")) {
                search = "contact";
            }

            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("select * from users");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    if (rs.getString(search).contains(searchField.getText())) {
                        Data.userModel = (DefaultTableModel) userTable.getModel();
                        Object[] fila = new Object[7];

                        for (int i = 0; i < 7; i++) {
                            fila[i] = rs.getObject(i + 1);
                        }

                        Data.userModel.addRow(fila);
                    }
                }

                Data.getConnection().close();
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
    //-------------------------------------------------------------------------- TABLE EVENT.
    //--------------------------------------------------------------------------

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        if (userTable.getSelectedRowCount() > 0) {
            idField.setText(userTable.getValueAt(userTable.getSelectedRow(), 0).toString());
            nameField.setText(userTable.getValueAt(userTable.getSelectedRow(), 1).toString());
            passField.setText(userTable.getValueAt(userTable.getSelectedRow(), 2).toString());
            workBox.setSelectedItem(userTable.getValueAt(userTable.getSelectedRow(), 3).toString());
            statusBox.setSelectedItem(userTable.getValueAt(userTable.getSelectedRow(), 4).toString());
            contField.setText(userTable.getValueAt(userTable.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_userTableMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- BACK BUTTON.
    //--------------------------------------------------------------------------

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_backButtonMouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTextField contField;
    private javax.swing.JLabel deleteButton;
    private javax.swing.JLabel editButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passField;
    private javax.swing.JLabel pdfButton;
    private javax.swing.JLabel processLabel;
    private javax.swing.JLabel refreshButton;
    private javax.swing.JComboBox<String> searchBox;
    private javax.swing.JLabel searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JTable userTable;
    private javax.swing.JComboBox<String> workBox;
    // End of variables declaration//GEN-END:variables
}
