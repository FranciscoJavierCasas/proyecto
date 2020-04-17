/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import Conectar.conectar;
import java.awt.BorderLayout;
import static proyecto.InterfazInicio.PanelPrincipal;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Francisco
 */
public class PanelReporte extends javax.swing.JPanel {
    InterfazInicio inicio;
    PanelMonitor p1 = null;
    PanelEstudiante p2 = null;
    
    String usuario,plan,id;
//    int tipoUsuario = 0;
//    Connection con = null;
//    ConexionBase conexion = null;
    /**
     * Creates new form PanelReporte
     * @param n
     */
     public PanelReporte(InterfazInicio n) {
        initComponents();
        inicio = n;
//

    }
    public PanelReporte() {
        initComponents();
//        conexion = new ConexionBase();
//        con = ConexionBase.cn;

  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    void GenerarReporte(){

        try {
            conectar con = new conectar();
            Connection conn = con.conexion();
            
            JasperReport reporte = null;
            String path = "src\\Reportes\\ReporteUso.jasper";
//            
//             Map parametro = new HashMap();
//             parametro.put("codigo", TxtCodigo.getText());
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            System.out.println("Error al crear reporte"+ex);
        }
      
    }
        @SuppressWarnings("unchecked")
        void GenerarReporteEstudiante(){

        try {
            conectar con = new conectar();
            Connection conn = con.conexion();
            
            JasperReport reporte = null;
            String path = "src\\Reportes\\ReporteEstudiante.jasper";
//            
//             Map parametro = new HashMap();
//             parametro.put("codigo", TxtCodigo.getText());
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            System.out.println("Error al crear reporte"+ex);
        }
      
    }
        @SuppressWarnings("unchecked")
        void GenerarReporteEstudianteBusqueda(String usuario){
            try {
            conectar con = new conectar();
            Connection conn = con.conexion();
            
            JasperReport reporte = null;
            String path = "src\\Reportes\\ReporteEstudianteBusqueda.jasper";
//            String url =  "SELECT * FROM registro WHERE codigo = '"+usuario+"' OR "+"codigoplan = '"+usuario+"' "
//               + "OR documentoidentidad = '"+usuario+"'"; 
           
             Map parametro = new HashMap();
             parametro.put("codigo", TxtCodigo.getText());

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            System.out.println("Error al crear reporte"+ex);
        }
        }
        @SuppressWarnings("unchecked")    
        void GenerarReporteDocente(){

            try {
            conectar con = new conectar();
            Connection conn = con.conexion();
            
            JasperReport reporte = null;
            String path = "src\\Reportes\\ReporteDocente.jasper";
//            
//            Map parametro = new HashMap();
//            parametro.put("id_estado", 36);
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            System.out.println("Error al crear reporte"+ex);
        }
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAtras3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        JlEstudianteInscritos = new javax.swing.JLabel();
        Iniciar = new javax.swing.JLabel();
        JlDocenteInscritos = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Registrar = new javax.swing.JLabel();
        JlReporteUso = new javax.swing.JLabel();
        Consultar = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAtras3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_atras.png"))); // NOI18N
        BtnAtras3.setBorderPainted(false);
        BtnAtras3.setContentAreaFilled(false);
        BtnAtras3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_atras_on.png"))); // NOI18N
        BtnAtras3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button_atras_on.png"))); // NOI18N
        BtnAtras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtras3ActionPerformed(evt);
            }
        });
        add(BtnAtras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 683, 160, 50));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Estudiante Inscritos");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        JlEstudianteInscritos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlEstudianteInscritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/internetmonitor_102153.png"))); // NOI18N
        JlEstudianteInscritos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JlEstudianteInscritosMouseMoved(evt);
            }
        });
        JlEstudianteInscritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlEstudianteInscritosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JlEstudianteInscritosMouseExited(evt);
            }
        });
        add(JlEstudianteInscritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 100, 100));
        add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 180, 130));

        JlDocenteInscritos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlDocenteInscritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-editar-archivo-96.png"))); // NOI18N
        JlDocenteInscritos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JlDocenteInscritosMouseMoved(evt);
            }
        });
        JlDocenteInscritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlDocenteInscritosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JlDocenteInscritosMouseExited(evt);
            }
        });
        add(JlDocenteInscritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 100, 90));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Docentes Inscritos");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));
        add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 180, 130));

        JlReporteUso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlReporteUso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-consulta-96.png"))); // NOI18N
        JlReporteUso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JlReporteUsoMouseMoved(evt);
            }
        });
        JlReporteUso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlReporteUsoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JlReporteUsoMouseExited(evt);
            }
        });
        add(JlReporteUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 90, 100));
        add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 180, 130));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Reporte de Uso");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informes del Sistema");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 350, -1));

        jLabel2.setText("Buscar:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));
        add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 120, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtras3ActionPerformed

            p1 = new PanelMonitor(inicio);
            p1.setSize(1090, 1000);//tamaño del Jpanel
            p1.setLocation(5, 5); // posicion del panel principal
            PanelPrincipal.removeAll();
            PanelPrincipal.add(p1, BorderLayout.CENTER);
            PanelPrincipal.revalidate();
            PanelPrincipal.repaint();

    }//GEN-LAST:event_BtnAtras3ActionPerformed

    private void JlEstudianteInscritosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlEstudianteInscritosMouseMoved
        // TODO add your handling code here:
        Iniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JlEstudianteInscritosMouseMoved

    private void JlEstudianteInscritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlEstudianteInscritosMouseClicked
        // TODO add your handling code here:
        
        GenerarReporteEstudiante();


    }//GEN-LAST:event_JlEstudianteInscritosMouseClicked

    private void JlEstudianteInscritosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlEstudianteInscritosMouseExited
        // TODO add your handling code here:
        Iniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JlEstudianteInscritosMouseExited

    private void JlDocenteInscritosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlDocenteInscritosMouseMoved
        // TODO add your handling code here:
        Registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JlDocenteInscritosMouseMoved

    private void JlDocenteInscritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlDocenteInscritosMouseClicked
        // TODO add your handling code here:
        GenerarReporteDocente();

    }//GEN-LAST:event_JlDocenteInscritosMouseClicked

    private void JlDocenteInscritosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlDocenteInscritosMouseExited
        // TODO add your handling code here:
        Registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JlDocenteInscritosMouseExited

    private void JlReporteUsoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlReporteUsoMouseMoved
        // TODO add your handling code here:
        Consultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JlReporteUsoMouseMoved

    private void JlReporteUsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlReporteUsoMouseClicked
        // TODO add your handling code here:
        GenerarReporte();

    }//GEN-LAST:event_JlReporteUsoMouseClicked

    private void JlReporteUsoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlReporteUsoMouseExited
        // TODO add your handling code here:
        Consultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JlReporteUsoMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        GenerarReporteEstudianteBusqueda(usuario);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras3;
    private javax.swing.JLabel Consultar;
    private javax.swing.JLabel Iniciar;
    private javax.swing.JLabel JlDocenteInscritos;
    private javax.swing.JLabel JlEstudianteInscritos;
    private javax.swing.JLabel JlReporteUso;
    private javax.swing.JLabel Registrar;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    // End of variables declaration//GEN-END:variables
}