/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agusseputra
 */
public class CrudFrame extends javax.swing.JFrame {

    
    private int selectedUserId=-1;
    UserController controller = new UserController();
    public CrudFrame() throws SQLException {
        initComponents();
        loadUserData();
    }

    @SuppressWarnings("unchecked")
    private void loadUserData() throws SQLException{
        List<User> users = controller.getUsers();
        String[][] data = new String[users.size()][5];
        
        for(int i=0; i < users.size(); i++){
           data[i][0] = String.valueOf(users.get(i).getId());
           data[i][1] = users.get(i).getFirstName();
           data[i][2] = users.get(i).getLastName();
           data[i][3] = users.get(i).getEmail();
           data[i][4] = users.get(i).getCountry();
        }
        String[] columnName = {"ID", "First Name", "Last Name", "Email", "Country"};
        usersTable.setModel(new javax.swing.table.DefaultTableModel(data, columnName));  
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        countryTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveUpdate = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstNameTextField.setText("First Name");

        lastNameTextField.setText("Last Name");

        emailTextField.setText("Email");

        countryTextField.setText("Country");

        jLabel1.setText("Nama");

        jLabel2.setText("Email");

        jLabel3.setText("Negara");

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersTable);

        addButton.setText("Save");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveUpdate.setText("Update");
        saveUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUpdateActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNameTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(countryTextField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton))
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(addButton)
                    .addComponent(deleteButton)
                    .addComponent(saveUpdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void clearForm(){
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        countryTextField.setText("");
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
        String fn = firstNameTextField.getText();
        String ln = lastNameTextField.getText();
        String email = emailTextField.getText();
        String country = countryTextField.getText();
        String password = new String(jPasswordField1.getPassword());
        
        if(fn.isEmpty() || fn.isEmpty() || fn.isEmpty() || fn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields ", "Input Error", JOptionPane.ERROR_MESSAGE);
        }else {
            AuthController authcontroller=new AuthController();
            password=authcontroller.hashPassword(password.toString());
            User newUser = new User(0, fn, ln, email, country, password );
            try {
                int res = controller.addUser(newUser);
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "User created successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm();
                    loadUserData();
                }else {
                    JOptionPane.showMessageDialog(this, "Error occurred while inserting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked
        // TODO add your handling code here:
        int selectedRow =usersTable.getSelectedRow();
        if(selectedRow != -1){
            selectedUserId = Integer.parseInt(usersTable.getValueAt(selectedRow, 0).toString());
            firstNameTextField.setText(usersTable.getValueAt(selectedRow, 1).toString());
            lastNameTextField.setText(usersTable.getValueAt(selectedRow, 2).toString());
            emailTextField.setText(usersTable.getValueAt(selectedRow, 3).toString());
            countryTextField.setText(usersTable.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_usersTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if(selectedUserId != -1){
                int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if(confirmation == JOptionPane.YES_OPTION){                    
                try {
                    controller.deleteUser(selectedUserId);
                    JOptionPane.showMessageDialog(this, "User Deleted successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm();
                    loadUserData();
                    selectedUserId = -1;
                }catch (SQLException ex) {
                     JOptionPane.showMessageDialog(this, "Error occurred while Deleting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "No User Selected for Delete ", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUpdateActionPerformed
        // TODO add your handling code here:
        String fn = firstNameTextField.getText();
        String ln = lastNameTextField.getText();
        String email = emailTextField.getText();
        String country = countryTextField.getText();
        String password = "";
        
        if(fn.isEmpty() || fn.isEmpty() || fn.isEmpty() || fn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields ", "Input Error", JOptionPane.ERROR_MESSAGE);
        }else {
        
            User newUser = new User(0, fn, ln, email, country, password );
            try {
                int res = controller.updateUser(newUser, selectedUserId);
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "User Updated successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm();
                    loadUserData();
                }else {
                    JOptionPane.showMessageDialog(this, "Error occurred while inserting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this, "Error occurred while inserting ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CrudFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CrudFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton saveUpdate;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
