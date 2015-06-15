/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Logic.Global;
import Logic.HNHotelsCom;
import Logic.Hotel;
import Logic.KindOfRoom;
import Logic.Register;
import Logic.Reserve;
import Logic.Room;
import Logic.Season;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kimberly
 */
public class ReservesWindow extends javax.swing.JFrame {
    private final Global global;
    private final CustomerWindow ancestor;
    private final Hotel hotel;
    public ReservesWindow(CustomerWindow ancestor,Hotel hotel) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.global = Global.getInstance();
        this.ancestor = ancestor;
        this.hotel = hotel;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelHotelSelected = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerEntryDay = new javax.swing.JSpinner();
        jSpinnerEntryMonth = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerDepartureDay = new javax.swing.JSpinner();
        jSpinnerDepartureMonth = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerNigthNumber = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListRoomSelected = new javax.swing.JList();
        jButtonReserve = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldResponsiblePerson = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSpinnerNumberAdults = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinnerChilndrenNumber = new javax.swing.JSpinner();
        jComboBoxTypeRoom = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxSeasonForReserve = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Hotel: ");

        jLabel2.setText("Entry date:");

        jLabel3.setText("Day:");

        jLabel4.setText("Month:");

        jSpinnerEntryDay.setModel(new javax.swing.SpinnerNumberModel(0, 0, 31, 1));

        jSpinnerEntryMonth.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));

        jLabel5.setText("Departure day:");

        jLabel6.setText("Day:");

        jLabel7.setText("Month:");

        jSpinnerDepartureDay.setModel(new javax.swing.SpinnerNumberModel(0, 0, 31, 1));

        jSpinnerDepartureMonth.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));

        jLabel8.setText("Number of nigths:");

        jSpinnerNigthNumber.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel9.setText("Select type room:");

        jListRoomSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListRoomSelectedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListRoomSelected);

        jButtonReserve.setText("Reserve ");
        jButtonReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReserveActionPerformed(evt);
            }
        });

        jLabel10.setText("Responsible person:");

        jLabel11.setText("Number of adults:");

        jSpinnerNumberAdults.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel12.setText("Number of children:");

        jSpinnerChilndrenNumber.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jComboBoxTypeRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTypeRoomMouseClicked(evt);
            }
        });
        jComboBoxTypeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeRoomActionPerformed(evt);
            }
        });

        jLabel13.setText("Select rooms:");

        jLabel14.setText("Season:");

        jComboBoxSeasonForReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSeasonForReserveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addComponent(jComboBoxTypeRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSpinnerNumberAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jSpinnerChilndrenNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonReserve)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldResponsiblePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))))
                                .addGap(0, 5, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel13)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerDepartureDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerEntryDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSpinnerNigthNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerEntryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerDepartureMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxSeasonForReserve, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelHotelSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHotelSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSeasonForReserve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnerEntryDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jSpinnerEntryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jSpinnerDepartureDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDepartureMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerNigthNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxTypeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldResponsiblePerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerNumberAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerChilndrenNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButtonReserve)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chargeAllRoomsOnJlist(KindOfRoom kindRoom){
        DefaultListModel model = new DefaultListModel();
        for(Room temporalRoom : kindRoom.getRoomsList()){
                model.addElement(temporalRoom.getID());  
            }
        jListRoomSelected.setModel(model);
    }
    private void chargeComboTypeRooms(Season season){
        for(KindOfRoom temporalKindRoom: season.getSeasonRoomList()){
            jComboBoxTypeRoom.addItem(temporalKindRoom.getBedType());
        }
    }
    private void chargeComboSeason(Hotel hotel){
        for(Season temporalSeason : hotel.getSeasons()){
            jComboBoxSeasonForReserve.addItem(temporalSeason.getCode());
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       jLabelHotelSelected.setText(this.hotel.getName());
       this.ancestor.setVisible(true);
       jTextFieldResponsiblePerson.setEnabled(false);
       jSpinnerChilndrenNumber.setEnabled(false);
       jSpinnerNumberAdults.setEnabled(false);
       chargeComboSeason(this.hotel);
       
    }//GEN-LAST:event_formWindowOpened

    private void jListRoomSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListRoomSelectedMouseClicked
        jTextFieldResponsiblePerson.setEnabled(true);
        jSpinnerChilndrenNumber.setEnabled(true);
        jSpinnerNumberAdults.setEnabled(true);
    }//GEN-LAST:event_jListRoomSelectedMouseClicked

    private void jButtonReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReserveActionPerformed
        if(((int)jSpinnerChilndrenNumber.getValue()==0)||((int)jSpinnerDepartureDay.getValue()==0)||
        ((int)jSpinnerDepartureMonth.getValue()==0)||((int)jSpinnerEntryDay.getValue()==0)||((int)jSpinnerEntryMonth.getValue()==0)||
        ((int)jSpinnerNigthNumber.getValue()==0)||((int)jSpinnerNumberAdults.getValue()==0)||(jTextFieldResponsiblePerson.getText().equals(""))){
            JOptionPane.showMessageDialog(this,"Some data are required!");
        }
        else{
            
            GregorianCalendar entryDate = HNHotelsCom.createDate((int)jSpinnerEntryDay.getValue(),(int)jSpinnerEntryMonth.getValue());
            GregorianCalendar departureDAte = HNHotelsCom.createDate((int)jSpinnerDepartureDay.getValue(),(int)jSpinnerDepartureMonth.getValue());
            
            Register register = new Register(jTextFieldResponsiblePerson.getText(),(int)jSpinnerNumberAdults.getValue(),(int)jSpinnerChilndrenNumber.getValue());
            Reserve reserve = new Reserve(entryDate, departureDAte,(int)jSpinnerNigthNumber.getValue(),true);
            reserve.getRegisterList().add(register);
            Object object = jComboBoxTypeRoom.getSelectedItem();
            KindOfRoom room = HNHotelsCom.searchKindOfRoom(this.hotel,object.toString());
            int idRoom =Integer.parseInt( jListRoomSelected.getModel()
            .getElementAt(jListRoomSelected.getSelectedIndex()).toString());
            
            Room newRoom = HNHotelsCom.searchRoom(hotel, room,idRoom);
            register.getRoomsSelectedList().add(newRoom);
            reserve.addRegister(register);
            System.out.println("exito");
            System.out.println(newRoom.toString());
        }
    
        
      
    }//GEN-LAST:event_jButtonReserveActionPerformed

    private void jComboBoxTypeRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTypeRoomMouseClicked
        
    }//GEN-LAST:event_jComboBoxTypeRoomMouseClicked

    private void jComboBoxTypeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeRoomActionPerformed
        Object object = jComboBoxTypeRoom.getSelectedItem();
        KindOfRoom room = HNHotelsCom.searchKindOfRoom(this.hotel,object.toString());
        chargeAllRoomsOnJlist(room);
    }//GEN-LAST:event_jComboBoxTypeRoomActionPerformed

    private void jComboBoxSeasonForReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSeasonForReserveActionPerformed
       Object obj= jComboBoxSeasonForReserve.getSelectedItem();
       Season season = HNHotelsCom.searchSeason(hotel,obj.toString());
        chargeComboTypeRooms(season);
    }//GEN-LAST:event_jComboBoxSeasonForReserveActionPerformed

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
            java.util.logging.Logger.getLogger(ReservesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservesWindow(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReserve;
    private javax.swing.JComboBox jComboBoxSeasonForReserve;
    private javax.swing.JComboBox jComboBoxTypeRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHotelSelected;
    private javax.swing.JList jListRoomSelected;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerChilndrenNumber;
    private javax.swing.JSpinner jSpinnerDepartureDay;
    private javax.swing.JSpinner jSpinnerDepartureMonth;
    private javax.swing.JSpinner jSpinnerEntryDay;
    private javax.swing.JSpinner jSpinnerEntryMonth;
    private javax.swing.JSpinner jSpinnerNigthNumber;
    private javax.swing.JSpinner jSpinnerNumberAdults;
    private javax.swing.JTextField jTextFieldResponsiblePerson;
    // End of variables declaration//GEN-END:variables
}
