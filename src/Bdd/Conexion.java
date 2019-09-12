package Bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion 
{
    private final String Url = "jdbc:mysql://Localhost:3306/farper";
    private final String Usuario = "root";
    private final String Clave = "";
    private final String Driver = "com.mysql.jdbc.Driver";
    Connection Conectar;
 
    
    public Conexion()
    {
        Conectar = null;
        try 
        {
            Class.forName(Driver);
            Conectar = DriverManager.getConnection(Url, Usuario, Clave);

        } catch (ClassNotFoundException  | SQLException Var) 
        {
            JOptionPane.showMessageDialog(null, "Error de conexión !!!" + Var);
        }
       
    }
 
    
    public Connection MeConecto()
    {
        
        return Conectar;
    }
    
    
    public void MeDesconecto()
    {
        Conectar = null;
        if (Conectar == null) 
        {
            JOptionPane.showMessageDialog(null, "Desconectando");
        }
    }
}
