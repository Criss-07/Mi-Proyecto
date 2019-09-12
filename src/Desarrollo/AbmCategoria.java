package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AbmCategoria 
{
//COMENTO MI PRIMER CAMBIOO
    private String Nom;
    private String ConsultaSql = "SELECT * FROM categoria;";     
    private String AltaSql = "INSERT INTO categoria (NomCat) VALUES (?);";
    private String Borrar = "DELETE FROM categoria WHERE NomCat = (?);";    
    
    
    DefaultListModel ModeloListaCategoria = new DefaultListModel();
    PreparedStatement Instruccion;    
    ResultSet Muestra;

    Conexion z = new Conexion();
    
    public AbmCategoria(String Nom) {
        this.Nom = Nom;
    }

    public AbmCategoria() {
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
        
        String Cambia ="UPDATE categoria SET  NomCat = '"+ NomNuevo+"' WHERE NomCat = '"+ this.getNom() +"';";
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
                ModeloListaCategoria.addElement(Muestra.getString(2));
            }           
            
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        
        return ModeloListaCategoria;
        
    }
}
