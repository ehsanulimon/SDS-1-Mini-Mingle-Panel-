
package myprojects;
import javax.swing.*;

/**
 *
 * @author Imon
 */
public class ImageViewer extends javax.swing.JFrame {

    public ImageViewer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSP = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        SlideShow = new javax.swing.JMenuItem();
        Viewer = new javax.swing.JMenuItem();
        Open_mt = new javax.swing.JMenuItem();
        Clear_mt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ImageViewer");

        jMenu1.setText("File");

        jMenu3.setText("View");

        SlideShow.setText("SlideShow");
        SlideShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlideShowActionPerformed(evt);
            }
        });
        jMenu3.add(SlideShow);

        Viewer.setText("Exit");
        Viewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewerActionPerformed(evt);
            }
        });
        jMenu3.add(Viewer);

        jMenu1.add(jMenu3);

        Open_mt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        Open_mt.setText("Open Image ");
        Open_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open_mtActionPerformed(evt);
            }
        });
        jMenu1.add(Open_mt);

        Clear_mt.setText("Clear Image");
        Clear_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_mtActionPerformed(evt);
            }
        });
        jMenu1.add(Clear_mt);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSP, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSP, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   JLabel l = new JLabel();
   
    private void Open_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open_mtActionPerformed

        JFileChooser jfc = new JFileChooser();
        if(jfc.showOpenDialog(JSP)== JFileChooser.APPROVE_OPTION)
        {
            java.io.File f = jfc.getSelectedFile();
            l.setIcon(new ImageIcon(f.toString()));
            l.setHorizontalAlignment(JLabel.CENTER);
            JSP.getViewport().add(l);
        }
    }//GEN-LAST:event_Open_mtActionPerformed

    private void Clear_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_mtActionPerformed
        // TODO add your handling code here:
        l.setIcon(null);
    }//GEN-LAST:event_Clear_mtActionPerformed

    private void ViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewerActionPerformed
  System.exit(0);
         
    }//GEN-LAST:event_ViewerActionPerformed

    private void SlideShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlideShowActionPerformed
        // TODO add your handling code here:
         JavaSlideShow  s=new JavaSlideShow();
        s.setVisible(true);
    }//GEN-LAST:event_SlideShowActionPerformed


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
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Clear_mt;
    public javax.swing.JScrollPane JSP;
    public javax.swing.JMenuItem Open_mt;
    private javax.swing.JMenuItem SlideShow;
    private javax.swing.JMenuItem Viewer;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
