/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linhns.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import linhnd.controllers.SearchController;
import linhnd.daos.HotelDAO;
import linhnd.daos.KindOfRoomDAO;
import linhnd.dtos.Hotel;
import linhnd.dtos.KindOfRoom;

/**
 *
 * @author Duc Linh
 */
public class WelcomeJFrame extends javax.swing.JFrame {

    DefaultTableModel tableModelHotel = null;
    DefaultTableModel tableModelRoomInHotel = null;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Creates new form WelcomeJFrame
     */
    public WelcomeJFrame() {
        initComponents();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        tableModelHotel = (DefaultTableModel) tableViewHotel.getModel();
        tableModelRoomInHotel = (DefaultTableModel) TableViewTypeRoomInHotel.getModel();
        firstController();

    }

    private void viewTableAllHotel(List<Hotel> result) {
        tableModelHotel.setRowCount(0);
        for (Hotel hotel : result) {
            tableModelHotel.addRow(hotel.toVecterHotel());
        }
    }

    private void firstController() {
        try {
            SearchController search = new SearchController();
            List<Hotel> result = search.getListHotelVaildNow();
            viewTableAllHotel(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void viewDetailRoomInHotel(List<KindOfRoom> result) {
        tableModelRoomInHotel.setRowCount(0);
        for (KindOfRoom kindOfRoom : result) {
            tableModelRoomInHotel.addRow(kindOfRoom.toVectorTypeRoom());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DetailHotelJFrame = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        labelImager = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableViewTypeRoomInHotel = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtNameHotel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddressHotel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdHotel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRate = new javax.swing.JLabel();
        txtSearchAdressHotel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewHotel = new javax.swing.JTable();
        dateSearchFrom = new com.toedter.calendar.JDateChooser();
        dateSearchTo = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Detail Hotel");

        TableViewTypeRoomInHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Room", "Type Room", "Number of People", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableViewTypeRoomInHotel);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Name Hotel :");

        txtNameHotel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNameHotel.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Address Hotel :");

        txtAddressHotel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddressHotel.setText("jLabel9");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ID Hotel:");

        txtIdHotel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIdHotel.setText("jLabel9");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Rate :");

        txtRate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRate.setText("jLabel10");

        javax.swing.GroupLayout DetailHotelJFrameLayout = new javax.swing.GroupLayout(DetailHotelJFrame.getContentPane());
        DetailHotelJFrame.getContentPane().setLayout(DetailHotelJFrameLayout);
        DetailHotelJFrameLayout.setHorizontalGroup(
            DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailHotelJFrameLayout.createSequentialGroup()
                .addGroup(DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailHotelJFrameLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5))
                    .addGroup(DetailHotelJFrameLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelImager, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(85, 85, 85)
                        .addGroup(DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameHotel)
                            .addComponent(txtAddressHotel)
                            .addComponent(txtIdHotel)
                            .addComponent(txtRate))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetailHotelJFrameLayout.createSequentialGroup()
                .addGap(0, 154, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        DetailHotelJFrameLayout.setVerticalGroup(
            DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailHotelJFrameLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailHotelJFrameLayout.createSequentialGroup()
                        .addGroup(DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtIdHotel))
                        .addGap(18, 18, 18)
                        .addGroup(DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNameHotel))
                        .addGap(22, 22, 22)
                        .addGroup(DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtAddressHotel))
                        .addGap(18, 18, 18)
                        .addGroup(DetailHotelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtRate)))
                    .addComponent(labelImager, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linhnd/icon/icons8_search_30px.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableViewHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDHotel", "Name Hotel", "Address hotel", "Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableViewHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewHotelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewHotel);

        dateSearchFrom.setDateFormatString("dd-MM-yyyy");

        dateSearchTo.setDateFormatString("dd-MM-yyyy");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BOOKING HOTEL");

        jLabel2.setText("Inpurt name Hotel or address Hotel :");

        jLabel3.setText("Date From :");

        jLabel4.setText("To");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linhnd/icon/icons8_login_30px_1.png"))); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linhnd/icon/icons8_refresh_30px.png"))); // NOI18N
        jButton3.setText("Refresh ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("* You need login to Booking Hotel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateSearchFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(dateSearchTo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchAdressHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel11)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtSearchAdressHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateSearchTo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateSearchFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String stringSearchValue = txtSearchAdressHotel.getText();
        Date dateFrom = dateSearchFrom.getDate();
        Date dateTo = dateSearchTo.getDate();
        Date datenow = new Date();
        SearchController search = new SearchController();
        List<Hotel> listSearchHotel;
        if (dateFrom != null && dateTo != null) {
            if (dateFrom.compareTo(datenow) < 0 && dateTo.compareTo(datenow) < 0 && dateFrom.compareTo(dateTo) == 0) {
                JOptionPane.showMessageDialog(this, "input date > date now");
            } else {
                if (dateFrom.compareTo(dateTo) > 0) {
                    JOptionPane.showMessageDialog(this, "Pls, Choose  dateFrom > dateTo");
                } else {
                    try {
                        listSearchHotel = search.getListHotelVaild(stringSearchValue, dateFrom, dateTo);
                        viewTableAllHotel(listSearchHotel);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginJFrame lg = new LoginJFrame();
        lg.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        firstController();
        txtSearchAdressHotel.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableViewHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewHotelMouseClicked
        String imagerUrl = "/imager/";
        int row = tableViewHotel.getSelectedRow();
        String idHotel = (String) tableModelHotel.getValueAt(row, 0);
        DetailHotelJFrame.setSize(900, 600);
        DetailHotelJFrame.setLocation(dim.width / 2 - DetailHotelJFrame.getSize().width / 2, dim.height / 2 - DetailHotelJFrame.getSize().height / 2);
        DetailHotelJFrame.setVisible(true);
        try {
            HotelDAO dao = new HotelDAO();
            Hotel dto = dao.getHotelByID(idHotel);
            imagerUrl = imagerUrl + dto.getImagerName();
            try {
                labelImager.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagerUrl)));
            } catch (Exception e) {
                labelImager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imager/1.jpg")));
            }
            txtIdHotel.setText(dto.getHotelID());
            txtNameHotel.setText(dto.getNameHotel());
            txtAddressHotel.setText(dto.getAddressHotel());
            txtRate.setText(String.valueOf(dto.getRateHotel()));
            KindOfRoomDAO kindOfRoomdao = new KindOfRoomDAO();
            List<KindOfRoom> resultKindOfRoom = kindOfRoomdao.getListKindOfRoom(idHotel);
            viewDetailRoomInHotel(resultKindOfRoom);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableViewHotelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame DetailHotelJFrame;
    private javax.swing.JTable TableViewTypeRoomInHotel;
    private com.toedter.calendar.JDateChooser dateSearchFrom;
    private com.toedter.calendar.JDateChooser dateSearchTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelImager;
    private javax.swing.JTable tableViewHotel;
    private javax.swing.JLabel txtAddressHotel;
    private javax.swing.JLabel txtIdHotel;
    private javax.swing.JLabel txtNameHotel;
    private javax.swing.JLabel txtRate;
    private javax.swing.JTextField txtSearchAdressHotel;
    // End of variables declaration//GEN-END:variables
}
