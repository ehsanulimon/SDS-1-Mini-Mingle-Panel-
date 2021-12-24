
package myprojects;

public class HelpFrame02 extends javax.swing.JFrame {

    public HelpFrame02() {
        initComponents();
        inco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        js_1_0 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        js_1_0.setViewportView(jTextArea1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js_1_0, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js_1_0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void inco(){
        String i = "INTRODUCTION\n" +
"The main objective of this project is to design a user friendly. The project Mini Mingle Panel is complete Desktop based application designed on. Net technology using NetBeans IDE 8.2 Software with the help of Java Swing. The main goal of the project is to include this \"Mini Mingle Panel\" to coordinate more than six separate programs. This is a Windows based desktop application, so anyone can use it so easily. "
                  +"\nDEVELOPMENT TOOLS\n" +
"1)	Language: Java Programming language.\n" +
"2)	GUI widget toolkit: Java Swing.\n" +
"3)	Themes: JTattoo.\n" +
"4)	Look and Feels: Texture.\n" +
"5)	Application: Desktop based.\n" +
"\n" +
"\n" +
" "
                  +"\n DESCRIPTION\n" +
"The application is based on managing more applications in one frame. The application has common small applications and small working methods. This application uses a variety of methods to perform small tasks. It is very easy to do and use different things through this application. This is a basic label Windows based desktop application, not a good feature or a big application. This application needs to be changed to bring more dynamic applications.\n" +
""
                  +"\n FEATURES OF PROJECT\n" +
"This is a basic label Windows based desktop application. It gives the details about the project of Mini Mingle Panel. the details components are described on the following page.\n" +
"Home page: As application starts the main/home page appears. This page contains all the sections we have in our application. This page includes a Desktop pane. There are three menus to access different types of data namely. This page includes a Desktop pane. Following the menus:\n" +
"1)	File menu: There are two menu items in this menu. The first of these is the exit application (keyboard shortcut Delete). And last one is the New application (keyboard shortcut Ctri-BackSpace). \n" +
"\n" +
"\n" +
""
                  +"\n 2) Window menu: There are six menu items in this menu. This menu contains the main applications. Following the application \n" +
"3) Help menu: This menu helps users and developers."
                  +"\n "+
                 
"\nMultiplication page:  Multiplication page is a JInternalFrame from. This page display in the Desktop pane of Home page. Its job is to do multiplication table. Any integer number can be given in the text field and Click on Enter button or Press keyboard shortcut enter. Displays it in the table after finding the multiplication. (keyboard shortcut Alt-1).\n" +
"Login page: Login page is a JInternalFrame from. This page display in the Desktop pane of Home page.  Its job is to do Admin login is determined by the user name and password.To clear the all text, click the Clear button. (keyboard shortcut Alt-L).                                          \n" +
"Cricket page: Cricket page is a JInternalFrame from. This page display in the Desktop pane of Home page. Its job is to do easy Cricket run count. It works better than a calculator. Each run-count is published separately. How many runs came from each number is revealed individually. Each time the button is clicked, the image on the slide changes. Clicking the \"Player Image\" button reveals a new slide and automatically changes the player's image on the slide.(keyboard shortcut Alt-C).\n" +
"Guessing game page: Guessing game page is a JInternalFrame from. This page display in the Desktop pane of Home page. Its job is to do Guess game use random number. The Guess game is five round. The tabbed pane is used to move from one round to another. Each round is a different task from the other round. (keyboard shortcut Alt-G).\n" +
"RGB page: RGB page is a JInternalFrame from. This page display in the Desktop pane of Home page. Its job is to do RGB Color Selectin Panel or method. (keyboard shortcut Alt-C).\n" +
"ImageViewer page: Image Viewer page is a JFrame from. This page does not display in the Desktop pane of Home page. This page displays individually. Its work to do individual Image View and Slideshow. (keyboard shortcut Ctrl-V).\n" +
"" +
"\n" +
"\n" +
"\n" +
"";

                      
        
       jTextArea1.setText(i);
       jTextArea1.setEditable(false);
    }
    
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
            java.util.logging.Logger.getLogger(HelpFrame02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpFrame02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpFrame02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpFrame02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpFrame02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane js_1_0;
    // End of variables declaration//GEN-END:variables
}
