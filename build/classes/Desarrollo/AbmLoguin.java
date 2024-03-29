package Desarrollo;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AbmLoguin
{
    private int id;
    private int NroLeg;
    private String Nom;
    private char Estado;
    private char Categoria;
    private String Usu;
    private String Clave;


    
    private String AltaSql = "INSERT INTO personal (`NroLeg`,`Nom`,`Estado`,`Categoria`,`Usu`,`Clave`) VALUES (?,?,?,?,?,?);";

    private String Borrar = "DELETE FROM personal WHERE NroLeg = (?);";

    
    
    Conexion z = new Conexion();
    PreparedStatement Instruccion;
    ResultSet MuestraLeg;    
    

    
    public AbmLoguin() 
    {
    }

    public AbmLoguin(int NroLeg, String Nom, char Estado, char Categoria, String Usu, String Clave) 
    {
        this.NroLeg = NroLeg;
        this.Nom = Nom;
        this.Estado = Estado;
        this.Categoria = Categoria;
        this.Usu = Usu;
        this.Clave = Clave;
    }

 
    

    public String getNom() 
    {
        return Nom;
    }

    public void setNom(String Nom) 
    {
        this.Nom = Nom;
    }

    public String getUsu() 
    {
        return Usu;
    }

    public void setUsu(String Usu) 
    {
        this.Usu = Usu;
    }

    public String getClave() 
    {
        return Clave;
    }

    public void setClave(String Clave) 
    {
        this.Clave = Clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroLeg() {
        return NroLeg;
    }

    public void setNroLeg(int NroLeg) {
        this.NroLeg = NroLeg;
    }

    public char getCategoria() {
        return Categoria;
    }

    public void setCategoria(char Categoria) {
        this.Categoria = Categoria;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
 
    
    
    
    
    public void Alta()
    {
 
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(AltaSql);            

            Instruccion.setInt(1, this.getNroLeg());
            Instruccion.setString(2, this.getNom());
            Instruccion.setString(3, String.valueOf(this.getEstado()));
            Instruccion.setString(4, String.valueOf(this.getCategoria()));
            Instruccion.setString(5, this.getUsu());
            Instruccion.setString(6, this.getClave());

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
            Instruccion.setInt(1, this.getNroLeg());
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
    
    public void Modificacion(int Legajo)
    {
        String Cambia ="UPDATE personal SET NroLeg = '"+ this.getNroLeg() +"', Nom = '"+ this.getNom()+"', Estado = '"+ this.getEstado() +"', Categoria = '"+ this.getCategoria() +"', Usu = '"+ this.getUsu() +"', Clave = '"+ this.getClave() +"' WHERE NroLeg = '"+ Legajo +"';";
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
    
    
    public boolean BuscarLegajo(int nrolegajo)
    {
        String BuscarNro = "select Nom, Usu, Clave, Estado from personal where NroLeg = '" + nrolegajo + "';";
        boolean Encuentra = false;
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(BuscarNro);
            MuestraLeg = Instruccion.executeQuery();
            
            if(MuestraLeg.next())
            {
                this.setNom( MuestraLeg.getString(1));
                this.setUsu( MuestraLeg.getString(2));
                this.setClave( MuestraLeg.getString(3));
                this.setEstado( MuestraLeg.getString(4).charAt(0));                
            }
            Encuentra = true;
               
           

        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No encuentra ese número de legajo" + e);
            System.out.println(MuestraLeg);
            Encuentra = false;
        }
        finally
        {
            return Encuentra;
        }
    }
    
}
