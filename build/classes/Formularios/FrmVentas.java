
package Formularios;
import Desarrollo.AbmVentas;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmVentas extends javax.swing.JInternalFrame {
AbmVentas  ObjVta3;
AbmVentas  ObjDetalleVta4;
AbmVentas ObjDetVta5=new AbmVentas();
Date FechaVta;
char TipoVta = ' ';
char TipoFPago = ' ';
String NroAfi = null;
String NomOSocial = null;
String NomCli = null;
String NomVend = null;
double VarSubtotal = 0;
double VarDescuento = 0;
double VarInteres = 0;
double VarTotal = 0;
final double PorDes = 1.10;
final double PorInt = 1.10;
DefaultTableModel ModeloTablaProductos;
String [] Titulos = {"PRODUCTO", "PRECIO UNITARIO", "CANTIDAD", "IMPORTE"};
String [] [] Datos;
double pu = 0;
double Cant = 0;
double Importe = 0;
String Producto = null;
DecimalFormat d = new DecimalFormat ("#0.00");

ArrayList <String> NomProd=new ArrayList<String>();
ArrayList <Double> precio=new ArrayList<Double>();
ArrayList <Integer> Cat=new ArrayList<Integer>();


    public FrmVentas() {
        initComponents();
        ObjVta3 = new AbmVentas();
        ListaClientes.setModel(ObjVta3.MuestroCli());
        ListaVendedor.setModel(ObjVta3.MuestroVend());
        this.ChkDto.setVisible(false);
        this.ChkInt.setVisible(false);
        ModeloTablaProductos = new DefaultTableModel(Datos, Titulos);
        this.TablaVentas.setModel(ModeloTablaProductos);
        CargarProductos();
    }
private void CargarProductos()
{
    this.CbProducto.setModel(ObjVta3.CargarComboProductos());
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTipoVta = new javax.swing.ButtonGroup();
        GrupoFPago = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        PanelCuerpo = new javax.swing.JPanel();
        LblFecha = new javax.swing.JLabel();
        DateFecha = new com.toedter.calendar.JDateChooser();
        PanelTipoVta = new javax.swing.JPanel();
        RbOSocial = new javax.swing.JRadioButton();
        RbPart = new javax.swing.JRadioButton();
        PanelFPago = new javax.swing.JPanel();
        RbEfectivo = new javax.swing.JRadioButton();
        RbDebito = new javax.swing.JRadioButton();
        RbCredito = new javax.swing.JRadioButton();
        LblOSocial = new javax.swing.JLabel();
        LblAfiliado = new javax.swing.JLabel();
        TxtOSocial = new javax.swing.JTextField();
        TxtAfiliado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtSubTotal = new javax.swing.JTextField();
        TxtDescuento = new javax.swing.JTextField();
        TxtInteres = new javax.swing.JTextField();
        LblTotal = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        LblClientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();
        LblVendedor = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaVendedor = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        ChkDto = new javax.swing.JCheckBox();
        ChkInt = new javax.swing.JCheckBox();
        PanelProductos = new javax.swing.JPanel();
        LblProducto = new javax.swing.JLabel();
        CbProducto = new javax.swing.JComboBox<>();
        LblPu = new javax.swing.JLabel();
        LblCant = new javax.swing.JLabel();
        TxtPu = new javax.swing.JTextField();
        TxtCant = new javax.swing.JTextField();
        BtnCargar = new javax.swing.JButton();
        PanelBotones = new javax.swing.JPanel();
        BtnIngreso = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        PanelTitulos = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ventas");

        PanelPrincipal.setBackground(new java.awt.Color(204, 153, 0));

        PanelCuerpo.setBackground(new java.awt.Color(255, 153, 0));

        LblFecha.setText("FECHA");

        PanelTipoVta.setBackground(new java.awt.Color(255, 153, 51));
        PanelTipoVta.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO DE VENTA"));

        GrupoTipoVta.add(RbOSocial);
        RbOSocial.setSelected(true);
        RbOSocial.setText("Obra Social");

        GrupoTipoVta.add(RbPart);
        RbPart.setText("Particular");

        javax.swing.GroupLayout PanelTipoVtaLayout = new javax.swing.GroupLayout(PanelTipoVta);
        PanelTipoVta.setLayout(PanelTipoVtaLayout);
        PanelTipoVtaLayout.setHorizontalGroup(
            PanelTipoVtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTipoVtaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelTipoVtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbOSocial)
                    .addComponent(RbPart))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelTipoVtaLayout.setVerticalGroup(
            PanelTipoVtaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTipoVtaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(RbOSocial)
                .addGap(18, 18, 18)
                .addComponent(RbPart)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PanelFPago.setBackground(new java.awt.Color(255, 204, 102));
        PanelFPago.setBorder(javax.swing.BorderFactory.createTitledBorder("FORMA DE PAGO"));

        GrupoFPago.add(RbEfectivo);
        RbEfectivo.setText("Efectivo");
        RbEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbEfectivoMouseClicked(evt);
            }
        });

        GrupoFPago.add(RbDebito);
        RbDebito.setText("Tarjeta de Débito");
        RbDebito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbDebitoMouseClicked(evt);
            }
        });

        GrupoFPago.add(RbCredito);
        RbCredito.setText("Tarjeta de Crédito");
        RbCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbCreditoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelFPagoLayout = new javax.swing.GroupLayout(PanelFPago);
        PanelFPago.setLayout(PanelFPagoLayout);
        PanelFPagoLayout.setHorizontalGroup(
            PanelFPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFPagoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelFPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbCredito)
                    .addComponent(RbDebito)
                    .addComponent(RbEfectivo))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        PanelFPagoLayout.setVerticalGroup(
            PanelFPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RbEfectivo)
                .addGap(14, 14, 14)
                .addComponent(RbDebito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(RbCredito)
                .addContainerGap())
        );

        LblOSocial.setText("OBRA SOCIAL");

        LblAfiliado.setText("NRO DE AFILIADO");

        TxtOSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtOSocialKeyTyped(evt);
            }
        });

        TxtAfiliado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtAfiliadoKeyTyped(evt);
            }
        });

        jLabel1.setText("SUBTOTAL");

        jLabel2.setText("DESCUENTO");

        jLabel3.setText("INTERES");

        LblTotal.setText("TOTAL");

        LblClientes.setText("CLIENTES");

        jScrollPane1.setViewportView(ListaClientes);

        LblVendedor.setText("VENDEDOR");

        jScrollPane2.setViewportView(ListaVendedor);

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaVentas);

        ChkDto.setText("Descuento 10 %");

        ChkInt.setText("Interes 10 %");

        PanelProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("CARGA DE PRODUCTOS"));

        LblProducto.setText("PRODUCTOS");

        CbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbProductoMouseClicked(evt);
            }
        });
        CbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbProductoActionPerformed(evt);
            }
        });

        LblPu.setText("PRECIO UNITARIO");

        LblCant.setText("CANTIDAD");

        BtnCargar.setText("CARGAR");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProductosLayout = new javax.swing.GroupLayout(PanelProductos);
        PanelProductos.setLayout(PanelProductosLayout);
        PanelProductosLayout.setHorizontalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(LblProducto))
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TxtPu))
                    .addComponent(LblPu))
                .addGap(26, 26, 26)
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtCant)
                    .addComponent(LblCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProductosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnCargar)
                .addGap(109, 109, 109))
        );
        PanelProductosLayout.setVerticalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblProducto)
                    .addComponent(LblPu)
                    .addComponent(LblCant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(BtnCargar)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelCuerpoLayout = new javax.swing.GroupLayout(PanelCuerpo);
        PanelCuerpo.setLayout(PanelCuerpoLayout);
        PanelCuerpoLayout.setHorizontalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelTipoVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(LblClientes))
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(PanelFPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(LblOSocial))
                                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtOSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(LblAfiliado)
                                                .addComponent(TxtAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(LblVendedor))))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47)
                                .addComponent(LblTotal))))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(ChkDto)
                        .addGap(18, 18, 18)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                                .addComponent(TxtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ChkInt)))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addComponent(PanelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PanelCuerpoLayout.setVerticalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTipoVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelFPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkDto)
                    .addComponent(ChkInt))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(LblTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addComponent(LblOSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtOSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(LblAfiliado))
                    .addComponent(PanelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCuerpoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        PanelBotones.setBackground(new java.awt.Color(204, 153, 0));

        BtnIngreso.setText("INGRESO");
        BtnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BtnIngreso)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelar)
                .addGap(18, 18, 18)
                .addComponent(BtnSalir)
                .addContainerGap(737, Short.MAX_VALUE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIngreso)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnSalir))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        PanelTitulos.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout PanelTitulosLayout = new javax.swing.GroupLayout(PanelTitulos);
        PanelTitulos.setLayout(PanelTitulosLayout);
        PanelTitulosLayout.setHorizontalGroup(
            PanelTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        PanelTitulosLayout.setVerticalGroup(
            PanelTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(PanelTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(PanelTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtAfiliadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAfiliadoKeyTyped
        SoloNumeros(evt);
    }//GEN-LAST:event_TxtAfiliadoKeyTyped

    private void TxtOSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOSocialKeyTyped
        SoloLetras(evt);
    }//GEN-LAST:event_TxtOSocialKeyTyped

    private void BtnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoActionPerformed
        NomCli = this.ListaClientes.getSelectedValue();//tomo el laboratorio
        NomVend = this.ListaVendedor.getSelectedValue();//tomo la droga
        NomOSocial = this.TxtOSocial.getText();
        NroAfi = this.TxtAfiliado.getText();
        if (RbPart.isSelected()) 
        {
            TipoVta = 'P';
        }
        else
        {
            TipoVta = 'O';
        }
        
       this.TxtSubTotal.setText(String.valueOf(VarSubtotal));
       this.TxtSubTotal.setEditable(false);       
       if (RbEfectivo.isSelected()) 
        {
            TipoFPago = 'E';
  //          this.ChkDto.setVisible(true);
            if (this.ChkDto.isSelected()) 
            {
               VarDescuento = VarSubtotal * PorDes;
               VarTotal = VarSubtotal - VarDescuento;
               this.TxtDescuento.setText(String.valueOf(VarDescuento));
               this.TxtDescuento.setEditable(false);
            } 
        }
        else
        {
            if (RbCredito.isSelected()) 
                {
                    TipoFPago = 'C';
                }
                else
                    {
                        TipoFPago = 'D';
                    }
          //  this.ChkInt.setVisible(true);
            if (this.ChkInt.isSelected()) 
                {
                    VarInteres = VarSubtotal * PorInt;
                    VarTotal = VarSubtotal + VarInteres;
                    this.TxtInteres.setText(String.valueOf(VarInteres));
                    this.TxtInteres.setEditable(false);
                } 
                else 
                    {
                        JOptionPane.showMessageDialog(null, "No se aplica interes a pago en Efectivo");
                        VarTotal = VarSubtotal;
                    }                    
        }
        this.TxtTotal.setText(String.valueOf(VarTotal));
        this.TxtTotal.setEditable(false);
        FechaVta = this.DateFecha.getDate();      

        if (NomCli.isEmpty() || NomVend.isEmpty() || NomOSocial.isEmpty() || this.NroAfi.isEmpty() || FechaVta.toString().isEmpty()) // pregunto si hay algun campo sin completar
        {
            JOptionPane.showMessageDialog(null, "Debe completar todos los datos");
            Limpiar();
        } 
        else 
        {
           int IdCli = ObjVta3.BuscoIdCli(NomCli); // trae el id del laboratorio elegido
           int IdVend = ObjVta3.BuscoIdVend(NomVend);
           java.sql.Date SqlFechaVta = ConvertirASql(FechaVta);
           ObjVta3 = new AbmVentas(SqlFechaVta, TipoVta, TipoFPago, NomOSocial, NroAfi, VarSubtotal, VarDescuento, VarInteres, VarTotal, IdCli, IdVend); 
           ObjVta3.Alta(IdCli,IdVend); //voy al metodo alta con el id del laboratorio
           Limpiar();  
            
           for (int i = 0; i < NomProd.size(); i++)
           {
            int DidProd = ObjDetVta5.BuscoidProducto(NomProd.get(i));   
            int DidCat = ObjDetVta5.BuscoidCategoria(NomProd.get(i));
            int DidVta = ObjDetVta5.BuscoidVtas();
           ObjDetalleVta4 = new AbmVentas(NomProd.get(i),precio.get(i), Cant.get(i),DidVta(corregir), DidProd, DidCat);
           ObjDetalleVta4.AltaDetalleVta();
      
           }
        }
        
        
    }//GEN-LAST:event_BtnIngresoActionPerformed

    private void RbEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbEfectivoMouseClicked
                 this.ChkDto.setVisible(true);
                 this.ChkInt.setVisible(false);
    }//GEN-LAST:event_RbEfectivoMouseClicked

    private void RbDebitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbDebitoMouseClicked
                 this.ChkDto.setVisible(false);
                 this.ChkInt.setVisible(true);
    }//GEN-LAST:event_RbDebitoMouseClicked

    private void RbCreditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbCreditoMouseClicked
                 this.ChkDto.setVisible(false);
                 this.ChkInt.setVisible(true);
    }//GEN-LAST:event_RbCreditoMouseClicked

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
     //   pu = Double.parseDouble(this.TxtPu.getText());
       Producto = this.CbProducto.getSelectedItem().toString();
        pu = ObjVta3.BuscoPrecioUnitario(Producto);
        Cant = Double.parseDouble(this.TxtCant.getText());
        Importe = Cant * pu;
        String [] ProductoComprado = {Producto, String.valueOf(pu), String.valueOf(Cant), String.valueOf(Importe)};
        ModeloTablaProductos.addRow(ProductoComprado);
        
        //solo para detalle de ventas
        NomProd.add(Producto);
        Cant.add(Integer.parseInt(this.TxtCant.getText()));
        precio.add(pu);
        //fin de la carga de detalle
        
        
        VarSubtotal = VarSubtotal + Importe;
        this.TxtSubTotal.setText(String.valueOf(VarSubtotal));
        this.TxtSubTotal.setEditable(false);
        //this.TxtPu.setText(null);
        this.TxtCant.setText(null);
        Importe = 0;
        
        
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void CbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbProductoMouseClicked
   //    Producto = this.CbProducto.getSelectedItem().toString();
   //     pu = ObjVta3.BuscoPrecioUnitario(Producto);
    }//GEN-LAST:event_CbProductoMouseClicked

    private void CbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbProductoActionPerformed

    private java.sql.Date ConvertirASql(java.util.Date FechaDelFormulario) 
    {
        java.sql.Date SqlFechaConvertida = new java.sql.Date(FechaDelFormulario.getTime()); 
        return SqlFechaConvertida;
    }
    
    private void Limpiar()
    {
        this.ChkDto.setVisible(false);
        this.ChkInt.setVisible(false);
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
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnIngreso;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CbProducto;
    private javax.swing.JCheckBox ChkDto;
    private javax.swing.JCheckBox ChkInt;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.ButtonGroup GrupoFPago;
    private javax.swing.ButtonGroup GrupoTipoVta;
    private javax.swing.JLabel LblAfiliado;
    private javax.swing.JLabel LblCant;
    private javax.swing.JLabel LblClientes;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblOSocial;
    private javax.swing.JLabel LblProducto;
    private javax.swing.JLabel LblPu;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JLabel LblVendedor;
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JList<String> ListaVendedor;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelCuerpo;
    private javax.swing.JPanel PanelFPago;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PanelTipoVta;
    private javax.swing.JPanel PanelTitulos;
    private javax.swing.JRadioButton RbCredito;
    private javax.swing.JRadioButton RbDebito;
    private javax.swing.JRadioButton RbEfectivo;
    private javax.swing.JRadioButton RbOSocial;
    private javax.swing.JRadioButton RbPart;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JTextField TxtAfiliado;
    private javax.swing.JTextField TxtCant;
    private javax.swing.JTextField TxtDescuento;
    private javax.swing.JTextField TxtInteres;
    private javax.swing.JTextField TxtOSocial;
    private javax.swing.JTextField TxtPu;
    private javax.swing.JTextField TxtSubTotal;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
