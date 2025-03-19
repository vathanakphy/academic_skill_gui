/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import core.*;
import user.*;
//import javax.swing.*;
/**
 *
 * @author vathanak
 */
public class Dasboard extends javax.swing.JFrame {
    /**
     * Creates new form Dasboard
     */
    AdminHome h = new AdminHome();
    CreateUser c = new CreateUser();
    CreateCourse newC = new CreateCourse();
    CreateClass newClass = new CreateClass();
    ResetUI reset = new ResetUI();
    public Dasboard() {
        initComponents();
        MianContent.add(h);
        MianContent.add(c);
        MianContent.add(reset);
        MianContent.add(newC);
        MianContent.add(newClass);
        h.setVisible(true);
        c.setVisible(false);
        reset.setVisible(false);
        newC.setVisible(false);
        newClass.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        userType = new javax.swing.JLabel();
        resentPasswd = new javax.swing.JButton();
        home = new javax.swing.JButton();
        createUser = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        createCourse = new javax.swing.JButton();
        createClass1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MianContent = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        userType.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        userType.setForeground(new java.awt.Color(255, 255, 255));
        userType.setText("Admin");

        resentPasswd.setBackground(new java.awt.Color(0, 51, 102));
        resentPasswd.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        resentPasswd.setForeground(new java.awt.Color(255, 255, 255));
        resentPasswd.setText("Reset Passord");
        resentPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resentPasswdActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(0, 51, 102));
        home.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        createUser.setBackground(new java.awt.Color(0, 51, 102));
        createUser.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        createUser.setForeground(new java.awt.Color(255, 255, 255));
        createUser.setText("Create User");
        createUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Student Enrollment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        createCourse.setBackground(new java.awt.Color(0, 51, 102));
        createCourse.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        createCourse.setForeground(new java.awt.Color(255, 255, 255));
        createCourse.setText("Create Course");
        createCourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                createCourseFocusLost(evt);
            }
        });
        createCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCourseActionPerformed(evt);
            }
        });

        createClass1.setBackground(new java.awt.Color(0, 51, 102));
        createClass1.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        createClass1.setForeground(new java.awt.Color(255, 255, 255));
        createClass1.setText("Create Class");
        createClass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                createClass1FocusLost(evt);
            }
        });
        createClass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClass1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resentPasswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createClass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userType)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(userType)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resentPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createClass1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(0, 153, 204));
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heighg 19.png"))); // NOI18N

        MianContent.setBackground(new java.awt.Color(153, 204, 0));
        MianContent.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MianContent)
                        .addGap(126, 126, 126)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MianContent)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createClass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClass1ActionPerformed
        // TODO add your handling code here:
        h.setVisible(false);
        c.setVisible(false);
        reset.setVisible(false);
        newC.setVisible(false);
        newClass.setVisible(true);
    }//GEN-LAST:event_createClass1ActionPerformed

    private void createClass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createClass1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_createClass1FocusLost

    private void createCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCourseActionPerformed
        // TODO add your handling code here:
        h.setVisible(false);
        c.setVisible(false);
        reset.setVisible(false);
        newC.setVisible(true);
        newClass.setVisible(false);
    }//GEN-LAST:event_createCourseActionPerformed

    private void createCourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createCourseFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_createCourseFocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void createUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserActionPerformed
        // TODO add your handling code here:
        h.setVisible(false);
        c.setVisible(true);
        reset.setVisible(false);
        newC.setVisible(false);
        newClass.setVisible(false);
    }//GEN-LAST:event_createUserActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        h.setVisible(true);
        c.setVisible(false);    
        reset.setVisible(false);
        newC.setVisible(false);
        newClass.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void resentPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resentPasswdActionPerformed
        // TODO add your handling code here:
        h.setVisible(false);
        c.setVisible(false);
        reset.setVisible(true);
        newC.setVisible(false);
        newClass.setVisible(false);
    }//GEN-LAST:event_resentPasswdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Form form = new Form();
        /* Set the Nimbus look and feel */
        Admin admin = null;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        </editor-fold>
        if (args != null && args.length == 2) {
            String email = args[0];   // Email passed as the first argument
            String password = args[1]; // Password passed as the second argument
            admin = (Admin)form.loadData(email, password);
        } else {
            System.out.println("Invalid arguments. Please pass email and password.");
        }
        System.out.println(admin);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane MianContent;
    private javax.swing.JButton createClass1;
    private javax.swing.JButton createCourse;
    private javax.swing.JButton createUser;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton resentPasswd;
    private javax.swing.JLabel userType;
    // End of variables declaration//GEN-END:variables
}
