/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alpageush
 */
public class okno extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public okno() {
        initComponents();
        warn_login.setVisible(false);
        warn_mail.setVisible(false);
        warn_pass.setVisible(false);
        warn_pass2.setVisible(false);
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
        tabbedPane = new javax.swing.JTabbedPane();
        rejestracja = new javax.swing.JPanel();
        rejestracja_label = new javax.swing.JLabel();
        login_label = new javax.swing.JLabel();
        login_textfield = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        email_textfield = new javax.swing.JTextField();
        pass_label = new javax.swing.JLabel();
        pass_textfield = new javax.swing.JPasswordField();
        repass_label = new javax.swing.JLabel();
        repass_textfield = new javax.swing.JPasswordField();
        warn_login = new javax.swing.JLabel();
        warn_mail = new javax.swing.JLabel();
        warn_pass = new javax.swing.JLabel();
        warn_pass2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        logowanie = new javax.swing.JPanel();
        rejestracja_label1 = new javax.swing.JLabel();
        email_label1 = new javax.swing.JLabel();
        email_textfield1 = new javax.swing.JTextField();
        pass_label1 = new javax.swing.JLabel();
        pass_textfield1 = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(498, 363));
        setMinimumSize(new java.awt.Dimension(498, 363));
        setResizable(false);

        rejestracja_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        rejestracja_label.setText("Rejestracja");

        login_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        login_label.setText("Login");

        login_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_textfieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                login_textfieldKeyReleased(evt);
            }
        });

        email_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email_label.setText("E-mail");

        pass_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pass_label.setText("Hasło");

        repass_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        repass_label.setText("Powtórz hasło");

        warn_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        warn_login.setForeground(new java.awt.Color(255, 51, 51));
        warn_login.setText("! Długość loginu powinna być między 2 a 20");

        warn_mail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        warn_mail.setForeground(new java.awt.Color(255, 51, 51));
        warn_mail.setText("! Nieprawidłowy format e-maila");

        warn_pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        warn_pass.setForeground(new java.awt.Color(255, 51, 51));
        warn_pass.setText("! Długość hasła powinna być między 2 a 20");

        warn_pass2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        warn_pass2.setForeground(new java.awt.Color(255, 51, 51));
        warn_pass2.setText("! Hasła nie są takie same");

        jButton1.setText("Zarejestruj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rejestracjaLayout = new javax.swing.GroupLayout(rejestracja);
        rejestracja.setLayout(rejestracjaLayout);
        rejestracjaLayout.setHorizontalGroup(
            rejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rejestracjaLayout.createSequentialGroup()
                .addGroup(rejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rejestracjaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(rejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(repass_textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rejestracjaLayout.createSequentialGroup()
                                .addComponent(repass_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(warn_pass2))
                            .addComponent(email_textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rejestracjaLayout.createSequentialGroup()
                                .addComponent(email_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(warn_mail))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rejestracjaLayout.createSequentialGroup()
                                .addComponent(login_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(warn_login))
                            .addComponent(login_textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rejestracjaLayout.createSequentialGroup()
                                .addComponent(pass_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(warn_pass))
                            .addComponent(pass_textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rejestracjaLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(rejestracja_label)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rejestracjaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(200, 200, 200))
        );
        rejestracjaLayout.setVerticalGroup(
            rejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rejestracjaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(rejestracja_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label)
                    .addComponent(warn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(warn_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(email_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_label)
                    .addComponent(warn_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rejestracjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repass_label)
                    .addComponent(warn_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repass_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Rejestracja", rejestracja);

        rejestracja_label1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        rejestracja_label1.setText("Logowanie");

        email_label1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email_label1.setText("E-mail");

        pass_label1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pass_label1.setText("Hasło");

        javax.swing.GroupLayout logowanieLayout = new javax.swing.GroupLayout(logowanie);
        logowanie.setLayout(logowanieLayout);
        logowanieLayout.setHorizontalGroup(
            logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logowanieLayout.createSequentialGroup()
                .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logowanieLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(rejestracja_label1))
                    .addGroup(logowanieLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pass_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(email_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(logowanieLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(pass_label1))
                                .addComponent(email_label1)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        logowanieLayout.setVerticalGroup(
            logowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logowanieLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(rejestracja_label1)
                .addGap(53, 53, 53)
                .addComponent(email_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Logowanie", logowanie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void addTooltipsToElements() {
        //login_textfield.setToolTipText("");
    }
    
    boolean loginZawiera(CharSequence a) {
        if(login_textfield.getText().contains(a)) return true;
        else return false;
    }
    
    private void login_textfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_textfieldKeyReleased
        // if(loginZawiera(".")) login_textfield.setText(login_textfield.getText().replace(".", ""));
        //if(login_textfield.getText().length() > 20 || login_textfield.getText().length() < 2) evt.
    }//GEN-LAST:event_login_textfieldKeyReleased

    private void login_textfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_textfieldKeyPressed
        // if(loginZawiera(".")) login_textfield.setText(login_textfield.getText().replace(".", ""));
    }//GEN-LAST:event_login_textfieldKeyPressed

    boolean checkOtherChars(String text) {
        for(int i=0; i<text.length(); i++) if(text.charAt(i) <= 'a' && text.charAt(i) >= 'z') return false;
        return true;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        var login = login_textfield.getText();
        if((login.length() <= 20 && login.length() > 2) && !checkOtherChars(login)) {
            warn_login.setVisible(false);
        } else warn_login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new okno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel email_label1;
    private javax.swing.JTextField email_textfield;
    private javax.swing.JTextField email_textfield1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel login_label;
    private javax.swing.JTextField login_textfield;
    private javax.swing.JPanel logowanie;
    private javax.swing.JLabel pass_label;
    private javax.swing.JLabel pass_label1;
    private javax.swing.JPasswordField pass_textfield;
    private javax.swing.JPasswordField pass_textfield1;
    private javax.swing.JPanel rejestracja;
    private javax.swing.JLabel rejestracja_label;
    private javax.swing.JLabel rejestracja_label1;
    private javax.swing.JLabel repass_label;
    private javax.swing.JPasswordField repass_textfield;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel warn_login;
    private javax.swing.JLabel warn_mail;
    private javax.swing.JLabel warn_pass;
    private javax.swing.JLabel warn_pass2;
    // End of variables declaration//GEN-END:variables
}