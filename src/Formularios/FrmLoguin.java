package Formularios;
import Desarrollo.AbmLoguin;
import javax.swing.JOptionPane;

public class FrmLoguin extends javax.swing.JFrame {
AbmLoguin ObLogueo;
AbmLoguin ObLogueo2;
AbmLoguin ObLogueo3;

    public FrmLoguin() {
        initComponents();
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);
        this.BtnActualizar.setVisible(false);
        this.BtnBuscar.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoEstado = new javax.swing.ButtonGroup();
        GrupoCategoria = new javax.swing.ButtonGroup();
        PanelTitulo = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        LblLTitulo = new org.edisoncor.gui.label.LabelHeader();
        PanelPie = new javax.swing.JPanel();
        BtnAlta = new javax.swing.JButton();
        BtnModifica = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        PanelCuerpo = new javax.swing.JPanel();
        labelRound1 = new org.edisoncor.gui.label.LabelRound();
        labelRound2 = new org.edisoncor.gui.label.LabelRound();
        labelRound4 = new org.edisoncor.gui.label.LabelRound();
        TxtUsu = new org.edisoncor.gui.textField.TextField();
        TxtClave = new org.edisoncor.gui.passwordField.PasswordField();
        RbInactivo = new javax.swing.JRadioButton();
        RbAdmin = new javax.swing.JRadioButton();
        RbVendedor = new javax.swing.JRadioButton();
        labelRound3 = new org.edisoncor.gui.label.LabelRound();
        RbActivo = new javax.swing.JRadioButton();
        TxtNom = new org.edisoncor.gui.textField.TextField();
        labelRound5 = new org.edisoncor.gui.label.LabelRound();
        lblLegajo = new org.edisoncor.gui.label.LabelRound();
        TxtLegao = new org.edisoncor.gui.textField.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logueo de Administrador y Vendedores");
        setResizable(false);

        PanelTitulo.setBackground(new java.awt.Color(255, 204, 153));

        panelImage1.setBackground(new java.awt.Color(255, 204, 0));
        panelImage1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        LblLTitulo.setText("Loguin");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(LblLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTituloLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LblLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(PanelTitulo, java.awt.BorderLayout.PAGE_START);

        PanelPie.setBackground(new java.awt.Color(255, 204, 153));

        BtnAlta.setText("ALTA");
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });

        BtnModifica.setText("MODIFICACION");
        BtnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificaActionPerformed(evt);
            }
        });

        BtnBaja.setText("BAJA");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPieLayout = new javax.swing.GroupLayout(PanelPie);
        PanelPie.setLayout(PanelPieLayout);
        PanelPieLayout.setHorizontalGroup(
            PanelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnModifica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnActualizar)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        PanelPieLayout.setVerticalGroup(
            PanelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPieLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAlta)
                    .addComponent(BtnModifica)
                    .addComponent(BtnBaja)
                    .addComponent(BtnSalir)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnActualizar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(PanelPie, java.awt.BorderLayout.PAGE_END);

        PanelCuerpo.setBackground(new java.awt.Color(255, 204, 153));

        labelRound1.setText("Usuario");

        labelRound2.setText("Clave");

        labelRound4.setText("Categoria");

        TxtClave.setText("passwordField1");

        GrupoEstado.add(RbInactivo);
        RbInactivo.setText("Inactivo");

        GrupoCategoria.add(RbAdmin);
        RbAdmin.setText("Administrador");

        GrupoCategoria.add(RbVendedor);
        RbVendedor.setSelected(true);
        RbVendedor.setText("Vendedor");

        labelRound3.setText("Estado");

        GrupoEstado.add(RbActivo);
        RbActivo.setSelected(true);
        RbActivo.setText("Activo");

        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        labelRound5.setText("Nombre");

        lblLegajo.setText("Legajo");

        TxtLegao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtLegaoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelCuerpoLayout = new javax.swing.GroupLayout(PanelCuerpo);
        PanelCuerpo.setLayout(PanelCuerpoLayout);
        PanelCuerpoLayout.setHorizontalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(labelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(labelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RbInactivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(labelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(RbActivo)
                                .addGap(173, 173, 173)
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RbAdmin)
                                    .addComponent(RbVendedor))
                                .addGap(39, 39, 39))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtLegao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        PanelCuerpoLayout.setVerticalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RbInactivo)))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(RbAdmin))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(RbActivo)))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(RbVendedor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtLegao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        getContentPane().add(PanelCuerpo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        String Nom = this.TxtNom.getText();
        String Usu = this.TxtUsu.getText();
        
        String Clave = new String(this.TxtClave.getPassword());
        System.out.println(Clave);
        
        int Legajo = Integer.parseInt(this.TxtLegao.getText());
        
        char Estado = 'z';
        if (this.RbInactivo.isSelected())  // Estado (activo o inactivo)
        {
            Estado = 'I';
        }
        else
        {
            Estado = 'A';
        }
        
        char Categoria = 'z';
        if (this.RbAdmin.isSelected()) // Categoria (Administrador o Vendedor)
        {
            Categoria = 'A';
        }
        else
        {
            Categoria = 'V';
        }
        
        ObLogueo = new AbmLoguin (Legajo, Nom, Estado, Categoria, Usu, Clave);
        ObLogueo.Alta();
        Limpiar();
        
    }//GEN-LAST:event_BtnAltaActionPerformed

    
    private void Limpiar()
    {
        this.TxtNom.setText(null);
        this.TxtLegao.setText(null);
        this.TxtUsu.setText(null);
        char asterisco = '*';
        this.TxtClave.setEchoChar(asterisco);
    }
    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
       SoloLetras(evt);
    }//GEN-LAST:event_TxtNomKeyTyped

    
    private void TxtLegaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLegaoKeyTyped
        SoloNumeros(evt);
    }//GEN-LAST:event_TxtLegaoKeyTyped

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        this.BtnModifica.setVisible(false);
        Ocultar();
        this.BtnCancelar.setVisible(true);
        this.BtnEliminar.setVisible(true);        
        this.BtnBaja.setVisible(false);

    }//GEN-LAST:event_BtnBajaActionPerformed

    private void Ocultar()
    {
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(false);
        
        //this.BtnBuscar.setVisible(false);
        this.labelRound1.setVisible(false);
        this.labelRound2.setVisible(false);
        this.labelRound3.setVisible(false);
        this.labelRound4.setVisible(false);
        this.labelRound5.setVisible(false);
        this.RbActivo.setVisible(false);
        this.RbInactivo.setVisible(false);
        this.RbAdmin.setVisible(false);
        this.RbVendedor.setVisible(false);
        this.TxtNom.setVisible(false);
        this.TxtUsu.setVisible(false);
        this.TxtClave.setVisible(false);
        
    }
    
    private void BtnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificaActionPerformed
        /* ocultar todos los datos y dejar solo visible el legajo
        deben aparecer 2 botones (actualizar y cancelar)
        ===> si cancela, no hace nada, pone todo visible y va derecho al metodo limpiar
        ===> si actualiza hace todo lo que esta escrito abajo */
        this.BtnBaja.setVisible(false);
        this.BtnCancelar.setVisible(true);
        this.BtnBuscar.setVisible(true);
        this.BtnModifica.setVisible(false);
        Ocultar();
        


    }//GEN-LAST:event_BtnModificaActionPerformed

    
    private void Actualizar()
    {
        String Nom = this.TxtNom.getText();
        String Usu = this.TxtUsu.getText();
        
        String Clave = new String(this.TxtClave.getPassword());
        
        int Legajo = Integer.parseInt(this.TxtLegao.getText());
        
        char Estado = 'z';
        if (this.RbInactivo.isSelected())  // Estado (activo o inactivo)
        {
            Estado = 'I';
        }
        else
        {
            Estado = 'A';
        }
        
        char Categoria = 'z';
        if (this.RbAdmin.isSelected()) // Categoria (Administrador o Vendedor)
        {
            Categoria = 'A';
        }
        else
        {
            Categoria = 'V';
        }
        ObLogueo = new AbmLoguin (Legajo, Nom, Estado, Categoria, Usu, Clave);
        ObLogueo.Modificacion(Legajo);
        Limpiar();        
    }
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int z = JOptionPane.showConfirmDialog(null, "Esta seguro ?");
        if ( z == 0) 
        {
           int Legajo = Integer.parseInt(this.TxtLegao.getText());
            ObLogueo2 = new AbmLoguin();
            ObLogueo2.setNroLeg(Legajo);
            ObLogueo2.Baja();
            this.TxtLegao.setText(null);
            Visible();
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Visible();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        Actualizar();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
            int Legajo = Integer.parseInt(this.TxtLegao.getText());
            ObLogueo3 = new AbmLoguin();
         boolean  z1 =  ObLogueo3.BuscarLegajo(Legajo);
         if (z1  == true) 
         {
             Visible();
             this.TxtNom.setText(ObLogueo3.getNom());
             this.TxtUsu.setText(ObLogueo3.getUsu());
             this.TxtClave.setText(ObLogueo3.getClave());
             if (ObLogueo3.getEstado() == 'A') 
             {
                 this.RbActivo.isSelected();
             }
             else
             {
                 this.RbInactivo.isSelected();
             }
             this.BtnActualizar.setVisible(true);
             this.BtnCancelar.setVisible(true);

            this.BtnBaja.setVisible(false);
            this.BtnAlta.setVisible(false);
            this.BtnSalir.setVisible(false);
            this.BtnModifica.setVisible(false);
            this.BtnBuscar.setVisible(false);
             
         }
    }//GEN-LAST:event_BtnBuscarActionPerformed
    
    
    private void Visible()
    {
        this.BtnModifica.setVisible(true);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);        
        this.BtnBaja.setVisible(true);
        this.BtnAlta.setVisible(true);
        this.BtnSalir.setVisible(true);
        this.labelRound1.setVisible(true);
        this.labelRound2.setVisible(true);
        this.labelRound3.setVisible(true);
        this.labelRound4.setVisible(true);
        this.labelRound5.setVisible(true);
        this.RbActivo.setVisible(true);
        this.RbInactivo.setVisible(true);
        this.RbAdmin.setVisible(true);
        this.RbVendedor.setVisible(true);
        this.TxtNom.setVisible(true);
        this.TxtUsu.setVisible(true);
        this.TxtClave.setVisible(true);
    }
    
    private void SoloNumeros(java.awt.event.KeyEvent evt)
    {
        char nro = evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isDigit(nro)  && Bs != 8  ) 
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número");
            evt.consume();
        }
    }


    private void SoloLetras(java.awt.event.KeyEvent evt)
    {
        char Letra = evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isLetter(Letra) && Bs != 32  && Bs != 8 ) 
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar una letra");
            evt.consume();
            
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
            java.util.logging.Logger.getLogger(FrmLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoguin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModifica;
    private javax.swing.JButton BtnSalir;
    private javax.swing.ButtonGroup GrupoCategoria;
    private javax.swing.ButtonGroup GrupoEstado;
    private org.edisoncor.gui.label.LabelHeader LblLTitulo;
    private javax.swing.JPanel PanelCuerpo;
    private javax.swing.JPanel PanelPie;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JRadioButton RbActivo;
    private javax.swing.JRadioButton RbAdmin;
    private javax.swing.JRadioButton RbInactivo;
    private javax.swing.JRadioButton RbVendedor;
    private org.edisoncor.gui.passwordField.PasswordField TxtClave;
    private org.edisoncor.gui.textField.TextField TxtLegao;
    private org.edisoncor.gui.textField.TextField TxtNom;
    private org.edisoncor.gui.textField.TextField TxtUsu;
    private org.edisoncor.gui.label.LabelRound labelRound1;
    private org.edisoncor.gui.label.LabelRound labelRound2;
    private org.edisoncor.gui.label.LabelRound labelRound3;
    private org.edisoncor.gui.label.LabelRound labelRound4;
    private org.edisoncor.gui.label.LabelRound labelRound5;
    private org.edisoncor.gui.label.LabelRound lblLegajo;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
