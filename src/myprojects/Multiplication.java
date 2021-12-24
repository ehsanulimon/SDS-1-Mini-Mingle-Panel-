
package myprojects;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Imon
 */
public class Multiplication extends javax.swing.JInternalFrame {
         Container c;
      private  Label Tlabel,Lname;
        JTextArea ta;
          private JButton submit;
    public Multiplication() {
      
        initComponents();
        inco();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Multiplication table");
        setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public void  inco(){
         c = this.getContentPane();
        c.setVisible(true);
     
             Font f = new Font("Arial", Font.BOLD,30);
         Tlabel = new Label("Enter the number");
        Tlabel.setForeground(Color.GREEN);
        Tlabel.setBackground(Color.RED);
        Tlabel.setBounds(10,100,300,50);
  
        Tlabel.setFont(f);
          c.add(Tlabel);
             JTextField tf = new JTextField();
        tf.setBounds(310,100,80, 50);
        tf.setBackground(Color.GREEN);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setToolTipText(" Plese enter any integar number. and Now \n Clike on  \n Submit Button \n or \n  enter shortcut ");
        tf.setFont(f);
        c.add(tf);
             JButton button = new JButton("Clear");
        button.setFont(f);
        button.setBounds(160, 260, 120, 50);
        // button.setBackground(Color.yellow);
          button.setToolTipText(" Clear TextArea ");
        c.add(button);

        ta = new JTextArea();
        ta.setBounds(400,100,300,580);
        ta.setBackground(Color.GREEN);
        ta.setEditable(false);
        ta.setFont(f);
        c.add(ta);
        //____________________________________________
            submit = new JButton("Enter");
        submit.setBounds(160, 200, 120, 50);
       submit.setBackground(Color.green);
        submit.setToolTipText(" Plese enter any integar number. and Now \n Clike on  \n Submit Button ");
        submit.setFont(f);
        c.add(submit);

            JLabel  Lname = new JLabel();
          Lname.setText("Multiplication Show");
           Lname.setBounds(400,50,350,50);
           Lname.setForeground(Color.GREEN);
           Lname.setFont(new Font("MV Boli", Font.BOLD,30));
           c.add( Lname);
        //____________________________________________
                  
        
         tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                {
                    String value = tf.getText();
                    if (value.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You didn't put number");

                    } else {
                        ta.setText("");

                        int num = Integer.parseInt(tf.getText());
                        for (int i = 1; i <= 10; i++) {
                            int result = num * i;
                            String r = String.valueOf(result);
                            String n = String.valueOf(num);
                            String incr = String.valueOf(i);

                            ta.append(n + " x " + incr + " = " + r + "\n");

                        }

                    }

                }
            }

        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  tf.setText(" ");
                ta.setText("");

            }

        });
          submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                {
                    String value = tf.getText();
                    if (value.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You didn't put number");

                    } else {
                        ta.setText("");

                        int num = Integer.parseInt(tf.getText());
                        for (int i = 1; i <= 10; i++) {
                            int result = num * i;
                            String r = String.valueOf(result);
                            String n = String.valueOf(num);
                            String incr = String.valueOf(i);

                            ta.append(n + " x " + incr + " = " + r + "\n");

                        }

                    }

                }
            }

        });
        
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
