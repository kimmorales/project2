/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Logic.Category;
import Logic.Global;
import Logic.HNHotelsCom;
import Logic.Hotel;
import Logic.KindOfRoom;
import Logic.Price;
import Logic.Room;
import Logic.Season;
import Logic.Service;
import Logic.TouristAttraction;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Kimberly
 */
public class AdminWindow extends javax.swing.JFrame {
    private final Global global;
    private final LoginWindow ancestor;
    
    public AdminWindow(LoginWindow login) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        global= Global.getInstance();
        this.ancestor = login;
        
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        terraceLounge = new javax.swing.ButtonGroup();
        seaview = new javax.swing.ButtonGroup();
        allIncluded = new javax.swing.ButtonGroup();
        somokePermission = new javax.swing.ButtonGroup();
        jRadioButtonTerraceAux = new javax.swing.JRadioButton();
        jRadioButtonSeaViewAux = new javax.swing.JRadioButton();
        jRadioButtonAllInclude = new javax.swing.JRadioButton();
        jRadioButtonSmoke = new javax.swing.JRadioButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldHotelName = new javax.swing.JTextField();
        jTextFielHoteldAddress = new javax.swing.JTextField();
        jTextFieldHotelCountry = new javax.swing.JTextField();
        jTextFieldHotelPhoneNumber = new javax.swing.JTextField();
        jComboBoxYearOfBuilt = new javax.swing.JComboBox();
        jTextFieldTypeOFLodgin = new javax.swing.JTextField();
        jSpinnerHotelSize = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinnerCheckinHour = new javax.swing.JSpinner();
        jSpinnerCheckOutHour = new javax.swing.JSpinner();
        jSpinnerStarsNumber = new javax.swing.JSpinner();
        jButtonSaveHotel = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBoxHotelCategory = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSpinnerCategoryTax = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPaneCategoryDescription = new javax.swing.JTextPane();
        jButtonSaveCategory = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldCategoryCode = new javax.swing.JTextField();
        jTextFieldHotelRequirements = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinnerFloor = new javax.swing.JSpinner();
        jTextFieldBedType = new javax.swing.JTextField();
        jSpinnerMaxGuest = new javax.swing.JSpinner();
        jSpinnerRoomSize = new javax.swing.JSpinner();
        jRadioButtonYesLoungeTerrace = new javax.swing.JRadioButton();
        jRadioButtonNoLoungeTerrace = new javax.swing.JRadioButton();
        jRadioButtonYesSeaview = new javax.swing.JRadioButton();
        jRadioButtonNoSeaview = new javax.swing.JRadioButton();
        jRadioButtonAllIncludedYes = new javax.swing.JRadioButton();
        jRadioButtonAllIncludedNo = new javax.swing.JRadioButton();
        jRadioButtonSmokeYes = new javax.swing.JRadioButton();
        jRadioButtonSmokeNo = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSpinnerIDRoom = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneDescriptionRoom = new javax.swing.JTextPane();
        jButtonSaveTypeRoom = new javax.swing.JButton();
        jButtonSaveRoom = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jComboBoxHotelList = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListTypeOfRooms = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldIDTouristAttraction = new javax.swing.JTextField();
        jTextFieldAttractionName = new javax.swing.JTextField();
        jButtonSaveTouristAttraction = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextFieldServiceCode = new javax.swing.JTextField();
        jTextFieldServiceName = new javax.swing.JTextField();
        jButtonSaveService = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jComboBoxComboSelectHotel = new javax.swing.JComboBox();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jSpinnerDayStartSeason = new javax.swing.JSpinner();
        jSpinnerMonthStartSeason = new javax.swing.JSpinner();
        jSpinnerDayEndSeason = new javax.swing.JSpinner();
        jSpinnerEndMonthSeason = new javax.swing.JSpinner();
        jTextFieldSeasonCode = new javax.swing.JTextField();
        jTextFieldSeasonName = new javax.swing.JTextField();
        jButtonSaveSeason = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextFieldPriceCode = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jTextFieldAmountPrice = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jTextFieldCurrencyPrice = new javax.swing.JTextField();
        jButtonSavePrice = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        jComboBoxSeasonForRoom = new javax.swing.JComboBox();
        jLabel58 = new javax.swing.JLabel();
        jComboBoxTypeOfRoomSeason = new javax.swing.JComboBox();
        jLabel59 = new javax.swing.JLabel();
        jComboBoxPriceRoomForSeason = new javax.swing.JComboBox();
        jButtonRoomPrice = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jButtonAddImages = new javax.swing.JButton();
        jComboBoxHotelsForImages = new javax.swing.JComboBox();
        jLabel61 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jButtonReports = new javax.swing.JButton();

        terraceLounge.add(jRadioButtonTerraceAux);
        jRadioButtonTerraceAux.setText("jRadioButton1");

        seaview.add(jRadioButtonSeaViewAux);
        jRadioButtonSeaViewAux.setText("jRadioButton1");

        allIncluded.add(jRadioButtonAllInclude);
        jRadioButtonAllInclude.setText("jRadioButton1");

        somokePermission.add(jRadioButtonSmoke);
        jRadioButtonSmoke.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Hotel name:");

        jLabel2.setText("Address:");

        jLabel3.setText("Country:");

        jLabel4.setText("Phone number:");

        jLabel5.setText("Year of built:");

        jLabel6.setText("Type of lodgin:");

        jLabel7.setText("Hotel size:");

        jLabel8.setText("Checkin hour:");

        jLabel9.setText("Checkout hour:");

        jLabel10.setText("Requierements:");

        jLabel11.setText("Stars number:");

        jTextFieldHotelName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHotelNameKeyTyped(evt);
            }
        });

        jTextFielHoteldAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielHoteldAddressKeyTyped(evt);
            }
        });

        jTextFieldHotelCountry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHotelCountryKeyTyped(evt);
            }
        });

        jTextFieldHotelPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHotelPhoneNumberKeyTyped(evt);
            }
        });

        jTextFieldTypeOFLodgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTypeOFLodginActionPerformed(evt);
            }
        });
        jTextFieldTypeOFLodgin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTypeOFLodginKeyTyped(evt);
            }
        });

        jSpinnerHotelSize.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jSpinnerCheckinHour.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jSpinnerCheckOutHour.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jSpinnerStarsNumber.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jButtonSaveHotel.setText("Add");
        jButtonSaveHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveHotelActionPerformed(evt);
            }
        });

        jLabel28.setText("Register new hotel:");

        jLabel30.setText("Category:");

        jComboBoxHotelCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHotelCategoryActionPerformed(evt);
            }
        });

        jLabel31.setText("Category:");

        jLabel32.setText("Tax:");

        jLabel33.setText("Description:");

        jSpinnerCategoryTax.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jScrollPane4.setViewportView(jTextPaneCategoryDescription);

        jButtonSaveCategory.setText("Save");
        jButtonSaveCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveCategoryActionPerformed(evt);
            }
        });

        jLabel34.setText("Code:");

        jTextFieldCategoryCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCategoryCodeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(138, 138, 138)
                                        .addComponent(jSpinnerHotelSize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldTypeOFLodgin, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(jTextFieldHotelName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFielHoteldAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldHotelCountry, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldHotelPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxYearOfBuilt, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE)
                                            .addComponent(jSpinnerStarsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxHotelCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSpinnerCheckinHour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinnerCheckOutHour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonSaveHotel)
                                            .addComponent(jTextFieldHotelRequirements, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel12)
                                .addGap(212, 212, 212))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator1))
                .addGap(228, 228, 228))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCategoryCode)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCategoryTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSaveCategory, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldHotelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFielHoteldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldHotelCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldHotelPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxYearOfBuilt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldTypeOFLodgin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerHotelSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerCheckinHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jSpinnerCheckOutHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldHotelRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jSpinnerStarsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jComboBoxHotelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jButtonSaveHotel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextFieldCategoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jSpinnerCategoryTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSaveCategory)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Add hotels", jPanel1);

        jLabel13.setText("Type of room:");

        jLabel14.setText("Floor:");

        jLabel15.setText("Bed type:");

        jLabel16.setText("Maximun number of guest:");

        jLabel17.setText("Room size:");

        jLabel18.setText("Has lounge or terrace: ");

        jLabel19.setText("Sea view:");

        jLabel20.setText("All included:");

        jLabel21.setText("Somoke permission:");

        jSpinnerFloor.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jSpinnerMaxGuest.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jSpinnerRoomSize.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        terraceLounge.add(jRadioButtonYesLoungeTerrace);
        jRadioButtonYesLoungeTerrace.setText("Yes");
        jRadioButtonYesLoungeTerrace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYesLoungeTerraceActionPerformed(evt);
            }
        });

        terraceLounge.add(jRadioButtonNoLoungeTerrace);
        jRadioButtonNoLoungeTerrace.setText("No");

        seaview.add(jRadioButtonYesSeaview);
        jRadioButtonYesSeaview.setText("Yes");
        jRadioButtonYesSeaview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYesSeaviewActionPerformed(evt);
            }
        });

        seaview.add(jRadioButtonNoSeaview);
        jRadioButtonNoSeaview.setText("No");

        allIncluded.add(jRadioButtonAllIncludedYes);
        jRadioButtonAllIncludedYes.setText("Yes");

        allIncluded.add(jRadioButtonAllIncludedNo);
        jRadioButtonAllIncludedNo.setText("No");

        somokePermission.add(jRadioButtonSmokeYes);
        jRadioButtonSmokeYes.setText("Yes");

        somokePermission.add(jRadioButtonSmokeNo);
        jRadioButtonSmokeNo.setText("No");

        jLabel22.setText("Room:");

        jLabel23.setText("ID:");

        jLabel24.setText("Description:");

        jScrollPane2.setViewportView(jTextPaneDescriptionRoom);

        jButtonSaveTypeRoom.setText("Save");
        jButtonSaveTypeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveTypeRoomActionPerformed(evt);
            }
        });

        jButtonSaveRoom.setText("Save room");
        jButtonSaveRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveRoomActionPerformed(evt);
            }
        });

        jLabel60.setText("Hotel:");

        jComboBoxHotelList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHotelListActionPerformed(evt);
            }
        });

        jLabel25.setText("Select type of room:");

        jScrollPane3.setViewportView(jListTypeOfRooms);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel22))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerIDRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSaveRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerFloor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonSmokeYes)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButtonSmokeNo))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonAllIncludedYes)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButtonAllIncludedNo))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonYesLoungeTerrace)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButtonNoLoungeTerrace))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonYesSeaview)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButtonNoSeaview))
                                        .addComponent(jTextFieldBedType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinnerMaxGuest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinnerRoomSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonSaveTypeRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addGap(116, 116, 116)
                                .addComponent(jComboBoxHotelList, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel60)
                            .addComponent(jComboBoxHotelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinnerFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(5, 5, 5)
                                .addComponent(jTextFieldBedType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jSpinnerMaxGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerRoomSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonYesLoungeTerrace)
                                    .addComponent(jRadioButtonNoLoungeTerrace))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonYesSeaview)
                                    .addComponent(jRadioButtonNoSeaview))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonAllIncludedYes)
                                    .addComponent(jRadioButtonAllIncludedNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonSmokeYes)
                                    .addComponent(jRadioButtonSmokeNo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSaveTypeRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jSpinnerIDRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonSaveRoom)
                .addGap(185, 185, 185))
        );

        jTabbedPane4.addTab("Add rooms", jPanel2);

        jLabel35.setText("Tourist attraction:");

        jLabel36.setText("ID:");

        jLabel37.setText("Name:");

        jButtonSaveTouristAttraction.setText("Save");
        jButtonSaveTouristAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveTouristAttractionActionPerformed(evt);
            }
        });

        jLabel38.setText("Service:");

        jLabel39.setText("Code:");

        jLabel40.setText("Name:");

        jButtonSaveService.setText("Save");
        jButtonSaveService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveServiceActionPerformed(evt);
            }
        });

        jLabel41.setText("Hotel:");

        jComboBoxComboSelectHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxComboSelectHotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel36)
                                                    .addComponent(jLabel37))
                                                .addGap(60, 60, 60))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel40)
                                                    .addComponent(jLabel39))
                                                .addGap(58, 58, 58)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldIDTouristAttraction)
                                            .addComponent(jTextFieldAttractionName)
                                            .addComponent(jTextFieldServiceCode)
                                            .addComponent(jTextFieldServiceName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                            .addComponent(jComboBoxComboSelectHotel, 0, 176, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonSaveTouristAttraction)
                                            .addComponent(jButtonSaveService))))))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jComboBoxComboSelectHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel38))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTextFieldIDTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jTextFieldAttractionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSaveTouristAttraction)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextFieldServiceCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jTextFieldServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSaveService)))
                .addGap(22, 22, 22)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Attractions-Services", jPanel3);

        jLabel44.setText("Season:");

        jLabel45.setText("Code:");

        jLabel46.setText("Name:");

        jLabel47.setText("Start:");

        jLabel48.setText("End:");

        jLabel49.setText("Day:");

        jLabel50.setText("Month:");

        jLabel52.setText("Day:");

        jLabel53.setText("Month:");

        jSpinnerDayStartSeason.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinnerMonthStartSeason.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinnerDayEndSeason.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinnerEndMonthSeason.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jButtonSaveSeason.setText("Save");
        jButtonSaveSeason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveSeasonActionPerformed(evt);
            }
        });

        jLabel51.setText("Price:");

        jLabel54.setText("Code:");

        jLabel55.setText("Amount:");

        jTextFieldAmountPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAmountPriceKeyTyped(evt);
            }
        });

        jLabel56.setText("Currency:");

        jButtonSavePrice.setText("Save");
        jButtonSavePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavePriceActionPerformed(evt);
            }
        });

        jLabel57.setText("Season:");

        jComboBoxSeasonForRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSeasonForRoomActionPerformed(evt);
            }
        });

        jLabel58.setText("Type of room:");

        jComboBoxTypeOfRoomSeason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeOfRoomSeasonActionPerformed(evt);
            }
        });

        jLabel59.setText("Price:");

        jComboBoxPriceRoomForSeason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPriceRoomForSeasonActionPerformed(evt);
            }
        });

        jButtonRoomPrice.setText("Save");
        jButtonRoomPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRoomPriceActionPerformed(evt);
            }
        });

        jLabel29.setText("Images:");

        jButtonAddImages.setText("Add images");
        jButtonAddImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddImagesActionPerformed(evt);
            }
        });

        jComboBoxHotelsForImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHotelsForImagesActionPerformed(evt);
            }
        });

        jLabel61.setText("Hotel:");

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonReports.setText("View statistics ");
        jButtonReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSaveSeason))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel47))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel52)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jSpinnerDayEndSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel49)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jSpinnerDayStartSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(27, 27, 27))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel45)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel46)
                                        .addGap(81, 81, 81)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldSeasonCode)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinnerEndMonthSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinnerMonthStartSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldPriceCode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAmountPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSeasonName)
                                    .addComponent(jTextFieldCurrencyPrice)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonSavePrice))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel54)))
                            .addComponent(jLabel51)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel29))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel58)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxSeasonForRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBoxPriceRoomForSeason, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBoxTypeOfRoomSeason, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonRoomPrice, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel61))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonReports, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonAddImages, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxHotelsForImages, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextFieldSeasonCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextFieldSeasonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jSpinnerDayStartSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerMonthStartSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jSpinnerDayEndSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerEndMonthSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSaveSeason)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextFieldPriceCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jTextFieldAmountPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTextFieldCurrencyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSavePrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSeasonForRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxHotelsForImages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jComboBoxTypeOfRoomSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel59)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBoxPriceRoomForSeason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddImages)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonReports)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRoomPrice)
                    .addComponent(jButtonExit))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Other", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonYesSeaviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYesSeaviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYesSeaviewActionPerformed

    private void jRadioButtonYesLoungeTerraceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYesLoungeTerraceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYesLoungeTerraceActionPerformed

    private void jButtonSaveHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveHotelActionPerformed
        if((jTextFieldHotelName.getText().equals("")) || (jTextFielHoteldAddress.getText().equals("")) || 
        (jTextFieldHotelCountry.getText().equals("")) || (jTextFieldHotelPhoneNumber.getText().equals(""))
        ||(jTextFieldHotelRequirements.getText().equals("")) || (jTextFieldTypeOFLodgin.getText().equals("")) || 
        (jComboBoxYearOfBuilt.getSelectedItem()==null) ||(int)jSpinnerCheckinHour.getValue()==0 ||
        (int)jSpinnerCheckOutHour.getValue()==0 || (int)jSpinnerHotelSize.getValue()==0 ||
        jComboBoxYearOfBuilt.getSelectedItem()==null||(jComboBoxHotelCategory.getSelectedItem()==null)){
             JOptionPane.showMessageDialog(this, "Some data are required");
        }
        else{
            
            String getYear= jComboBoxYearOfBuilt.getSelectedItem().toString();
            int year = Integer.parseInt(getYear);
            int phone = Integer.parseInt(jTextFieldHotelPhoneNumber.getText());
            Category hotelCategory = HNHotelsCom.searchCategory(Integer.parseInt(jComboBoxHotelCategory.getSelectedItem().toString()));
            Hotel newHotel = new Hotel(jTextFieldHotelName.getText(), jTextFielHoteldAddress.getText(),
            jTextFieldHotelCountry.getText(),phone,
           year,jTextFieldTypeOFLodgin.getText(),(int)jSpinnerHotelSize.getValue(),(int)jSpinnerCheckinHour.getValue(),
           (int)jSpinnerCheckOutHour.getValue(),
           jTextFieldHotelRequirements.getText(),(int)jSpinnerStarsNumber.getValue(),hotelCategory);          
            
            Global.getInstance().addHotel(newHotel);
            JOptionPane.showMessageDialog(this,"Saved successfully");
            jTextFielHoteldAddress.setText("");
            jTextFieldHotelCountry.setText("");
            jTextFieldHotelName.setText("");
            jTextFieldHotelPhoneNumber.setText("");
            jTextFieldHotelRequirements.setText("");
            jTextFieldTypeOFLodgin.setText("");
            jSpinnerHotelSize.setValue(0);
            jSpinnerCheckOutHour.setValue(0);
            jSpinnerCheckinHour.setValue(0);
            jSpinnerStarsNumber.setValue(0);
        
            jComboBoxHotelList.addItem(newHotel.getName());
            jComboBoxComboSelectHotel.addItem(newHotel.getName());
            jComboBoxHotelsForImages.addItem(newHotel.getName());
            jComboBoxComboSelectHotel.addItem(newHotel.getName());
        }
        
    }//GEN-LAST:event_jButtonSaveHotelActionPerformed

    private void jTextFieldHotelPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHotelPhoneNumberKeyTyped
        char c = evt.getKeyChar(); 
        if (!((c >= 48) && (c <= 57) || (c == evt.VK_BACK_SPACE) || (c == evt.VK_DELETE))) { 
        getToolkit().beep(); 
        evt.consume(); 
        }
    }//GEN-LAST:event_jTextFieldHotelPhoneNumberKeyTyped

    private void jTextFieldHotelNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHotelNameKeyTyped
       char c = evt.getKeyChar(); 
        if (!((c >= 65) && (c <= 90)||((c>=97)&&(c<=122)) || (c == evt.VK_BACK_SPACE) || (c == evt.VK_DELETE))) { 
        getToolkit().beep(); 
        evt.consume(); 
        }
    }//GEN-LAST:event_jTextFieldHotelNameKeyTyped

    private void jTextFielHoteldAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielHoteldAddressKeyTyped
        char c = evt.getKeyChar(); 
        if (!((c >= 65) && (c <= 90)||((c>=97)&&(c<=122))||((c>=48)&&(c<=57)) || (c == evt.VK_BACK_SPACE) || (c == evt.VK_DELETE))) { 
        getToolkit().beep(); 
        evt.consume(); 
        }
    }//GEN-LAST:event_jTextFielHoteldAddressKeyTyped

    private void jTextFieldHotelCountryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHotelCountryKeyTyped
        char c = evt.getKeyChar(); 
        if (!((c >= 65) && (c <= 90)||((c>=97)&&(c<=122)) || (c == evt.VK_BACK_SPACE) || (c == evt.VK_DELETE))) { 
        getToolkit().beep(); 
        evt.consume(); 
        }
    }//GEN-LAST:event_jTextFieldHotelCountryKeyTyped

    private void jTextFieldTypeOFLodginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTypeOFLodginKeyTyped
        char c = evt.getKeyChar(); 
        if (!((c >= 65) && (c <= 90)||((c>=97)&&(c<=122)) || (c == evt.VK_BACK_SPACE) || (c == evt.VK_DELETE))) { 
        getToolkit().beep(); 
        evt.consume(); 
        }
    }//GEN-LAST:event_jTextFieldTypeOFLodginKeyTyped

    private void jTextFieldCategoryCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCategoryCodeKeyTyped
        char c = evt.getKeyChar(); 
        if (!((c >= 48) && (c <= 57) || (c == evt.VK_BACK_SPACE) || (c == evt.VK_DELETE))) { 
        getToolkit().beep(); 
        evt.consume(); 
        }
    }//GEN-LAST:event_jTextFieldCategoryCodeKeyTyped

    private void jButtonSaveCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveCategoryActionPerformed
       Object tax=jSpinnerCategoryTax.getValue();
       int hotelTax =Integer.parseInt(tax.toString());
        if(!(jTextFieldCategoryCode.getText().equals("")||jTextPaneCategoryDescription.getText().equals(""))){
           Category category = new Category(Integer.parseInt(jTextFieldCategoryCode.getText()),
           hotelTax,jTextPaneCategoryDescription.getText());   
           Global.getInstance().getCategoryList().add(category);
           jTextFieldCategoryCode.setText("");
           jTextPaneCategoryDescription.setText("");
           jSpinnerCategoryTax.setValue(0);
           chargeCategory();
       }
        else 
            JOptionPane.showMessageDialog(this,"Some data are required !");
        
    }//GEN-LAST:event_jButtonSaveCategoryActionPerformed

    private void jTextFieldAmountPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAmountPriceKeyTyped
        char c = evt.getKeyChar(); 
        if (!((c >= 48) && (c <= 57) || (c == evt.VK_BACK_SPACE) || (c == evt.VK_DELETE))) { 
        getToolkit().beep(); 
        evt.consume(); 
        }
    }//GEN-LAST:event_jTextFieldAmountPriceKeyTyped

    private void jButtonSaveRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveRoomActionPerformed
        Object hotel = jComboBoxHotelList.getSelectedItem();     
        Hotel hotelToSearch = HNHotelsCom.searchHotel(hotel.toString()); 
        if(!jTextPaneDescriptionRoom.getText().equals("")){
            Room newRoom = new Room((int)jSpinnerIDRoom.getValue(),jTextPaneDescriptionRoom.getText());
            hotelToSearch.getKindOfRoomList().get(jListTypeOfRooms.getSelectedIndex()).addRoom(newRoom);
        }
        jTextPaneDescriptionRoom.setText("");
        jSpinnerIDRoom.setValue(0);
    }//GEN-LAST:event_jButtonSaveRoomActionPerformed

    private void jButtonSaveTypeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveTypeRoomActionPerformed
    Hotel hotel =HNHotelsCom.searchHotel(jComboBoxComboSelectHotel.getSelectedItem().toString());
    if(((int)jSpinnerFloor.getValue()==0)|| (jTextFieldBedType.getText().equals(""))||
    ((int)jSpinnerMaxGuest.getValue()==0)||((int)jSpinnerRoomSize.getValue()==0)){
        JOptionPane.showMessageDialog(this,"Some data are required.");
    }
    else{
        KindOfRoom newKindOFRoom = new KindOfRoom((int)jSpinnerFloor.getValue(),jTextFieldBedType.getText()
        ,(int) jSpinnerMaxGuest.getValue(),(int)jSpinnerHotelSize.getValue(),jRadioButtonYesLoungeTerrace.isSelected()
        , jRadioButtonYesSeaview.isSelected(), jRadioButtonAllIncludedYes.isSelected(),jRadioButtonSmokeYes.isSelected());
        hotel.addKindRoom(newKindOFRoom);
        jSpinnerFloor.setValue(0);
        jTextFieldBedType.setText("");
        jSpinnerMaxGuest.setValue(0);
        jSpinnerHotelSize.setValue(0);
        jRadioButtonAllInclude.setSelected(true);
        jRadioButtonSeaViewAux.setSelected(true);
        jRadioButtonSmoke.setSelected(true);
        jRadioButtonTerraceAux.setSelected(true);
        chargeJlistKindOfRoom(hotel);
    }
  
    }//GEN-LAST:event_jButtonSaveTypeRoomActionPerformed

    private void chargeCategory(){
        for(Category temporalCategory : Global.getInstance().getCategoryList()){
            jComboBoxHotelCategory.addItem(temporalCategory.getCode());
        }
    }
    
    private void chargeComboSeason(Hotel hotel){
        jComboBoxSeasonForRoom.removeAllItems();
        for(Season temporalSeason : hotel.getSeasons()){
            jComboBoxSeasonForRoom.addItem(temporalSeason.getCode());
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        chargeComboYear();
        chargeComboWithHotels(jComboBoxComboSelectHotel);
        chargeComboWithHotels(jComboBoxHotelList);
        chargeComboWithHotels(jComboBoxHotelsForImages);
        chargeComboWithHotels(jComboBoxComboSelectHotel);
        chargeJlistKindOfRoom(HNHotelsCom.searchHotel(jComboBoxComboSelectHotel.getSelectedItem().toString()));
        chargeCategory();
        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxComboSelectHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxComboSelectHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxComboSelectHotelActionPerformed

    private void jComboBoxHotelCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHotelCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHotelCategoryActionPerformed

    private void jTextFieldTypeOFLodginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTypeOFLodginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTypeOFLodginActionPerformed

    private void jButtonSaveTouristAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveTouristAttractionActionPerformed
       Hotel hotel = HNHotelsCom.searchHotel(jComboBoxComboSelectHotel.getSelectedItem().toString());
       if(jTextFieldIDTouristAttraction.getText().equals("") || jTextFieldAttractionName.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Some date are required !");
       }
       else{
           TouristAttraction touristAttraction = new TouristAttraction(jTextFieldIDTouristAttraction.getText(),jTextFieldAttractionName.getText());
           hotel.addAtraction(touristAttraction);
           
       }
       jTextFieldIDTouristAttraction.setText("");
       jTextFieldAttractionName.setText("");
           
    }//GEN-LAST:event_jButtonSaveTouristAttractionActionPerformed

    private void jButtonSaveServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveServiceActionPerformed
        Hotel hotelSearch = HNHotelsCom.searchHotel(jComboBoxComboSelectHotel.getSelectedItem().toString());
        if(jTextFieldServiceCode.getText().equals("") || jTextFieldServiceName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Some date are required !");
        }
        else{
            Service service = new Service(jTextFieldServiceCode.getText(),jTextFieldServiceName.getText());
            hotelSearch.addHotelServive(service);
            
        }
        jTextFieldServiceCode.setText("");
        jTextFieldServiceName.setText("");
        
    }//GEN-LAST:event_jButtonSaveServiceActionPerformed

    private void jButtonSaveSeasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSeasonActionPerformed
        Hotel hotel = HNHotelsCom.searchHotel(jComboBoxComboSelectHotel.getSelectedItem().toString());
        if(jTextFieldSeasonCode.getText().equals("")|| jTextFieldSeasonName.getText().equals("")||
        (int)jSpinnerDayStartSeason.getValue()==0||(int)jSpinnerMonthStartSeason.getValue()==0 || 
        (int)jSpinnerDayEndSeason.getValue()==0||(int)jSpinnerEndMonthSeason.getValue()==0){
           JOptionPane.showMessageDialog(this,"Some data are required!");
        }
        else{
             Season newSeason = new Season(jTextFieldSeasonCode.getText(),jTextFieldSeasonName.getText(),
            HNHotelsCom.createDate((int)jSpinnerDayStartSeason.getValue(),(int)jSpinnerMonthStartSeason.getValue()),
            HNHotelsCom.createDate((int)jSpinnerDayEndSeason.getValue(),(int)jSpinnerEndMonthSeason.getValue()));
            hotel.registerSeason(newSeason);
        }
       
    }//GEN-LAST:event_jButtonSaveSeasonActionPerformed

    private void chargeJlistKindOfRoom(Hotel hotel){
        DefaultListModel model = new DefaultListModel();
        for(KindOfRoom temporalKindOfRoom : hotel.getKindOfRoomList()){
                model.addElement(temporalKindOfRoom.getFloor());  
            }
            jListTypeOfRooms.setModel(model);
    }
    
    private void jComboBoxHotelListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHotelListActionPerformed
        if(jComboBoxHotelList.getSelectedItem() != null){
            Hotel hotel = HNHotelsCom.searchHotel(jComboBoxHotelList.getSelectedItem().toString());
            chargeJlistKindOfRoom(hotel);
        }
    }//GEN-LAST:event_jComboBoxHotelListActionPerformed

    private void jButtonSavePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavePriceActionPerformed
       
    }//GEN-LAST:event_jButtonSavePriceActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.setVisible(false);
        this.ancestor.setVisible(true);
        
    }//GEN-LAST:event_jButtonExitActionPerformed
    private void chargeComboTypesRoom(Season season){
        jComboBoxTypeOfRoomSeason.removeAllItems();
        for(KindOfRoom kindRoom : season.getSeasonRoomList()){
            jComboBoxTypeOfRoomSeason.addItem(kindRoom.getFloor());
        }
    }
    
    private void jComboBoxSeasonForRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSeasonForRoomActionPerformed
        Hotel hotel = HNHotelsCom.searchHotel(jComboBoxHotelsForImages.getSelectedItem().toString());
        Season season = HNHotelsCom.searchSeason(hotel,jComboBoxSeasonForRoom.getSelectedItem().toString());
        chargeComboTypesRoom(season);
        chargePricesForSeason(season);
    }//GEN-LAST:event_jComboBoxSeasonForRoomActionPerformed

    private void jComboBoxHotelsForImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHotelsForImagesActionPerformed
        Hotel hotel = HNHotelsCom.searchHotel(jComboBoxHotelsForImages.getSelectedItem().toString());
        chargeComboSeason(hotel);
    }//GEN-LAST:event_jComboBoxHotelsForImagesActionPerformed

    private void jComboBoxTypeOfRoomSeasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeOfRoomSeasonActionPerformed
      
    }//GEN-LAST:event_jComboBoxTypeOfRoomSeasonActionPerformed

    private void jButtonRoomPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRoomPriceActionPerformed
        Hotel hotel = HNHotelsCom.searchHotel(jComboBoxHotelsForImages.getSelectedItem().toString());
        KindOfRoom roomSearched = HNHotelsCom.searchKindOfRoom(hotel,jComboBoxTypeOfRoomSeason.getSelectedItem().toString());
        Season season = HNHotelsCom.searchSeason(hotel,jComboBoxSeasonForRoom.getSelectedItem().toString());
        Price selectPrice = HNHotelsCom.searchPrice(season,jComboBoxPriceRoomForSeason.getSelectedItem().toString());
        if(hotel == null ||roomSearched ==null || season ==null || selectPrice ==null){
            JOptionPane.showMessageDialog(this,"Some erroneous data!");
        }
        else{
            for(Season temporalSeason : hotel.getSeasons()){
            if(season.getCode().equals(temporalSeason.getCode())){
                for(KindOfRoom room : season.getSeasonRoomList())
                    if(room.getBedType().equals(roomSearched.getBedType())){
                        room.setPrice(selectPrice);
                    }
            }
        }
        }
    }//GEN-LAST:event_jButtonRoomPriceActionPerformed

    
    private void jComboBoxPriceRoomForSeasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPriceRoomForSeasonActionPerformed
       
    }//GEN-LAST:event_jComboBoxPriceRoomForSeasonActionPerformed

    private void jButtonAddImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddImagesActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("File tipe multimedia",
        "jpg","jpeg","gif"); //Filter.
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);  //Add the filter for the JFileChooser
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int state = chooser.showOpenDialog(null);
        if(state == JFileChooser.APPROVE_OPTION){
            if(chooser.getSelectedFile().canExecute()){
                try {
                    ImageIcon newImage = new ImageIcon(ImageIO.read(chooser.getSelectedFile()));
                    Hotel hotel =HNHotelsCom.searchHotel(jComboBoxHotelsForImages.getSelectedItem().toString());
                    hotel.addImage(newImage);
                } catch (IOException ex) {
                    Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else
                JOptionPane.showMessageDialog(this,"Error, you must select a valid file.");
        }
        
    }//GEN-LAST:event_jButtonAddImagesActionPerformed

    private void jButtonReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportsActionPerformed
       ReportsWindow reports = new ReportsWindow(this);
       this.setEnabled(false);
       reports.setVisible(true);
    }//GEN-LAST:event_jButtonReportsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.ancestor.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    private void chargePricesForSeason(Season season){
        jComboBoxPriceRoomForSeason.removeAllItems();
        for(Price price : season.getSeasonPriceList()){
            jComboBoxPriceRoomForSeason.addItem(price.getPriceCode());
        }
    }
    public void chargeComboYear(){
        int anno = 2015;
        while(anno >= 1900){
              jComboBoxYearOfBuilt.addItem(anno);
             anno--;
        }
    }
    
    public void chargeComboWithHotels(JComboBox combo){
        combo.removeAllItems();
        for(Hotel temporalHotel : Global.getInstance().getHotelsList()){
            combo.addItem(temporalHotel.getName());
        }
    }

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
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup allIncluded;
    private javax.swing.JButton jButtonAddImages;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReports;
    private javax.swing.JButton jButtonRoomPrice;
    private javax.swing.JButton jButtonSaveCategory;
    private javax.swing.JButton jButtonSaveHotel;
    private javax.swing.JButton jButtonSavePrice;
    private javax.swing.JButton jButtonSaveRoom;
    private javax.swing.JButton jButtonSaveSeason;
    private javax.swing.JButton jButtonSaveService;
    private javax.swing.JButton jButtonSaveTouristAttraction;
    private javax.swing.JButton jButtonSaveTypeRoom;
    private javax.swing.JComboBox jComboBoxComboSelectHotel;
    private javax.swing.JComboBox jComboBoxHotelCategory;
    private javax.swing.JComboBox jComboBoxHotelList;
    private javax.swing.JComboBox jComboBoxHotelsForImages;
    private javax.swing.JComboBox jComboBoxPriceRoomForSeason;
    private javax.swing.JComboBox jComboBoxSeasonForRoom;
    private javax.swing.JComboBox jComboBoxTypeOfRoomSeason;
    private javax.swing.JComboBox jComboBoxYearOfBuilt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListTypeOfRooms;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonAllInclude;
    private javax.swing.JRadioButton jRadioButtonAllIncludedNo;
    private javax.swing.JRadioButton jRadioButtonAllIncludedYes;
    private javax.swing.JRadioButton jRadioButtonNoLoungeTerrace;
    private javax.swing.JRadioButton jRadioButtonNoSeaview;
    private javax.swing.JRadioButton jRadioButtonSeaViewAux;
    private javax.swing.JRadioButton jRadioButtonSmoke;
    private javax.swing.JRadioButton jRadioButtonSmokeNo;
    private javax.swing.JRadioButton jRadioButtonSmokeYes;
    private javax.swing.JRadioButton jRadioButtonTerraceAux;
    private javax.swing.JRadioButton jRadioButtonYesLoungeTerrace;
    private javax.swing.JRadioButton jRadioButtonYesSeaview;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinnerCategoryTax;
    private javax.swing.JSpinner jSpinnerCheckOutHour;
    private javax.swing.JSpinner jSpinnerCheckinHour;
    private javax.swing.JSpinner jSpinnerDayEndSeason;
    private javax.swing.JSpinner jSpinnerDayStartSeason;
    private javax.swing.JSpinner jSpinnerEndMonthSeason;
    private javax.swing.JSpinner jSpinnerFloor;
    private javax.swing.JSpinner jSpinnerHotelSize;
    private javax.swing.JSpinner jSpinnerIDRoom;
    private javax.swing.JSpinner jSpinnerMaxGuest;
    private javax.swing.JSpinner jSpinnerMonthStartSeason;
    private javax.swing.JSpinner jSpinnerRoomSize;
    private javax.swing.JSpinner jSpinnerStarsNumber;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextFielHoteldAddress;
    private javax.swing.JTextField jTextFieldAmountPrice;
    private javax.swing.JTextField jTextFieldAttractionName;
    private javax.swing.JTextField jTextFieldBedType;
    private javax.swing.JTextField jTextFieldCategoryCode;
    private javax.swing.JTextField jTextFieldCurrencyPrice;
    private javax.swing.JTextField jTextFieldHotelCountry;
    private javax.swing.JTextField jTextFieldHotelName;
    private javax.swing.JTextField jTextFieldHotelPhoneNumber;
    private javax.swing.JTextField jTextFieldHotelRequirements;
    private javax.swing.JTextField jTextFieldIDTouristAttraction;
    private javax.swing.JTextField jTextFieldPriceCode;
    private javax.swing.JTextField jTextFieldSeasonCode;
    private javax.swing.JTextField jTextFieldSeasonName;
    private javax.swing.JTextField jTextFieldServiceCode;
    private javax.swing.JTextField jTextFieldServiceName;
    private javax.swing.JTextField jTextFieldTypeOFLodgin;
    private javax.swing.JTextPane jTextPaneCategoryDescription;
    private javax.swing.JTextPane jTextPaneDescriptionRoom;
    private javax.swing.ButtonGroup seaview;
    private javax.swing.ButtonGroup somokePermission;
    private javax.swing.ButtonGroup terraceLounge;
    // End of variables declaration//GEN-END:variables
}
