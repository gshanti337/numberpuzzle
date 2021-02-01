/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpuzzel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    int n,arraySize;
    int initialValue;
    int end_size_of_row_JLabel;
     boolean pl11,pl22;
     int numberTotalValue;
     JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lbl16,lb17,lb18,lb19,lb20,lb21,lb22,lb23,lb24,lb25;
     JPanel PL1,PL2;
    
   
    public NumberPuzeel(boolean pl1,boolean pl2,int numberDisplyOnbox,int initialValueOf_I,int arraySizeOf_Jth_column,int end_size_of_row_JLabel)
    {
        initComponents();
        p1.setVisible(pl1);
        p2.setVisible(pl2);
        if(pl1)
            p1.setBounds(20, 50, 370,280 );
        else
            p2.setBounds(20,50,390,310);
          
        this.n=numberDisplyOnbox;
        this.numberTotalValue=numberDisplyOnbox;
        this.end_size_of_row_JLabel=end_size_of_row_JLabel;
        this.initialValue=initialValueOf_I;
        this.arraySize=arraySizeOf_Jth_column;
        showNumberOnBox();
        this.pl11=pl1;
        this.pl22=pl2;
       if(pl11)
           l8.setFocusable(true);
        else if(pl22)
            l24.setFocusable(true);
       
    }
    public void showNumberOnBox()
    {
        initilazationOfBoxes();
       // lb2.setText(" xcm");
        JLabel[][] jl={{l0,l1,l2},{l3,l4,l5},{l6,l7,l8},{l9,l10,l11,l12},{l13,l14,l15,l16},{l17,l18,l19,l20},{l21,l22,l23,l24}};
        int[] number={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; 
        int randomNumber;
        for(int i=initialValue;i < end_size_of_row_JLabel ; i++)
        {
           for(int j=0;j < arraySize;j++)
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
                   x=x1=i;
                   y=y1=j;
               }
               else
                   jl[i][j].setText(""+number[randomNumber]);
               n--;   
           }
        }
        
       
    }
    public void initilazationOfBoxes()
    {
         JLabel j11[][]={{lb1,lb2,lb3},{lb4,lb5,lb6},{lb7,lb8,lb9},{lb10,lb11,lb12,lb13},{lb14,lb15,lbl16,lb17},{lb18,lb19,lb20,lb21},{lb22,lb23,lb24,lb25}};
        if(pl11)
        {
               
          
          for(int i=initialValue;i<end_size_of_row_JLabel;i++)
            for(int j=0;j<arraySize;j++)
            {
                j11[i][j]=new JLabel();
                
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
        jButton1 = new javax.swing.JButton();
        moveCount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 430));
        setResizable(false);
        getContentPane().setLayout(null);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        p1.setOpaque(false);

        l2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(p1);
        p1.setBounds(910, 100, 370, 320);

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("New Game");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 350, 130, 40);

        moveCount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        moveCount.setText("300");
        getContentPane().add(moveCount);
        moveCount.setBounds(110, 10, 90, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Moves::");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 90, 29);

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setOpaque(false);

        l9.setBackground(new java.awt.Color(255, 255, 255));
        l9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l10.setBackground(new java.awt.Color(255, 255, 255));
        l10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l11.setBackground(new java.awt.Color(255, 255, 255));
        l11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l15.setBackground(new java.awt.Color(255, 255, 255));
        l15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l14.setBackground(new java.awt.Color(255, 255, 255));
        l14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l13.setBackground(new java.awt.Color(255, 255, 255));
        l13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l17.setBackground(new java.awt.Color(255, 255, 255));
        l17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l18.setBackground(new java.awt.Color(255, 255, 255));
        l18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l19.setBackground(new java.awt.Color(255, 255, 255));
        l19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                l19KeyPressed(evt);
            }
        });

        l12.setBackground(new java.awt.Color(255, 255, 255));
        l12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l16.setBackground(new java.awt.Color(255, 255, 255));
        l16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l20.setBackground(new java.awt.Color(255, 255, 255));
        l20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                l20KeyPressed(evt);
            }
        });

        l21.setBackground(new java.awt.Color(255, 255, 255));
        l21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l22.setBackground(new java.awt.Color(255, 255, 255));
        l22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l23.setBackground(new java.awt.Color(255, 255, 255));
        l23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                l23KeyPressed(evt);
            }
        });

        l24.setBackground(new java.awt.Color(255, 255, 255));
        l24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                l24KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(p2);
        p2.setBounds(480, 110, 390, 310);

        jButton4.setBackground(new java.awt.Color(255, 153, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.setToolTipText("");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(170, 350, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/second pic.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void keypressed(int keycode)
    {
       JLabel[][] jl={{l0,l1,l2},{l3,l4,l5},{l6,l7,l8},{l9,l10,l11,l12},{l13,l14,l15,l16},{l17,l18,l19,l20},{l21,l22,l23,l24}};
       int count=Integer.parseInt(moveCount.getText());
       
      switch(keycode)
        {
            case KeyEvent.VK_UP:
                y=y1;
                if(x != initialValue)
                {                
                 moveCount.setText(""+(count-1));
                 String temp=jl[x][y].getText();
                 jl[x][y].setText(jl[x-1][y].getText());
                 jl[x-1][y].setText(temp);
                 x--;
                 
                }
                checkWinningCodition();
                break;
            case KeyEvent.VK_DOWN:
                y=y1;
                if(x != end_size_of_row_JLabel-1)
                {
                    moveCount.setText(""+(count-1));
                    String temp=jl[x][y].getText();
                    jl[x][y].setText(jl[x+1][y].getText());
                    jl[x+1][y].setText(temp);
                    x++;
                }
                checkWinningCodition();
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
                 checkWinningCodition();
                 break;
            case KeyEvent.VK_RIGHT:
                x1=x;
                if(y1 != arraySize-1 )
                 {
                     moveCount.setText(""+(count-1));
                     String temp=jl[x1][y1].getText();
                     jl[x1][y1].setText(jl[x1][y1+1].getText());
                     jl[x1][y1+1].setText(temp);
                     y1++;
                 }
                checkWinningCodition();
        }
      
     //         else if(numberPosition == numberTotalValue)
                 
    }
    public void checkWinningCodition()
    {
        JLabel[][] jl={{l0,l1,l2},{l3,l4,l5},{l6,l7,l8},{l9,l10,l11,l12},{l13,l14,l15,l16},{l17,l18,l19,l20},{l21,l22,l23,l24}};
        String numberPosition="1";
       int numberPositionInt=1;
       loop1: for(int i=initialValue;i < end_size_of_row_JLabel ; i++)
       {
           for(int j=0;j < arraySize;j++)
          {
              if(jl[i][j].getText().equals(numberPosition) && (numberPositionInt <= numberTotalValue))
              {
                  numberPositionInt=Integer.parseInt(numberPosition);
                  numberPositionInt++;
                  numberPosition=String.valueOf(numberPositionInt);
              }
              else if(jl[end_size_of_row_JLabel-1][arraySize-1].getText().equals(" ") && numberPositionInt==numberTotalValue+1)
              {
                  JOptionPane.showMessageDialog(null, "Congratualtion You Win");
                  jButton1.doClick(1000);
              }
              else 
              {
                  break loop1;
              }}
       }
    }
    private void l19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_l19KeyPressed

    private void l20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l20KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_l20KeyPressed

    private void l23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l23KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_l23KeyPressed

    private void l24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l24KeyPressed
        int keycode=evt.getKeyCode();
        keypressed(keycode);
    }//GEN-LAST:event_l24KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         SelectionPage sp=new SelectionPage();
         sp.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(pl11)
        {
          n=8;
          l8.setFocusable(true);
          l8.requestFocusInWindow();
        }
        else
        {
          n=15;
          l24.setFocusable(true);
          l24.requestFocusInWindow();
        }
        showNumberOnBox();
        moveCount.setText("300");
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void l8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l8KeyPressed
        int keycode=evt.getKeyCode();
        keypressed(keycode);
    }//GEN-LAST:event_l8KeyPressed

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
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l0;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel moveCount;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    // End of variables declaration//GEN-END:variables
}
