/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        DocterTeam = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingLabel = new javax.swing.JLabel();
        NameTeam = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BackgroundImages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocterTeam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/team3-removebg-preview.png"))); // NOI18N
        BackgroundPanel.add(DocterTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 520, 330));

        LoadingBar.setBackground(new java.awt.Color(0, 120, 215));
        BackgroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 750, -1));

        LoadingLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 15)); // NOI18N
        LoadingLabel.setText("Loading ....");
        BackgroundPanel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        NameTeam.setFont(new java.awt.Font("Sitka Text", 1, 55)); // NOI18N
        NameTeam.setForeground(new java.awt.Color(51, 51, 255));
        NameTeam.setText("COVID'S VICTIM");
        BackgroundPanel.add(NameTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        LoadingValue.setFont(new java.awt.Font("Segoe UI Symbol", 1, 15)); // NOI18N
        LoadingValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LoadingValue.setText("0 %");
        BackgroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 40, -1));
        BackgroundPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 310, 10));

        BackgroundImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pates.jpg"))); // NOI18N
        BackgroundPanel.add(BackgroundImages, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Loading sp = new Loading() ;
        sp.setVisible(true);
        
        try {
            for(int i = 0 ; i <= 100 ; i++){
                Thread.sleep(10);
                sp.LoadingValue.setText(i + " %");
                if(i==10){
                    sp.LoadingLabel.setText("Turning On Modules ....");
                }
                if(i==20){
                    sp.LoadingLabel.setText("Loading Modules ....");
                }
                if(i==50){
                    sp.LoadingLabel.setText("Connecting to Database ....");
                }
                if(i==70){
                    sp.LoadingLabel.setText("Connection Successful !!!");
                }
                if(i==80){
                    sp.LoadingLabel.setText("Launching Application ....");
                }
                if(i == 100){
                    Login lg = new Login();
                    lg.setVisible(true);
                    sp.dispose();
                }
                sp.LoadingBar.setValue(i);
            }
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImages;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel DocterTeam;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel NameTeam;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}