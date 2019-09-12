package Formularios;
import Desarrollo.AbmClientes;
import javax.swing.JOptionPane;
// import javax.swing.DefaultListModel;

public class FrmClientes extends javax.swing.JInternalFrame {
AbmClientes ObjCli;
AbmClientes ObjCli2;
//DefaultListModel ModeloCategoria = new DefaultListModel();
String NomCliBorrar = null;
String NomViejo = null;

    public FrmClientes() {
        initComponents();
        this.PanelConsulta.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);              
        this.BtnBuscar.setVisible(false);
        this.BtnActualizar.setVisible(false);
        this.BtnBaja.setVisible(false);
        this.BtnModif.setVisible(false);
   //     this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        LblTitulo = new org.edisoncor.gui.label.LabelMetric();
        LblNom = new org.edisoncor.gui.label.LabelRect();
        TxtNom = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        PanelBotones = new javax.swing.JPanel();
        BtnBaja = new org.edisoncor.gui.button.ButtonAero();
        BtnActualizar = new org.edisoncor.gui.button.ButtonAero();
        BtnAlta = new org.edisoncor.gui.button.ButtonAero();
        BtnModif = new org.edisoncor.gui.button.ButtonAero();
        BtnSalir = new org.edisoncor.gui.button.ButtonAero();
        BtnEliminar = new org.edisoncor.gui.button.ButtonAero();
        BtnBuscar = new org.edisoncor.gui.button.ButtonAero();
        BtnCancelar = new org.edisoncor.gui.button.ButtonAero();
        BtnConsulta1 = new org.edisoncor.gui.button.ButtonAero();
        PanelConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("CLIENTES");

        PanelPrincipal.setBackground(new java.awt.Color(255, 153, 102));

        LblTitulo.setText("CLIENTES");
        LblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        LblNom.setText("NOMBRE");

        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        PanelBotones.setBackground(new java.awt.Color(255, 153, 102));

        BtnBaja.setBackground(new java.awt.Color(153, 102, 0));
        BtnBaja.setText("BAJAS");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });

        BtnActualizar.setBackground(new java.awt.Color(153, 102, 0));
        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnAlta.setBackground(new java.awt.Color(153, 102, 0));
        BtnAlta.setText("ALTAS");
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });

        BtnModif.setBackground(new java.awt.Color(153, 102, 0));
        BtnModif.setText("MODIFICACIONES");
        BtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(153, 102, 0));
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(153, 102, 0));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(153, 102, 0));
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(153, 102, 0));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnConsulta1.setBackground(new java.awt.Color(153, 102, 0));
        BtnConsulta1.setText("CONSULTAS");
        BtnConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsulta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBotonesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBotonesLayout.createSequentialGroup()
                        .addComponent(BtnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelConsulta.setBackground(new java.awt.Color(255, 153, 102));

        ListaClientes.setBackground(new java.awt.Color(204, 153, 0));
        jScrollPane1.setViewportView(ListaClientes);

        javax.swing.GroupLayout PanelConsultaLayout = new javax.swing.GroupLayout(PanelConsulta);
        PanelConsulta.setLayout(PanelConsultaLayout);
        PanelConsultaLayout.setHorizontalGroup(
            PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsultaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelConsultaLayout.setVerticalGroup(
            PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsultaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(PanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(PanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
      dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        String Nom = this.TxtNom.getText();
        ObjCli = new AbmClientes(Nom); 
        ObjCli.Alta();
        Limpiar();
    }//GEN-LAST:event_BtnAltaActionPerformed

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
         SoloLetras(evt);
    }//GEN-LAST:event_TxtNomKeyTyped

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        this.BtnModif.setVisible(false);
        this.BtnConsulta1.setVisible(false);
        Ocultar();
        this.BtnCancelar.setVisible(true);
        this.BtnEliminar.setVisible(true);        
        this.BtnBaja.setVisible(false);
        
    //    System.out.println("valor " + this.ListaCategorias.getSelectedValue());
        NomCliBorrar = this.ListaClientes.getSelectedValue();
         
    }//GEN-LAST:event_BtnBajaActionPerformed

    private void Ocultar()
    {
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(false);   
        this.LblNom.setVisible(false);
        this.TxtNom.setVisible(false);

        
    }
    private void BtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifActionPerformed
        this.BtnBaja.setVisible(false);
        this.BtnCancelar.setVisible(true);
        this.BtnBuscar.setVisible(false);
        this.BtnActualizar.setVisible(true);
        this.BtnModif.setVisible(false);
        this.BtnConsulta1.setVisible(false);
        Ocultar();
        NomViejo = this.ListaClientes.getSelectedValue();
        this.TxtNom.setText(NomViejo);
        this.LblNom.setVisible(true);
        this.TxtNom.setVisible(true);
        

    }//GEN-LAST:event_BtnModifActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed

        String NomAct = this.TxtNom.getText();

        ObjCli2 = new AbmClientes(NomViejo);
        ObjCli2.Modif(NomAct);
        Limpiar(); 
        Visible();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int z = JOptionPane.showConfirmDialog(null, "Esta seguro ?");
        if ( z == 0) 
        {
    //       String Nom = this.TxtNom.getText(); // debe tomar el id y no el nombre
            ObjCli2 = new AbmClientes();
            ObjCli2.setNom(NomCliBorrar);
            ObjCli2.Baja();
            this.TxtNom.setText(null);
            ObjCli2 = new AbmClientes();
            ListaClientes.setModel(ObjCli2.Muestro());
            Visible();
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
       Visible();
    }//GEN-LAST:event_BtnCancelarActionPerformed
   private void Visible()
    {
        this.BtnActualizar.setVisible(false);
        this.BtnConsulta1.setVisible(true);
        this.BtnModif.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);        
        this.BtnBaja.setVisible(false);
        this.BtnAlta.setVisible(true);
        this.BtnSalir.setVisible(true);
        this.LblNom.setVisible(true);
        this.TxtNom.setVisible(true);
    }
    private void BtnConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsulta1ActionPerformed
        this.PanelConsulta.setVisible(true);
        this.ListaClientes.setVisible(true);
        this.BtnModif.setVisible(true);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);        
        this.BtnBaja.setVisible(true);
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(true);
        this.LblNom.setVisible(false);
        this.TxtNom.setVisible(false);
        ObjCli2 = new AbmClientes();
        ListaClientes.setModel(ObjCli2.Muestro()); // error de nullpointer
    }//GEN-LAST:event_BtnConsulta1ActionPerformed
    private void Limpiar()
    {
        this.TxtNom.setText(null);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAero BtnActualizar;
    private org.edisoncor.gui.button.ButtonAero BtnAlta;
    private org.edisoncor.gui.button.ButtonAero BtnBaja;
    private org.edisoncor.gui.button.ButtonAero BtnBuscar;
    private org.edisoncor.gui.button.ButtonAero BtnCancelar;
    private org.edisoncor.gui.button.ButtonAero BtnConsulta1;
    private org.edisoncor.gui.button.ButtonAero BtnEliminar;
    private org.edisoncor.gui.button.ButtonAero BtnModif;
    private org.edisoncor.gui.button.ButtonAero BtnSalir;
    private org.edisoncor.gui.label.LabelRect LblNom;
    private org.edisoncor.gui.label.LabelMetric LblTitulo;
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelConsulta;
    private javax.swing.JPanel PanelPrincipal;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtNom;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
