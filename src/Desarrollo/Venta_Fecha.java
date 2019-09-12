package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Venta_Fecha 
{
    
     public Venta_Fecha() 
     {
         
     }

    
    
  PreparedStatement Instruccion;    
  ResultSet Muestra;
  Conexion z = new Conexion();
    
 
  private String ListaVtaFecha = "select vta.FechaVta, vta.TotPagar, cli.NomCli from venta as  vta inner join cliente as cli on vta.cliente_idcliente = cli.idcliente;"; 
  DefaultTableModel ModeloTablaFecha;
  String [] Titulos  = {"Fecha Venta", "Total de Venta", "Cliente"};
  String [] [] Datos;
 
  public DefaultTableModel Titulos()
  {
      ModeloTablaFecha = new DefaultTableModel(Datos, Titulos);
      return ModeloTablaFecha;
  }
  
  public DefaultTableModel MuestraVtaFecha()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaVtaFecha);
            Muestra = Instruccion.executeQuery();
            //String [] VecTabla = {};
            while   (Muestra.next())
            {
                String Fecha = String.valueOf(Muestra.getDate(1));
                String Total = String.valueOf(Muestra.getDouble(2));
                String Cliente = Muestra.getString(3);        
                String [] VecTabla = {Fecha, Total, Cliente};
                ModeloTablaFecha.addRow(VecTabla);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloTablaFecha;

    }

}