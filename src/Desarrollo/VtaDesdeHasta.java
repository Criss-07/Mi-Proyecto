package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class VtaDesdeHasta 
{
         private  Date Fdesde;
         private  Date Fhasta;

    public VtaDesdeHasta() {
    }

   
        public VtaDesdeHasta(Date Fdesde, Date Fhasta) {
        this.Fdesde = Fdesde;
        this.Fhasta = Fhasta;
    }

    public Date getFdesde() {
        return Fdesde;
    }

    public Date getFhasta() {
        return Fhasta;
    }
      
     

    
    
  PreparedStatement Instruccion;    
  ResultSet Muestra;
  Conexion z = new Conexion();  
  
  private String ListaDesdeHasta = "select vta.FechaVta, vta.TotPagar, vta.FPago, cli.NomCli from venta as  vta inner join cliente as cli on vta.cliente_idcliente = cli.idcliente where vta.FechaVta between '"+getFdesde()+"' and '"+getFhasta()+"';"; 
  DefaultTableModel ModeloTablaDesdeHasta;
  String [] Titulos  = {"Fecha Venta", "Total de Venta","Forma de pago", "Cliente"};
  String [] [] Datos;
 
  public DefaultTableModel Titulos()
  {
      ModeloTablaDesdeHasta= new DefaultTableModel(Datos, Titulos);
      return ModeloTablaDesdeHasta;
  }
  
  public DefaultTableModel MuestraVtaFecha()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaDesdeHasta);
            Muestra = Instruccion.executeQuery();
            //String [] VecTabla = {};
            while   (Muestra.next())
            {
                String Fecha = String.valueOf(Muestra.getDate(1));
                String Total = String.valueOf(Muestra.getDouble(2));
                String Fpago = String.valueOf(Muestra.getString(3).charAt(0));
                String Cliente = Muestra.getString(4);        
                String [] VecTabla = {Fecha, Total,Fpago,  Cliente};
                ModeloTablaDesdeHasta.addRow(VecTabla);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloTablaDesdeHasta;
    }
}