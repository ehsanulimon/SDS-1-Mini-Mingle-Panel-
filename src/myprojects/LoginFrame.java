
package myprojects;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Imon
 */
public class LoginFrame extends javax.swing.JInternalFrame {

    
     private JLabel u1, u2;
    private JTextField T;
    private JPasswordField pw;
    private JButton submit, clear;
    private Container c;
    private Font f;
    
    public LoginFrame() {
        initComponents();
         Login();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("LoginFrame");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void  Login(){
    c = this.getContentPane();
        c.setLayout(null);
            f = new Font("Arial", Font.BOLD, 22);

        u1 = new JLabel("Username:");
        u1.setBounds(50, 20, 250, 50);
        u1.setHorizontalAlignment(JTextField.LEFT);
        u1.setToolTipText("  \n Username:  \n\t   imon  \n ");
        u1.setFont(f);
        c.add(u1);

        T = new JTextField();
        T.setFont(f);
        T.setBounds(160, 20, 250, 50);
        T.setHorizontalAlignment(JTextField.CENTER);
        //T.setBackground(Color.LIGHT_GRAY);
           T.setToolTipText("  \n Username:  \n\t   imon  \n ");
        c.add(T);
        

        u2 = new JLabel("Password:");
        u2.setBounds(50, 80, 250, 50);
        u2.setHorizontalAlignment(JTextField.LEFT);
        u2.setToolTipText(" \n password:  123  \n  ");
        u2.setFont(f);
        c.add(u2);

         pw = new JPasswordField();

        pw.setBounds(160, 80, 250, 50);
        pw.setBackground(Color.LIGHT_GRAY);
        pw.setFont(f);
        pw.setEchoChar('*');
        c.add(pw);


        submit = new JButton("Submit");
        submit.setBounds(160, 140, 120, 50);
       submit.setBackground(Color.green);
        submit.setFont(f);
        c.add(submit);

        clear = new JButton("Clear");
        clear.setBounds(290, 140, 120, 50);
        clear.setBackground(Color.RED);
        clear.setFont(f);
        c.add(clear);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                T.setText(" ");
                pw.setText("");
            }

        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String name = T.getText();
                String password = pw.getText();
                if (name.equals("imon") && password.equals("123")) {
                    JOptionPane.showMessageDialog(null, "you are successfully login");
                    dispose();
                   // MFrame Frame1=new MFrame();
                   // Clock Frame1=new Clock();
                  
                } else {

                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
