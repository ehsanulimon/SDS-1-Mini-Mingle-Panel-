
package myprojects;
public class HelpFrame01 extends javax.swing.JFrame {
    public HelpFrame01() {
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
        String i = "These are the JTattoo themes\n" +
"1. TextureLookAndFeel – “com.jtattoo.plaf.texture.TextureLookAndFeel”\n" +
"2. SmartLookAndFeel – “com.jtattoo.plaf.smart.SmartLookAndFeel”\n" +
"3. NoireLookAndFeel – “com.jtattoo.plaf.noire.NoireLookAndFeel”\n" +
"4. AcrylLookAndFeel – “com.jtattoo.plaf.acryl.AcrylLookAndFeel”5. AeroLookAndFeel – “com.jtattoo.plaf.aero.AeroLookAndFeel”\n" +
"6. AluminiumLookAndFeel –\n" +
"“com.jtattoo.plaf.aluminium.AluminiumLookAndFeel”\n" +
"7. BernsteinLookAndFeel –\n" +
"“com.jtattoo.plaf.bernstein.BernsteinLookAndFeel”\n" +
"8. FastLookAndFeel – “com.jtattoo.plaf.fast.FastLookAndFeel”9. GraphiteLookAndFeel – “com.jtattoo.plaf.graphite.GraphiteLookAndFeel”\n" +
"10. HiFiLookAndFeel – “com.jtattoo.plaf.hifi.HiFiLookAndFeel”\n" +
"11. LunaLookAndFeel – “com.jtattoo.plaf.luna.LunaLookAndFeel”\n" +
"12. McWinLookAndFeel – “com.jtattoo.plaf.mcwin.McWinLookAndFeel”13. MintLookAndFeel – “com.jtattoo.plaf.mint.MintLookAndFeel”\n" +
"First download the JTattoo.jar and add into your project classpath then you\n" +
"public static void main(String []args){\n" +
"try {\n" +
"//here you can put the selected theme class name in JTattoo\n" +
"UIManager.setLookAndFeel(\"com.jtattoo.plaf.texture.TextureLookA\n" +
"ndFeel\");\n" +
"} catch (ClassNotFoundException ex) {\n" +
"java.util.logging.Logger.getLogger(PC.class.getName()).log(java\n" +
".util.logging.Level.SEVERE, null, ex);\n" +
"} catch (InstantiationException ex) {\n" +
"java.util.logging.Logger.getLogger(PC.class.getName()).log(java\n" +
".util.logging.Level.SEVERE, null, ex);\n" +
"} catch (IllegalAccessException ex) {\n" +
"java.util.logging.Logger.getLogger(PC.class.getName()).log(java\n" +
".util.logging.Level.SEVERE, null, ex);\n" +
"} catch (javax.swing.UnsupportedLookAndFeelException ex) {\n" +
"java.util.logging.Logger.getLogger(PC.class.getName()).log(java\n" +
".util.logging.Level.SEVERE, null, ex);\n" +
"}\n" +
"}";
                      
        
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
            java.util.logging.Logger.getLogger(HelpFrame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpFrame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpFrame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpFrame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpFrame01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane js_1_0;
    // End of variables declaration//GEN-END:variables
}
