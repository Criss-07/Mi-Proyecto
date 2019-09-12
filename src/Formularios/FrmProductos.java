
package Formularios;
import Desarrollo.AbmProductos;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmProductos extends javax.swing.JInternalFrame {
AbmProductos  ObjProd3;
AbmProductos  ObjProd2;
String NomLab = null;
String NomDroga = null;
String NomCat = null;
String NomCom = null;
double PrecioLista = 0;
double PrecioCosto = 0;
int Cantidad = 0;
String Envase = null;
char TipoVta = ' ';
Date FechaVto;
String NomProductoBorrar = null;
String NomViejo = null;

    public FrmProductos() 
    {
        initComponents();
        ObjProd3 = new AbmProductos();
        ListaLaboratorio.setModel(ObjProd3.MuestroLab()); 
        ListaDroga.setModel(ObjProd3.MuestroDroga()); 
        ListaCat.setModel(ObjProd3.MuestroCat()); 
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);              
        this.BtnActualizar.setVisible(false);
        this.BtnBaja.setVisible(false);
        this.BtnModif.setVisible(false);
        this.PanelProductos.setVisible(false);            
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrTipoVta = new javax.swing.ButtonGroup();
        PnlPrincipal = new javax.swing.JPanel();
        PnlTitulo = new javax.swing.JPanel();
        LblProductos = new javax.swing.JLabel();
        PnlCuerpo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaLaboratorio = new javax.swing.JList<>();
        LblLaboratorio = new javax.swing.JLabel();
        LblDroga = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaDroga = new javax.swing.JList<>();
        LblNom = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        LblPrecio = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        LblCantidad = new javax.swing.JLabel();
        TxtCantidad = new javax.swing.JTextField();
        LblPrecioCosto = new javax.swing.JLabel();
        TxtPrecioCosto = new javax.swing.JTextField();
        LblEnvase = new javax.swing.JLabel();
        CbEnvase = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        RbtnLibre = new javax.swing.JRadioButton();
        RbtnReceta = new javax.swing.JRadioButton();
        DateFechaVto = new com.toedter.calendar.JDateChooser();
        TxtFechaVto = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaCat = new javax.swing.JList<>();
        LblCategoria = new javax.swing.JLabel();
        PlnBotones = new javax.swing.JPanel();
        BtnAlta = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        BtnModif = new javax.swing.JButton();
        BtnConsulta = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        PanelProductos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaProducto = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        PnlPrincipal.setBackground(new java.awt.Color(255, 153, 102));

        PnlTitulo.setBackground(new java.awt.Color(255, 153, 102));

        LblProductos.setText("PRODUCTOS");

        javax.swing.GroupLayout PnlTituloLayout = new javax.swing.GroupLayout(PnlTitulo);
        PnlTitulo.setLayout(PnlTituloLayout);
        PnlTituloLayout.setHorizontalGroup(
            PnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTituloLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(LblProductos)
                .addContainerGap(377, Short.MAX_VALUE))
        );
        PnlTituloLayout.setVerticalGroup(
            PnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblProductos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PnlCuerpo.setBackground(new java.awt.Color(255, 153, 102));

        jScrollPane1.setViewportView(ListaLaboratorio);

        LblLaboratorio.setText("LABORATORIO");

        LblDroga.setText("DROGA");

        jScrollPane3.setViewportView(ListaDroga);

        LblNom.setText("NOMBRE COMERCIAL");

        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        LblPrecio.setText("PRECIO");

        TxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrecioKeyTyped(evt);
            }
        });

        LblCantidad.setText("CANTIDAD");

        TxtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCantidadKeyTyped(evt);
            }
        });

        LblPrecioCosto.setText("PRECIO COSTO");

        TxtPrecioCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioCostoActionPerformed(evt);
            }
        });
        TxtPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrecioCostoKeyTyped(evt);
            }
        });

        LblEnvase.setText("ENVASE");

        CbEnvase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caja", "Frasco" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Venta"));
        jPanel1.setName(""); // NOI18N

        BtnGrTipoVta.add(RbtnLibre);
        RbtnLibre.setSelected(true);
        RbtnLibre.setText("Venta Libre");

        BtnGrTipoVta.add(RbtnReceta);
        RbtnReceta.setText("Venta conReceta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RbtnLibre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RbtnReceta)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(RbtnLibre)
                .addGap(18, 18, 18)
                .addComponent(RbtnReceta)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TxtFechaVto.setText("FECHA DE VENCIMIENTO");

        jScrollPane4.setViewportView(ListaCat);

        LblCategoria.setText("CATEGORIA");

        javax.swing.GroupLayout PnlCuerpoLayout = new javax.swing.GroupLayout(PnlCuerpo);
        PnlCuerpo.setLayout(PnlCuerpoLayout);
        PnlCuerpoLayout.setHorizontalGroup(
            PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCuerpoLayout.createSequentialGroup()
                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlCuerpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlCuerpoLayout.createSequentialGroup()
                                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblLaboratorio)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlCuerpoLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(LblDroga)
                                        .addGap(72, 72, 72)
                                        .addComponent(LblCategoria))
                                    .addGroup(PnlCuerpoLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PnlCuerpoLayout.createSequentialGroup()
                                .addComponent(LblNom)
                                .addGap(57, 57, 57)
                                .addComponent(LblEnvase)
                                .addGap(72, 72, 72)
                                .addComponent(LblPrecio))))
                    .addGroup(PnlCuerpoLayout.createSequentialGroup()
                        .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlCuerpoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCantidad)
                            .addGroup(PnlCuerpoLayout.createSequentialGroup()
                                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblPrecioCosto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtFechaVto)
                                    .addComponent(DateFechaVto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PnlCuerpoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PnlCuerpoLayout.setVerticalGroup(
            PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCuerpoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblLaboratorio)
                    .addComponent(LblDroga)
                    .addComponent(LblCategoria))
                .addGap(18, 18, 18)
                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlCuerpoLayout.createSequentialGroup()
                        .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnlCuerpoLayout.createSequentialGroup()
                                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblPrecioCosto)
                                    .addComponent(TxtFechaVto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DateFechaVto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNom)
                    .addComponent(LblEnvase)
                    .addComponent(LblPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PlnBotones.setBackground(new java.awt.Color(255, 153, 102));

        BtnAlta.setText("ALTA");
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });

        BtnBaja.setText("BAJA");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });

        BtnModif.setText("MODIFICAR");
        BtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifActionPerformed(evt);
            }
        });

        BtnConsulta.setText("CONSULTA");
        BtnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultaActionPerformed(evt);
            }
        });

        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlnBotonesLayout = new javax.swing.GroupLayout(PlnBotones);
        PlnBotones.setLayout(PlnBotonesLayout);
        PlnBotonesLayout.setHorizontalGroup(
            PlnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlnBotonesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BtnAlta)
                .addGap(18, 18, 18)
                .addComponent(BtnBaja)
                .addGap(18, 18, 18)
                .addComponent(BtnModif)
                .addGap(18, 18, 18)
                .addComponent(BtnConsulta)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEliminar)
                .addGap(26, 26, 26)
                .addComponent(BtnSalir)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlnBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnActualizar)
                .addGap(315, 315, 315))
        );
        PlnBotonesLayout.setVerticalGroup(
            PlnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlnBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAlta)
                    .addComponent(BtnBaja)
                    .addComponent(BtnModif)
                    .addComponent(BtnConsulta)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnSalir))
                .addGap(18, 18, 18)
                .addComponent(BtnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelProductos.setBackground(new java.awt.Color(255, 153, 102));
        PanelProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUCTOS"));

        jScrollPane2.setViewportView(ListaProducto);

        javax.swing.GroupLayout PanelProductosLayout = new javax.swing.GroupLayout(PanelProductos);
        PanelProductos.setLayout(PanelProductosLayout);
        PanelProductosLayout.setHorizontalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelProductosLayout.setVerticalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlnBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(PnlCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(PanelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addComponent(PnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(PanelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(PlnBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
        
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        SoloLetras(evt);
    }//GEN-LAST:event_TxtNomKeyTyped

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        NomLab = this.ListaLaboratorio.getSelectedValue();//tomo el laboratorio
        NomDroga = this.ListaDroga.getSelectedValue();//tomo la droga
        NomCat = this.ListaCat.getSelectedValue();//tomo la catgoria
        NomCom = this.TxtNom.getText();
        PrecioLista = Double.parseDouble(this.TxtPrecio.getText());
        PrecioCosto = Double.parseDouble(this.TxtPrecioCosto.getText());
        Cantidad = Integer.parseInt(this.TxtCantidad.getText());
        Envase = this.CbEnvase.getSelectedItem().toString();
        //TipoVta = ///
        if (RbtnReceta.isSelected()) 
        {
            TipoVta = 'R';
        }
        else
        {
            TipoVta = 'L';
        }
        Date FechaVto = this.DateFechaVto.getDate();      
        
        if (NomLab.isEmpty() || NomDroga.isEmpty() || NomCom.isEmpty() || this.TxtPrecio.getText().isEmpty() || this.TxtPrecioCosto.getText().isEmpty() || this.TxtCantidad.getText().isEmpty() || Envase.isEmpty() || FechaVto.toString().isEmpty()) // pregunto si hay algun campo sin completar
        {
            JOptionPane.showMessageDialog(null, "Debe completar todos los datos");
            Limpiar();
        } 
        else 
        {
           int IdLab = ObjProd3.BuscoId(NomLab); // trae el id del laboratorio elegido
           int IdDroga = ObjProd3.BuscoIdDroga(NomDroga);
           int IdCat = ObjProd3.BuscoIdCat(NomCat);
           java.sql.Date SqlFechaVto = ConvertirASql(FechaVto);
           ObjProd2 = new AbmProductos(NomCom, PrecioLista, SqlFechaVto, Cantidad, Envase, TipoVta, PrecioCosto, IdCat, IdLab, IdDroga); 
           ObjProd2.Alta(IdLab,IdCat, IdDroga); //voy al metodo alta con el id del laboratorio
           Limpiar();           
         }
    }//GEN-LAST:event_BtnAltaActionPerformed

    private java.sql.Date ConvertirASql(java.util.Date FechaDelFormulario) 
    {
        java.sql.Date SqlFechaConvertida = new java.sql.Date(FechaDelFormulario.getTime()); 
        return SqlFechaConvertida;
    }
    
    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        this.BtnModif.setVisible(false);
        this.BtnConsulta.setVisible(false);
        Ocultar();
        this.BtnCancelar.setVisible(true);
        this.BtnEliminar.setVisible(true);        
        this.BtnBaja.setVisible(false);
        
        NomProductoBorrar = this.ListaProducto.getSelectedValue();

    }//GEN-LAST:event_BtnBajaActionPerformed

    private void BtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifActionPerformed
        this.BtnBaja.setVisible(false);
        this.BtnCancelar.setVisible(true);
        this.BtnActualizar.setVisible(true);
        this.BtnModif.setVisible(false);
        this.BtnConsulta.setVisible(false);
        Ocultar();
        NomViejo = this.ListaProducto.getSelectedValue();
        this.PnlCuerpo.setVisible(true);
        this.TxtNom.setText(NomViejo); // debe traer todo el registro
        TraerDatos(NomViejo);
    //    this.LblNom.setVisible(true);
    //    this.TxtNom.setVisible(true); 
    }//GEN-LAST:event_BtnModifActionPerformed

    
    private void TraerDatos(String NombreProd)
    {
       boolean  z1 =   ObjProd3.Buscar(NombreProd);
         if (z1  == true) 
         {
             Visible();
             this.TxtNom.setText(ObjProd3.getNom());
             this.TxtPrecio.setText(String.valueOf(ObjProd3.getPrecioLista()));
             this.TxtPrecioCosto.setText(String.valueOf(ObjProd3.getPrecioCosto()));
             this.TxtCantidad.setText(String.valueOf(ObjProd3.getCantExis()));
             this.DateFechaVto.setDate(ObjProd3.getFechaVto());
             this.CbEnvase.setSelectedItem(ObjProd3.getEnvase());
          // FALTAN LOS ID  
          int IdcatBuscoNombre = ObjProd3.getVaridCatDevuelvo();
          String NomCatDevuelto = ObjProd3.BuscoNomCat(IdcatBuscoNombre);
          this.ListaCat.setSelectedValue(NomCatDevuelto,true);

          int IdLabBuscoNombre = ObjProd3.getVaridLabDevuelvo();
          String NomLabDevuelto = ObjProd3.BuscoNomLab(IdLabBuscoNombre);
          this.ListaLaboratorio.setSelectedValue(NomLabDevuelto,true);

          int IdDrogaBuscoNombre = ObjProd3.getVaridDrogaDevuelvo();
          String NomDrogaDevuelto = ObjProd3.BuscoNomDroga(IdDrogaBuscoNombre);
          this.ListaDroga.setSelectedValue(NomDrogaDevuelto,true);
          
     //     this.ListaCat.setSelectedValue(ObjProd3.getVaridCatDevuelvo(),true);
            if (String.valueOf(ObjProd3.getTipoVta()).equalsIgnoreCase("R") )
               {
                     this.RbtnReceta.isSelected();
               }
            else
                {
                      RbtnLibre.isSelected();
                }
             this.BtnActualizar.setVisible(true);
             this.BtnCancelar.setVisible(true);
         }
        
    }
    
    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        String NomNuevo = this.TxtNom.getText();
        NomLab = this.ListaLaboratorio.getSelectedValue();//tomo el laboratorio
        NomDroga = this.ListaDroga.getSelectedValue();//tomo la droga
        NomCat = this.ListaCat.getSelectedValue();//tomo la catgoria
        double PreListNuevo = Double.parseDouble(this.TxtPrecio.getText());
        double PreCosto = Double.parseDouble(this.TxtPrecioCosto.getText());
        int Cant = Integer.parseInt(this.TxtCantidad.getText());
        String EnvaseNuevo = this.CbEnvase.getSelectedItem().toString();
        char TipoVtaNuevo = ' ';
        if (RbtnReceta.isSelected()) 
        {
            TipoVtaNuevo = 'R';
        }
        else
        {
            TipoVtaNuevo = 'L';
        }
        Date FechaVtoNueva = this.DateFechaVto.getDate();      
           int idLabNuevo = ObjProd3.BuscoId(NomLab); // trae el id del laboratorio elegido
           int idDroNuevo = ObjProd3.BuscoIdDroga(NomDroga);
           int idCatNuevo = ObjProd3.BuscoIdCat(NomCat);
           java.sql.Date SqlFechaVtoNueva = ConvertirASql(FechaVtoNueva);               
      //  ObjProd2 = new AbmProductos(NomViejo); // debe llevar todos los datos
        ObjProd3.Modif(NomNuevo, PreListNuevo, SqlFechaVtoNueva, Cant, EnvaseNuevo, TipoVtaNuevo, PreCosto, idCatNuevo, idLabNuevo, idDroNuevo); // llevar todos los datos
        Limpiar(); 
        Visible();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int z = JOptionPane.showConfirmDialog(null, "Esta seguro ?");
        if ( z == 0) 
        {
           // ObjDroga2 = new AbmDroga();
            ObjProd3.setNom(NomProductoBorrar);
            ObjProd3.Baja();
//            this.TxtNom.setText(null);
           // ObjDroga2 = new AbmDroga();
  //          ListaProducto.setModel(ObjProd3.MuestroProducto());
            Visible();
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
       Visible();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultaActionPerformed
        this.PanelProductos.setVisible(true);
        this.BtnModif.setVisible(true);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);        
        this.BtnBaja.setVisible(true);
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(true);

        this.PnlCuerpo.setVisible(false);
        ListaProducto.setModel(ObjProd3.MuestroProducto()); 

    }//GEN-LAST:event_BtnConsultaActionPerformed

    private void TxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrecioKeyTyped
        SoloNumeros(evt);
    }//GEN-LAST:event_TxtPrecioKeyTyped

    private void TxtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCantidadKeyTyped
        SoloNumeros(evt);
    }//GEN-LAST:event_TxtCantidadKeyTyped

    private void TxtPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrecioCostoKeyTyped
        SoloNumeros(evt);
    }//GEN-LAST:event_TxtPrecioCostoKeyTyped

    private void TxtPrecioCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioCostoActionPerformed
    
    private void Ocultar()
    {
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(false);   
        this.LblNom.setVisible(false);
        this.TxtNom.setVisible(false);

        
    }
  
     private void Visible()
    {
        this.BtnActualizar.setVisible(false);
        this.BtnConsulta.setVisible(true);
        this.BtnModif.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);        
        this.BtnBaja.setVisible(false);
        this.BtnAlta.setVisible(true);
        this.BtnSalir.setVisible(true);
        this.PnlCuerpo.setVisible(true);
        this.PanelProductos.setVisible(false);

    }
    
    private void Limpiar()
    {
        this.TxtNom.setText(null);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConsulta;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.ButtonGroup BtnGrTipoVta;
    private javax.swing.JButton BtnModif;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CbEnvase;
    private com.toedter.calendar.JDateChooser DateFechaVto;
    private javax.swing.JLabel LblCantidad;
    private javax.swing.JLabel LblCategoria;
    private javax.swing.JLabel LblDroga;
    private javax.swing.JLabel LblEnvase;
    private javax.swing.JLabel LblLaboratorio;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblPrecio;
    private javax.swing.JLabel LblPrecioCosto;
    private javax.swing.JLabel LblProductos;
    private javax.swing.JList<String> ListaCat;
    private javax.swing.JList<String> ListaDroga;
    private javax.swing.JList<String> ListaLaboratorio;
    private javax.swing.JList<String> ListaProducto;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PlnBotones;
    private javax.swing.JPanel PnlCuerpo;
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JPanel PnlTitulo;
    private javax.swing.JRadioButton RbtnLibre;
    private javax.swing.JRadioButton RbtnReceta;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JLabel TxtFechaVto;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtPrecioCosto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
