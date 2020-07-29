/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpuzzel;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/**
 *
 * @author Shanti
 */
public class NumberPuzeel extends javax.swing.JFrame {

    /**
     * Creates new form NumberPuzeel
     */
    JLabel[][] jl;
    JLabel[][] jlarray;
    int x,y;
    int x1,y1;
    
    public NumberPuzeel() {
        initComponents();
        showNumberOnBox();
        l8.setFocusable(true);
        
    }
    public void showNumberOnBox()
    {
        JLabel[][] jl={{l0,l1,l2},{l3,l4,l5},{l6,l7,l8}};
        int[] number={1,2,3,4,5,6,7,8};
        int n=8;//we have total 16boxes so we take 9
        int randomNumber;
        for(int i=0;i < 3 ; i++)
        {
           for(int j=0;j<3;j++)
           {
               randomNumber=(int)(Math.random()*n);
               if(randomNumber < n-1 && n!=0)
               {
                   jl[i][j].setText(""+number[randomNumber]);
                   number[randomNumber]=number[n-1];
               }
               else if(n==0)
               {
                   jl[i][j].setText(" ");
                   x=x1=y=y1=i;
               }
               else
                   jl[i][j].setText(""+number[randomNumber]);
               n--;
               
           }
           
                
         
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        l0 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        moveCount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                l8KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(p1);
        p1.setBounds(20, 120, 310, 236);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 40, 322, 2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Number Puzzel");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 11, 147, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("New Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 370, 130, 40);

        moveCount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        moveCount.setText("300");
        getContentPane().add(moveCount);
        moveCount.setBounds(110, 70, 90, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Moves::");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 90, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l8KeyPressed
             int keycode=evt.getKeyCode();
            JLabel[][] jl={{l0,l1,l2},{l3,l4,l5},{l6,l7,l8}};
            int count=Integer.parseInt(moveCount.getText());
        
      switch(keycode)
        {
            case KeyEvent.VK_UP:
                y=y1;
                if(x != 0)
                {
                 moveCount.setText(""+(count-1));
                 String temp=jl[x][y].getText();
                 jl[x][y].setText(jl[x-1][y].getText());
                 jl[x-1][y].setText(temp);
                 x--;
                }
                break;
            case KeyEvent.VK_DOWN:
                y=y1;
                if(x != 2)
                {
                    moveCount.setText(""+(count-1));
                    String temp=jl[x][y].getText();
                    jl[x][y].setText(jl[x+1][y].getText());
                    jl[x+1][y].setText(temp);
                    x++;
                }
                break;
            case KeyEvent.VK_LEFT:
                x1=x;
                 if(y1 != 0)
                 {
                     moveCount.setText(""+(count-1));
                     String temp=jl[x1][y1].getText();
                     jl[x1][y1].setText(jl[x1][y1-1].getText());
                     jl[x1][y1-1].setText(temp);
                     y1--;
                 }
                 break;
            case KeyEvent.VK_RIGHT:
                x1=x;
                if(y1 != 2)
                 {
                     moveCount.setText(""+(count-1));
                     String temp=jl[x1][y1].getText();
                     jl[x1][y1].setText(jl[x1][y1+1].getText());
                     jl[x1][y1+1].setText(temp);
                     y1++;
                 }
        }
        
    }//GEN-LAST:event_l8KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showNumberOnBox();
        l8.setFocusable(true);
        l8.requestFocusInWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NumberPuzeel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberPuzeel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberPuzeel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberPuzeel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberPuzeel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l0;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel moveCount;
    private javax.swing.JPanel p1;
    // End of variables declaration//GEN-END:variables
}
