package com.cothify.app.view;


import java.awt.Font;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

// random color "new Color((int) (Math.random() * 0x1000000))"
public class CothifyView extends javax.swing.JFrame {

    private JPanel gridPanel;
    private JScrollPane scrollPane;
    private JButton addButton;
    private int panelCount = 0;

    public CothifyView() {
        setUndecorated(true);
        initComponents();
        //setOpacity(0.9f);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        changeFonts();

        /*  for (int i = 0; i < 3; i++) {
            JPanel p1 = new JPanel();
            p1.setPreferredSize(new Dimension(250, 250));
            p1.setBackground(new Color((int) (Math.random() * 0x1000000)));
            catalogo.add(p1);
            
        }*/
    }

    //Fuentes de google
    void changeFonts() {
        try {
            //Fuentes
            File file_inter_font = new File("src/main/resources/fonts/inter-extralight.ttf");
            File libre_caslon_display_font = new File("src/main/resources/fonts/librecaslondisplay-regular.ttf");

            //Etiquetas
            lblLogin.setFont(Font.createFont(Font.TRUETYPE_FONT, file_inter_font).deriveFont(24f));
            lblCothify.setFont(Font.createFont(Font.TRUETYPE_FONT, libre_caslon_display_font).deriveFont(40f));
            lblCothify1.setFont(Font.createFont(Font.TRUETYPE_FONT, libre_caslon_display_font).deriveFont(40f));
            lblCothify2.setFont(Font.createFont(Font.TRUETYPE_FONT, libre_caslon_display_font).deriveFont(40f));
            btnCatalogue.setFont(Font.createFont(Font.TRUETYPE_FONT, file_inter_font).deriveFont(24f));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        pnlMain = new javax.swing.JPanel();
        pnlBar = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblCothify = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JLabel();
        btnEN = new javax.swing.JLabel();
        btnLogin2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        pnlRegister = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        lblRegisterOn = new javax.swing.JLabel();
        lblCothify1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtUsername1 = new javax.swing.JTextField();
        txtUsername2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnlOptions = new javax.swing.JPanel();
        mainOpcionsBar = new javax.swing.JPanel();
        lblCothify2 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCatalogue = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnSupport = new javax.swing.JButton();
        btnFavorite = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pnlProfile = new javax.swing.JPanel();
        cateroryPanel1 = new javax.swing.JPanel();
        lblCothify4 = new javax.swing.JLabel();
        btnCatalogue2 = new javax.swing.JButton();
        btnCatalogue3 = new javax.swing.JButton();
        btnCatalogue4 = new javax.swing.JButton();
        btnCatalogue5 = new javax.swing.JButton();
        btnCatalogue6 = new javax.swing.JButton();
        productsPanel1 = new javax.swing.JPanel();
        btnDeleteImageFile = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        txtChangePassword = new javax.swing.JTextField();
        txtChangeUsername = new javax.swing.JTextField();
        btnImageFile = new javax.swing.JButton();
        txtConfirmPassword = new javax.swing.JTextField();
        txtSetName = new javax.swing.JTextField();
        txtSetLastname = new javax.swing.JTextField();
        txtSetDayBirth = new javax.swing.JTextField();
        pnlCatalogue = new javax.swing.JPanel();
        cateroryPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list3 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        secondaryOpcionsBar = new javax.swing.JPanel();
        btnWomen = new javax.swing.JButton();
        btnMen = new javax.swing.JButton();
        btnElegant = new javax.swing.JButton();
        btnCasual = new javax.swing.JButton();
        btnSport = new javax.swing.JButton();
        btnBrands = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        catalogo4 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setAlignmentY(20.0F);
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBar.setBackground(new java.awt.Color(17, 33, 34));
        pnlBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(17, 33, 34));
        btnExit.setFont(new java.awt.Font("Quicksand Light", 0, 30)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("x");
        btnExit.setOpaque(true);
        btnExit.setPreferredSize(new java.awt.Dimension(30, 30));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        pnlBar.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 60, 40));

        pnlMain.add(pnlBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setPreferredSize(new java.awt.Dimension(1280, 680));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dalle_person/dalle_person_login.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        pnlLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 768, 680));

        lblLogin.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(17, 34, 34));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Login");
        pnlLogin.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 70, 60));

        lblCothify.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblCothify.setForeground(new java.awt.Color(17, 34, 34));
        lblCothify.setText("Cothify");
        pnlLogin.add(lblCothify, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(91, 91, 91));
        txtUser.setText("Enter username");
        pnlLogin.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 84, 84));
        jLabel2.setText("Do you need QR for login?");
        pnlLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 620, 170, 30));

        jLabel4.setBackground(new java.awt.Color(17, 84, 84));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/qr_icon.png"))); // NOI18N
        jLabel4.setOpaque(true);
        pnlLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 600, 60, 60));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(91, 91, 91));
        txtPassword.setText("Enter password");
        txtPassword.setEchoChar('\u0000');
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        pnlLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 300, 40));

        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(17, 34, 34));
        btnRegister.setText("You do not have an account?");
        pnlLogin.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, -1, -1));

        btnEN.setBackground(new java.awt.Color(17, 34, 34));
        btnEN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEN.setForeground(new java.awt.Color(255, 255, 255));
        btnEN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEN.setText("ES");
        btnEN.setOpaque(true);
        pnlLogin.add(btnEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 40, 35, 35));

        btnLogin2.setBackground(new java.awt.Color(17, 34, 34));
        btnLogin2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin2.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin2.setText("EN");
        btnLogin2.setOpaque(true);
        pnlLogin.add(btnLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 40, 35, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 34, 34));
        jLabel5.setText("Language/Idioma");
        pnlLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        btnLogin.setBackground(new java.awt.Color(17, 34, 34));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 60, 60));

        pnlMain.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1280, 680));

        pnlRegister.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegister.setPreferredSize(new java.awt.Dimension(1280, 540));
        pnlRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(91, 91, 91));
        txtEmail.setText("Enter username");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        pnlRegister.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 300, 40));

        lblRegisterOn.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        lblRegisterOn.setForeground(new java.awt.Color(17, 34, 34));
        lblRegisterOn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegisterOn.setText("Register on");
        pnlRegister.add(lblRegisterOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 130, 60));

        lblCothify1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblCothify1.setForeground(new java.awt.Color(17, 34, 34));
        lblCothify1.setText("Cothify");
        pnlRegister.add(lblCothify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, 60));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(91, 91, 91));
        txtUsername.setText("Enter username");
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        pnlRegister.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 300, 40));

        txtUsername1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername1.setForeground(new java.awt.Color(91, 91, 91));
        txtUsername1.setText("Enter username");
        txtUsername1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsername1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsername1FocusLost(evt);
            }
        });
        txtUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername1ActionPerformed(evt);
            }
        });
        pnlRegister.add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 300, 40));

        txtUsername2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername2.setForeground(new java.awt.Color(91, 91, 91));
        txtUsername2.setText("Enter username");
        txtUsername2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsername2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsername2FocusLost(evt);
            }
        });
        txtUsername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername2ActionPerformed(evt);
            }
        });
        pnlRegister.add(txtUsername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 300, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/register_and_login.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlRegister.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 140, 50));

        pnlMain.add(pnlRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1280, 40, 1280, 680));

        pnlOptions.setBackground(new java.awt.Color(255, 255, 255));
        pnlOptions.setPreferredSize(new java.awt.Dimension(1280, 660));
        pnlOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainOpcionsBar.setBackground(new java.awt.Color(255, 255, 255));
        mainOpcionsBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCothify2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblCothify2.setForeground(new java.awt.Color(17, 34, 34));
        lblCothify2.setText("Cothify");
        mainOpcionsBar.add(lblCothify2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        searchBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchBar.setForeground(new java.awt.Color(17, 84, 84));
        searchBar.setText("Are you looking for a product?");
        searchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchBarFocusLost(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        mainOpcionsBar.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 300, 40));

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(217, 217, 217)));
        mainOpcionsBar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, 1200, 1));

        btnCatalogue.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnCatalogue.setForeground(new java.awt.Color(17, 164, 164));
        btnCatalogue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/MdiShoppingSearchOutline.png"))); // NOI18N
        btnCatalogue.setText("Catalogue");
        btnCatalogue.setBorder(null);
        btnCatalogue.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mainOpcionsBar.add(btnCatalogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 160, 40));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/MaterialSymbolsSearch.png"))); // NOI18N
        mainOpcionsBar.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 40, 40));

        btnProfile.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(17, 84, 84));
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/HealthiconsUiUserProfileOutline.png"))); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.setBorder(null);
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mainOpcionsBar.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 130, 40));

        btnSupport.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnSupport.setForeground(new java.awt.Color(17, 84, 84));
        btnSupport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/BxSupport (1).png"))); // NOI18N
        btnSupport.setText("Support");
        btnSupport.setBorder(null);
        btnSupport.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupportActionPerformed(evt);
            }
        });
        mainOpcionsBar.add(btnSupport, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 140, 40));

        btnFavorite.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnFavorite.setForeground(new java.awt.Color(17, 84, 84));
        btnFavorite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/MaterialSymbolsLightBookmarksOutline.png"))); // NOI18N
        btnFavorite.setText("Favorite");
        btnFavorite.setBorder(null);
        btnFavorite.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnFavorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoriteActionPerformed(evt);
            }
        });
        mainOpcionsBar.add(btnFavorite, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 140, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 84, 84));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/shopping_icon1.png"))); // NOI18N
        jLabel8.setText("S/ 0.0");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mainOpcionsBar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 110, 40));

        pnlOptions.add(mainOpcionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        pnlProfile.setBackground(new java.awt.Color(255, 255, 255));
        pnlProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cateroryPanel1.setBackground(new java.awt.Color(255, 255, 255));
        cateroryPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(217, 217, 217)));
        cateroryPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCothify4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblCothify4.setForeground(new java.awt.Color(17, 34, 34));
        lblCothify4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/HealthiconsUiUserProfileOutline (1).png"))); // NOI18N
        cateroryPanel1.add(lblCothify4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 80));

        btnCatalogue2.setBackground(new java.awt.Color(239, 239, 239));
        btnCatalogue2.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnCatalogue2.setForeground(new java.awt.Color(17, 164, 164));
        btnCatalogue2.setText("<html>Personal <br><center>data</center></html>");
        btnCatalogue2.setBorder(null);
        btnCatalogue2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatalogue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogue2ActionPerformed(evt);
            }
        });
        cateroryPanel1.add(btnCatalogue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 90));

        btnCatalogue3.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnCatalogue3.setForeground(new java.awt.Color(17, 164, 164));
        btnCatalogue3.setText("<html>Payment <br><center>methods</center></html>");
        btnCatalogue3.setBorder(null);
        btnCatalogue3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatalogue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogue3ActionPerformed(evt);
            }
        });
        cateroryPanel1.add(btnCatalogue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 90));

        btnCatalogue4.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnCatalogue4.setForeground(new java.awt.Color(17, 164, 164));
        btnCatalogue4.setText("<html>Shopping<br><center>history</center></html>");
        btnCatalogue4.setBorder(null);
        btnCatalogue4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatalogue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogue4ActionPerformed(evt);
            }
        });
        cateroryPanel1.add(btnCatalogue4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 90));

        btnCatalogue5.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnCatalogue5.setForeground(new java.awt.Color(17, 164, 164));
        btnCatalogue5.setText("<html>Invetary <br><center>control</center></html>");
        btnCatalogue5.setBorder(null);
        btnCatalogue5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatalogue5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogue5ActionPerformed(evt);
            }
        });
        cateroryPanel1.add(btnCatalogue5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 260, 90));

        btnCatalogue6.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnCatalogue6.setForeground(new java.awt.Color(17, 164, 164));
        btnCatalogue6.setText("<html>Analitycs</html>");
        btnCatalogue6.setBorder(null);
        btnCatalogue6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatalogue6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogue6ActionPerformed(evt);
            }
        });
        cateroryPanel1.add(btnCatalogue6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 260, 90));

        pnlProfile.add(cateroryPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 620));

        productsPanel1.setBackground(new java.awt.Color(255, 255, 255));
        productsPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDeleteImageFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Group 35.png"))); // NOI18N
        btnDeleteImageFile.setBorder(null);
        productsPanel1.add(btnDeleteImageFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 100, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/MaterialSymbolsLightAccountCircleOutline 1 (1).png"))); // NOI18N
        jButton3.setBorder(null);
        productsPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 150, 150));

        btnSaveChanges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Group 41 (1).png"))); // NOI18N
        btnSaveChanges.setBorder(null);
        productsPanel1.add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 100, -1));

        txtChangePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtChangePassword.setForeground(new java.awt.Color(91, 91, 91));
        txtChangePassword.setText("Change password");
        txtChangePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtChangePasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtChangePasswordFocusLost(evt);
            }
        });
        txtChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangePasswordActionPerformed(evt);
            }
        });
        productsPanel1.add(txtChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 300, 40));

        txtChangeUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtChangeUsername.setForeground(new java.awt.Color(91, 91, 91));
        txtChangeUsername.setText("Change username");
        txtChangeUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtChangeUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtChangeUsernameFocusLost(evt);
            }
        });
        txtChangeUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeUsernameActionPerformed(evt);
            }
        });
        productsPanel1.add(txtChangeUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 300, 40));

        btnImageFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Group 33.png"))); // NOI18N
        btnImageFile.setBorder(null);
        productsPanel1.add(btnImageFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 100, -1));

        txtConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(91, 91, 91));
        txtConfirmPassword.setText("Confirm password");
        txtConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmPasswordFocusLost(evt);
            }
        });
        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });
        productsPanel1.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 300, 40));

        txtSetName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSetName.setForeground(new java.awt.Color(91, 91, 91));
        txtSetName.setText("Set Name");
        txtSetName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSetNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSetNameFocusLost(evt);
            }
        });
        txtSetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetNameActionPerformed(evt);
            }
        });
        productsPanel1.add(txtSetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 300, 40));

        txtSetLastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSetLastname.setForeground(new java.awt.Color(91, 91, 91));
        txtSetLastname.setText("Set Lastname");
        txtSetLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSetLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSetLastnameFocusLost(evt);
            }
        });
        txtSetLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetLastnameActionPerformed(evt);
            }
        });
        productsPanel1.add(txtSetLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 300, 40));

        txtSetDayBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSetDayBirth.setForeground(new java.awt.Color(91, 91, 91));
        txtSetDayBirth.setText("Set day of birth");
        txtSetDayBirth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSetDayBirthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSetDayBirthFocusLost(evt);
            }
        });
        txtSetDayBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetDayBirthActionPerformed(evt);
            }
        });
        productsPanel1.add(txtSetDayBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 300, 40));

        pnlProfile.add(productsPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1010, 620));

        pnlOptions.add(pnlProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1280, 60, 1280, 620));

        pnlCatalogue.setBackground(new java.awt.Color(255, 255, 255));
        pnlCatalogue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cateroryPanel.setBackground(new java.awt.Color(153, 153, 153));
        cateroryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(list3);

        cateroryPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, -1));

        jScrollPane2.setViewportView(list1);

        cateroryPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, -1));

        jScrollPane3.setViewportView(list2);

        cateroryPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, -1));

        pnlCatalogue.add(cateroryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 590));

        secondaryOpcionsBar.setBackground(new java.awt.Color(255, 255, 255));
        secondaryOpcionsBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnWomen.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnWomen.setForeground(new java.awt.Color(17, 34, 34));
        btnWomen.setText("Women");
        btnWomen.setBorder(null);
        btnWomen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnWomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWomenActionPerformed(evt);
            }
        });
        secondaryOpcionsBar.add(btnWomen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 100, 40));

        btnMen.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnMen.setForeground(new java.awt.Color(17, 34, 34));
        btnMen.setText("Men");
        btnMen.setBorder(null);
        btnMen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenActionPerformed(evt);
            }
        });
        secondaryOpcionsBar.add(btnMen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 100, 40));

        btnElegant.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnElegant.setForeground(new java.awt.Color(17, 34, 34));
        btnElegant.setText("Elegant");
        btnElegant.setBorder(null);
        btnElegant.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnElegant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegantActionPerformed(evt);
            }
        });
        secondaryOpcionsBar.add(btnElegant, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 100, 40));

        btnCasual.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnCasual.setForeground(new java.awt.Color(17, 34, 34));
        btnCasual.setText("Casual");
        btnCasual.setBorder(null);
        btnCasual.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCasual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasualActionPerformed(evt);
            }
        });
        secondaryOpcionsBar.add(btnCasual, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 100, 40));

        btnSport.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnSport.setForeground(new java.awt.Color(17, 164, 164));
        btnSport.setText("Sport");
        btnSport.setBorder(null);
        btnSport.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSportActionPerformed(evt);
            }
        });
        secondaryOpcionsBar.add(btnSport, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 100, 40));

        btnBrands.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        btnBrands.setForeground(new java.awt.Color(17, 34, 34));
        btnBrands.setText("Brands");
        btnBrands.setBorder(null);
        btnBrands.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandsActionPerformed(evt);
            }
        });
        secondaryOpcionsBar.add(btnBrands, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 100, 40));

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(217, 217, 217)));
        secondaryOpcionsBar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 42, 1200, 1));

        pnlCatalogue.add(secondaryOpcionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setPreferredSize(new java.awt.Dimension(1000, 500));

        catalogo4.setPreferredSize(new java.awt.Dimension(1000, 1000));
        catalogo4.setLayout(new java.awt.GridLayout(0, 5, 10, 10));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel20.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Group 14 (1).png"))); // NOI18N
        jPanel20.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel21.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/Group 24 (1).png"))); // NOI18N
        jPanel21.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel22.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (1).png"))); // NOI18N
        jPanel22.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel23.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (2).png"))); // NOI18N
        jPanel23.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel24.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (6).png"))); // NOI18N
        jPanel24.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel25.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (3).png"))); // NOI18N
        jPanel25.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel26.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (4).png"))); // NOI18N
        jPanel26.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel27.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (5).png"))); // NOI18N
        jPanel27.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel28.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg.png"))); // NOI18N
        jPanel28.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel29.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (7).png"))); // NOI18N
        jPanel29.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel29);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel30.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (8).png"))); // NOI18N
        jPanel30.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel30);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel31.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (9).png"))); // NOI18N
        jPanel31.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel32.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (10).png"))); // NOI18N
        jPanel32.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel32);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel33.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg (11).png"))); // NOI18N
        jPanel33.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel33);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel34.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg.png"))); // NOI18N
        jPanel34.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel34);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel35.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pngegg.png"))); // NOI18N
        jPanel35.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 240));

        catalogo4.add(jPanel35);

        jScrollPane5.setViewportView(catalogo4);

        pnlCatalogue.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        pnlOptions.add(pnlCatalogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 620));

        pnlMain.add(pnlOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1280, 40, 1280, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained

    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost

    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsername1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsername1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername1FocusGained

    private void txtUsername1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsername1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername1FocusLost

    private void txtUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername1ActionPerformed

    private void txtUsername2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsername2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername2FocusGained

    private void txtUsername2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsername2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername2FocusLost

    private void txtUsername2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void searchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarFocusLost

    private void searchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarFocusGained

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void btnSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupportActionPerformed

    private void btnFavoriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoriteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavoriteActionPerformed

    private void btnWomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWomenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWomenActionPerformed

    private void btnMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenActionPerformed

    private void btnElegantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElegantActionPerformed

    private void btnCasualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasualActionPerformed

    private void btnSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSportActionPerformed

    private void btnBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBrandsActionPerformed

    private void btnCatalogue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogue2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCatalogue2ActionPerformed

    private void btnCatalogue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogue3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCatalogue3ActionPerformed

    private void btnCatalogue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogue4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCatalogue4ActionPerformed

    private void btnCatalogue5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogue5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCatalogue5ActionPerformed

    private void btnCatalogue6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogue6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCatalogue6ActionPerformed

    private void txtChangePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtChangePasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangePasswordFocusGained

    private void txtChangePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtChangePasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangePasswordFocusLost

    private void txtChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangePasswordActionPerformed

    private void txtChangeUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtChangeUsernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeUsernameFocusGained

    private void txtChangeUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtChangeUsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeUsernameFocusLost

    private void txtChangeUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeUsernameActionPerformed

    private void txtConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordFocusGained

    private void txtConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordFocusLost

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void txtSetNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSetNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetNameFocusGained

    private void txtSetNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSetNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetNameFocusLost

    private void txtSetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetNameActionPerformed

    private void txtSetLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSetLastnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetLastnameFocusGained

    private void txtSetLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSetLastnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetLastnameFocusLost

    private void txtSetLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetLastnameActionPerformed

    private void txtSetDayBirthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSetDayBirthFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetDayBirthFocusGained

    private void txtSetDayBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSetDayBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetDayBirthFocusLost

    private void txtSetDayBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetDayBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetDayBirthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBrands;
    public javax.swing.JButton btnCasual;
    public javax.swing.JButton btnCatalogue;
    public javax.swing.JButton btnCatalogue2;
    public javax.swing.JButton btnCatalogue3;
    public javax.swing.JButton btnCatalogue4;
    public javax.swing.JButton btnCatalogue5;
    public javax.swing.JButton btnCatalogue6;
    private javax.swing.JButton btnDeleteImageFile;
    public javax.swing.JLabel btnEN;
    public javax.swing.JButton btnElegant;
    public javax.swing.JLabel btnExit;
    public javax.swing.JButton btnFavorite;
    private javax.swing.JButton btnImageFile;
    public javax.swing.JButton btnLogin;
    public javax.swing.JLabel btnLogin2;
    public javax.swing.JButton btnMen;
    public javax.swing.JButton btnProfile;
    public javax.swing.JLabel btnRegister;
    public javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnSearch;
    public javax.swing.JButton btnSport;
    public javax.swing.JButton btnSupport;
    public javax.swing.JButton btnWomen;
    private javax.swing.JPanel catalogo4;
    private javax.swing.JPanel cateroryPanel;
    public javax.swing.JPanel cateroryPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCothify;
    public javax.swing.JLabel lblCothify1;
    private javax.swing.JLabel lblCothify2;
    private javax.swing.JLabel lblCothify4;
    private javax.swing.JLabel lblLogin;
    public static javax.swing.JLabel lblRegisterOn;
    private javax.swing.JList<String> list1;
    private javax.swing.JList<String> list2;
    private javax.swing.JList<String> list3;
    private javax.swing.JPanel mainOpcionsBar;
    private javax.swing.JPanel pnlBar;
    public javax.swing.JPanel pnlCatalogue;
    public javax.swing.JPanel pnlLogin;
    public javax.swing.JPanel pnlMain;
    public javax.swing.JPanel pnlOptions;
    public javax.swing.JPanel pnlProfile;
    public javax.swing.JPanel pnlRegister;
    public transient javax.swing.JPanel productsPanel1;
    public javax.swing.JTextField searchBar;
    private javax.swing.JPanel secondaryOpcionsBar;
    public javax.swing.JTextField txtChangePassword;
    public javax.swing.JTextField txtChangeUsername;
    public javax.swing.JTextField txtConfirmPassword;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtSetDayBirth;
    public javax.swing.JTextField txtSetLastname;
    public javax.swing.JTextField txtSetName;
    public javax.swing.JTextField txtUser;
    public javax.swing.JTextField txtUsername;
    public javax.swing.JTextField txtUsername1;
    public javax.swing.JTextField txtUsername2;
    // End of variables declaration//GEN-END:variables
}
