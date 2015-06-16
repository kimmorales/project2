/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Logic.Customer;
import Logic.Global;
import Logic.Reserve;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kimberly
 */
public class SingleReservesWindow extends javax.swing.JFrame {
    private final CustomerWindow ancestor;
    private final Customer customer;
    private final Global global;
    public SingleReservesWindow(CustomerWindow ancestor, Customer customer) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.ancestor = ancestor;
        this.customer = customer;
        this.global = Global.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListReservesForClient = new javax.swing.JList();
        jButtonDeleteReserve = new javax.swing.JButton();
        jButtonCancelREserve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Reserves:");

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListReservesForClient);

        jButtonDeleteReserve.setText("Delete reserve");
        jButtonDeleteReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteReserveActionPerformed(evt);
            }
        });

        jButtonCancelREserve.setText("Cancel reserve");
        jButtonCancelREserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelREserveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(261, 261, 261))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonCancelREserve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDeleteReserve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonDeleteReserve)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelREserve)
                .addGap(65, 65, 65)
                .addComponent(jButtonBack)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chargeReserves(Customer customer){
        jListReservesForClient.removeAll();
        DefaultListModel model = new DefaultListModel();
        for(Reserve temporalReserve : customer.getReserveList()){
            model.addElement(temporalReserve.getCode()+" -State: "+ temporalReserve.viewReserveState(temporalReserve));
        }
        jListReservesForClient.setModel(model);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        chargeReserves(this.customer);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonDeleteReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteReserveActionPerformed
        if(jListReservesForClient.getSelectedIndex()<=-1){
            JOptionPane.showMessageDialog(this,"You must select a reservation!");
        }
        else{
            customer.deleteReserve(jListReservesForClient.getSelectedIndex());
            chargeReserves(customer);
        }
       
    }//GEN-LAST:event_jButtonDeleteReserveActionPerformed

    private void jButtonCancelREserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelREserveActionPerformed
        if(jListReservesForClient.getSelectedIndex() <0){
            JOptionPane.showMessageDialog(this,"You must select a reservation!");
        }
        else{
        Reserve reserveToCancel = customer.searchReserve(jListReservesForClient.getModel()
        .getElementAt(jListReservesForClient.getSelectedIndex()).toString());
        if(reserveToCancel == null){
            JOptionPane.showMessageDialog(this,"This reservation doesn't exist!");
        }
        else{
            reserveToCancel.setState(false);
            global.addCancelReserves(reserveToCancel);
            chargeReserves(customer);
        }
        }
    }//GEN-LAST:event_jButtonCancelREserveActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.dispose();
        ancestor.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(SingleReservesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleReservesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleReservesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleReservesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingleReservesWindow(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCancelREserve;
    private javax.swing.JButton jButtonDeleteReserve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jListReservesForClient;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
