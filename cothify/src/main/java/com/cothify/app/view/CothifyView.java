package com.cothify.app.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.geom.RoundRectangle2D;
import java.io.File;

public class CothifyView extends javax.swing.JFrame {

    public CothifyView() {
        setUndecorated(true);
        initComponents();
        //setOpacity(0.9f);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        changeFonts();
    }

    //Fuentes de google
    void changeFonts() {
        try {
            File file_inter_font = new File("src/main/resources/fonts/inter-extralight.ttf");
            File libre_caslon_display_font = new File("src/main/resources/fonts/librecaslondisplay-regular.ttf");
            lblLogin.setFont(Font.createFont(Font.TRUETYPE_FONT, file_inter_font).deriveFont(24f));
            lblCothify.setFont(Font.createFont(Font.TRUETYPE_FONT, libre_caslon_display_font).deriveFont(40f));
            lblCothify1.setFont(Font.createFont(Font.TRUETYPE_FONT, libre_caslon_display_font).deriveFont(40f));
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

        btnExit.setFont(new java.awt.Font("Quicksand Light", 0, 30)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("x");
        btnExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnExit.setPreferredSize(new java.awt.Dimension(30, 30));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        pnlBar.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1231, 5, -1, -1));

        pnlMain.add(pnlBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
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
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
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

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Enter username")) {
            txtUser.setText("");
            txtUser.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().equals("")) {
            txtUser.setText("Enter username");
            txtUser.setForeground(new Color(91, 91, 91));
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (new String((char[]) txtPassword.getPassword()).equals("Enter password")) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.BLACK);
            txtPassword.setEchoChar('*');

        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (new String((char[]) txtPassword.getPassword()).equals("")) {
            txtPassword.setText("Enter password");
            txtPassword.setForeground(new Color(91, 91, 91));
            txtPassword.setEchoChar('\u0000');
        }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnEN;
    private javax.swing.JLabel btnExit;
    public javax.swing.JButton btnLogin;
    public javax.swing.JLabel btnLogin2;
    public javax.swing.JLabel btnRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCothify;
    public javax.swing.JLabel lblCothify1;
    private javax.swing.JLabel lblLogin;
    public static javax.swing.JLabel lblRegisterOn;
    private javax.swing.JPanel pnlBar;
    public javax.swing.JPanel pnlLogin;
    public javax.swing.JPanel pnlMain;
    public javax.swing.JPanel pnlRegister;
    public javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUser;
    public javax.swing.JTextField txtUsername;
    public javax.swing.JTextField txtUsername1;
    public javax.swing.JTextField txtUsername2;
    // End of variables declaration//GEN-END:variables
}
