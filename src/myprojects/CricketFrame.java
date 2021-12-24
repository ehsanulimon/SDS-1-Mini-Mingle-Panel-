
package myprojects;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

/**
 *
 * @author Imon
 */
public class CricketFrame extends javax.swing.JInternalFrame {
        Container c;
        public int total = 0, six = 0, four = 0, two = 0, one = 0,out=0,a,num1,num2,num4,num6,num0,ball=0,no1=0,nw1=0,r5=0,r3=0,n3,n5;
      JTextArea ta, t6, t4, t2, t1, tfout,t0,tf6,tf4,tf2,tf1,tf0,adp,tfball,tfno,tfw,tfa;
      JButton ba, bb, bc, b6, b4, b2, b1, b0,b3,b5,bno,bw,bnext,b_c,badp;
      private JLabel labeltotal,lnum,lrun,wicket,Lball,lslide,Lname;
    private JScrollPane jsp;
    private JPanel panel;
    private CardLayout cl;
    
    int test;
        private ImageIcon icon,img6, img4, img2, img1, img0,slide1,img3,img5;
   
    public CricketFrame() {
       // icon =new ImageIcon(getClass().getResource("S.png"));
        initComponents();
        inco();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setTitle("CricketFrame");
        setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void inco(){
        c = this.getContentPane();
        c.setVisible(true);
      // c.setBackground(Color.magenta);
         cl = new CardLayout();
        panel = new JPanel(cl);
        panel.setBounds(350,2,300,120);
        panel.setBackground(Color.yellow);
        c.add(panel);
    
          img6 = new ImageIcon(getClass().getResource("6.png"));
        img4 = new ImageIcon(getClass().getResource("4.png"));
        img2 = new ImageIcon(getClass().getResource("2.png"));
        img1 = new ImageIcon(getClass().getResource("1.png"));
        img0 = new ImageIcon(getClass().getResource("0.png"));
        img3 = new ImageIcon(getClass().getResource("three-icon.png"));
        img5 = new ImageIcon(getClass().getResource("Number-5-icon.png"));
       String[] imgname={ "st.jpg","pk.jpeg","aus.jpg","bd.jpg","uke.jpg","afg.jpg","is.jpg","zm.jpg","nz.jpg","bd2.jpg","sl.jpg","sf.jpg"};
        for(String n: imgname){
         slide1= new ImageIcon("src/img/"+n);
         //******* resize the image *********
         Image i =slide1.getImage();
         Image newimage =i.getScaledInstance(panel.getWidth(),panel.getWidth(),Image.SCALE_SMOOTH);
         slide1= new ImageIcon(newimage);
         
        lslide =new JLabel(slide1);
        panel.add(lslide);
        }
       
        
            Cursor cu = new Cursor(Cursor.HAND_CURSOR);
            Cursor cr = new Cursor(Cursor.DEFAULT_CURSOR);
   
       
     //**************************       
             b6 = new JButton(img6);
        b6.setBounds(10, 200, 100, 150);
        b6.setBackground(Color.RED);
        b6.setCursor(cu);
        c.add(b6);
        
             b4 = new JButton(img4);
        b4.setBounds(110, 200, 100, 150);
        b4.setBackground(Color.BLUE);
        b4.setCursor(cu);
        c.add(b4);

           b2 = new JButton(img2);
        b2.setBounds(210, 200, 100, 150);
        b2.setBackground(Color.GREEN);
        b2.setCursor(cu);
        c.add(b2);

           b1 = new JButton(img1);
        b1.setBounds(310, 200, 100, 150);
        b1.setBackground(Color.YELLOW);
        b1.setCursor(cu);
        c.add(b1);

             b0 = new JButton(img0);
        b0.setBounds(410, 200, 100, 150);
        b0.setBackground(Color.CYAN);
        b0.setCursor(cu);
        c.add(b0);

       

            b3 = new JButton(img3);
        b3.setCursor(cu);
        b3.setBounds(260,350,70,60);
       // b3.setFont(new Font("Verdana", Font.BOLD, 50));
       // b3.setForeground(Color.BLACK);
        b3.setBackground(new Color(255,51,255));
        c.add(b3);
        
           b5 = new JButton(img5);
        b5.setCursor(cu);
        b5.setBounds(260,410,70,60);
        //b5.setFont(new Font("Verdana", Font.BOLD, 50));
       // b5.setForeground(Color.BLACK);
        b5.setBackground(new Color(127,0,255));
        c.add(b5);
      
            Font f = new Font("Arial", Font.BOLD, 45);
            Font f2 = new Font("Arial", Font.BOLD, 30);
            Font f3 = new Font("Arial", Font.BOLD, 20);

            //********** no boll , wide ball and out  *********
            
            
            
            bno = new JButton("No Ball");
        bno.setCursor(cu);
        bno.setBounds(10,350,200,40);
        bno.setFont(new Font("Verdana", Font.BOLD,25));
        bno.setForeground(Color.BLACK);
        bno.setBackground(new Color(204,102,0));
        c.add(bno);
           tfno = new JTextArea(" 0");
        tfno.setBounds(210,350,50,40);
        tfno.setForeground(Color.WHITE);
        tfno.setBackground(new Color(204,102,0));
        tfno.setCursor(cr);
         tfno.setEditable(false);
        tfno.setFont(f2);
        c.add(tfno);
        
        
             bw = new JButton("Wide Ball");
        bw.setCursor(cu);
        bw.setBounds(10,390,200,40);
        bw.setFont(new Font("Verdana", Font.BOLD,25));
        bw.setForeground(Color.BLACK);
        bw.setBackground(new Color(0,128,255));
        c.add(bw);
             tfw = new JTextArea(" 0");
        tfw.setBounds(210,390,50,40);
        tfw.setForeground(Color.WHITE);
        tfw.setBackground(new Color(0,128,255));
         tfw.setEditable(false);
        tfw.setFont(f2);
        c.add(tfw);
        
              ba = new JButton("Out");
        ba.setCursor(cu);
        ba.setBounds(10,430,200,40);
        ba.setFont(new Font("Verdana", Font.BOLD, 30));
        ba.setForeground(Color.BLACK);
        ba.setBackground(new Color(255,26,0));
        c.add(ba);
                tfa = new JTextArea(" 0");
        tfa.setBounds(210,430,50,40);
        tfa.setForeground(Color.WHITE);
        tfa.setBackground(new Color(255,26,0));
         tfa.setEditable(false);
        tfa.setFont(f2);
        c.add(tfa);
        
            //****************************************8
            // six four two one run count****************
            lrun = new JLabel();
        lrun.setText("Run");
        lrun.setBounds(500,170,60,25);
        lrun.setFont(f3);
          lrun.setBackground(Color.magenta);
        lrun.setOpaque(true);
        
        c.add(lrun);
            
            t6 = new JTextArea("00");
        t6.setBounds(30,170,60,25);
        t6.setForeground(Color.WHITE);
        t6.setBackground(Color.DARK_GRAY);
        
        t6.setEditable(false);
        t6.setFont(f3);
        c.add(t6);
        
           t4 = new JTextArea("00");
        t4.setBounds(130, 170, 60,25);
        t4.setForeground(Color.WHITE);
        t4.setBackground(Color.DARK_GRAY);
         t4.setEditable(false);
        t4.setFont(f3);
        c.add(t4);

             t2 = new JTextArea("00");
        t2.setBounds(230, 170, 60,25);
        t2.setForeground(Color.WHITE);
        t2.setBackground(Color.DARK_GRAY);
         t2.setEditable(false);
        t2.setFont(f3);
        c.add(t2);

             t1 = new JTextArea("00");
        t1.setBounds(330, 170,60,25);
        t1.setForeground(Color.WHITE);
        t1.setBackground(Color.DARK_GRAY);
         t1.setEditable(false);
        t1.setFont(f3);
        c.add(t1);
        
             t0 = new JTextArea("00");
        t0.setBounds(430,170,60,25);
        t0.setForeground(Color.WHITE);
        t0.setBackground(Color.DARK_GRAY);
         t0.setEditable(false);
        t0.setFont(f3);
        c.add(t0);
        

            //******************************
            //six four two one individuals count
          lnum = new JLabel();
        lnum.setText("Number");
        lnum.setBounds(500,135,80,25);
        lnum.setFont(f3);
         lnum.setBackground(Color.magenta);
        lnum.setOpaque(true);
    
        c.add(lnum);
        
        tf6 = new JTextArea("00");
        tf6.setBounds(30, 135, 60,25);
        tf6.setForeground(Color.WHITE);
        tf6.setBackground(Color.DARK_GRAY);
        tf6.setEditable(false);
        tf6.setFont(f3);
        c.add(tf6);

        tf4 = new JTextArea("00");
        tf4.setBounds(130, 135,60,25);
        tf4.setForeground(Color.WHITE);
        tf4.setBackground(Color.DARK_GRAY);
        tf4.setEditable(false);
        tf4.setFont(f3);
        c.add(tf4);

        tf2 = new JTextArea("00");
        tf2.setBounds(230, 135,60,25);
        tf2.setForeground(Color.WHITE);
        tf2.setBackground(Color.DARK_GRAY);
        tf2.setEditable(false);
        tf2.setFont(f3);
        c.add(tf2);

           tf1 = new JTextArea("00");
        tf1.setBounds(330, 135, 60,25);
        tf1.setForeground(Color.WHITE);
        tf1.setBackground(Color.DARK_GRAY);
         tf1.setEditable(false);
        tf1.setFont(f3);
        c.add(tf1);
        
            tf0 = new JTextArea("00");
        tf0.setBounds(430, 135,60,25);
        tf0.setForeground(Color.WHITE);
        tf0.setBackground(Color.DARK_GRAY);
         tf0.setEditable(false);
        tf0.setFont(f3);
        c.add(tf0);
            //********************************
            // labeltotal**************************
            labeltotal = new JLabel();
        labeltotal.setText("Score");
        labeltotal.setBounds(670,0,130,29);
        labeltotal.setFont(f2);
        labeltotal.setForeground(Color.WHITE);
        labeltotal.setOpaque(true);
        labeltotal.setBackground(Color.BLACK);
       // labeltotal.setToolTipText(" ");
        c.add(labeltotal);
             ta = new JTextArea("000");
        ta.setBounds(670,30,130,33);
        ta.setForeground(Color.WHITE);
        ta.setBackground(Color.GREEN);
        ta.setEditable(false);
        ta.setFont(f2);
        c.add(ta);
            //** wicket display *******
             wicket = new JLabel();
        wicket.setText("Wickets");
        wicket.setBounds(670,64,130,30);
        wicket.setFont(f2);
        wicket.setForeground(Color.WHITE);
        wicket.setOpaque(true);
        wicket.setBackground(Color.BLACK);
        c.add(wicket);
             tfout = new JTextArea("0");
        tfout.setBounds(670,96,130,32);
        tfout.setForeground(Color.WHITE);
        tfout.setBackground(Color.GREEN);
        tfout.setEditable(false);
        //tfo.setFont(new Font("MV boil",Font.TYPE1_FONT, 45));
        tfout.setFont(f2);
        c.add(tfout);
            //**** boll count************
             Lball = new JLabel();
        Lball.setText("Ball");
        Lball.setBounds(670,126,130,30);
        Lball.setFont(f2);
        Lball.setForeground(Color.WHITE);
        Lball.setOpaque(true);
        Lball.setBackground(Color.BLACK);
        c.add(Lball);
             tfball = new JTextArea(" 000 ");
        tfball.setBounds(670,159,130,35);
        tfball.setForeground(Color.WHITE);
        tfball.setBackground(Color.GREEN);
        tfball.setEditable(false);
        //tfo.setFont(new Font("MV boil",Font.TYPE1_FONT, 45));
        tfball.setFont(f2);
        c.add(tfball);
        //************************************************************
          bnext = new JButton("Player Image");
        bnext.setCursor(cu);
        bnext.setBounds(340,350,150,40);
        bnext.setFont(new Font("Verdana", Font.BOLD,16));
        bnext.setForeground(Color.BLACK);
        bnext.setBackground(new Color(200,28,255));
        c.add(bnext);
           b_c = new JButton("Innings");
        b_c.setCursor(cu);
        b_c.setBounds(340,390,150,40);
        b_c.setFont(new Font("Verdana", Font.BOLD,16));
        b_c.setForeground(Color.BLACK);
        b_c.setBackground(new Color(200,28,255));
        c.add(b_c);
              badp = new JButton("Player list clear");
        badp.setCursor(cu);
        badp.setBounds(340,430,150,40);
        badp.setFont(new Font("Verdana", Font.BOLD,16));
        badp.setForeground(Color.BLACK);
        badp.setBackground(new Color(200,28,255));
        c.add(badp);
               Lname = new JLabel();
          Lname.setText("Easy Run Count Method");
           Lname.setBounds(0,0,350,50);
           Lname.setForeground(Color.RED);
           Lname.setFont(new Font("MV Boli", Font.BOLD,27));
          Lname.setOpaque(true);
           c.add( Lname);
        //******************************************************
            adp = new JTextArea("Abu Jayed\n"+
                  "Afif Hossain\n"+
                  "Al-Amin Hossain\n"+
                  "Aminul Islam\n"+
                  "Ebadat Hossain\n"+
                  "Hasan Mahmud\n"+
                  "Imrul Kayes\n"+
                  "Liton Das\n"+
                  "Mahedi Hasan\n"+
                  "Mahmudullah\n"+
                  "Mashrafe Mortaza\n"+
                  "Mehidy Hasan Miraz\n"+
                  "Mohammad Mithun\n"+
                  "Mohammad Naim\n"+
                  "Mohammad Saifuddin\n"+
                  "Mominul Haque\n"+
                  "Mosaddek Hossain\n"+
                  "Mushfiqur Rahim\n"+
                  "Mustafizur Rahman\n"+
                  "Nayeem Hasan\n"+
                  "Najmul Hossain Shanto\n"+
                  "Rubel Hossain\n"+
                  "Sabbir Rahman\n"+
                  "Saif Hassan\n"+
                  "Shadman Islam\n"+
                  "Shafiul Islam\n"+
                  "Shakib Al Hasan\n"+
                  "Soumya Sarkar\n"+
                  "Taijul Islam\n"+
                  "Tamim Iqbal");
        //this.add(adp,BorderLayout.CENTER);  
        adp.setWrapStyleWord(true); 
        adp.setFont(f3);
        adp.setBackground(Color.GREEN);
            JScrollPane jsp = new JScrollPane(adp,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         jsp.setBounds(510,200,280,415);
         c.add(jsp);                 
        //************************************
   b6.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
               cl.next(panel);
            six = six + 6;

            String r = String.valueOf(six);
            t6.setText(r);
            num6=num6+1;
            String n = String.valueOf(num6);
            tf6.setText(n);
            total = total+6;
          String n6 = String.valueOf(total);
        ta.setText(n6);
        
          ball = ball+1;
          String b = String.valueOf(ball);
             tfball.setText(b); 
            
        }
   });
   b4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
                cl.next(panel);
          // c.setBackground(Color.BLUE);
            four = four + 4;
            String r = String.valueOf(four);
            t4.setText(r);
            
            num4=num4+1;
            String n = String.valueOf(num4);
            tf4.setText(n);
            total = total+4;
               String n4 = String.valueOf(total);
            ta.setText(n4);
            
              ball = ball+1;
          String b = String.valueOf(ball);
             tfball.setText(b); 
        }
   });
   
    b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
           // c.setBackground(Color.GREEN);
              cl.next(panel);
            two = two + 2;

            String r = String.valueOf(two);
            t2.setText(r);
            
             num2=num2+1;
            String n = String.valueOf(num2);
            tf2.setText(n);
              total = total+2;
               String n2 = String.valueOf(total);
            ta.setText(n2);
            
              ball = ball+1;
          String b = String.valueOf(ball);
             tfball.setText(b); 
        }
   });
     b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             cl.next(panel);
            one = one + 1;
            String r = String.valueOf(one);
            t1.setText(r);
            
             num1=num1+1;
            String n = String.valueOf(num1);
            tf1.setText(n);
              total = total+1;
               String n1 = String.valueOf(total);
            ta.setText(n1);
         
              ball = ball+1;
          String b = String.valueOf(ball);
             tfball.setText(b); 
        }
   });
      b0.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
                    cl.next(panel);
           // c.setBackground(Color.CYAN);
          
                 num0=num0+1;
            String n = String.valueOf(num0);
            tf0.setText(n); 
            
              ball = ball+1;
          String b = String.valueOf(ball);
             tfball.setText(b); 
        }
   });
     b3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            cl.next(panel);
            r3=r3+3;
            n3=n3+1;
              total = total+3;
               String n3 = String.valueOf(total);
            ta.setText(n3);
            
              ball = ball+1;
          String b = String.valueOf(ball);
             tfball.setText(b); 
        }
   });
     b5.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            cl.next(panel);
            r5=r5+5;
            n5=n5+1;
              total = total+5;
               String n5 = String.valueOf(total);
            ta.setText(n5);
            
              ball = ball+1;
          String b = String.valueOf(ball);
             tfball.setText(b); 
        }
   });
     bno.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
           // c.setBackground(Color.YELLOW);
               cl.next(panel);
            
             no1=no1+1;
            String nob1 = String.valueOf(no1);
            tfno.setText(nob1);
              total = total+1;
               String no1 = String.valueOf(total);
            ta.setText(no1);
       
        }
   });
     bw.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){          
               cl.next(panel);
            nw1=nw1+1;
            String w = String.valueOf(nw1);
            tfw.setText(w);
              total = total+1;
               String nw1 = String.valueOf(total);
            ta.setText(nw1);         
        }
   });
     ba.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
                  cl.next(panel);                     
             out=out+1;  
             String u = String.valueOf(out);
         if(out<=10){
             tfout.setText(u);
             tfa.setText(u);
         }
         else{
          tfout.setText("AllOut");
            }   
         ball = ball+1;
          String b = String.valueOf(ball);            
             tfball.setText(b);  
        }
   });
     
      bnext.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
           PlayerImageShow  i=new PlayerImageShow();
          i.setVisible(true);
        }
   });
        b_c.addActionListener(new ActionListener() {
            @Override
            //ta, t6, t4, t2, t1, tfout,t0,tf6,tf4,tf2,tf1,tf0,adp,tfball,tfno,tfw,tfa;
            public void actionPerformed(ActionEvent ae) {
                //  tf.setText(" ");
                ta.setText("");
                t6.setText("");
                t4.setText("");
                t2.setText("");
                t1.setText("");
                tfout.setText("");
                t0.setText("");
                tf6.setText("");
                tf4.setText("");
                tf2.setText("");
                tf1.setText("");
                tf0.setText("");
                tfball.setText("");
                tfno.setText("");
                tfw.setText("");
                tfa.setText("");
            }
        });
         badp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  tf.setText(" ");
                adp.setText("");
            }
        });
}
}

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

