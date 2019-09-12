package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel; // LA LIBRERIA DEL COMBO BOX

public class AbmVentas 
{
   private Date FechaVta;
   private char TipoVta;
   private char Fpago;
   private String NomOsocial;
   private String NroAfiliado;
   private double Subtotal;
   private double Descuento;
   private double Interes;
   private double Total;
   private int VarIdCli;
   private int VarIdVend;
   
   // los campos de detalle de ventas
   
   private String Nom;
   private double precio;
   private int Cant;
   private int DidVta;
   private int DidProd;
   private int DidCat;

   
   
    PreparedStatement Instruccion;    
    ResultSet Muestra;
    Conexion z = new Conexion();
    
    DefaultListModel ModeloListaCli = new DefaultListModel();
    DefaultListModel ModeloListaVend = new DefaultListModel();   
    private String ListaCliSql = "SELECT * FROM cliente;"; 
    private String ListaVendSql = "SELECT * FROM personal;"; 
    
    private String AltaSql = "INSERT INTO venta (FechaVta,TipoVta,FPago,NomOSocial,NroAfiliado,Subtotal,Descuento,Interes,TotPagar,cliente_idcliente,personal_idadministrador) VALUES (?,?,?,?,?,?,?,?,?,?,?);";    
    private String AltaDetalleVta = "INSERT INTO DetalleVta" + "(NomProd,PrecioVta,Cantidad,Productos_idProductos,Productos_Categoria_idCategoria)" + "VALUES(?,?,?,?,?)";
    
    DefaultComboBoxModel ModeloComboProducto = new DefaultComboBoxModel();
    private String ProductosAlCombo = "SELECT * FROM productos;"; // LOS DATOS SE ALMACENADOSDE LA BASE DE DATOS
    
    public AbmVentas() {
    }

    public AbmVentas(Date FechaVta, char TipoVta, char Fpago, String NomOsocial, String NroAfiliado, double Subtotal, double Descuento, double Interes, double Total, int VarIdCli, int VarIdVend) {
        this.FechaVta = FechaVta;
        this.TipoVta = TipoVta;
        this.Fpago = Fpago;
        this.NomOsocial = NomOsocial;
        this.NroAfiliado = NroAfiliado;
        this.Subtotal = Subtotal;
        this.Descuento = Descuento;
        this.Interes = Interes;
        this.Total = Total;
        this.VarIdCli = VarIdCli;
        this.VarIdVend = VarIdVend;
    }

    /************contructor de detalle de venta*/
    
    public AbmVentas(String Nom, double precio, int Cant, int DidVta, int DidProd, int DidCat) 
    {
        this.Nom = Nom;
        this.precio = precio;
        this.Cant = Cant;
        this.DidVta = DidVta;
        this.DidProd = DidProd;
        this.DidCat = DidCat;
    }

    public Date getFechaVta() {
        return FechaVta;
    }

    public void setFechaVta(Date FechaVta) {
        this.FechaVta = FechaVta;
    }

    public char getTipoVta() {
        return TipoVta;
    }

    public void setTipoVta(char TipoVta) {
        this.TipoVta = TipoVta;
    }

    public char getFpago() {
        return Fpago;
    }

    public void setFpago(char Fpago) {
        this.Fpago = Fpago;
    }

    public String getNomOsocial() {
        return NomOsocial;
    }

    public void setNomOsocial(String NomOsocial) {
        this.NomOsocial = NomOsocial;
    }

    public String getNroAfiliado() {
        return NroAfiliado;
    }

    public void setNroAfiliado(String NroAfiliado) {
        this.NroAfiliado = NroAfiliado;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double Interes) {
        this.Interes = Interes;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public int getVarIdCli() {
        return VarIdCli;
    }

    public void setVarIdCli(int VarIdCli) {
        this.VarIdCli = VarIdCli;
    }

    public int getVarIdVend() {
        return VarIdVend;
    }

    public void setVarIdVend(int VarIdVend) {
        this.VarIdVend = VarIdVend;
    }
    
// get y set de los detalles de ventas

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return Cant;
    }

    public void setCant(int Cant) {
        this.Cant = Cant;
    }

    public int getDidVta() {
        return DidVta;
    }

    public void setDidVta(int DidVta) {
        this.DidVta = DidVta;
    }

    public int getDidProd() {
        return DidProd;
    }

    public void setDidProd(int DidProd) {
        this.DidProd = DidProd;
    }

    public int getDidCat() {
        return DidCat;
    }

    public void setDidCat(int DidCat) {
        this.DidCat = DidCat;
    }
  
    
    
    
    
    public void Alta(int  VaridCli, int  VaridVend)
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(AltaSql);            
            Instruccion.setDate(1, this.getFechaVta());
            Instruccion.setString(2, String.valueOf(this.getTipoVta())); // char
            Instruccion.setString(3, String.valueOf(this.getFpago())); // char
            Instruccion.setString(4, this.getNomOsocial());
            Instruccion.setString(5, this.getNroAfiliado());
            Instruccion.setDouble(6, this.getSubtotal());
            Instruccion.setDouble(7, this.getDescuento());
            Instruccion.setDouble(8, this.getInteres());
            Instruccion.setDouble(9, this.getTotal());
            Instruccion.setInt(10, this.getVarIdCli());
            Instruccion.setInt(11, this.getVarIdVend());

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

    
    
    public DefaultListModel MuestroCli()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaCliSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloListaCli.addElement(Muestra.getString(2));
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloListaCli;
    }
     
    public DefaultListModel MuestroVend()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaVendSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloListaVend.addElement(Muestra.getString(3));
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloListaVend;
    }     

    public int BuscoIdCli(String NomCliElegido)
    {
        int VarId = 0;
        String DevuelveIdCliSql =  "SELECT * FROM cliente WHERE NomCli = '"+NomCliElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveIdCliSql);
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

    public int BuscoIdVend(String NomVendElegido)
    {
        int VarId = 0;
        String DevuelveIdVendSql =  "SELECT * FROM personal WHERE Nom = '"+NomVendElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveIdVendSql);
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
    
  public DefaultComboBoxModel CargarComboProductos()
  {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ProductosAlCombo);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloComboProducto.addElement(Muestra.getString(2));
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return ModeloComboProducto;     
  }
   
   public double BuscoPrecioUnitario(String NomProdElegido)
    {
        double VarId = 0;
        String DevuelvePuSql =  "SELECT * FROM productos WHERE NomCom = '"+NomProdElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelvePuSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarId =  Muestra.getInt(3);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos (busco id)" + e);
        }
         return VarId;
    } 
   
   
   public void AltaDetalleVta()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(AltaSql);            
            
            
            Instruccion.setString(1, this.getNom());
            Instruccion.setDouble(2, this.getPrecio());
            Instruccion.setDouble(3, this.getCant());
            Instruccion.setInt(4, this.getDidVta());
            Instruccion.setInt(5, this.getDidProd());
            Instruccion.setInt(6, this.getDidCat());
            

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
   
   public int BuscoidProducto(String NomProdElegido)
    {
        int VarId = 0;
        String DevuelveidProdSql =  "SELECT * FROM productos WHERE NomCom = '"+NomProdElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveidProdSql);
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
   
   
   public int BuscoidCategoria(String NomProdElegido)
    {
        int VarId = 0;
        String DevuelveidCatdSql =  "SELECT * FROM productos WHERE NomCom = '"+NomProdElegido+"';";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveidCatdSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarId =  Muestra.getInt(7);
            }           
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos (busco id)" + e);
        }
         return VarId;
    } 
   
   public int BuscoidVtas()
    {
        int VarId = 0;
        String DevuelveidVtaSql =  "SELECT max(idVta) FROM venta;";
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(DevuelveidVtaSql);
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
}
