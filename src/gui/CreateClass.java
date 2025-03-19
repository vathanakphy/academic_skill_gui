package gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import academic.*;
import core.MySQLConnection;
//import exception.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import user.*;

/**
 *
 * @author vathanak
 */
public class CreateClass extends javax.swing.JPanel {

    /**
     * Creates new form CreateClass
     */
    public CreateClass() {
        initComponents();
        for(Course c :Course.listCourses.values()){
            selectCourse.addItem(c.name);
        }
        for(User t :User.listUser.values()){
            if(t instanceof Teacher){
               Teacher tch = (Teacher) t;
               selectTeacher.addItem(tch.basicInfor());
            }
        }
        getAllClassRoom();
        for (int i = 0; i < 24; i++) {
            String hour = String.format("%02d", i);
            startHour.addItem(hour);
            endHour.addItem(hour);
        }

        // Populate minutes (00-59)
        for (int i = 0; i < 60; i++) {
            String minute = String.format("%02d", i);
            startMin.addItem(minute);
            endMin.addItem(minute);
        }
        String[] months = {
            "JAN", "FEB", "MAR", "APR", "MAY", "JUN", 
            "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"
        };
        for (String month : months) {
            startMonth.addItem(month);
            endMonth.addItem(month);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        academic_group = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        academic_term = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        academic_year = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selectTeacher = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        selectCourse = new javax.swing.JComboBox<>();
        createClass = new javax.swing.JButton();
        startHour = new javax.swing.JComboBox<>();
        startMonth = new javax.swing.JComboBox<>();
        endMonth = new javax.swing.JComboBox<>();
        endDay = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        startDay1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        endMin = new javax.swing.JComboBox<>();
        SelectClassRoom = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        endHour = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        startMin = new javax.swing.JComboBox<>();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Select Teacher");

        academic_group.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        academic_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academic_groupActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("From");

        academic_term.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        academic_term.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academic_termActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Group");

        academic_year.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        academic_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academic_yearActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Year");

        jLabel6.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Select Course");

        createClass.setBackground(new java.awt.Color(51, 102, 255));
        createClass.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        createClass.setForeground(new java.awt.Color(255, 255, 255));
        createClass.setText("Create");
        createClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClassActionPerformed(evt);
            }
        });

        startHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHourActionPerformed(evt);
            }
        });

        startMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMonthActionPerformed(evt);
            }
        });

        endMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endMonthActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Day");

        jLabel11.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("Month");

        jLabel12.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("Month");

        jLabel13.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setText("Day");

        jLabel14.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setText("Class Room ");

        jLabel15.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("Start Date");

        jLabel7.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Term");

        jLabel16.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 153));
        jLabel16.setText(":");

        jLabel17.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 153));
        jLabel17.setText("To");

        jLabel18.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 153));
        jLabel18.setText("End Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(academic_year, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(academic_term, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(academic_group, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(startMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(endDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(314, 314, 314)
                                        .addComponent(jLabel10)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(createClass, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(endMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(startMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(42, 42, 42)
                                                        .addComponent(jLabel17)
                                                        .addGap(28, 28, 28)
                                                        .addComponent(endHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(endMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(34, 34, 34))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(SelectClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(startDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(selectTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(jLabel8)
                    .addContainerGap(470, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(537, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addGap(228, 228, 228)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(academic_year, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(academic_term, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(academic_group, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(63, 63, 63)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(startHour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(endMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(endHour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(startMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(SelectClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(createClass, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jLabel8)
                    .addContainerGap(588, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(309, 309, 309)
                    .addComponent(jLabel18)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void academic_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academic_groupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_academic_groupActionPerformed

    private void academic_termActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academic_termActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_academic_termActionPerformed

    private void academic_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academic_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_academic_yearActionPerformed

    private void createClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClassActionPerformed
        // TODO add your handling code here:
        String yearText = this.academic_year.getText();
        String termText = this.academic_term.getText();
        String group = this.academic_group.getText();
        String tchBasicInfor = (String) this.selectTeacher.getSelectedItem();
        String tchId = tchBasicInfor.split(" ")[0]; 
        String courseSortName = (String) this.selectCourse.getSelectedItem();
        int y = 0;
        int t = 0;
        User u = User.listUser.get(tchId);
        Teacher tch = null;
        try{
            tch = (Teacher) u;
            Course curs = Course.findCourseByName(courseSortName);
            t = Integer.parseInt(termText);
            y = Integer.parseInt(yearText);
            CourseInstance newclass = new CourseInstance(curs, tch, y, t, group);
            String query = "INSERT INTO Course_instance (year, term, group_s, teacher_id, short_name) VALUES ("+y+", "+t+", '"+group+"', '"+tchId+"', '"+curs.getShortName()+"');";
            int row = MySQLConnection.executeUpdate(query);
            if(row!=0){
                System.out.println("Success");
            }
        }catch(ClassCastException c){
            System.out.println(c.getMessage());
        }catch(NumberFormatException num){
            System.err.println(num.getMessage());
            
        }
    }//GEN-LAST:event_createClassActionPerformed

    private void endMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endMonthActionPerformed
        // TODO add your handling code here:
         int monthIndex = endMonth.getSelectedIndex();

                // Determine number of days in the selected month
                int daysInMonth = getDayOfMonth(monthIndex);
                

                // Update the day JComboBox
                endDay.removeAllItems();
                for (int i = 1; i <= daysInMonth; i++) {
                    endDay.addItem(String.valueOf(i));
                }
    }//GEN-LAST:event_endMonthActionPerformed

    private void startMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMonthActionPerformed
        // TODO add your handling code here:
        int monthIndex = startMonth.getSelectedIndex();

                // Determine number of days in the selected month
                int daysInMonth = getDayOfMonth(monthIndex);
     // Update the day JComboBox
                startDay1.removeAllItems();
                for (int i = 1; i <= daysInMonth; i++) {
                    startDay1.addItem(String.valueOf(i));
                }
    }//GEN-LAST:event_startMonthActionPerformed

    private void startHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startHourActionPerformed
    
    private ArrayList<String> getAllClassRoom(){
       ResultSet r =  MySQLConnection.executeQuery("SELECT class_id FROM Class_room ;");
       ArrayList<String> listClass = new ArrayList<>();
       try{
           if(r!=null){
               while(r.next()){
                   listClass.add(r.getString("class_id"));
                   SelectClassRoom.addItem(r.getString("class_id"));
               }
           }
       }catch(SQLException s){
           System.out.println("No class select");
       }
       return listClass;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelectClassRoom;
    private javax.swing.JTextField academic_group;
    private javax.swing.JTextField academic_term;
    private javax.swing.JTextField academic_year;
    private javax.swing.JButton createClass;
    private javax.swing.JComboBox<String> endDay;
    private javax.swing.JComboBox<String> endHour;
    private javax.swing.JComboBox<String> endMin;
    private javax.swing.JComboBox<String> endMonth;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JComboBox<String> selectCourse;
    private javax.swing.JComboBox<String> selectTeacher;
    private javax.swing.JComboBox<String> startDay1;
    private javax.swing.JComboBox<String> startHour;
    private javax.swing.JComboBox<String> startMin;
    private javax.swing.JComboBox<String> startMonth;
    // End of variables declaration//GEN-END:variables
    private int getDayOfMonth(int indexMonth){
        int y = Integer.parseInt(academic_year.getText());
        switch (indexMonth) {
            case 1:
                // February
                if (( y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
                    return 29; // Leap year
                } else {
                    return 28; // Non-leap year
                }
            case 3:
            case 5:
            case 8:
            case 10:
                return  30; // April, June, September, November
            default:
                return 31; // Other months
        }
    }
}
