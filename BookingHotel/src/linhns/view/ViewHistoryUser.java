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
import linhnd.daos.BookingDAO;
import linhnd.daos.DetailBookingDAO;
import linhnd.dtos.Booking;
import linhnd.dtos.DetailBooking;
import linhnd.dtos.UserDTO;

/**
 *
 * @author PC
 */
public class ViewHistoryUser extends javax.swing.JFrame {

    DefaultTableModel tableModelBooking = null;
    DefaultTableModel tableModelDetailBooking = null;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Creates new form ViewHistoryUser
     */
    public ViewHistoryUser() {
        initComponents();
        tableModelBooking = (DefaultTableModel) tableViewBooking.getModel();
        tableModelDetailBooking = (DefaultTableModel) tableViewDetailBooking.getModel();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        txtUsername.setText(UserDTO.Username);
        firstContronller();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DetailBooking = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableViewDetailBooking = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewBooking = new javax.swing.JTable();
        txtUsername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dateSearchFrom = new com.toedter.calendar.JDateChooser();
        dateSearchTo = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        tableViewDetailBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id Hotel", "Kind Of Room", "number Of Room"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableViewDetailBooking);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Detail booking");

        javax.swing.GroupLayout DetailBookingLayout = new javax.swing.GroupLayout(DetailBooking.getContentPane());
        DetailBooking.getContentPane().setLayout(DetailBookingLayout);
        DetailBookingLayout.setHorizontalGroup(
            DetailBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailBookingLayout.createSequentialGroup()
                .addGroup(DetailBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailBookingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(DetailBookingLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        DetailBookingLayout.setVerticalGroup(
            DetailBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetailBookingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HISTORY BOOKING");

        tableViewBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idBooking", "Date Check In", "Date Check out", "Total Booking", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableViewBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewBookingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewBooking);

        txtUsername.setText("jLabel2");

        jButton1.setText("Delete Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("To");

        jLabel4.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsername)
                        .addGap(56, 56, 56)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateSearchFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateSearchTo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 202, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername)
                    .addComponent(jButton3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateSearchFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(dateSearchTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableViewBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewBookingMouseClicked
        int row = tableViewBooking.getSelectedRow();
        if (row >= 0) {
            String idBooking = (String) tableModelBooking.getValueAt(row, 0);
            DetailBooking.setSize(500, 400);
            DetailBooking.setLocation(dim.width / 2 - DetailBooking.getSize().width / 2, dim.height / 2 - DetailBooking.getSize().height / 2);
            DetailBooking.setVisible(true);
            try {
                DetailBookingDAO dao = new DetailBookingDAO();
                List<DetailBooking> result = dao.getListDetailBooking(idBooking);
                viewtableDetailBooking(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableViewBookingMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tableViewBooking.getSelectedRow();
        if (row >= 0) {
            String idBooking = (String) tableModelBooking.getValueAt(row, 0);
            int confim = JOptionPane.showConfirmDialog(this, "Do you want delete Booking " + idBooking);
            if (confim == JOptionPane.YES_OPTION) {
                try {
                    BookingDAO dao = new BookingDAO();
                    dao.updateStatusBooking(idBooking);
                    firstContronller();
                    JOptionPane.showMessageDialog(this, "Done");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select Row");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String search = txtSearch.getText();
        Date dateFrom = dateSearchFrom.getDate();
        Date dateTo = dateSearchTo.getDate();
        if (!search.equals("")) {
            if (dateFrom == null && dateTo == null) {
                try {
                    BookingDAO dao = new BookingDAO();
                    List<Booking> result = dao.getListBookingbySerarch(UserDTO.Username, search);
                    viewtableBooking(result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    BookingDAO dao = new BookingDAO();
                    List<Booking> result = dao.getListBookingbySerarch(UserDTO.Username, search, dateFrom, dateTo);
                    viewtableBooking(result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                BookingDAO dao = new BookingDAO();
                List<Booking> result = dao.getListBookingbySerarch(UserDTO.Username, dateFrom, dateTo);
                viewtableBooking(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BookingJFrame b = new BookingJFrame();
        this.dispose();
        b.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    private void viewtableBooking(List<Booking> result) {
        tableModelBooking.setRowCount(0);
        for (Booking booking : result) {
            tableModelBooking.addRow(booking.toVector());
        }
    }

    private void viewtableDetailBooking(List<DetailBooking> result) {
        tableModelDetailBooking.setRowCount(0);
        for (DetailBooking detailBooking : result) {
            tableModelDetailBooking.addRow(detailBooking.toVector());
        }
    }

    private void firstContronller() {
        try {
            BookingDAO dao = new BookingDAO();
            List<Booking> result = dao.getListBookingbyUsername(UserDTO.Username);
            viewtableBooking(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(ViewHistoryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHistoryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHistoryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHistoryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHistoryUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame DetailBooking;
    private com.toedter.calendar.JDateChooser dateSearchFrom;
    private com.toedter.calendar.JDateChooser dateSearchTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableViewBooking;
    private javax.swing.JTable tableViewDetailBooking;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
