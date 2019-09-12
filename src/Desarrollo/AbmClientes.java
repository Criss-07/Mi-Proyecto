package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AbmClientes 
{

    private String Nom;
    private String ConsultaSql = "SELECT * FROM cliente;";     
    private String AltaSql = "INSERT INTO cliente (NomCli) VALUES (?);";
    private String Borrar = "DELETE FROM cliente WHERE NomCli = (?);";    
    
    
    DefaultListModel ModeloListacliente = new DefaultListModel();
    PreparedStatement Instruccion;    
    ResultSet Muestra;

    Conexion z = new Conexion();
    
    public AbmClientes(String Nom) {
        this.Nom = Nom;
    }

    public AbmClientes() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    public void Alta()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(AltaSql);            
            Instruccion.setString(1, this.getNom());
            
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
    
    public void Baja()
    {
          try 
        {
            Instruccion = z.MeConecto().prepareStatement(Borrar);
            Instruccion.setString(1, this.getNom());
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al querer borrar un registro " + e);
        }      
    }
    
    public void Modif(String NomNuevo)
    {
        
        String Cambia ="UPDATE cliente SET  NomCli = '"+ NomNuevo+"' WHERE NomCli = '"+ this.getNom() +"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(Cambia);
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al querer modificar un registro " + e );
        }       
    }
    
    
    
    public DefaultListModel Muestro()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ConsultaSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
           //     System.out.println( Muestra.getString(2));
                ModeloListacliente.addElement(Muestra.getString(2));
            }           
            
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        
        return ModeloListacliente;
        
    }
}
