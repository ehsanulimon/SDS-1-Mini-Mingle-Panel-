
package myprojects;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Imon
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenuItem();
        NEW = new javax.swing.JMenuItem();
        MenuFrames = new javax.swing.JMenu();
        MenuIFrame1 = new javax.swing.JMenuItem();
        MenuLogin = new javax.swing.JMenuItem();
        Cricket = new javax.swing.JMenuItem();
        Guessing_game = new javax.swing.JMenuItem();
        jMenuItemClock = new javax.swing.JMenuItem();
        jMenuImageViewer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        help_1_1 = new javax.swing.JMenuItem();
        help_1_2 = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home-Mini Mingle Panel ");
        setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        Desktop.setBackground(new java.awt.Color(0, 0, 51));
        Desktop.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        jLabel1.setText("Mini Mingle Panel ");

        MenuFile.setText("File");

        MenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        MenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Close-icon.png"))); // NOI18N
        MenuExit.setText("Exit");
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        MenuFile.add(MenuExit);

        NEW.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Files-New-Window-icon14.png"))); // NOI18N
        NEW.setText("New");
        NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWActionPerformed(evt);
            }
        });
        MenuFile.add(NEW);

        jMenuBar1.add(MenuFile);

        MenuFrames.setText("Window");
        MenuFrames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFramesActionPerformed(evt);
            }
        });

        MenuIFrame1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        MenuIFrame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Crafting-Table-icon.png"))); // NOI18N
        MenuIFrame1.setText("Multiplication table");
        MenuIFrame1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                MenuIFrame1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        MenuIFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIFrame1ActionPerformed(evt);
            }
        });
        MenuFrames.add(MenuIFrame1);

        MenuLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        MenuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preferences-system-login-icon.png"))); // NOI18N
        MenuLogin.setText("Login");
        MenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLoginActionPerformed(evt);
            }
        });
        MenuFrames.add(MenuLogin);

        Cricket.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Cricket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cricket-icon.png"))); // NOI18N
        Cricket.setText("Cricket");
        Cricket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CricketActionPerformed(evt);
            }
        });
        MenuFrames.add(Cricket);

        Guessing_game.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        Guessing_game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/games-folder-icon.png"))); // NOI18N
        Guessing_game.setText("Guessing Game");
        Guessing_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guessing_gameActionPerformed(evt);
            }
        });
        MenuFrames.add(Guessing_game);

        jMenuItemClock.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apps-colors-icon.png"))); // NOI18N
        jMenuItemClock.setText("RGB Selection");
        jMenuItemClock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClockActionPerformed(evt);
            }
        });
        MenuFrames.add(jMenuItemClock);

        jMenuImageViewer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuImageViewer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Picture-Viewer-icon.png"))); // NOI18N
        jMenuImageViewer.setText("ImageViewer");
        jMenuImageViewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuImageViewerActionPerformed(evt);
            }
        });
        MenuFrames.add(jMenuImageViewer);

        jMenuBar1.add(MenuFrames);

        jMenu2.setText("Help");

        help_1_1.setText("JTattoo Source  ");
        help_1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_1_1ActionPerformed(evt);
            }
        });
        jMenu2.add(help_1_1);

        help_1_2.setText("Discription");
        help_1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_1_2ActionPerformed(evt);
            }
        });
        jMenu2.add(help_1_2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_MenuExitActionPerformed

    private void MenuIFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIFrame1ActionPerformed
        // TODO add your handling code here:
         Multiplication f = new Multiplication();
          Desktop.add(f);
        f.setVisible(true);
       
    }//GEN-LAST:event_MenuIFrame1ActionPerformed

    private void MenuFramesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFramesActionPerformed
      
    }//GEN-LAST:event_MenuFramesActionPerformed

    private void MenuIFrame1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MenuIFrame1AncestorMoved
 
  
    }//GEN-LAST:event_MenuIFrame1AncestorMoved

    private void MenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLoginActionPerformed
        // TODO add your handling code here:
        LoginFrame l =new LoginFrame();
           Desktop.add(l);
        l.setVisible(true);
    }//GEN-LAST:event_MenuLoginActionPerformed

    private void NEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
    }//GEN-LAST:event_NEWActionPerformed

    private void CricketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CricketActionPerformed
        // TODO add your handling code here:
        CricketFrame c =new CricketFrame();
        Desktop.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_CricketActionPerformed

    private void Guessing_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guessing_gameActionPerformed
        // TODO add your handling code here:
         Guessing c5 =new Guessing();
        Desktop.add(c5);
        c5.setVisible(true);
    }//GEN-LAST:event_Guessing_gameActionPerformed

    private void jMenuItemClockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClockActionPerformed
        // TODO add your handling code here:
         RGB c6 =new RGB();
        Desktop.add(c6);
        c6.setVisible(true);
    }//GEN-LAST:event_jMenuItemClockActionPerformed

    private void jMenuImageViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuImageViewerActionPerformed
        // TODO add your handling code here:
        ImageViewer  i=new ImageViewer();
        i.setVisible(true);
    }//GEN-LAST:event_jMenuImageViewerActionPerformed

    private void help_1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_1_1ActionPerformed
        // TODO add your handling code here:
        HelpFrame01  i=new HelpFrame01();
        i.setVisible(true);
    }//GEN-LAST:event_help_1_1ActionPerformed

    private void help_1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_1_2ActionPerformed
        // TODO add your handling code here:
         HelpFrame02  i=new HelpFrame02();
        i.setVisible(true);
    }//GEN-LAST:event_help_1_2ActionPerformed

 
    public static void main(String args[]) throws InstantiationException, ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                 //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
                 //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
               // UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                 // UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                  if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
         UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
         }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cricket;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem Guessing_game;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenu MenuFrames;
    private javax.swing.JMenuItem MenuIFrame1;
    private javax.swing.JMenuItem MenuLogin;
    private javax.swing.JMenuItem NEW;
    private javax.swing.JMenuItem help_1_1;
    private javax.swing.JMenuItem help_1_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuImageViewer;
    private javax.swing.JMenuItem jMenuItemClock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
