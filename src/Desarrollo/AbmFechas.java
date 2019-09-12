
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;

public class AbmFechas 
{
    
    private Date FechaActual;
    private Date FechaInicio;
    private Date FechaFin;

    public AbmFechas(Date FechaActual, Date FechaInicio, Date FechaFin) {
        this.FechaActual = FechaActual;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }
    
    
    
    private String AltaSql = "INSERT INTO solofecha (FechaInicio, FechaFin,FechaActual) VALUES (?,?,?);";
    PreparedStatement Instruccion;    
    ResultSet Muestra;

    Conexion z = new Conexion();

    public Date getFechaActual() {
        return FechaActual;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }
   
    public void Alta()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(AltaSql);            
            Instruccion.setDate(1, this.getFechaInicio());
            Instruccion.setDate(2, this.getFechaFin());
            Instruccion.setDate(3, this.getFechaActual());            
             int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                z.MeConecto().close();
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No pudo ingresar los datos");
        }
    }
    
}
