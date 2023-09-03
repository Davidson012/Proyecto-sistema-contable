/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Mantenimiento;

import Archivos.Archivo;
import MenuPrincipal.MenuPrincipal;
import TextPrompt.TextPrompt;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalvi
 */
public class UsuarioFrame extends javax.swing.JFrame {
 
   ButtonGroup gr=new ButtonGroup();
    /**
     * Creates new form UsuarioFrame
     */
    public UsuarioFrame() {
        initComponents();
        setLocationRelativeTo(null);
       gr.add(adminrbt);
       gr.add(normalrbt);
       
        TextPrompt lg = new TextPrompt("Ingrese el login", logintxt, TextPrompt.Show.ALWAYS);
        lg.setForeground(Color.white);
        TextPrompt p = new TextPrompt(" Digite su contraseña", pass_ptxt, TextPrompt.Show.ALWAYS);
        p.setForeground(Color.white);
        TextPrompt n = new TextPrompt(" Ingrese su nombre", nombretxt, TextPrompt.Show.ALWAYS);
        n.setForeground(Color.white);
        TextPrompt a = new TextPrompt(" Ingrese sus Apellidos", apellidotxt, TextPrompt.Show.ALWAYS);
        a.setForeground(Color.white);
        TextPrompt e = new TextPrompt(" Ingrese su Email", emailtxt, TextPrompt.Show.ALWAYS);
        e.setForeground(Color.white);
    }

    public static String LineaAntigua;
    public boolean Modificar = false;
    public int Nivel = 0;
    public String Email = "NoEmail";
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        loginlabel = new javax.swing.JLabel();
        logintxt = new javax.swing.JTextField();
        passlabel = new javax.swing.JLabel();
        accesolabel = new javax.swing.JLabel();
        adminrbt = new javax.swing.JRadioButton();
        normalrbt = new javax.swing.JRadioButton();
        nombrelabel = new javax.swing.JLabel();
        apellidolabel = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        apellidotxt = new javax.swing.JTextField();
        emaillabel = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        guardarbt = new javax.swing.JButton();
        registral_label = new javax.swing.JLabel();
        limpiarbt = new javax.swing.JButton();
        salirbt = new javax.swing.JButton();
        pass_ptxt = new javax.swing.JPasswordField();
        bf = new javax.swing.JLabel();

        cabecera.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setName("icon"); // NOI18N

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registral");
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setPreferredSize(new java.awt.Dimension(490, 396));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginlabel.setForeground(new java.awt.Color(255, 255, 255));
        loginlabel.setText("Login");
        bg.add(loginlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        logintxt.setBackground(new java.awt.Color(39, 38, 44));
        logintxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logintxt.setForeground(new java.awt.Color(255, 255, 255));
        logintxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        logintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logintxtActionPerformed(evt);
            }
        });
        logintxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                logintxtKeyTyped(evt);
            }
        });
        bg.add(logintxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, -1));

        passlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passlabel.setForeground(new java.awt.Color(255, 255, 255));
        passlabel.setText("Password");
        bg.add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        accesolabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accesolabel.setForeground(new java.awt.Color(255, 255, 255));
        accesolabel.setText("Tipo de acceso");
        bg.add(accesolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        adminrbt.setBackground(new java.awt.Color(39, 38, 44));
        adminrbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminrbt.setForeground(new java.awt.Color(255, 255, 255));
        adminrbt.setText("Admin");
        adminrbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminrbtActionPerformed(evt);
            }
        });
        bg.add(adminrbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        normalrbt.setBackground(new java.awt.Color(39, 38, 44));
        normalrbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        normalrbt.setForeground(new java.awt.Color(255, 255, 255));
        normalrbt.setText("Normal");
        normalrbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalrbtActionPerformed(evt);
            }
        });
        bg.add(normalrbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        nombrelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombrelabel.setForeground(new java.awt.Color(255, 255, 255));
        nombrelabel.setText("Nombre");
        bg.add(nombrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        apellidolabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellidolabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidolabel.setText("Apellido");
        bg.add(apellidolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        nombretxt.setBackground(new java.awt.Color(39, 38, 44));
        nombretxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(255, 255, 255));
        nombretxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        nombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombretxtKeyTyped(evt);
            }
        });
        bg.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, -1));

        apellidotxt.setBackground(new java.awt.Color(39, 38, 44));
        apellidotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellidotxt.setForeground(new java.awt.Color(255, 255, 255));
        apellidotxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        apellidotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidotxtActionPerformed(evt);
            }
        });
        apellidotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidotxtKeyTyped(evt);
            }
        });
        bg.add(apellidotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 170, -1));

        emaillabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emaillabel.setForeground(new java.awt.Color(255, 255, 255));
        emaillabel.setText("Email");
        bg.add(emaillabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        emailtxt.setBackground(new java.awt.Color(39, 38, 44));
        emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(255, 255, 255));
        emailtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        emailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailtxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailtxtKeyTyped(evt);
            }
        });
        bg.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, -1));

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bg.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 100, 30));

        guardarbt.setBackground(new java.awt.Color(64, 68, 237));
        guardarbt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guardarbt.setForeground(new java.awt.Color(255, 255, 255));
        guardarbt.setText("Guardar");
        guardarbt.setPreferredSize(new java.awt.Dimension(76, 27));
        guardarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtActionPerformed(evt);
            }
        });
        bg.add(guardarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 347, 82, -1));

        registral_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        registral_label.setForeground(new java.awt.Color(255, 255, 255));
        registral_label.setText("Registrar");
        bg.add(registral_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        limpiarbt.setBackground(new java.awt.Color(64, 68, 237));
        limpiarbt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        limpiarbt.setForeground(new java.awt.Color(255, 255, 255));
        limpiarbt.setText("Limpiar");
        limpiarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtActionPerformed(evt);
            }
        });
        bg.add(limpiarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 347, 82, -1));

        salirbt.setBackground(new java.awt.Color(255, 0, 0));
        salirbt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salirbt.setForeground(new java.awt.Color(255, 255, 255));
        salirbt.setText("Salir");
        salirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtActionPerformed(evt);
            }
        });
        bg.add(salirbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 82, -1));

        pass_ptxt.setBackground(new java.awt.Color(39, 38, 44));
        pass_ptxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass_ptxt.setForeground(new java.awt.Color(255, 255, 255));
        pass_ptxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        pass_ptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_ptxtActionPerformed(evt);
            }
        });
        pass_ptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pass_ptxtKeyTyped(evt);
            }
        });
        bg.add(pass_ptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, -1));

        bf.setIcon(new javax.swing.ImageIcon("C:\\Users\\cleve\\Desktop\\Imagenes\\Registral.png")); // NOI18N
        bg.add(bf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed
        logintxt.setText("");
        pass_ptxt.setText("");
        gr.clearSelection();
        Nivel = 0;
        nombretxt.setText("");
        apellidotxt.setText("");
        emailtxt.setText("");
        status.setText(""); 
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void salirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtActionPerformed
            this.dispose();
    }//GEN-LAST:event_salirbtActionPerformed

    private void logintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logintxtActionPerformed
        if(logintxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Debe ingresar el Login del Usuario para continuar");
        } else {
            pass_ptxt.setText("");
            pass_ptxt.grabFocus();
        }
    }//GEN-LAST:event_logintxtActionPerformed
        
    private void adminrbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminrbtActionPerformed
        Nivel=1;
    }//GEN-LAST:event_adminrbtActionPerformed

    private void normalrbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalrbtActionPerformed
       Nivel=0;
    }//GEN-LAST:event_normalrbtActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         int resp = JOptionPane.showConfirmDialog(rootPane, "Desea cerrar la ventana de Mantenimiento de Usuarios","Cerrar Ventana",JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void guardarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtActionPerformed
        
       if (logintxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Se debe rellenar el Login antes de guardar");
        } else if (pass_ptxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Se debe rellenar la Contraseña antes de guardar");
        } else if (!adminrbt.isSelected() && !normalrbt.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "Se debe elegir un Nivel de Acceso antes de guardar");
        } else if (nombretxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Se debe rellenar el Nombre del Usuario antes de guardar");
        } else if (apellidotxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Se debe rellenar los Apellidos del Usuario antes de guardar");
        } else {
            String login=logintxt.getText();
            String pas=pass_ptxt.getText();
            String lv=adminrbt.isSelected() ? "1" : "0";
            String na=nombretxt.getText();
            String ap=apellidotxt.getText();
            String em=emailtxt.getText();
    
      try {
        String nombreArchivo = "C:\\Datos\\User.txt";
        File archivo = new File(nombreArchivo);

        boolean existeLoginCuenta = false;
        String contenidoArchivo = "";
        if (archivo.exists()) {
            contenidoArchivo = new String(Files.readAllBytes(archivo.toPath()));
            existeLoginCuenta = contenidoArchivo.contains(login);
        }
         if (existeLoginCuenta) {
            // Actualizar el registro existente
            contenidoArchivo = contenidoArchivo.replaceAll(login + ".*", login + " ; " + pas + " ; " + lv + " ; " + na + " ; " +
                    ap + " ; " + em );
            FileWriter escritor = new FileWriter(nombreArchivo);
              escritor.write(contenidoArchivo);
            escritor.close();
         
        } else {
            // Agregar un nuevo registro
            FileWriter escritor = new FileWriter(nombreArchivo, true);
            escritor.write(login + " ; " + pas + " ; " + lv + " ; " + na + " ; " +
                    ap + " ; " + em + "\n");
            escritor.close();
           
        }
         
             JOptionPane.showMessageDialog(this, "¡Datos guardados exitosamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        }
      limpiarbtActionPerformed(evt);
    }//GEN-LAST:event_guardarbtActionPerformed

    private void logintxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logintxtKeyTyped
        char c = evt.getKeyChar();
    if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_ENTER ) {
        evt.consume();

        JOptionPane.showMessageDialog(this, "Solo se aceptan letras y guiones.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
           
    }//GEN-LAST:event_logintxtKeyTyped

    private void nombretxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombretxtKeyTyped
           char c= evt.getKeyChar();
        if(!Character.isLetter(c)){
             evt.consume();
         
        if (c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan letra.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }}
        
    }//GEN-LAST:event_nombretxtKeyTyped

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed

        apellidotxt.grabFocus();
    }//GEN-LAST:event_nombretxtActionPerformed

    private void apellidotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidotxtKeyTyped
        String allowedCharacters= "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char c= evt.getKeyChar();
     
         
        if ((allowedCharacters.indexOf(c)==-1) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE && c!=KeyEvent.VK_SPACE) {
             evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se aceptan caracteres.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_apellidotxtKeyTyped

    private void apellidotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidotxtActionPerformed
       emailtxt.grabFocus();
    }//GEN-LAST:event_apellidotxtActionPerformed

    private void emailtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtxtKeyTyped
     
     char c = evt.getKeyChar();
    if (!Character.isLetterOrDigit(c) && c != '@' && c != '.' && c != '_') {
        evt.consume();

        if (c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan letras, números, '@', '.', y '_'.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    }//GEN-LAST:event_emailtxtKeyTyped

    private void pass_ptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_ptxtActionPerformed
               String pass_u = pass_ptxt.getText();
               String login_u = logintxt.getText();
//          if (passtxt.getText().isEmpty()) {
//        JOptionPane.showMessageDialog(this, "Debe ingresar la contraseña del Usuario para continuar");
//    } else{
//              gr.clearSelection();
//          }
          
        boolean encontrado = false;
    
        Scanner s;
        
        try {
            File f = new File("C:\\Datos\\User.txt");
            
            if(!f.exists()){
                f.createNewFile();
                status.setText("Creando");
            } else {
                s = new Scanner(f);
                while(s.hasNextLine() && !encontrado){
                    String lineaActual = s.nextLine();
                    Scanner s1 = new Scanner(lineaActual);
                    
                    s1.useDelimiter("\\s*;\\s*");
                    
                    try {
                        String auxlogin = s1.next();
                        String auxPass = s1.next();
                        if(login_u.equals(auxlogin) && pass_u.equals(auxPass)){
                            Nivel = Integer.parseInt(s1.next());
                            if (Nivel == 1) {
                                adminrbt.setSelected(true);
                            } else {
                                normalrbt.setSelected(true);
                            }
                            
                            nombretxt.setText(s1.next());
                            apellidotxt.setText(s1.next());
                            
                            Email = s1.next();
                            String aux = "NoEmail";
                            if(Email.equals(aux)){
                                emailtxt.setText("");
                            } else {
                                emailtxt.setText(Email);
                            }
                            
                            LineaAntigua = login_u + " ; " + pass_u + " ; " + Nivel + " ; " + nombretxt.getText() + " ; " + apellidotxt.getText() + " ; " + Email + "\n";
                         
                            Modificar = true;
                            status.setText("Modificando");
                            encontrado = true;
                        } else {
                            if(login_u.equals(auxlogin)){
                                limpiarbtActionPerformed(evt);
                                logintxt.setText(login_u);
                                JOptionPane.showMessageDialog(rootPane,"Contraseña incorrecta intente nuevamente");
                                return;
                            }
                            
                            nombretxt.setText("");
                            apellidotxt.setText("");
                            emailtxt.setText("");
                            gr.clearSelection();
                            Modificar = false;
                            status.setText("Creando");
                            encontrado = false;
                            
                        }
                        
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                s.close();
            }
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            System.out.println("Error: "+ex);
        }
    }//GEN-LAST:event_pass_ptxtActionPerformed

    private void pass_ptxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_ptxtKeyTyped
      char c = evt.getKeyChar();
    if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c) && c != KeyEvent.VK_BACK_SPACE && c != '-' && c != '.' && c != ',') {
        evt.consume();

        JOptionPane.showMessageDialog(this, "Solo se aceptan números, letras, guiones, puntos, comas y retroceso.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    
    if (pass_ptxt.getText().length() >= 8 && c != KeyEvent.VK_BACK_SPACE) {
        evt.consume();
        
        JOptionPane.showMessageDialog(this, "Solo se permiten 8 caracteres.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_pass_ptxtKeyTyped

    private void emailtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtxtKeyPressed
 if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           guardarbt.doClick();
    }                                     

    }//GEN-LAST:event_emailtxtKeyPressed
    
    
    
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
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accesolabel;
    private javax.swing.JRadioButton adminrbt;
    private javax.swing.JLabel apellidolabel;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JLabel bf;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cabecera;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JButton guardarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JLabel loginlabel;
    private javax.swing.JTextField logintxt;
    private javax.swing.JLabel nombrelabel;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JRadioButton normalrbt;
    private javax.swing.JPasswordField pass_ptxt;
    private javax.swing.JLabel passlabel;
    private javax.swing.JLabel registral_label;
    private javax.swing.JButton salirbt;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
