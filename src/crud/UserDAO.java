/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author agusseputra
 */
public class UserDAO {
    private Connection connection;
    public UserDAO() {
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // create User
    public int insertUser(User user){
        try{
            String sql = "INSERT INTO users (first_name, last_name, email, country) VALUES(?,?,?,?)";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getCountry());
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
              return 0;
        }
        
    }
     // Select/read Users
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM users";
            PreparedStatement stmt =connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String fName = rs.getString("first_name");
                String lName = rs.getString("last_name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                
                users.add(new User(id, fName, lName, email, country));
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    // update User
    public int updateUser(User user, int id){
        try{
            String sql = "UPDATE users SET first_name=?, last_name=?, email=?, country=? WHERE id=?";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getCountry());
            stmt.setInt(5, id);
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
              return 0;
        }
        
    }
     // Delete User
    public int deleteUser(int id){
        try{
            String sql = "DELETE FROM users  WHERE id=?";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
              //e.printStackTrace();
              return 0;
        }
        
    }
    
}
