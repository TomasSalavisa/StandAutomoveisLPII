//import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
//import java.sql.SQLException;

public class BD {
        public static Connection liga() throws SQLException{
            
            String url = "jdbc:mysql://localhost:3306/standcarro?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String pass = "";
            Connection liga = null;
            liga = DriverManager.getConnection(url,user,pass);
            
            return liga;
                    
        }
        
        public static void InserirCliente(Cliente c){
            try{
                String sql = "INSERT INTO clientes(Nome,Morada,Telefone,CodigoPostal,Email,Login,Passe)" + "VALUES ('"+c.getNome()+"','"+
                        c.getMorada()+"','"+
                        c.getTelefone()+"',"+
                        c.getCodigoPostal()+","+
                        c.getEmail()+",'"+
                        c.getLogin()+"','"+
                        c.getPasse()+"')";
                Connection con = liga();
                
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        
        public static ResultSet MostrarCliente(){
            try{
                String sql = "SELECT Nome,Morada,Telefone,CodigoPostal,Email,Login,Passe FROM clientes";
                Connection con = liga();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = null;
                rs = ps.executeQuery();
                return rs;
            }catch(SQLException e){
                e.printStackTrace();
            }
            return null;
        }
        
        public static void InserirCarro(Carro cd) {
    try {
        String sql = "INSERT INTO carros(Marca, Modelo, Segmento, Combustivel, Preco, Ano) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        Connection con = liga();
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cd.getMarca());
            ps.setString(2, cd.getModelo());
            ps.setString(3, cd.getSegmento());
            ps.setString(4, cd.getCombustivel());
            ps.setInt(5, cd.getPreco());
            ps.setInt(6, cd.getAno());
            
            ps.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        /*public static void InserirCarro(Carro cd){
            try{
                String sql = "INSERT INTO carros(Marca,Modelo,Segmento,Combustivel,Preco,Ano)" + "VALUES ('"+cd.getMarca()+"','"+
                        cd.getModelo()+"','"+
                        cd.getSegmento()+"',"+
                        cd.getCombustivel()+","+
                        cd.getPreco()+",'"+
                        cd.getAno()+"')";
                Connection con = liga();
                
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }*/
        
        public static ResultSet MostrarCarro(){
            try{
                String sql = "SELECT Marca,Modelo,Segmento,Combustivel,Preco,Ano FROM carros";
                Connection con = liga();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = null;
                rs = ps.executeQuery();
                return rs;
            }catch(SQLException e){
                e.printStackTrace();
            }
            return null;
        }
        
        public static ResultSet EliminarCliente(){
            try{
                String sql = "DELETE FROM clientes WHERE Nome = ?";
                Connection con = liga();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = null;
                rs =ps.executeQuery();
                return rs;
            }catch(SQLException e){
                e.printStackTrace();
            }
            return null;
        }
}


