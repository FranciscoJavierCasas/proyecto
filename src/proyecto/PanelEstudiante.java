/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.BorderLayout;
import static proyecto.InterfazInicio.PanelPrincipal;

/**
 *
 * @author Francisco
 */
public class PanelEstudiante extends javax.swing.JPanel {
InterfazInicio inicio;
InterfazInicio a;
PanelAjustesEstudiante a1 = null;
    /**
     * Creates new form PanelEstudiante
     */
    public PanelEstudiante() {
        initComponents();
    }

    PanelEstudiante(InterfazInicio n) {
        initComponents();
        inicio = n;
    }
//    public void iniciar(){
//        InterfazSesion interfazsesion = new InterfazSesion(inicio);
//        interfazsesion.setVisible(true);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        JlIniciarSesion = new javax.swing.JLabel();
        Iniciar = new javax.swing.JLabel();
        Ajustes = new javax.swing.JLabel();
        JlAjustes = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JlCerrarSesion = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Iniciar Sesion");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        JlIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/internetmonitor_102153.png"))); // NOI18N
        JlIniciarSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JlIniciarSesionMouseMoved(evt);
            }
        });
        JlIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlIniciarSesionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JlIniciarSesionMouseExited(evt);
            }
        });
        add(JlIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 100, 100));
        add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 180, 130));
        add(Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 180, 130));

        JlAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-ajustes-96.png"))); // NOI18N
        JlAjustes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JlAjustesMouseMoved(evt);
            }
        });
        JlAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlAjustesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JlAjustesMouseExited(evt);
            }
        });
        add(JlAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 90, 100));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Ajustes");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        JlCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-96.png"))); // NOI18N
        JlCerrarSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JlCerrarSesionMouseMoved(evt);
            }
        });
        JlCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlCerrarSesionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JlCerrarSesionMouseExited(evt);
            }
        });
        add(JlCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 90, 100));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Cerrar Sesion");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, -1));
        add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 180, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void JlIniciarSesionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlIniciarSesionMouseMoved
        // TODO add your handling code here:
        Iniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JlIniciarSesionMouseMoved

    private void JlIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlIniciarSesionMouseExited
        // TODO add your handling code here:
        Iniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JlIniciarSesionMouseExited

    private void JlIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlIniciarSesionMouseClicked
        // TODO add your handling code here:
        InterfazSesion interfazsesion = new InterfazSesion(inicio);
        interfazsesion.setVisible(true);
        inicio.setVisible(false);
        
        
    }//GEN-LAST:event_JlIniciarSesionMouseClicked

    private void JlAjustesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlAjustesMouseMoved
        // TODO add your handling code here:
        Ajustes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JlAjustesMouseMoved

    private void JlAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlAjustesMouseClicked
        // TODO add your handling code here:
        a1 = inicio.getConfiguracion();
        a1.setSize(1090, 1000);//tamaño del Jpanel
        a1.setLocation(5, 5); // posicion del panel principal
        PanelPrincipal.removeAll();
        PanelPrincipal.add(a1, BorderLayout.CENTER);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }//GEN-LAST:event_JlAjustesMouseClicked

    private void JlAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlAjustesMouseExited
        // TODO add your handling code here:
        Ajustes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JlAjustesMouseExited

    private void JlCerrarSesionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlCerrarSesionMouseMoved
        // TODO add your handling code here:
        CerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JlCerrarSesionMouseMoved

    private void JlCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlCerrarSesionMouseClicked
        // TODO add your handling code here:

        //vuelve el panel principal
        PanelPrincipal.removeAll();
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        //        limpia la caja de texto
        inicio.Limpiar();
        //desbloquea la caja de texto
        inicio.Desbloquear();
        //el jLabel de cerrar sesion se oculta y foto por defecto
        inicio.CerrarSesionFoto();
        //botones
        inicio.BotonDesbloquear();
        // desoculta lo elementos
        inicio.desocultar();

    }//GEN-LAST:event_JlCerrarSesionMouseClicked

    private void JlCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlCerrarSesionMouseExited
        // TODO add your handling code here:
        CerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JlCerrarSesionMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ajustes;
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel Iniciar;
    private javax.swing.JLabel JlAjustes;
    private javax.swing.JLabel JlCerrarSesion;
    private javax.swing.JLabel JlIniciarSesion;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    // End of variables declaration//GEN-END:variables
 
}