/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Consulta;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalvi
 */
public class CusuarioFrame extends javax.swing.JFrame {

   
    public CusuarioFrame() {
        initComponents();
        setLocationRelativeTo(null);
        TablaM = (DefaultTableModel) TablaUs.getModel();
    }
     public DefaultTableModel TablaM;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        cabecera = new javax.swing.JPanel();
        encabezadolabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUs = new javax.swing.JTable();
        salir = new javax.swing.JButton();
        consultarbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(39, 38, 44));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabecera.setBackground(new java.awt.Color(64, 68, 237));
        cabecera.setForeground(new java.awt.Color(255, 255, 255));
        cabecera.setToolTipText("");
        cabecera.setName(""); // NOI18N
        cabecera.setPreferredSize(new java.awt.Dimension(1214, 100));

        encabezadolabel.setBackground(new java.awt.Color(255, 255, 255));
        encabezadolabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        encabezadolabel.setForeground(new java.awt.Color(255, 255, 255));
        encabezadolabel.setText("CONSULTA DE LOS USUARIOS ");

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(encabezadolabel)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(encabezadolabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 70));

        TablaUs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Contraseña", "Tipo de nivel", "Nombre", "Apellido", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaUs.setPreferredSize(new java.awt.Dimension(365, 80));
        jScrollPane1.setViewportView(TablaUs);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 1100, 200));

        salir.setBackground(new java.awt.Color(204, 0, 0));
        salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.setMaximumSize(new java.awt.Dimension(77, 27));
        salir.setMinimumSize(new java.awt.Dimension(77, 27));
        salir.setPreferredSize(new java.awt.Dimension(77, 27));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        bg.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 88, -1));

        consultarbt.setBackground(new java.awt.Color(64, 68, 237));
        consultarbt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        consultarbt.setForeground(new java.awt.Color(255, 255, 255));
        consultarbt.setText("Consultar");
        consultarbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultarbt.setMaximumSize(new java.awt.Dimension(77, 27));
        consultarbt.setMinimumSize(new java.awt.Dimension(77, 27));
        consultarbt.setPreferredSize(new java.awt.Dimension(77, 27));
        consultarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarbtActionPerformed(evt);
            }
        });
        bg.add(consultarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 89, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarbtActionPerformed
        boolean filas = false;
        String id, pass, lv, nm, ap,em;
         TablaM.setRowCount(0);
        
        File f = new File("C:\\Datos\\User.txt");
        
         try {
            if (!f.exists()) {
                JOptionPane.showMessageDialog(rootPane, "La archivo no existe");
            } else {
                Scanner s = new Scanner(f);
                while (s.hasNextLine()) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    id = s1.next();
                    pass = s1.next();
                    lv = s1.next();
                    nm = s1.next();
                    ap = s1.next();
                    em = s1.next();
                   

                    TablaM.addRow(new Object[]{id, pass, lv,  nm, ap,em});
                    
                    filas = true;
                }
                s.close();
                
                if(!filas){
                    JOptionPane.showMessageDialog(rootPane, "No se encontró ningún registro");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }


    }//GEN-LAST:event_consultarbtActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
          this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    
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
            java.util.logging.Logger.getLogger(CusuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CusuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CusuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CusuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUs;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cabecera;
    private javax.swing.JButton consultarbt;
    private javax.swing.JLabel encabezadolabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
