/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import Clases.cargarR;
import Conectar.conectar;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.filechooser.FileNameExtensionFilter;
import static proyecto.InterfazInicio.PanelPrincipal;


/**
 *
 * @author Francisco
 */
public class PanelRecuperar extends javax.swing.JPanel {

    InterfazInicio inicio = null;
    PanelCargando cargando = null;

    public boolean presionoRecu = false;
    cargarR hilo;
    
    String correo;
    String user1;
    String pass1;
    /////////////
    String correoDocente;
    String userDocente;
    String passDocente;
      
    /**
     * Creates new form PanelRecuperar
     * @param n
     */
    public PanelRecuperar(InterfazInicio n) {
        inicio = n;
        initComponents();
        this.progreso.setVisible(false);
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelCarga = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RsCodigo = new rscomponentshade.RSFormatFieldShade();
        RsNombre = new rscomponentshade.RSFormatFieldShade();
        progreso = new javax.swing.JProgressBar();
        BtnRecuperar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recuperar usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Y contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 46, 217, -1));

        PanelCarga.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Para recuperar su usuario y contraseña debe introducir el código y el nombre");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("en el caso del estudiante, en el docente introducir su documento y su nombre");

        RsCodigo.setPlaceholder("Codigo");

        RsNombre.setPlaceholder("Nombre");

        javax.swing.GroupLayout PanelCargaLayout = new javax.swing.GroupLayout(PanelCarga);
        PanelCarga.setLayout(PanelCargaLayout);
        PanelCargaLayout.setHorizontalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCargaLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(RsCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCargaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCargaLayout.setVerticalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RsCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(PanelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, 750, 180));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, -1, -1));

        BtnRecuperar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_recuperar.png"))); // NOI18N
        BtnRecuperar.setBorderPainted(false);
        BtnRecuperar.setContentAreaFilled(false);
        BtnRecuperar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_recuperar_on.png"))); // NOI18N
        BtnRecuperar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_recuperar_on.png"))); // NOI18N
        BtnRecuperar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_recuperar_on.png"))); // NOI18N
        BtnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecuperarActionPerformed(evt);
            }
        });
        add(BtnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 159, 45));

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_cancelar.png"))); // NOI18N
        BtnCancelar.setBorderPainted(false);
        BtnCancelar.setContentAreaFilled(false);
        BtnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_cancelar_On.png"))); // NOI18N
        BtnCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_cancelar_On.png"))); // NOI18N
        BtnCancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/button_cancelar_On.png"))); // NOI18N
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 159, 45));
    }// </editor-fold>//GEN-END:initComponents
    

    public javax.swing.JProgressBar getProgreso() {
        return progreso;
    }

    /**
     * @param progreso
     */
    public void setProgreso(JProgressBar progreso) {
        this.progreso = progreso;
    }
    void startThread() {
        hilo = new cargarR(getProgreso());
        hilo.start();
        hilo = null;
    }
      public void enviar(){
        String correoRemitente = null;
        String passwordRemitente = null;
        try{
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props);
        
        File email = new File ("./Correo.txt");
        
        try{
        
        BufferedReader leer = new BufferedReader(new FileReader(email));
        String e = leer.readLine();
        
        while (e != null){   
            correoRemitente = e;
            e = leer.readLine();
            
        }
       
        File contraseña = new File ("./Contraseña.txt");
        
        try{
        
        BufferedReader leer2 = new BufferedReader(new FileReader(contraseña));
        String c = leer2.readLine();
        
        while (c != null){   
            passwordRemitente = c;
            c = leer.readLine();
            
        }
       
        
        String correoReceptor =correo;
        String asunto = "Recuperacion de contraseña y usuario";
        String mensaje = user1+"\n"+pass1;
        //System.out.println(correoRemitente+" "+passwordRemitente+" "+correoReceptor+" "+asunto+ " "+mensaje);
        
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(correoRemitente));
        
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
        message.setSubject(asunto);
        message.setText(mensaje);
        
        Transport t = session.getTransport("smtp");
        t.connect(correoRemitente, passwordRemitente);
        
        t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        t.close();

        //JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");
        
        }catch(HeadlessException | IOException | MessagingException ex){
            ex.printStackTrace();
        }
         } catch (IOException ex){
            ex.printStackTrace();
        }
         } catch (Exception ex){
            ex.printStackTrace();
        }
        
    }
 public void enviarDocente(){
        String correoRemitente = null;
        String passwordRemitente = null;
        try{
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props);
        
        File email = new File ("./Correo.txt");
        
        try{
        
        BufferedReader leer = new BufferedReader(new FileReader(email));
        String e = leer.readLine();
        
        while (e != null){   
            correoRemitente = e;
            e = leer.readLine();
            
        }
       
        File contraseña = new File ("./Contraseña.txt");
        
        try{
        
        BufferedReader leer2 = new BufferedReader(new FileReader(contraseña));
        String c = leer2.readLine();
        
        while (c != null){   
            passwordRemitente = c;
            c = leer.readLine();
            
        }
       
        
        String correoReceptor =correoDocente;
        String asunto = "Recuperacion de contraseña y usuario";
        String mensaje = userDocente+"\n"+passDocente;
        //System.out.println(correoRemitente+" "+passwordRemitente+" "+correoReceptor+" "+asunto+ " "+mensaje);
        
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(correoRemitente));
        
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
        message.setSubject(asunto);
        message.setText(mensaje);
        
        Transport t = session.getTransport("smtp");
        t.connect(correoRemitente, passwordRemitente);
        
        t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        t.close();

        //JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");
        
        }catch(HeadlessException | IOException | MessagingException ex){
            ex.printStackTrace();
        }
         } catch (IOException ex){
            ex.printStackTrace();
        }
         } catch (Exception ex){
            ex.printStackTrace();
        }
        
    }


    public void verificaCodigo(String codigo, String plan, String nombre) {
        
        try {
            
            String sql = "SELECT * FROM registro WHERE Codigo = '"+codigo+"' and "+"CodigoPlan = '"+plan+"' "
               + "and Nombres = '"+nombre+"'";
            java.sql.Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String user = null;
            String user2 = null;
            String pass = null;
            String email = null;
            if (rs.next()) {
//                new EfectoPanel(capa, new PanelTermino()).play();
                user = rs.getString(2);
                user2 = rs.getString(3);
                email = rs.getString(7);
                
                pass = rs.getString(10);

                user1 = "USUARIO: " + user +"- "+user2 ; pass1 = "CONTRASEÑA: " + pass;
                //System.out.println(user1+" "+pass1);
                correo = email;
              
                      enviar();
//                    guardarDatos(user1, pass1);   
                 
//                    dispose();
                      PanelPrincipal.removeAll();
                      PanelPrincipal.revalidate();
                      PanelPrincipal.repaint();
                 JOptionPane.showMessageDialog(this, "SU USUARIO Y CONTRASEÑA SE HA ENVIADO,\n"
                        + "A SU CORREO DISPONIBLE VERIFICADO POR LA PLATAFORMA", "¡CORREO!",JOptionPane.INFORMATION_MESSAGE
                         ); 
                
            
            }else {
                this.BtnRecuperar.setVisible(true);
                this.BtnCancelar.setVisible(true);
//                new EfectoPanel(capa, new PanelRecupera()).play();
                presionoRecu = false;
                JOptionPane.showMessageDialog(this, "EL CÓDIGO INGRESADO NO ES VÁLIDO,\nINGRESE UN CÓDIGO DE RECUPERACIÓN\n"
                        + "VÁLIDO O CONTACTE AL ADMINISTRADOR DEL SISTEMA.", "¡ERROR AL RECUPERAR!", JOptionPane.ERROR_MESSAGE);
                PanelPrincipal.removeAll();
                PanelPrincipal.revalidate();
                PanelPrincipal.repaint();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
  
        public void verificaCodigoDocente(String codigo2, String nombre2) {
        try {
            String sql="SELECT * FROM docente WHERE DocumentoIdentidad='"+codigo2+"' and Nombres='"+nombre2+"'";
            java.sql.Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String user = null;
            String pass = null;
            String email = null;
            if (rs.next()) {
//                  gif.imagenInmovil();
//                new EfectoPanel(capa, new PanelTermino()).play();
                
                user = rs.getString(3);
                pass = rs.getString(8);
                email = rs.getString(5);

                userDocente = "USUARIO: " + user ; passDocente = "CONTRASEÑA: " + pass;
                correoDocente = email;
                
                         enviarDocente();
//                    guardarDatos(user1, pass1);   
                 
//                    dispose();
                      PanelPrincipal.removeAll();
                      PanelPrincipal.revalidate();
                      PanelPrincipal.repaint();
                      
                      JOptionPane.showMessageDialog(this, "SU USUARIO Y CONTRASEÑA SE HA ENVIADO,\n"
                        + "A SU CORREO DISPONIBLE VERIFICADO POR LA PLATAFORMA", "¡CORREO!",JOptionPane.INFORMATION_MESSAGE
                         ); 
                 
            } else {
                this.BtnRecuperar.setVisible(true);
                this.BtnCancelar.setVisible(true);
//                new EfectoPanel(capa, new PanelRecupera()).play();
               
                presionoRecu = false;
                JOptionPane.showMessageDialog(this, "EL CÓDIGO INGRESADO NO ES VÁLIDO,\nINGRESE UN CÓDIGO DE RECUPERACIÓN\n"
                        + "VÁLIDO O CONTACTE AL ADMINISTRADOR DEL SISTEMA.", "¡ERROR AL RECUPERAR!", JOptionPane.ERROR_MESSAGE);
                PanelPrincipal.removeAll();
                PanelPrincipal.revalidate();
                PanelPrincipal.repaint();
                
            }
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
      public void guardarDatos(String user, String pass) {
        JFileChooser ventana = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
        ventana.addChoosableFileFilter(filter);
        ventana.setFileFilter(filter);
        ventana.setDialogTitle("GUARDAR DATOS DE USUARIO");

        if (ventana.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File archivo = ventana.getSelectedFile();
                BufferedWriter bw;
                if (archivo.exists()) {
                    bw = new BufferedWriter(new FileWriter(archivo.getAbsoluteFile() + ".txt"));
                    bw.write(user);
                    bw.newLine();
                    bw.write(pass);
                } else {
                    bw = new BufferedWriter(new FileWriter(archivo.getAbsoluteFile() + ".txt"));
                    bw.write(user);
                    bw.newLine();
                    bw.write(pass);
                }
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
//        this.dispose();
                PanelPrincipal.removeAll();
                PanelPrincipal.revalidate();
                PanelPrincipal.repaint();
    

    }
    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
       try {
        if (progreso.getValue() == 10) {
            PanelCargando.mensaje.setText("Verificando código de recuperación...");
        }
        if (progreso.getValue() == 20) {
            PanelCargando.mensaje.setText("Obteniendo resultados...");
        }
        
        String [] cod = RsCodigo.getText().split("-");
        switch (cod.length){
            case 1:
                String cod2 = RsCodigo.getText();
                String nom2 = RsNombre.getText();
                if (progreso.getValue() == 30){
                verificaCodigoDocente(cod2, nom2);
        }
        
        break;
            case 2:
                String nom = RsNombre.getText();
                if (progreso.getValue() == 30) {
                verificaCodigo(cod[0], cod[1], nom);
        }
        
        break;
        default:
             JOptionPane.showMessageDialog(this,"los datos no existen");
        }
        } catch (HeadlessException ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_progresoStateChanged

    private void BtnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecuperarActionPerformed
        // TODO add your handling code here:
        
        try{ 
          String [] cod = RsCodigo.getText().split("-");
          switch (cod.length){
              
              case 1:
                    String cod2 = RsCodigo.getText();
                    String nom2 = RsNombre.getText();
                    if (cod2.equals("") && nom2.equals("")) {
                    JOptionPane.showMessageDialog(this, "DEBES INGRESAR EL CÓDIGO Y EL NOMBRE DE RECUPERACIÓN", 
                    "CÓDIGO Y NOMBRE",JOptionPane.WARNING_MESSAGE);
                    } else {
                        
                            this.BtnRecuperar.setVisible(false);
                            this.BtnCancelar.setVisible(false);
                            cargando = new PanelCargando();
                            cargando.setSize(750, 180);//tamaño del Jpanel
                            cargando.setLocation(2, 2); // posicion del panel principal
                            PanelCarga.removeAll();
                            PanelCarga.add(cargando, BorderLayout.CENTER);
                            PanelCarga.revalidate();
                            PanelCarga.repaint();
                
                            presionoRecu = true;
                            startThread();
                         
                        }
                    break;
              case 2:
                   String nom = RsNombre.getText();
                    if (cod[0].equals("") && cod[1].equals("") && nom.equals("")) {
                    JOptionPane.showMessageDialog(this, "DEBES INGRESAR EL CÓDIGO + EL CODIGO DE Y EL NOMBRE DE RECUPERACIÓN", 
                    "CÓDIGO Y NOMBRE",JOptionPane.WARNING_MESSAGE);
                    } else {
                        
                            this.BtnRecuperar.setVisible(false);
                            this.BtnCancelar.setVisible(false);
                            cargando = new PanelCargando();
                            cargando.setSize(750, 180);//tamaño del Jpanel
                            cargando.setLocation(2, 2); // posicion del panel principal
                            PanelCarga.removeAll();
                            PanelCarga.add(cargando, BorderLayout.CENTER);
                            PanelCarga.revalidate();
                            PanelCarga.repaint();
                
                            presionoRecu = true;
                            startThread();
                       
                        }
              
              break;
              default:
             JOptionPane.showMessageDialog(this,"los datos no existen");
                    }
    }catch(Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(this,"Ingrese los datos");
    }

    }//GEN-LAST:event_BtnRecuperarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        PanelPrincipal.removeAll();
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }//GEN-LAST:event_BtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRecuperar;
    private javax.swing.JPanel PanelCarga;
    private rscomponentshade.RSFormatFieldShade RsCodigo;
    private rscomponentshade.RSFormatFieldShade RsNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
conectar cc = new conectar();
java.sql.Connection cn = cc.conexion();
}