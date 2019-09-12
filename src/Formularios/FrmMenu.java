package Formularios;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
        this.setTitle("ROMPECABEZAS");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEscritorio = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArt = new javax.swing.JMenu();
        ItemAbmCate = new javax.swing.JMenuItem();
        ItemAbmProd = new javax.swing.JMenuItem();
        ItemAbmLab = new javax.swing.JMenuItem();
        ItemAbmDroga = new javax.swing.JMenuItem();
        MenuCli = new javax.swing.JMenu();
        ItemClientes = new javax.swing.JMenuItem();
        MenuVta = new javax.swing.JMenu();
        ItemVentas = new javax.swing.JMenuItem();
        MenuVentaFecha = new javax.swing.JMenuItem();
        MenuDesdeHasta = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuArt.setMnemonic('a');
        MenuArt.setText("Articulos");

        ItemAbmCate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        ItemAbmCate.setText("Categoria");
        ItemAbmCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAbmCateActionPerformed(evt);
            }
        });
        MenuArt.add(ItemAbmCate);

        ItemAbmProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        ItemAbmProd.setText("Productos");
        ItemAbmProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAbmProdActionPerformed(evt);
            }
        });
        MenuArt.add(ItemAbmProd);

        ItemAbmLab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ItemAbmLab.setText("Laboratorios");
        ItemAbmLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAbmLabActionPerformed(evt);
            }
        });
        MenuArt.add(ItemAbmLab);

        ItemAbmDroga.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        ItemAbmDroga.setText("Droga");
        ItemAbmDroga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAbmDrogaActionPerformed(evt);
            }
        });
        MenuArt.add(ItemAbmDroga);

        BarraMenu.add(MenuArt);

        MenuCli.setMnemonic('c');
        MenuCli.setText("Cliente");
        MenuCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCliActionPerformed(evt);
            }
        });

        ItemClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ItemClientes.setText("ABM Clientes");
        ItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemClientesActionPerformed(evt);
            }
        });
        MenuCli.add(ItemClientes);

        BarraMenu.add(MenuCli);

        MenuVta.setMnemonic('v');
        MenuVta.setText("Venta");
        MenuVta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVtaActionPerformed(evt);
            }
        });

        ItemVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        ItemVentas.setText("Ingreso de Ventas");
        ItemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVentasActionPerformed(evt);
            }
        });
        MenuVta.add(ItemVentas);

        MenuVentaFecha.setText("Consultas de fechas por venta");
        MenuVentaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVentaFechaActionPerformed(evt);
            }
        });
        MenuVta.add(MenuVentaFecha);

        MenuDesdeHasta.setText("Ventas Desde Hasta");
        MenuDesdeHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDesdeHastaActionPerformed(evt);
            }
        });
        MenuVta.add(MenuDesdeHasta);

        BarraMenu.add(MenuVta);

        MenuSalir.setMnemonic('s');
        MenuSalir.setText("Salir");
        BarraMenu.add(MenuSalir);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemAbmCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAbmCateActionPerformed
       FrmCategoria Cat = new FrmCategoria();
        PanelEscritorio.add(Cat);
        Cat.show();
    }//GEN-LAST:event_ItemAbmCateActionPerformed

    private void ItemAbmProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAbmProdActionPerformed
        FrmProductos Prod = new FrmProductos();
    //FrmLista Prod = new FrmLista();
        PanelEscritorio.add(Prod);
        Prod.show();
    }//GEN-LAST:event_ItemAbmProdActionPerformed

    private void MenuCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCliActionPerformed
 
    }//GEN-LAST:event_MenuCliActionPerformed

    private void MenuVtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVtaActionPerformed

    }//GEN-LAST:event_MenuVtaActionPerformed

    private void ItemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVentasActionPerformed
         FrmVentas Vta = new FrmVentas();
        //FrmFecha Vta = new FrmFecha();
        PanelEscritorio.add(Vta);
        Vta.show();
    }//GEN-LAST:event_ItemVentasActionPerformed

    private void ItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemClientesActionPerformed
       FrmClientes Cli = new FrmClientes();
       PanelEscritorio.add(Cli);
       Cli.show();
    }//GEN-LAST:event_ItemClientesActionPerformed

    private void ItemAbmLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAbmLabActionPerformed
       FrmLaboratorio Lab = new FrmLaboratorio();
       PanelEscritorio.add(Lab);
       Lab.show();       
    }//GEN-LAST:event_ItemAbmLabActionPerformed

    private void ItemAbmDrogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAbmDrogaActionPerformed
       FrmDroga Droga = new FrmDroga();
       PanelEscritorio.add(Droga);
       Droga.show(); 
    }//GEN-LAST:event_ItemAbmDrogaActionPerformed

    private void MenuVentaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVentaFechaActionPerformed
        FrmConsultaFecha Venta = new  FrmConsultaFecha();
       PanelEscritorio.add(Venta);
       Venta.show(); 
    }//GEN-LAST:event_MenuVentaFechaActionPerformed

    private void MenuDesdeHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDesdeHastaActionPerformed
        FrmDesdeHastaVta VtaDesdeHasta = new  FrmDesdeHastaVta();
       PanelEscritorio.add( VtaDesdeHasta);
        VtaDesdeHasta.show(); 
    }//GEN-LAST:event_MenuDesdeHastaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem ItemAbmCate;
    private javax.swing.JMenuItem ItemAbmDroga;
    private javax.swing.JMenuItem ItemAbmLab;
    private javax.swing.JMenuItem ItemAbmProd;
    private javax.swing.JMenuItem ItemClientes;
    private javax.swing.JMenuItem ItemVentas;
    private javax.swing.JMenu MenuArt;
    private javax.swing.JMenu MenuCli;
    private javax.swing.JMenuItem MenuDesdeHasta;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenuItem MenuVentaFecha;
    private javax.swing.JMenu MenuVta;
    private javax.swing.JDesktopPane PanelEscritorio;
    // End of variables declaration//GEN-END:variables

}
