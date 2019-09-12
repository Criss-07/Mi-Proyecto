
package Formularios;

import java.util.Date; // esta es para el formulario
import java.text.DateFormat;
import java.text.SimpleDateFormat; // Depende pura y exclusivamente del DateFormat
import Desarrollo.AbmFechas;
import java.time.LocalDate;
import javax.swing.JOptionPane;

class FrmFecha extends javax.swing.JInternalFrame {
Date VarFechaInicio, VarFechaFin, VarFechaActual;
AbmFechas ObjFechas;

    public FrmFecha() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JFecha = new com.toedter.calendar.JDateChooser();
        BtnFecha = new org.edisoncor.gui.button.ButtonAero();
        LblFecha = new org.edisoncor.gui.label.LabelRound();
        MostrarFecha = new org.edisoncor.gui.label.LabelRound();
        LblFecha2 = new org.edisoncor.gui.label.LabelRound();
        jPanel1 = new javax.swing.JPanel();
        LblFechaInicio = new javax.swing.JLabel();
        LblFechaFin = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        JFechaInicio = new com.toedter.calendar.JDateChooser();
        JFechaFin = new com.toedter.calendar.JDateChooser();
        JFechaActual = new com.toedter.calendar.JDateChooser();

        BtnFecha.setText("ACEPTAR");
        BtnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFechaActionPerformed(evt);
            }
        });

        LblFecha.setText("Fecha");

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SOLO PARA GRABAR EN BASE DE DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        LblFechaInicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblFechaInicio.setText("FECHA INICIO");

        LblFechaFin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblFechaFin.setText("FECHA FIN");

        BtnIngresar.setText("INGRESAR");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        JFechaInicio.setDateFormatString("yyyy/MM/dd");

        JFechaFin.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(LblFechaInicio)
                                .addGap(180, 180, 180)
                                .addComponent(LblFechaFin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(JFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFechaFin)
                    .addComponent(LblFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnIngresar)
                    .addComponent(JFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MostrarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LblFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(MostrarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LblFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFechaActionPerformed

       Date Fecha2 = this.JFecha.getDate(); // Devuelve un tipo de dato Date
       DateFormat ObjFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
       

       this.LblFecha2.setText(ObjFormatoFecha.format(Fecha2).toString()); // lo convierto a string por el Label
       System.out.println(ObjFormatoFecha.format(Fecha2));
       System.out.println("tal como lo recibe " + Fecha2);
       
    }//GEN-LAST:event_BtnFechaActionPerformed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
       VarFechaInicio = this.JFechaInicio.getDate(); // Devuelve un tipo de dato Date (necesito de la clase util.Date)
       VarFechaFin = this.JFechaFin.getDate();
       VarFechaActual = this.JFechaActual.getDate();
       
       java.sql.Date SqlFechaInicio = ConvertirASql(VarFechaInicio);
       java.sql.Date SqlFechaFin = ConvertirASql(VarFechaFin);
       java.sql.Date SqlFechaActual = ConvertirASql(VarFechaActual);
        
/*       
       LocalDate Hoy = LocalDate.now();
       java.sql.Date SqlFechaActual = java.sql.Date.valueOf( Hoy ); // debo convertirlo asi porque es una clase LocalDate y esta tiene el metodo para tomar la fecha del dia
*/       

       ObjFechas = new AbmFechas(SqlFechaActual, SqlFechaInicio, SqlFechaFin); // los necesito de la clase sql.date
       ObjFechas.Alta();
    }//GEN-LAST:event_BtnIngresarActionPerformed
    
    private java.sql.Date ConvertirASql(java.util.Date FechaDelFormulario) 
    {
        java.sql.Date SqlFechaConvertida = new java.sql.Date(FechaDelFormulario.getTime()); //util.date toma fecha y hora por eso va gettime, pero en este ehercicio en sql puse solo date
        return SqlFechaConvertida;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAero BtnFecha;
    private javax.swing.JButton BtnIngresar;
    private com.toedter.calendar.JDateChooser JFecha;
    private com.toedter.calendar.JDateChooser JFechaActual;
    private com.toedter.calendar.JDateChooser JFechaFin;
    private com.toedter.calendar.JDateChooser JFechaInicio;
    private org.edisoncor.gui.label.LabelRound LblFecha;
    private org.edisoncor.gui.label.LabelRound LblFecha2;
    private javax.swing.JLabel LblFechaFin;
    private javax.swing.JLabel LblFechaInicio;
    private org.edisoncor.gui.label.LabelRound MostrarFecha;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
