/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.List;

/**
 *
 * @author agusseputra
 */
public class UserController {
    private UserDAO userDao = new UserDAO();

    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public int updateUser(User user, int id) {
        return userDao.updateUser(user, id);
    }

    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }
}
