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

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 * @author Enzo Portillo.
 */
public class Sales extends javax.swing.JFrame {

    String dateOne;
    String dateTwo;
    String finalDate;
    String rute = System.getProperty("user.home");

    public Sales() {
        initComponents();
        setLocationRelativeTo(null);
        userDBTable(Data.salesModel);
        processLabel.setVisible(false);
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- TABLE METOD.
    //--------------------------------------------------------------------------
    private void userDBTable(DefaultTableModel model) {
        try {
            PreparedStatement pst = Data.getConnection().prepareStatement("select * from sales");
            ResultSet rs = pst.executeQuery();

            model = (DefaultTableModel) salesTable.getModel();

            if (model.getColumnCount() == 0) {
                model.addColumn("ID");
                model.addColumn("Producto");
                model.addColumn("Precio");
                model.addColumn("Cantidad");
                model.addColumn("Total");
                model.addColumn("Carrito");
                model.addColumn("Vendedor");
                model.addColumn("Fecha");
                model.addColumn("Hora");
            }

            while (rs.next()) {
                if(rs.getString("date").contains(Data.getDate())){
                    Object[] fila = new Object[9];

                    for (int i = 0; i < 9; i++) {
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
    //-------------------------------------------------------------------------- PROCESS LABEL.
    //--------------------------------------------------------------------------
    private void setProcessLabel(char num) {
        processLabel.setVisible(true);
        processLabel.setIcon(new ImageIcon("C:/Users/Usuario/OneDrive/Escritorio/Programación/Proyectos Personales/MarketSystem/src/Images/Done.png"));

        switch (num) {
            case '1':
                processLabel.setText("Se creó un PDF (" + Data.getDate() + ")");
                break;
            case '2':
                processLabel.setText("Se creó un PDF (" + dateOne + ")");
                break;
            case '3':
                processLabel.setText("Se creó PDF (" + dateOne + " - " + dateTwo + ")");
                break;
            default:
                break;
        }
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- EQUALIZE DATE.
    //--------------------------------------------------------------------------
    private void equalizeDate() {
        String[] dateA = finalDate.split("/");
        int[] date = new int[3];

        date[0] = Integer.parseInt(dateA[0]) + 1;
        date[1] = Integer.parseInt(dateA[1]);
        date[2] = Integer.parseInt(dateA[2]);

        if (date[0] > 31) {
            date[0] = 1;
            date[1]++;
        }

        if (date[1] > 12) {
            date[1] = 1;
            date[2]++;
        }

        finalDate = date[0] + "/" + date[1] + "/" + date[2];
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        searchBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        pdfButton3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pdfButton2 = new javax.swing.JLabel();
        processLabel = new javax.swing.JLabel();
        pdfButton1 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarketSystem - Ventas");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡ VISUALIZADOR DE VENTAS !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aquí podrás ver toda la información sobre las ventas realizadas en el día a día...");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 10));

        searchBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------", "ID", "Total", "Fecha", "Carrito", "Producto", "Vendedor" }));
        getContentPane().add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, 25));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Filtro:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 50, 25));

        searchField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 423, 25));

        searchButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        searchButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Search.png")); // NOI18N
        searchButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButton3MouseClicked(evt);
            }
        });
        getContentPane().add(searchButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 30, 25));

        salesTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Precio", "Cantidad", "Total", "Carrito", "Vendedor", "Fecha", "Hora"
            }
        ));
        jScrollPane1.setViewportView(salesTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 780, 380));

        pdfButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pdfButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdfButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\PDF.png")); // NOI18N
        pdfButton3.setText("ENTRE FECHAS");
        pdfButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pdfButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pdfButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdfButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pdfButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pdfButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfButton3MouseClicked(evt);
            }
        });
        getContentPane().add(pdfButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 90, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Out.png")); // NOI18N
        jLabel4.setText("VOLVER");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 70));

        pdfButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pdfButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdfButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\PDF.png")); // NOI18N
        pdfButton2.setText("FECHA");
        pdfButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pdfButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pdfButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdfButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pdfButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pdfButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfButton2MouseClicked(evt);
            }
        });
        getContentPane().add(pdfButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 80, 70));

        processLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        processLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        processLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        processLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(processLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 330, 70));

        pdfButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pdfButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdfButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\PDF.png")); // NOI18N
        pdfButton1.setText("HOY");
        pdfButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pdfButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pdfButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdfButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pdfButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pdfButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfButton1MouseClicked(evt);
            }
        });
        getContentPane().add(pdfButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 70, 70));

        backgroundLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Programación\\Proyectos Personales\\MarketSystem\\src\\Images\\Background (General).png")); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- SEARCH BUTTON.
    //--------------------------------------------------------------------------
    private void searchButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButton3MouseClicked
        if (!searchField.getText().equals("") && searchBox.getSelectedIndex() != 0) {
            Data.clearTable(Data.salesModel, salesTable);
            String search = "";

            if (searchBox.getSelectedItem().equals("ID")) {
                search = "ID";
            } else if (searchBox.getSelectedItem().equals("Producto")) {
                search = "product";
            } else if (searchBox.getSelectedItem().equals("Total")) {
                search = "total";
            } else if (searchBox.getSelectedItem().equals("Carrito")) {
                search = "cart";
            } else if (searchBox.getSelectedItem().equals("Vendedor")) {
                search = "seller";
            } else if (searchBox.getSelectedItem().equals("Fecha")) {
                search = "date";
            }

            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("select * from sales");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    if (rs.getString(search).contains(searchField.getText())) {
                        Data.salesModel = (DefaultTableModel) salesTable.getModel();
                        Object[] fila = new Object[9];

                        for (int i = 0; i < 9; i++) {
                            fila[i] = rs.getObject(i + 1);
                        }

                        Data.salesModel.addRow(fila);
                    }
                }

                Data.getConnection().close();
                searchField.setText("");
                searchBox.setSelectedIndex(0);
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }
        } else if (searchField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo de búsqueda vacío.");
        } else if (searchBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una opción en la caja de FILTRO.");
        }
    }//GEN-LAST:event_searchButton3MouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- PDF TODAY BUTTON.
    //--------------------------------------------------------------------------
    private void pdfButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfButton1MouseClicked
        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(rute + "/Lista de Ventas del Día.pdf"));

            Paragraph text = new Paragraph();
            text.setAlignment(Paragraph.ALIGN_CENTER);
            text.add("Formato creado por Enzo Portillo ©" + "\n\n");
            text.setFont(FontFactory.getFont("Arial", 18, Font.BOLD, BaseColor.BLACK));
            text.add("Lista de Ventas..." + "\n\n");

            documento.open();

            documento.add(text);

            PdfPTable table = new PdfPTable(9);
            table.addCell("ID");
            table.addCell("Producto");
            table.addCell("Precio");
            table.addCell("Cantidad");
            table.addCell("Total");
            table.addCell("Carrito");
            table.addCell("Vendedor");
            table.addCell("Fecha");
            table.addCell("Hora");

            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("select * from sales");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    if (rs.getString("date").contains(Data.getDate())) {
                        table.addCell(rs.getString(1));
                        table.addCell(rs.getString(2));
                        table.addCell(rs.getString(3));
                        table.addCell(rs.getString(4));
                        table.addCell(rs.getString(5));
                        table.addCell(rs.getString(6));
                        table.addCell(rs.getString(7));
                        table.addCell(rs.getString(8));
                        table.addCell(rs.getString(9));
                    }
                }

                documento.add(table);
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }

            documento.close();
            setProcessLabel('1');
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear al archivo PDF." + "\n" + e);
        }
    }//GEN-LAST:event_pdfButton1MouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- PDF DATE BUTTON.
    //--------------------------------------------------------------------------
    private void pdfButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfButton2MouseClicked
        dateOne = JOptionPane.showInputDialog(null, "Introduce la fecha que deseas imprimir.");

        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(rute + "/Lista de Ventas del Día " + dateOne.replace("/", "-") + ".pdf"));

            Paragraph text = new Paragraph();
            text.setAlignment(Paragraph.ALIGN_CENTER);
            text.add("Formato creado por Enzo Portillo ©" + "\n\n");
            text.setFont(FontFactory.getFont("Arial", 18, Font.BOLD, BaseColor.BLACK));
            text.add("Lista de Ventas..." + "\n\n");

            documento.open();

            documento.add(text);

            PdfPTable table = new PdfPTable(9);
            table.addCell("ID");
            table.addCell("Producto");
            table.addCell("Precio");
            table.addCell("Cantidad");
            table.addCell("Total");
            table.addCell("Carrito");
            table.addCell("Vendedor");
            table.addCell("Fecha");
            table.addCell("Hora");

            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("select * from sales");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    if (rs.getString("date").contains(dateOne)) {
                        table.addCell(rs.getString(1));
                        table.addCell(rs.getString(2));
                        table.addCell(rs.getString(3));
                        table.addCell(rs.getString(4));
                        table.addCell(rs.getString(5));
                        table.addCell(rs.getString(6));
                        table.addCell(rs.getString(7));
                        table.addCell(rs.getString(8));
                        table.addCell(rs.getString(9));
                    }
                }

                documento.add(table);
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }

            documento.close();
            setProcessLabel('2');
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear al archivo PDF." + "\n" + e);
        }
    }//GEN-LAST:event_pdfButton2MouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- PDF DATES BUTTON.
    //--------------------------------------------------------------------------
    @SuppressWarnings("empty-statement")
    private void pdfButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfButton3MouseClicked
        dateOne = JOptionPane.showInputDialog(null, "Introduce la 1er fecha.");
        dateTwo = JOptionPane.showInputDialog(null, "Introduce la 2da fecha.");
        finalDate = dateOne;

        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(rute + "/Lista de Ventas entre " + dateOne.replace("/", "-") + " y " + dateTwo.replace("/", "-") + ".pdf"));

            Paragraph text = new Paragraph();
            text.setAlignment(Paragraph.ALIGN_CENTER);
            text.add("Formato creado por Enzo Portillo ©" + "\n\n");
            text.setFont(FontFactory.getFont("Arial", 18, Font.BOLD, BaseColor.BLACK));
            text.add("Lista de Ventas..." + "\n\n");

            documento.open();

            documento.add(text);

            PdfPTable table = new PdfPTable(9);
            table.addCell("ID");
            table.addCell("Producto");
            table.addCell("Precio");
            table.addCell("Cantidad");
            table.addCell("Total");
            table.addCell("Carrito");
            table.addCell("Vendedor");
            table.addCell("Fecha");
            table.addCell("Hora");

            try {
                PreparedStatement pst = Data.getConnection().prepareStatement("select * from sales");
                ResultSet rs = pst.executeQuery();

                while (!finalDate.equals(dateTwo)); {
                    while (rs.next()) {
                        if (rs.getString("date").contains(finalDate)) {
                            table.addCell(rs.getString(1));
                            table.addCell(rs.getString(2));
                            table.addCell(rs.getString(3));
                            table.addCell(rs.getString(4));
                            table.addCell(rs.getString(5));
                            table.addCell(rs.getString(6));
                            table.addCell(rs.getString(7));
                            table.addCell(rs.getString(8));
                            table.addCell(rs.getString(9));
                        }
                    }

                    equalizeDate();
                }

                documento.add(table);
            } catch (SQLException e) {
                Data.errorDBMessage(e);
            }

            documento.close();
            setProcessLabel('3');
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear al archivo PDF." + "\n" + e);
        }
    }//GEN-LAST:event_pdfButton3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- MAIN.
    //--------------------------------------------------------------------------
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Sales().setVisible(true);
        });
    }

    //--------------------------------------------------------------------------
    //-------------------------------------------------------------------------- NETBEANS.
    //--------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel pdfButton1;
    private javax.swing.JLabel pdfButton2;
    private javax.swing.JLabel pdfButton3;
    private javax.swing.JLabel processLabel;
    private javax.swing.JTable salesTable;
    private javax.swing.JComboBox<String> searchBox;
    private javax.swing.JLabel searchButton3;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
