/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypackage;

/**
 *
 * @author Abinash pc
 */
public class quiz extends javax.swing.JFrame{

    int count=0,current=0;
    private String num;
    public quiz() {
     
        
        initComponents();
        myinitComponents();
        
    }
    
    private void myinitComponents()
    {
        
        setSize(800,400);
        setVisible(true);
        javax.swing.ButtonGroup bg=new javax.swing.ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        set();
        jButton2.setEnabled(false);
        
        
    }
    
    boolean check()
    {
         if(current==0)  
            return(jRadioButton4.isSelected());  
        if(current==1)  
            return(jRadioButton1.isSelected());  
        if(current==2)  
            return(jRadioButton2.isSelected());  
        if(current==3)  
            return(jRadioButton2.isSelected());  
        if(current==4)  
            return(jRadioButton1.isSelected());  
        if(current==5)  
            return(jRadioButton4.isSelected());  
        if(current==6)  
            return(jRadioButton3.isSelected());  
        if(current==7)  
            return(jRadioButton4.isSelected());  
        if(current==8)  
            return(jRadioButton2.isSelected());  
        if(current==9)  
            return(jRadioButton1.isSelected());  
        return false;  
    }
    
    void set()
    {
        if(current==0)
            {
                jLabel1.setText("1.Which of the following is not OOPs concept in Java?");
                jRadioButton1.setText("Inheritance");
                jRadioButton2.setText("Encapsulation");
                jRadioButton3.setText("Polymorphism");
                jRadioButton4.setText("Compilation");    
    }
        if(current==1)
            {
                jLabel1.setText("2.Which of the following is a type of polymorphism in Java?");
                jRadioButton1.setText("Compile time");
                jRadioButton2.setText("Execution time");
                jRadioButton3.setText("Multiple");
                jRadioButton4.setText("Multi-level");    
    }
        if(current==2)
            {
                jLabel1.setText("3.When does method overloading is determined?");
                jRadioButton1.setText("At run time");
                jRadioButton2.setText("At compile time");
                jRadioButton3.setText("At coding time");
                jRadioButton4.setText("At execution time");    
    }
        if(current==3)
            {
                jLabel1.setText("4.Which is a way of converting real world objects in terms of class?");
                jRadioButton1.setText("Polymorphism");
                jRadioButton2.setText("Abstraction");
                jRadioButton3.setText("Encapsulation");
                jRadioButton4.setText("Inheritance");    
    }
        if(current==4)
            {
                jLabel1.setText("5.Which of the following is achieved by combining methods and attribute into a class?");
                jRadioButton1.setText("Encapsulation");
                jRadioButton2.setText("Inheritance");
                jRadioButton3.setText("Polymorphism");
                jRadioButton4.setText("Abstraction");    
    }
        if(current==5)
            {
                jLabel1.setText("6.What is it called if an object has its own lifecycle and there is no owner?");
                jRadioButton1.setText("Aggregation");
                jRadioButton2.setText("Composition");
                jRadioButton3.setText("Encapsulation");
                jRadioButton4.setText("Association");    
    }
        if(current==6)
            {
                jLabel1.setText("7.Which of the following is used with Switch statement?");
                jRadioButton1.setText("Continue");
                jRadioButton2.setText("Exit");
                jRadioButton3.setText("break");
                jRadioButton4.setText("do");    
    }
        if(current==7)
            {
                jLabel1.setText("8.Which of the following is not a decision making statement?");
                jRadioButton1.setText("if");
                jRadioButton2.setText("if-else");
                jRadioButton3.setText("switch");
                jRadioButton4.setText("do-while");    
    }
        if(current==8)
            {
                jLabel1.setText("9.Which of the following is not a valid jump statement?");
                jRadioButton1.setText("break");
                jRadioButton2.setText("goto");
                jRadioButton3.setText("continue");
                jRadioButton4.setText("return");    
    }
        if(current==9)
            {
                jLabel1.setText("10.Which of the following is not a valid flow control statement?");
                jRadioButton1.setText("exit()");
                jRadioButton2.setText("break");
                jRadioButton3.setText("continue");
                jRadioButton4.setText("return");    
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

        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(65, 33, 468, 57);

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(65, 124, 261, 23);

        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(65, 166, 345, 23);

        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(65, 207, 397, 23);

        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(65, 248, 375, 23);

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(254, 299, 107, 32);

        jButton2.setText("RESULT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(429, 299, 93, 32);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(check())
      {
          ++count;
      }
      ++current;
      set();
      if(current==9)
      {
          jButton1.setEnabled(false);
          jButton2.setEnabled(true);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      javax.swing.JOptionPane.showMessageDialog(this,"Total marks:"+count);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables

    
}
