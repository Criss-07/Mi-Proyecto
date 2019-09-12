package Desarrollo;
import Bdd.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AbmProductos 
{
    private String Nom;
    private double PrecioLista;
    private Date FechaVto;
    private int CantExis;
    private String Envase;
    private char TipoVta;
    private double PrecioCosto;
    private String ProductoCol;
    private int ProdIdCat;
    private int ProdIdLab;
    private int ProIdDrog;


    private int VaridCatDevuelvo;
    private int VaridLabDevuelvo;
    private int VaridDrogaDevuelvo;
    
    private String AltaSql = "INSERT INTO productos (NomCome,PrecioLista,FechaVto,CantExist,Envase,TipoVta,PrecioCosto,Productoscol,categoria_idcategoria,laboratorios_idlaboratorios,droga_iddroga) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
    private String ConsultaSql = "SELECT * FROM productos;";     
    private String Borrar = "DELETE FROM productos WHERE NomCom = (?);";    
    
    
    private String ListaLabSql = "SELECT * FROM laboratorio;"; 
    private String ListaDrogaSql = "SELECT * FROM droga;"; 
    private String ListaCatSql = "SELECT * FROM categoria;"; 
    
    DefaultListModel ModeloListadroga = new DefaultListModel();
    DefaultListModel ModeloListaLab = new DefaultListModel();
    DefaultListModel ModeloListaCat = new DefaultListModel();
    DefaultListModel ModeloListaProducto = new DefaultListModel();
    PreparedStatement Instruccion;    
    ResultSet Muestra;

    Conexion z = new Conexion();
    

    
    public AbmProductos() 
    {
        
    }

    public AbmProductos(String Nom, double PrecioLista, Date FechaVto, int CantExis, String Envase, char TipoVta, double PrecioCosto, String ProductoCol, int ProdIdCat, int ProdIdLab, int ProIdDrog) {
        this.Nom = Nom;
        this.PrecioLista = PrecioLista;
        this.FechaVto = FechaVto;
        this.CantExis = CantExis;
        this.Envase = Envase;
        this.TipoVta = TipoVta;
        this.PrecioCosto = PrecioCosto;
        this.ProductoCol = ProductoCol;
        this.ProdIdCat = ProdIdCat;
        this.ProdIdLab = ProdIdLab;
        this.ProIdDrog = ProIdDrog;
    }

    

    public String getNom() {
        return Nom;
    }

    public double getPrecioLista() {
        return PrecioLista;
    }

    public Date getFechaVto() {
        return FechaVto;
    }

    public int getCantExis() {
        return CantExis;
    }

    public String getEnvase() {
        return Envase;
    }

    public char getTipoVta() {
        return TipoVta;
    }

    public double getPrecioCosto() {
        return PrecioCosto;
    }
    
    public String getProductoCol()
    {
        return ProductoCol;
    }

    public int getProdIdCat() {
        return ProdIdCat;
    }

    public int getProdIdLab() {
        return ProdIdLab;
    }

    public int getProIdDrog() {
        return ProIdDrog;
    }

    
    
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrecioLista(double PrecioLista) {
        this.PrecioLista = PrecioLista;
    }

    public void setFechaVto(Date FechaVto) {
        this.FechaVto = FechaVto;
    }

    public void setCantExis(int CantExis) {
        this.CantExis = CantExis;
    }

    public void setEnvase(String Envase) {
        this.Envase = Envase;
    }

    public void setTipoVta(char TipoVta) {
        this.TipoVta = TipoVta;
    }

    public void setPrecioCosto(double PrecioCosto) {
        this.PrecioCosto = PrecioCosto;
    }
    public void getProductoCol(String ProductoCol)
    {
        this.ProductoCol= ProductoCol;
    }

    public int getVaridCatDevuelvo() {
        return VaridCatDevuelvo;
    }

    public void setVaridCatDevuelvo(int VaridCatDevuelvo) {
        this.VaridCatDevuelvo = VaridCatDevuelvo;
    }

    public int getVaridLabDevuelvo() {
        return VaridLabDevuelvo;
    }

    public void setVaridLabDevuelvo(int VaridLabDevuelvo) {
        this.VaridLabDevuelvo = VaridLabDevuelvo;
    }

    public int getVaridDrogaDevuelvo() {
        return VaridDrogaDevuelvo;
    }

    public void setVaridDrogaDevuelvo(int VaridDrogaDevuelvo) {
        this.VaridDrogaDevuelvo = VaridDrogaDevuelvo;
    }
    


   
    public void Alta(int  VaridLab, int  VaridCat, int  VaridDro)
    {
        try 
        {
            
            Instruccion = z.MeConecto().prepareStatement(AltaSql);            
            Instruccion.setString(1, this.getNom());
            Instruccion.setDouble(2, this.getPrecioLista());
            Instruccion.setDate(3, this.getFechaVto());
            Instruccion.setInt(4, this.getCantExis());
            Instruccion.setString(5, this.getEnvase());
            Instruccion.setString(6, String.valueOf(this.getTipoVta())); // char
            Instruccion.setDouble(7, this.getPrecioCosto());
            Instruccion.setString(8, this.getProductoCol());
            Instruccion.setInt(9, VaridCat);
            Instruccion.setInt(10, VaridLab);
            Instruccion.setInt(11, VaridDro);

            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                z.MeConecto().close();
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No pudo ingresar los datos" + e);
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
    
    public void Modif(String NomNuevo, double PreListNuevo, Date FechaVto,int CantExit, String Envase, char TipoVta, double PreCosto,String ProductoCol, int idCat, int idLab, int idDro)
    {
        
        String Cambia ="UPDATE productos SET  NomCome = '"+ NomNuevo+"', PrecioLista = '"+ PreListNuevo +"', FechaVto = '"+ FechaVto +"', CantExist = '"+ CantExit +"', Envase = '"+ Envase +"', TipoVta = '"+ TipoVta +"', PrecioCosto = '"+ PreCosto + "' Productoscol= '"+ ProductoCol + "', categoria_idcategoria = '"+ idCat +"', laboratorios_idlaboratorios = '"+ idLab +"', droga_iddroga = '"+ idDro +"' WHERE NomCom = '"+ this.getNom() +"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(Cambia);
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al querer modificar un registro " + e );
        }       
    }
 
 
    
    
    
    
    public int BuscoId(String NomLabElegido)
    {
        int VarId = 0;
        String DevuelveIdLabSql =  "SELECT * FROM laboratorio WHERE NomLab = '"+NomLabElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveIdLabSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarId =  Muestra.getInt(1);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos (busco id)" + e);
        }
         return VarId;
    }


   
    public int BuscoIdDroga(String NomDrogaElegido)
    {
        int VarId = 0;
        String DevuelveIdDrogaSql =  "SELECT * FROM droga WHERE NomDroga = '"+NomDrogaElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveIdDrogaSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarId =  Muestra.getInt(1);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos (busco id)" + e);
        }
         return VarId;
    }

    public int BuscoIdCat(String NomCatElegido)
    {
        int VarId = 0;
        String DevuelveIdCatSql =  "SELECT * FROM categoria WHERE NomCat = '"+NomCatElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveIdCatSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarId =  Muestra.getInt(1);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos (busco id)" + e);
        }
         return VarId;
    }

    public String BuscoNomCat(int IdCatElegido)
    {
        String VarNom = "";
        String DevuelveNomCatSql =  "SELECT * FROM categoria WHERE idcategoria = '"+IdCatElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveNomCatSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarNom =  Muestra.getString(2);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos (busco Nombre)" + e);
        }
        return VarNom;
    }
    
    
    public String BuscoNomLab(int IdLabElegido)
    {
        String VarNom = "";
        String DevuelveNomLabSql =  "SELECT * FROM laboratorio WHERE idlaboratorio = '"+IdLabElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveNomLabSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarNom =  Muestra.getString(2);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos (busco Nombre)" + e);
        }
         return VarNom;
    }


   
    public String BuscoNomDroga(int IdDrogaElegido)
    {
        String VarNom = "";
        String DevuelveNomDrogaSql =  "SELECT * FROM droga WHERE iddroga = '"+IdDrogaElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveNomDrogaSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarNom =  Muestra.getString(2);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos (busco Nombre)" + e);
        }
         return VarNom;
    }

/************************/   
    public DefaultListModel MuestroLab()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaLabSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloListaLab.addElement(Muestra.getString(2));
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloListaLab;
    }
/************************/   


/************************/   
    public DefaultListModel MuestroDroga()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaDrogaSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloListadroga.addElement(Muestra.getString(2));
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloListadroga;
    }
/************************/   


/************************/   
    public DefaultListModel MuestroCat()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaCatSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloListaCat.addElement(Muestra.getString(2));
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloListaCat;
    }
/************************/   
 


/************************/   
    public DefaultListModel MuestroProducto()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ConsultaSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloListaProducto.addElement(Muestra.getString(2));
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloListaProducto;
    }
/************************/   
 
    public boolean Buscar(String NomProd)
    {
        String BuscarNro = "select NomCome,PrecioLista,FechaVto,CantExist,Envase,TipoVta,PrecioCosto,Productocol,categoria_idcategoria,laboratorio_idlaboratorio,droga_iddroga from productos where NomCom = '" + NomProd + "';";
        boolean Encuentra = false;
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(BuscarNro);
            Muestra = Instruccion.executeQuery();
            
            if(Muestra.next())
            {
               this.setNom(Muestra.getString(1));
               this.setPrecioLista(Muestra.getDouble(2));
               this.setFechaVto(Muestra.getDate(3));
               this.setCantExis(Muestra.getInt(4));
               this.setEnvase(Muestra.getString(5));
               this.setTipoVta(Muestra.getString(6).charAt(0)); // char
               this.setPrecioCosto(Muestra.getDouble(7));
               this.setVaridCatDevuelvo(Muestra.getInt(8));
               this.setVaridLabDevuelvo(Muestra.getInt(9));
               this.setVaridDrogaDevuelvo(Muestra.getInt(10));
/*            Muestra.setInt(Muestra VaridCatDevuelvo);
            Muestra.setInt(Muestra VaridLab); 
            Muestra.setInt(Muestra VaridDro);
*/
            }
            Encuentra = true;
               
           

        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No encuentra el producto" + e);
            System.out.println(Muestra);
            Encuentra = false;
        }
        finally
        {
            return Encuentra;
        }
    }

    
}