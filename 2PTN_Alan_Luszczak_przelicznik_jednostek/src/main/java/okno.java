
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     * Creates new form okno
     */
    public okno() {
        initComponents();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupa = new javax.swing.ButtonGroup();
        okno_info = new javax.swing.JFrame();
        tekst_info = new javax.swing.JLabel();
        okno_historia = new javax.swing.JFrame();
        tekst_info1 = new javax.swing.JLabel();
        okno_historia_dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        panel = new javax.swing.JPanel();
        tabbedpane = new javax.swing.JTabbedPane();
        temperatury = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        temperatury_wartosc1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        temperatury_wartosc2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        temperatury_wartosc3 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        odległości = new javax.swing.JPanel();
        milimetry = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        centymetry = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        decymetry = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        metry = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kilometry = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        pasek = new javax.swing.JMenuBar();
        pasek_plik = new javax.swing.JMenu();
        pasek_plik_historia = new javax.swing.JMenuItem();
        pasek_plik_zamknij = new javax.swing.JMenuItem();
        pasek_oprogramie = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        okno_info.setTitle("Informacje");
        okno_info.setMinimumSize(new java.awt.Dimension(371, 378));
        okno_info.setResizable(false);
        okno_info.setType(java.awt.Window.Type.UTILITY);

        tekst_info.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tekst_info.setText("<html> <center> <h1>O PROGRAMIE</h1> <b>Autor:</b> Alan Łuszczak<br> <b>Język:</b> Java<br> <b>Data kompilacji:</b> 14/02/2021<br> </center> </html>");

        javax.swing.GroupLayout okno_infoLayout = new javax.swing.GroupLayout(okno_info.getContentPane());
        okno_info.getContentPane().setLayout(okno_infoLayout);
        okno_infoLayout.setHorizontalGroup(
            okno_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, okno_infoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(tekst_info, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        okno_infoLayout.setVerticalGroup(
            okno_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(okno_infoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(tekst_info, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        okno_historia.setTitle("Informacje");
        okno_historia.setMinimumSize(new java.awt.Dimension(371, 378));
        okno_historia.setResizable(false);
        okno_historia.setType(java.awt.Window.Type.UTILITY);

        tekst_info1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tekst_info1.setText("<html> <center> <h1>O PROGRAMIE</h1> <b>Autor:</b> Alan Łuszczak<br> <b>Język:</b> Java<br> <b>Data kompilacji:</b> 14/02/2021<br> </center> </html>");

        javax.swing.GroupLayout okno_historiaLayout = new javax.swing.GroupLayout(okno_historia.getContentPane());
        okno_historia.getContentPane().setLayout(okno_historiaLayout);
        okno_historiaLayout.setHorizontalGroup(
            okno_historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, okno_historiaLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(tekst_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        okno_historiaLayout.setVerticalGroup(
            okno_historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(okno_historiaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(tekst_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        okno_historia_dialog.setTitle("Historia");
        okno_historia_dialog.setMaximumSize(new java.awt.Dimension(309, 320));
        okno_historia_dialog.setMinimumSize(new java.awt.Dimension(309, 320));
        okno_historia_dialog.setPreferredSize(new java.awt.Dimension(309, 320));
        okno_historia_dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                okno_historia_dialogWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        title1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        title1.setText("Historia");

        jLabel9.setText("//placeholder");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setText("//placeholder");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(title1)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(156, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(116, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)))
        );

        javax.swing.GroupLayout okno_historia_dialogLayout = new javax.swing.GroupLayout(okno_historia_dialog.getContentPane());
        okno_historia_dialog.getContentPane().setLayout(okno_historia_dialogLayout);
        okno_historia_dialogLayout.setHorizontalGroup(
            okno_historia_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        okno_historia_dialogLayout.setVerticalGroup(
            okno_historia_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Przelicznik jednostek");
        setBackground(new java.awt.Color(204, 0, 51));
        setMaximumSize(new java.awt.Dimension(513, 376));
        setMinimumSize(new java.awt.Dimension(513, 376));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 0, 0));
        panel.setForeground(new java.awt.Color(255, 0, 0));

        tabbedpane.setBackground(new java.awt.Color(255, 153, 153));
        tabbedpane.setFocusable(false);

        temperatury.setBackground(new java.awt.Color(255, 153, 153));
        temperatury.setForeground(new java.awt.Color(255, 153, 153));

        jLabel1.setText("Kelwiny");

        temperatury_wartosc1.setBackground(new java.awt.Color(255, 102, 102));
        temperatury_wartosc1.setText("0");
        temperatury_wartosc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                temperatury_wartosc1KeyReleased(evt);
            }
        });

        jLabel2.setText("Fahrenheity");

        temperatury_wartosc2.setBackground(new java.awt.Color(255, 102, 102));
        temperatury_wartosc2.setText("0");
        temperatury_wartosc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                temperatury_wartosc2KeyReleased(evt);
            }
        });

        jLabel3.setText("Celcjusze");

        temperatury_wartosc3.setBackground(new java.awt.Color(255, 102, 102));
        temperatury_wartosc3.setText("0");
        temperatury_wartosc3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                temperatury_wartosc3KeyReleased(evt);
            }
        });

        jToggleButton1.setText("Zapisz");
        jToggleButton1.setFocusable(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout temperaturyLayout = new javax.swing.GroupLayout(temperatury);
        temperatury.setLayout(temperaturyLayout);
        temperaturyLayout.setHorizontalGroup(
            temperaturyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temperaturyLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(temperaturyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(temperaturyLayout.createSequentialGroup()
                        .addGroup(temperaturyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temperatury_wartosc1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(temperaturyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temperatury_wartosc2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(temperaturyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temperatury_wartosc3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(temperaturyLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        temperaturyLayout.setVerticalGroup(
            temperaturyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, temperaturyLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(temperaturyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(temperaturyLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temperatury_wartosc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(temperaturyLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temperatury_wartosc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(temperaturyLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temperatury_wartosc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(80, 80, 80))
        );

        tabbedpane.addTab("Temperatury", temperatury);

        odległości.setBackground(new java.awt.Color(255, 153, 153));
        odległości.setForeground(new java.awt.Color(255, 153, 153));

        milimetry.setBackground(new java.awt.Color(255, 102, 102));
        milimetry.setText("0");
        milimetry.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        milimetry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                milimetryKeyReleased(evt);
            }
        });

        jLabel4.setText("Milimetry");

        jLabel5.setText("Centymetry");

        centymetry.setBackground(new java.awt.Color(255, 102, 102));
        centymetry.setText("0");
        centymetry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                centymetryKeyReleased(evt);
            }
        });

        jLabel6.setText("Decymetry");

        decymetry.setBackground(new java.awt.Color(255, 102, 102));
        decymetry.setText("0");
        decymetry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                decymetryKeyReleased(evt);
            }
        });

        jToggleButton2.setText("Zapisz");
        jToggleButton2.setFocusable(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        metry.setBackground(new java.awt.Color(255, 102, 102));
        metry.setText("0");
        metry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                metryKeyReleased(evt);
            }
        });

        jLabel7.setText("Metry");

        jLabel8.setText("Kilometry");

        kilometry.setBackground(new java.awt.Color(255, 102, 102));
        kilometry.setText("0");
        kilometry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kilometryKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout odległościLayout = new javax.swing.GroupLayout(odległości);
        odległości.setLayout(odległościLayout);
        odległościLayout.setHorizontalGroup(
            odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odległościLayout.createSequentialGroup()
                .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odległościLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(odległościLayout.createSequentialGroup()
                                .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(milimetry, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(centymetry, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(decymetry, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(odległościLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(metry, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kilometry, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))))
                    .addGroup(odległościLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        odległościLayout.setVerticalGroup(
            odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odległościLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(odległościLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(milimetry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odległościLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(centymetry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odległościLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decymetry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(odległościLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(odległościLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(metry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odległościLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kilometry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabbedpane.addTab("Odległości", odległości);

        title.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        title.setText("Przelicznik jednostek");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(tabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pasek_plik.setText("Plik");

        pasek_plik_historia.setText("Pokaż historię");
        pasek_plik_historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasek_plik_historiaActionPerformed(evt);
            }
        });
        pasek_plik.add(pasek_plik_historia);

        pasek_plik_zamknij.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        pasek_plik_zamknij.setText("Zamknij");
        pasek_plik_zamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasek_plik_zamknijActionPerformed(evt);
            }
        });
        pasek_plik.add(pasek_plik_zamknij);

        pasek.add(pasek_plik);

        pasek_oprogramie.setText("O programie");
        pasek_oprogramie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasek_oprogramieMouseClicked(evt);
            }
        });

        jMenuItem1.setText("O programie");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        pasek_oprogramie.add(jMenuItem1);

        pasek.add(pasek_oprogramie);

        setJMenuBar(pasek);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pasek_oprogramieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasek_oprogramieMouseClicked
        
    }//GEN-LAST:event_pasek_oprogramieMouseClicked

    private void pasek_plik_zamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasek_plik_zamknijActionPerformed
        System.exit(0);
    }//GEN-LAST:event_pasek_plik_zamknijActionPerformed

    void save() {
        File plik = new File("save.txt");
        FileWriter writer;
        try {
            writer = new FileWriter(plik);
            writer.write(temperatury_wartosc1.getText() + ";" + milimetry.getText());
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(okno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        save();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        save();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void temperatury_wartosc2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temperatury_wartosc2KeyReleased
        if(temperatury_wartosc2.getText().equals("")) return;
        double fahrenheity = Integer.parseInt(temperatury_wartosc2.getText());
        
        double kelwiny = Math.floor(((fahrenheity - 32) / 1.8000 + 273.15) * 100) / 100;
        temperatury_wartosc1.setText(Double.toString(kelwiny)); 
        
        double celcjusze = Math.floor(((fahrenheity - 32) / 1.8000) * 100) / 100;
        temperatury_wartosc3.setText(Double.toString(celcjusze));
    }//GEN-LAST:event_temperatury_wartosc2KeyReleased

    private void temperatury_wartosc1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temperatury_wartosc1KeyReleased
        if(temperatury_wartosc1.getText().equals("")) return;
        double kelwiny = Integer.parseInt(temperatury_wartosc1.getText());
        
        double fahrenheity = Math.floor(((kelwiny - 273.15) * 1.8000 + 32.00) * 100) / 100;
        temperatury_wartosc2.setText(Double.toString(fahrenheity));
        
        double celcjusze = Math.floor((kelwiny - 273.15) * 100) / 100;
        temperatury_wartosc3.setText(Double.toString(celcjusze));
    }//GEN-LAST:event_temperatury_wartosc1KeyReleased

    private void temperatury_wartosc3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temperatury_wartosc3KeyReleased
        if(temperatury_wartosc3.getText().equals("")) return;
        double celcjusze = Integer.parseInt(temperatury_wartosc3.getText());
        
        double fahrenheity = Math.floor(((celcjusze * 9/5) + 32) * 100) / 100;
        temperatury_wartosc2.setText(Double.toString(fahrenheity));
        
        double kelwiny = Math.floor((celcjusze + 273.15) * 100) / 100;
        temperatury_wartosc1.setText(Double.toString(kelwiny));
    }//GEN-LAST:event_temperatury_wartosc3KeyReleased

    private void milimetryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_milimetryKeyReleased
        if(milimetry.getText().equals("")) return;
        double milimetryI = Integer.parseInt(milimetry.getText());
        
        double centymetryI = Math.floor(milimetryI / 10 * 100) / 100;
        centymetry.setText(Double.toString(centymetryI));
        
        double decymetryI = Math.floor(milimetryI / 100 * 100) / 100;
        decymetry.setText(Double.toString(decymetryI));
        
        double metryI = Math.floor(milimetryI / 1000 * 100) / 100;
        metry.setText(Double.toString(metryI));
        
        double kilometryI = Math.floor(milimetryI / 1000000 * 100) / 100;
        kilometry.setText(Double.toString(kilometryI));
    }//GEN-LAST:event_milimetryKeyReleased

    private void centymetryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_centymetryKeyReleased
        if(centymetry.getText().equals("")) return;
        double centymetryI = Integer.parseInt(centymetry.getText());
        
        double milimetryI = Math.floor(centymetryI * 10 * 100) / 100;
        milimetry.setText(Double.toString(milimetryI));
        
        double decymetryI = Math.floor(centymetryI / 10 * 100) / 100;
        decymetry.setText(Double.toString(decymetryI));
        
        double metryI = Math.floor(centymetryI / 100 * 100) / 100;
        metry.setText(Double.toString(metryI));
        
        double kilometryI = Math.floor(centymetryI / 100000 * 100) / 100;
        kilometry.setText(Double.toString(kilometryI));
    }//GEN-LAST:event_centymetryKeyReleased

    private void decymetryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_decymetryKeyReleased
        if(decymetry.getText().equals("")) return;
        double decymetryI = Integer.parseInt(decymetry.getText());
        
        double milimetryI = Math.floor(decymetryI * 100 * 100) / 100;
        milimetry.setText(Double.toString(milimetryI));
        
        double centymetryI = Math.floor(decymetryI * 10 * 100) / 100;
        decymetry.setText(Double.toString(centymetryI));
        
        double metryI = Math.floor(decymetryI / 10 * 100) / 100;
        metry.setText(Double.toString(metryI));
        
        double kilometryI = Math.floor(decymetryI / 10000 * 100) / 100;
        kilometry.setText(Double.toString(kilometryI));
    }//GEN-LAST:event_decymetryKeyReleased

    private void metryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_metryKeyReleased
        if(metry.getText().equals("")) return;
        double metryI = Integer.parseInt(metry.getText());
        
        double milimetryI = Math.floor(metryI * 1000 * 100) / 100;
        milimetry.setText(Double.toString(milimetryI));
        
        double centymetryI = Math.floor(metryI * 100 * 100) / 100;
        centymetry.setText(Double.toString(centymetryI));
        
        double decymetryI = Math.floor(metryI * 10 * 100) / 100;
        decymetry.setText(Double.toString(decymetryI));
        
        double kilometryI = Math.floor(metryI / 1000 * 100) / 100;
        kilometry.setText(Double.toString(kilometryI));
    }//GEN-LAST:event_metryKeyReleased

    private void kilometryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kilometryKeyReleased
        if(kilometry.getText().equals("")) return;
        double kilometryI = Integer.parseInt(kilometry.getText());
        
        double milimetryI = Math.floor(kilometryI * 1000000 * 100) / 100;
        milimetry.setText(Double.toString(milimetryI));
        
        double centymetryI = Math.floor(kilometryI * 100000 * 100) / 100;
        centymetry.setText(Double.toString(centymetryI));
        
        double decymetryI = Math.floor(kilometryI * 10000 * 100) / 100;
        decymetry.setText(Double.toString(decymetryI));
        
        double metryI = Math.floor(kilometryI * 1000 * 100) / 100;
        metry.setText(Double.toString(metryI));
    }//GEN-LAST:event_kilometryKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        okno_info.show();
        okno_info.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void pasek_plik_historiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasek_plik_historiaActionPerformed
        //okno_historia_dialog.();
        //okno_historia_dialog
        //jPopupMenu1.show();
    }//GEN-LAST:event_pasek_plik_historiaActionPerformed

    private void okno_historia_dialogWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_okno_historia_dialogWindowOpened
        File plik = new File("save.txt");
        BufferedReader br;
        double kelwinyC = 0;
        double milimetryC = 0;
        try {
            br = new BufferedReader(new FileReader(plik));
            String content = br.readLine();
            kelwinyC = Integer.parseInt(content.split(";")[0]);
            milimetryC = Integer.parseInt(content.split(";")[1]);
        } catch (IOException ex) {
            Logger.getLogger(okno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jLabel10.setText("Temperatury:\nK: " + Double.toString(kelwinyC));
        jLabel9.setText("Odległości:\n");
    }//GEN-LAST:event_okno_historia_dialogWindowOpened

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
    private javax.swing.JTextField centymetry;
    private javax.swing.JTextField decymetry;
    private javax.swing.ButtonGroup grupa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField kilometry;
    private javax.swing.JTextField metry;
    private javax.swing.JTextField milimetry;
    private javax.swing.JPanel odległości;
    private javax.swing.JFrame okno_historia;
    private javax.swing.JDialog okno_historia_dialog;
    private javax.swing.JFrame okno_info;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuBar pasek;
    private javax.swing.JMenu pasek_oprogramie;
    private javax.swing.JMenu pasek_plik;
    private javax.swing.JMenuItem pasek_plik_historia;
    private javax.swing.JMenuItem pasek_plik_zamknij;
    private javax.swing.JTabbedPane tabbedpane;
    private javax.swing.JLabel tekst_info;
    private javax.swing.JLabel tekst_info1;
    private javax.swing.JPanel temperatury;
    private javax.swing.JTextField temperatury_wartosc1;
    private javax.swing.JTextField temperatury_wartosc2;
    private javax.swing.JTextField temperatury_wartosc3;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
