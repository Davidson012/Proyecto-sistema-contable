/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;
import Archivos.Archivo;
import MenuPrincipal.MenuPrincipal;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import TextPrompt.TextPrompt;
import java.awt.Color;

/**
 *
 * @author Dalvi
 */
public class LoginFrame extends javax.swing.JFrame {
    public static String getuser ="";
       
    
 
    public LoginFrame() {
        
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt p1 = new TextPrompt("Ingrese su ID", logintxt);
          p1.setForeground(Color.WHITE);
           TextPrompt p2 = new TextPrompt("Ingrese su contrasena", passtxt);
           p2.setForeground(Color.WHITE);
       
    }
    public int Nivel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cabecera = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        salirbt = new javax.swing.JButton();
        loginbt = new javax.swing.JButton();
        passtxt = new javax.swing.JPasswordField();
        Loginlabel = new javax.swing.JLabel();
        logintxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        cabecera.setBackground(new java.awt.Color(255, 102, 0));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setName("icon"); // NOI18N

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(447, 315));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setMinimumSize(new java.awt.Dimension(433, 226));
        bg.setName(""); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(447, 315));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirbt.setBackground(new java.awt.Color(255, 0, 0));
        salirbt.setForeground(new java.awt.Color(255, 255, 255));
        salirbt.setText("Salir");
        salirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtActionPerformed(evt);
            }
        });
        bg.add(salirbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        loginbt.setBackground(new java.awt.Color(64, 68, 237));
        loginbt.setForeground(new java.awt.Color(255, 255, 255));
        loginbt.setText("Login");
        loginbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtActionPerformed(evt);
            }
        });
        bg.add(loginbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        passtxt.setBackground(new java.awt.Color(39, 38, 44));
        passtxt.setForeground(new java.awt.Color(255, 255, 255));
        passtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });
        passtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passtxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passtxtKeyTyped(evt);
            }
        });
        bg.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 140, -1));

        Loginlabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Loginlabel.setForeground(new java.awt.Color(255, 255, 255));
        Loginlabel.setText("Login");
        bg.add(Loginlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        logintxt.setBackground(new java.awt.Color(39, 38, 44));
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
        bg.add(logintxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, -1));
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtActionPerformed
       boolean encontrado = false;
        try {
         
           File f = new File("C:\\Datos\\User.txt");
           
            if(!f.exists()){
                f.createNewFile();
                JOptionPane.showMessageDialog(rootPane,"No se encontraron registros de Usuarios");
            } else {
                Scanner s = new Scanner(f);
                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    
                    s1.useDelimiter("\\s*;\\s*");
                    
                    String auxLogin = s1.next();
                    String auxPass = s1.next();
                    
                    if(auxLogin.equals(logintxt.getText()) && auxPass.equals(passtxt.getText())){
                        Nivel = Integer.parseInt(s1.next());
                        String Nombre = s1.next();
                        MenuPrincipal m = new MenuPrincipal();
                        if(Nivel == 0){
                            m.procesoMn.setEnabled(false);
                            m.mantenimientoMn.setEnabled(false);
                        }
                        m.userlabel.setText("Bienvenido "+Nombre);
                        m.setVisible(true);
                        encontrado = true;
                        this.dispose();
                        
                    } else {
                        encontrado = false;
                        if(auxLogin.equals(passtxt.getText())){
                            JOptionPane.showMessageDialog(rootPane, "Contraseña Incorrecta");
                            passtxt.setText("");
                            return;
                        } else if(!s.hasNextLine()){
                            JOptionPane.showMessageDialog(rootPane, "No hay registro de este usuario");
                            logintxt.setText("");
                            passtxt.setText("");
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: "+e);
        }
      getuser = logintxt.getText();
       
    }//GEN-LAST:event_loginbtActionPerformed

    private void logintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logintxtActionPerformed
        
        if(logintxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Debe ingresar el Login del Usuario para continuar");
        } else {
             passtxt.setText("");
              passtxt.grabFocus();
         }
        
    }//GEN-LAST:event_logintxtActionPerformed

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        loginbt.grabFocus();
    }//GEN-LAST:event_passtxtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Archivo MA = new Archivo();
      
        File archivosBD = new File("C:\\Datos");
        if(!archivosBD.exists()){
            archivosBD.mkdir();
            String Admin = "DR;1234;1;Dalvinson;Reyes;DalvinsonR23";
            File Usuario = new File("C:\\Datos\\User.txt");
            MA.GuardarDatos(Admin, Usuario);
        }

    }//GEN-LAST:event_formWindowOpened

    private void salirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtActionPerformed
       this.dispose();
    }//GEN-LAST:event_salirbtActionPerformed

    private void logintxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logintxtKeyTyped
           char c= evt.getKeyChar();
        if(!Character.isLetter(c)){
             evt.consume();
         
        if (c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan letra.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }}
    }//GEN-LAST:event_logintxtKeyTyped

    private void passtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtxtKeyTyped
            char c= evt.getKeyChar();
        if(!Character.isDigit(c)){
             evt.consume();
         
        if (c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan numeros.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }}
    }//GEN-LAST:event_passtxtKeyTyped

    private void passtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           loginbt.doClick();
    }                                     

    }//GEN-LAST:event_passtxtKeyPressed
  
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loginlabel;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cabecera;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginbt;
    public javax.swing.JTextField logintxt;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JButton salirbt;
    // End of variables declaration//GEN-END:variables
}
