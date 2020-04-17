/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Francisco
 */
public final class InterfazWebCam extends javax.swing.JFrame {

    /**
     * Creates new form InterfazWebCam
     */
    int x,y;
    int largoCamara =340;
    int anchoCamara = 330;
    Dimension dimension = new Dimension(largoCamara, anchoCamara);
    Dimension dimension1 = WebcamResolution.VGA.getSize();
    Webcam webcam = Webcam.getDefault();
    WebcamPanel webcamPanel = new WebcamPanel(webcam,dimension,false);
    
    BufferedImage ruta;
    int contador = 0;
    Icon iconoFoto = null;
    PanelAjustesEstudiante f = null;


    public InterfazWebCam(PanelAjustesEstudiante foto) {
        initComponents();
        ////////////////////////////////////////
        jLabel1.setBackground(Color.gray);
        jLabel1.setOpaque(true);
        /////////////////////////////////////
        f = foto;
        setLocationRelativeTo(null);
        webcam.setViewSize(dimension1);
        webcamPanel.setFitArea(true);
        JPanelCamara.setLayout(new FlowLayout());
        JPanelCamara.add(webcamPanel);        
        JblNombreCamara.setText(webcam.toString());
        apagarBotones();
    }
    public void apagarBotones(){
        BtnApagar.setEnabled(false);
        BtnCapturarFoto.setEnabled(false);
        BtnGuardarFoto.setEnabled(false);
    }
    public void prenderBotones(){
        BtnApagar.setEnabled(true);
        BtnCapturarFoto.setEnabled(true);
    }
    
    public void textoBotonesModificados(){
        BtnApagar.setText("iniciando camara..");
        BtnCapturarFoto.setText("iniciando camara..");
        BtnGuardarFoto.setText("iniciando camara..");
        BtnIniciar.setText("iniciando camara..");
    }
    
    public void textoBotonesOriginales(){
        BtnApagar.setText("Apagar.");
        BtnCapturarFoto.setText("Capturar Foto");
        BtnGuardarFoto.setText("Guardar Foto");
        BtnIniciar.setText("Iniciar");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JPanelCamara = new javax.swing.JPanel();
        JblFotoTomada = new javax.swing.JLabel();
        BtnCapturarFoto = new javax.swing.JButton();
        BtnGuardarFoto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        BtnIniciar = new javax.swing.JButton();
        BtnApagar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JblNombreCamara = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelCamara.setBackground(new java.awt.Color(0, 0, 0));
        JPanelCamara.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanelCamara.setPreferredSize(new java.awt.Dimension(360, 320));

        javax.swing.GroupLayout JPanelCamaraLayout = new javax.swing.GroupLayout(JPanelCamara);
        JPanelCamara.setLayout(JPanelCamaraLayout);
        JPanelCamaraLayout.setHorizontalGroup(
            JPanelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );
        JPanelCamaraLayout.setVerticalGroup(
            JPanelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jPanel2.add(JPanelCamara, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 352, 337));

        JblFotoTomada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(JblFotoTomada, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 189, 231));

        BtnCapturarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_capturar.png"))); // NOI18N
        BtnCapturarFoto.setBorderPainted(false);
        BtnCapturarFoto.setContentAreaFilled(false);
        BtnCapturarFoto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_capturar_On.png"))); // NOI18N
        BtnCapturarFoto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_apagar_On.png"))); // NOI18N
        BtnCapturarFoto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_apagar_On.png"))); // NOI18N
        BtnCapturarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCapturarFotoActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCapturarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 170, 50));

        BtnGuardarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_guardar.png"))); // NOI18N
        BtnGuardarFoto.setBorderPainted(false);
        BtnGuardarFoto.setContentAreaFilled(false);
        BtnGuardarFoto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_guardar_on.png"))); // NOI18N
        BtnGuardarFoto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_guardar_on.png"))); // NOI18N
        BtnGuardarFoto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_guardar_on.png"))); // NOI18N
        BtnGuardarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarFotoActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 170, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 30, -1, 430));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Camara");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_x.png"))); // NOI18N
        BtnCerrar.setBorderPainted(false);
        BtnCerrar.setContentAreaFilled(false);
        BtnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_x_On.png"))); // NOI18N
        BtnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_x_On.png"))); // NOI18N
        BtnCerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_x_On.png"))); // NOI18N
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 32, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 430));

        BtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_iniciar.png"))); // NOI18N
        BtnIniciar.setBorderPainted(false);
        BtnIniciar.setContentAreaFilled(false);
        BtnIniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_iniciar_On.png"))); // NOI18N
        BtnIniciar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_iniciar_On.png"))); // NOI18N
        BtnIniciar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_apagar_On.png"))); // NOI18N
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, -1));

        BtnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_apagar.png"))); // NOI18N
        BtnApagar.setBorderPainted(false);
        BtnApagar.setContentAreaFilled(false);
        BtnApagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_apagar_On.png"))); // NOI18N
        BtnApagar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_apagar_On.png"))); // NOI18N
        BtnApagar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_apagar_On.png"))); // NOI18N
        BtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Camara en Uso");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        JblNombreCamara.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        JblNombreCamara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JblNombreCamara.setText("-");
        jPanel2.add(JblNombreCamara, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 190, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        // TODO add your handling code here:}

        Thread hilo = new Thread(){
            @SuppressWarnings("unchecked")
            @Override
            public void run(){
                webcamPanel.start();
                prenderBotones();

            }
        };
        hilo.setDaemon(true);
        hilo.start();
        BtnIniciar.setEnabled(false);
   

    }//GEN-LAST:event_BtnIniciarActionPerformed


    
    private void BtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarActionPerformed
        // TODO add your handling code here:
        webcamPanel.stop();
        apagarBotones();
        BtnIniciar.setEnabled(true);
        
    }//GEN-LAST:event_BtnApagarActionPerformed

    private void BtnCapturarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCapturarFotoActionPerformed
        // TODO add your handling code here:
        BtnGuardarFoto.setEnabled(true);
        
        ImageIcon foto;
        ruta = webcam.getImage();
        foto = new ImageIcon(ruta);
        iconoFoto = new ImageIcon(foto.getImage().getScaledInstance(133, 153, Image.SCALE_DEFAULT));
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(JblFotoTomada.getWidth(), JblFotoTomada.getHeight(), Image.SCALE_DEFAULT));
        JblFotoTomada.setIcon(icono);

        
    }//GEN-LAST:event_BtnCapturarFotoActionPerformed

    private void BtnGuardarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarFotoActionPerformed
        // TODO add your handling code here:
               
        f.getJLFoto().setIcon(iconoFoto);
        f.setFotoCamara(ruta);
 
    }//GEN-LAST:event_BtnGuardarFotoActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        // TODO add your handling code here:
        webcamPanel.stop();
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);

    }//GEN-LAST:event_jLabel1MouseDragged

    /**
     * @param args the com
     * mand line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InterfazWebCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InterfazWebCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InterfazWebCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InterfazWebCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InterfazWebCam().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnCapturarFoto;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnGuardarFoto;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JPanel JPanelCamara;
    private javax.swing.JLabel JblFotoTomada;
    private javax.swing.JLabel JblNombreCamara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
