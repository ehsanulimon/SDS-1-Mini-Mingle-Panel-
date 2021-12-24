
package myprojects;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Imon
 */

public class PlayerImageShow extends JFrame{
    JLabel pic;
    Timer tm;
    int x = 0;
    //Images Path In Array
    String[] list = {  "src/img/st.jpg",
                      "src/img/p2.jpg",
                       "src/img/p3.jpg",
                      "src/img/p4.jpg",
                      "src/img/p5.jpg",
                      "src/img/p6.jpg",
                      "src/img/p7.jpg",
                       "src/img/p8.jpg",
                       "src/img/p9.jpg",
                       "src/img/p10.jpg",
                       "src/img/p11.jpg",
                       "src/img/p12.jpg",               
                    };
    
    public PlayerImageShow(){
        super("Player SlideShow");
        pic = new JLabel();
        pic.setBounds(20,20,270,270);

        //Call The Function SetImageSize
        SetImageSize(6);
               //set a timer
        tm = new Timer(500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(330,330);
        getContentPane().setBackground(Color.RED);
        //setLocationRelativeTo(null);
        setLocation(900,0);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

public static void main(String[] args){ 
      
    new PlayerImageShow();
}
}
