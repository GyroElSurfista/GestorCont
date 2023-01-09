/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jairo.gest.gui;



import com.jairo.gest.editores.EditorCuenta;
import com.jairo.gest.genCont.GenContrasenias;
import com.jairo.gest.usuarios.Cuenta;
import java.awt.Color;


/**
 *
 * @author Jairo
 */
public class VentanaEdicionCuenta extends javax.swing.JFrame {

    private EditorCuenta editor;
    private GenContrasenias genCont;
    private VentanaVerFolder origen;
    private String usuario;
    private int mouseX, mouseY;
    public VentanaEdicionCuenta(String usuario,String contM, Cuenta cuenta, VentanaVerFolder origen) {
        setLookAndFeel();
        initComponents();
        
        this.usuario    = usuario;
        editor          = new EditorCuenta(contM, cuenta);
        this.origen     = origen;
        setUsrInfo();
        setCuentaInfo();
        
        msjLbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bg2 = new javax.swing.JPanel();
        cuentaInfPanel = new javax.swing.JPanel();
        cuentaInfLbl = new javax.swing.JLabel();
        nomCuentLbl = new javax.swing.JLabel();
        nomCuentTxtBox = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        nomUsrLbl = new javax.swing.JLabel();
        nomUsrTxtBox = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        uriLbl = new javax.swing.JLabel();
        uriTxtBox = new javax.swing.JTextField();
        contLbl = new javax.swing.JLabel();
        separador4 = new javax.swing.JSeparator();
        separador5 = new javax.swing.JSeparator();
        descCuentaLbl = new javax.swing.JLabel();
        descCuentaTxtBox = new javax.swing.JTextField();
        genContPanel = new javax.swing.JPanel();
        genContLbl = new javax.swing.JLabel();
        verContPanel = new javax.swing.JPanel();
        verContLbl = new javax.swing.JLabel();
        contBox = new javax.swing.JPasswordField();
        usrInfo = new javax.swing.JPanel();
        usrInfoLbl = new javax.swing.JLabel();
        crearCuenBtn = new javax.swing.JPanel();
        crearLbl = new javax.swing.JLabel();
        msjLbl = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        exitB = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(203, 182, 184));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.setPreferredSize(new java.awt.Dimension(737, 467));

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        cuentaInfPanel.setBackground(new java.awt.Color(255, 255, 255));
        cuentaInfPanel.setFocusable(false);
        cuentaInfPanel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        cuentaInfLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cuentaInfLbl.setText("Edicion de cuenta");

        nomCuentLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        nomCuentLbl.setText("Nombre de la cuenta");

        nomCuentTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        nomCuentTxtBox.setText("Nombre de la cuenta");
        nomCuentTxtBox.setBorder(null);
        nomCuentTxtBox.setMaximumSize(new java.awt.Dimension(200, 200));
        nomCuentTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomCuentTxtBoxFocusGained(evt);
            }
        });
        nomCuentTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomCuentTxtBoxActionPerformed(evt);
            }
        });

        separador1.setForeground(new java.awt.Color(0, 0, 0));

        separador2.setForeground(new java.awt.Color(0, 0, 0));

        nomUsrLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        nomUsrLbl.setText("Nombre de usuario");

        nomUsrTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        nomUsrTxtBox.setText("Nombre de usuario de la cuenta");
        nomUsrTxtBox.setBorder(null);
        nomUsrTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomUsrTxtBoxFocusGained(evt);
            }
        });
        nomUsrTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomUsrTxtBoxActionPerformed(evt);
            }
        });

        separador3.setForeground(new java.awt.Color(0, 0, 0));

        uriLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        uriLbl.setText("URI");

        uriTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        uriTxtBox.setBorder(null);
        uriTxtBox.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        uriTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uriTxtBoxFocusGained(evt);
            }
        });
        uriTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uriTxtBoxActionPerformed(evt);
            }
        });

        contLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        contLbl.setText("Contraseña");

        separador4.setForeground(new java.awt.Color(0, 0, 0));

        separador5.setForeground(new java.awt.Color(0, 0, 0));

        descCuentaLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        descCuentaLbl.setText("Descripción");

        descCuentaTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        descCuentaTxtBox.setBorder(null);
        descCuentaTxtBox.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        descCuentaTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descCuentaTxtBoxFocusGained(evt);
            }
        });
        descCuentaTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descCuentaTxtBoxActionPerformed(evt);
            }
        });

        genContPanel.setBackground(new java.awt.Color(255, 255, 255));
        genContPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genContPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                genContPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                genContPanelMouseExited(evt);
            }
        });

        genContLbl.setBackground(new java.awt.Color(255, 255, 255));
        genContLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        genContLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genContLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jairo\\Documents\\NetBeansProjects\\GestorContrasenias\\src\\main\\java\\com\\jairo\\gest\\gui\\assets\\Reload.png")); // NOI18N
        genContLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genContLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                genContLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                genContLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout genContPanelLayout = new javax.swing.GroupLayout(genContPanel);
        genContPanel.setLayout(genContPanelLayout);
        genContPanelLayout.setHorizontalGroup(
            genContPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genContLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        genContPanelLayout.setVerticalGroup(
            genContPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genContLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        verContPanel.setBackground(new java.awt.Color(255, 255, 255));
        verContPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verContPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verContPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verContPanelMouseExited(evt);
            }
        });

        verContLbl.setBackground(new java.awt.Color(255, 255, 255));
        verContLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        verContLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verContLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jairo\\Documents\\NetBeansProjects\\GestorContrasenias\\src\\main\\java\\com\\jairo\\gest\\gui\\assets\\ojito.png")); // NOI18N
        verContLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verContLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verContLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verContLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verContLblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                verContLblMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout verContPanelLayout = new javax.swing.GroupLayout(verContPanel);
        verContPanel.setLayout(verContPanelLayout);
        verContPanelLayout.setHorizontalGroup(
            verContPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verContLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        verContPanelLayout.setVerticalGroup(
            verContPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verContLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        contBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        contBox.setText("Contraseña de la cuenta");
        contBox.setToolTipText("");
        contBox.setBorder(null);
        contBox.setEchoChar('*');
        contBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contBoxFocusGained(evt);
            }
        });

        javax.swing.GroupLayout cuentaInfPanelLayout = new javax.swing.GroupLayout(cuentaInfPanel);
        cuentaInfPanel.setLayout(cuentaInfPanelLayout);
        cuentaInfPanelLayout.setHorizontalGroup(
            cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentaInfPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(descCuentaLbl)
                        .addComponent(descCuentaTxtBox)
                        .addComponent(separador5, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(uriLbl)
                        .addComponent(uriTxtBox)
                        .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contLbl)
                    .addGroup(cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nomUsrLbl)
                        .addComponent(nomUsrTxtBox)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nomCuentLbl)
                        .addComponent(cuentaInfLbl)
                        .addComponent(nomCuentTxtBox, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                        .addComponent(separador1))
                    .addGroup(cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(cuentaInfPanelLayout.createSequentialGroup()
                            .addComponent(contBox)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(genContPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(verContPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        cuentaInfPanelLayout.setVerticalGroup(
            cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentaInfPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuentaInfLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomCuentLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomCuentTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomUsrLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomUsrTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuentaInfPanelLayout.createSequentialGroup()
                        .addGroup(cuentaInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verContPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uriLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uriTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descCuentaLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descCuentaTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genContPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        usrInfo.setBackground(new java.awt.Color(255, 255, 255));

        usrInfoLbl.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usrInfoLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usrInfoLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jairo\\Documents\\NetBeansProjects\\GestorContrasenias\\src\\main\\java\\com\\jairo\\gest\\gui\\assets\\User.png")); // NOI18N
        usrInfoLbl.setText("Usuario");

        javax.swing.GroupLayout usrInfoLayout = new javax.swing.GroupLayout(usrInfo);
        usrInfo.setLayout(usrInfoLayout);
        usrInfoLayout.setHorizontalGroup(
            usrInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usrInfoLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(usrInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        usrInfoLayout.setVerticalGroup(
            usrInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usrInfoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        crearCuenBtn.setBackground(new java.awt.Color(255, 255, 255));

        crearLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        crearLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearLbl.setText("Editar Cuenta");
        crearLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearCuenBtnLayout = new javax.swing.GroupLayout(crearCuenBtn);
        crearCuenBtn.setLayout(crearCuenBtnLayout);
        crearCuenBtnLayout.setHorizontalGroup(
            crearCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        crearCuenBtnLayout.setVerticalGroup(
            crearCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        msjLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        msjLbl.setForeground(new java.awt.Color(255, 255, 255));
        msjLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msjLbl.setText("Mensaje");

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(crearCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bg2Layout.createSequentialGroup()
                            .addComponent(usrInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cuentaInfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usrInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuentaInfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crearCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bar.setBackground(new java.awt.Color(203, 182, 184));
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        exitB.setBackground(new java.awt.Color(203, 182, 184));
        exitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBMouseExited(evt);
            }
        });

        exitLbl.setBackground(new java.awt.Color(203, 182, 184));
        exitLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        exitLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBLayout = new javax.swing.GroupLayout(exitB);
        exitB.setLayout(exitBLayout);
        exitBLayout.setHorizontalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        exitBLayout.setVerticalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX , y - mouseY );
    }//GEN-LAST:event_barMouseDragged

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLblMouseClicked

    private void exitLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitLblMouseEntered

    private void exitBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitBMouseExited

    private void exitBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitBMouseEntered

    private void exitLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitLblMouseExited

    private void nomCuentTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomCuentTxtBoxActionPerformed
        
    }//GEN-LAST:event_nomCuentTxtBoxActionPerformed

    private void nomUsrTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomUsrTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomUsrTxtBoxActionPerformed

    private void nomCuentTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomCuentTxtBoxFocusGained
        nomCuentTxtBox.setForeground(Color.black);
    }//GEN-LAST:event_nomCuentTxtBoxFocusGained

    private void nomUsrTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomUsrTxtBoxFocusGained
        nomUsrTxtBox.setForeground(Color.black);       
    }//GEN-LAST:event_nomUsrTxtBoxFocusGained

    private void uriTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uriTxtBoxFocusGained
        uriTxtBox.setForeground(Color.black);
    }//GEN-LAST:event_uriTxtBoxFocusGained

    private void uriTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uriTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uriTxtBoxActionPerformed

    private void descCuentaTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descCuentaTxtBoxFocusGained
        descCuentaTxtBox.setForeground(Color.black);
    }//GEN-LAST:event_descCuentaTxtBoxFocusGained

    private void descCuentaTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descCuentaTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descCuentaTxtBoxActionPerformed

    private void genContPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genContPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_genContPanelMouseEntered

    private void genContPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genContPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_genContPanelMouseExited

    private void verContPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verContPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_verContPanelMouseEntered

    private void verContPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verContPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_verContPanelMouseExited

    private void genContLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genContLblMouseClicked
        contBox.setForeground(Color.black);
        if(String.valueOf(contBox.getPassword()).equals("Contraseña de la cuenta")){
            contBox.setText("");
        }
       
        VentanaGenCont ventana;
        
        ventana = new VentanaGenCont(contBox);
        ventana.setVisible(true);
    }//GEN-LAST:event_genContLblMouseClicked

    private void genContLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genContLblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_genContLblMouseEntered

    private void genContLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genContLblMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_genContLblMouseExited

    private void verContLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verContLblMouseClicked
       
    }//GEN-LAST:event_verContLblMouseClicked

    private void verContLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verContLblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_verContLblMouseEntered

    private void verContLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verContLblMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_verContLblMouseExited

    private void contBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contBoxFocusGained
        contBox.setForeground(Color.black);
    }//GEN-LAST:event_contBoxFocusGained

    private void verContLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verContLblMousePressed
        contBox.setEchoChar((char)0);
    }//GEN-LAST:event_verContLblMousePressed

    private void verContLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verContLblMouseReleased
        contBox.setEchoChar('*');
    }//GEN-LAST:event_verContLblMouseReleased

    private void crearLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearLblMouseClicked
        if(verificarLlenado()){
            if(editor.editarCuenta(nomCuentTxtBox.getText(), nomUsrTxtBox.getText(), String.valueOf(contBox.getPassword()), descCuentaTxtBox.getText(), uriTxtBox.getText())){
                msjLbl.setText("Cuenta editada exitosamente");
                origen.setCuentas();
            }else{
                msjLbl.setText("Error al editar la cuenta"); 
            }

            msjLbl.setVisible(true);
        
        }   
        
        
    }//GEN-LAST:event_crearLblMouseClicked

    
    private void setUsrInfo(){
        usrInfoLbl.setText(usuario);
    }
    
    private void setCuentaInfo(){
        nomCuentTxtBox.setText(editor.getCuenta().getNomCuenta());
        nomUsrTxtBox.setText(editor.getCuenta().getUsrCuenta());
        contBox.setText(editor.getCuenta().getContCuenta());
        uriTxtBox.setText(editor.getCuenta().getUri());
        descCuentaTxtBox.setText(editor.getCuenta().getDescCuenta());
    }
    
    private boolean verificarLlenado(){
        boolean correcto;
        String mensaje;
        
        correcto    = false;
        mensaje     = null;
        
        if(nomCuentTxtBox.getText().equals("") || nomCuentTxtBox.getText().equals("Nombre de la cuenta")){
            mensaje = "Debe introducir un nombre para la cuenta";
        }else if(nomUsrTxtBox.getText().equals("") || nomUsrTxtBox.equals("Nombre de usuario de la cuenta")){
            mensaje = "Debe introducir un nombre de usuario para la cuenta";
        }else if(String.valueOf(contBox.getPassword()).equals("") || String.valueOf(contBox.getPassword()).equals("Contraseña de la cuenta")){
            mensaje = "Debe introducir una contraseña para la cuenta";
        }
        
        correcto = mensaje == null;
        
        if(mensaje != null){
            msjLbl.setText(mensaje);
            msjLbl.setVisible(true);
        }
        
        return correcto;
        
    }
    /**
     * @param args the command line arguments
     */


    
    private void setLookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JPasswordField contBox;
    private javax.swing.JLabel contLbl;
    private javax.swing.JPanel crearCuenBtn;
    private javax.swing.JLabel crearLbl;
    private javax.swing.JLabel cuentaInfLbl;
    private javax.swing.JPanel cuentaInfPanel;
    private javax.swing.JLabel descCuentaLbl;
    private javax.swing.JTextField descCuentaTxtBox;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel genContLbl;
    private javax.swing.JPanel genContPanel;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JLabel nomCuentLbl;
    private javax.swing.JTextField nomCuentTxtBox;
    private javax.swing.JLabel nomUsrLbl;
    private javax.swing.JTextField nomUsrTxtBox;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JSeparator separador5;
    private javax.swing.JLabel uriLbl;
    private javax.swing.JTextField uriTxtBox;
    private javax.swing.JPanel usrInfo;
    private javax.swing.JLabel usrInfoLbl;
    private javax.swing.JLabel verContLbl;
    private javax.swing.JPanel verContPanel;
    // End of variables declaration//GEN-END:variables
}
