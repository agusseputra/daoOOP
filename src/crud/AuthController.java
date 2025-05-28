/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.security.MessageDigest;


/**
 *
 * @author agusseputra
 */
public class AuthController {
    private AuthDAO authDao;

    public AuthController() {
        try {
             authDao = new AuthDAO();
        } catch (Exception e) {
        }
    }

    public User login(String email, String password) {
        return authDao.login(email, password);
    }


    public String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(password.getBytes());
            byte[] hashBytes = md.digest();

            // Ubah hasil hash ke format hex
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (Exception e) {
            throw new RuntimeException("MD5 Algorithm not found");
        }
    }
}
