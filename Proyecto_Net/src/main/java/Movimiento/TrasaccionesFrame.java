package Movimiento;


import Archivos.Archivo;
import MenuPrincipal.LoginFrame;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import TextPrompt.TextPrompt;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


/**
 *
 * @author Dalvi
 */
public class TrasaccionesFrame extends javax.swing.JFrame {
    
    
    public DefaultTableModel TablaM;
    private int sec = 0;
    String secf = "";
    public static String LineaAntigua;
    public static String LineaAntigua1;
    public static String LineaTabla;
    private javax.swing.Timer timer;
    boolean status;
    
    private static double Debit = 0.0;
    private static double Credit = 0.0;
    String fechaAc = "**/**/****";
    boolean Modificar = false;
    int seleccionar;
    boolean mod = false;
    boolean eliminar = false;
    String secuenciaGlobal;
    private int maxSequence = 2;
    public TrasaccionesFrame() {
        initComponents();
        LoginFrame  login =new LoginFrame();
        fechatxt.setText(fecha());
        fechatxt.setEditable(false);
        user_status_txt.setText(login.getuser);
        user_status_txt.setEditable(false);
        this.setLocationRelativeTo(null);
        
        documenttxt.requestFocusInWindow();
        montotxt.setEditable(false);
       // descriptxt.setEditable(false);
        descrip_cuentatxt.setEditable(false);
        this.registrojt.setComponentPopupMenu(PopupMenuTabla);
        this.Transacciones.setComponentPopupMenu(jPopupTrasanccion);
      
         TablaM = (DefaultTableModel) registrojt.getModel();
        
          timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hrstxt.setText(hora());
            }
        });
        timer.start();
        TextPrompt ndoc = new TextPrompt(" Digite No. del documento", documenttxt, TextPrompt.Show.ALWAYS);
        ndoc.setForeground(Color.black);
        TextPrompt ncuent = new TextPrompt(" Digite el No. de cuenta", num_cuentatxt, TextPrompt.Show.ALWAYS);
        ncuent.setForeground(Color.black);
        TextPrompt deb = new TextPrompt(" Digite el Debito", debitotxt, TextPrompt.Show.ALWAYS);
        deb.setForeground(Color.black);
        TextPrompt cred = new TextPrompt(" Digite el Credito", creditotxt, TextPrompt.Show.ALWAYS);
        cred.setForeground(Color.black);
        TextPrompt com = new TextPrompt(" Digite un Comentario", commenttxt, TextPrompt.Show.ALWAYS);
        com.setForeground(Color.black);
        
        cargarEstados();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupMenuTabla = new javax.swing.JPopupMenu();
        modificaritem = new javax.swing.JMenuItem();
        EliminarItem = new javax.swing.JMenuItem();
        jPopupTrasanccion = new javax.swing.JPopupMenu();
        limpiaritem = new javax.swing.JMenuItem();
        bg = new javax.swing.JPanel();
        cabecerapanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cabecera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        documenttxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descriptxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fechatxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tipo_documentcbx = new javax.swing.JComboBox<>();
        montotxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        user_status_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hrstxt = new javax.swing.JTextField();
        Transacciones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        num_cuentatxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        descrip_cuentatxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        debitotxt = new javax.swing.JTextField();
        creditotxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        commenttxt = new javax.swing.JTextField();
        agregarbt = new javax.swing.JButton();
        Tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        registrojt = new javax.swing.JTable();
        guardarbt = new javax.swing.JButton();
        limpiarbt = new javax.swing.JButton();
        salirbt = new javax.swing.JButton();

        modificaritem.setText("Modificar");
        modificaritem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaritemActionPerformed(evt);
            }
        });
        PopupMenuTabla.add(modificaritem);

        EliminarItem.setText("Eliminar");
        EliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarItemActionPerformed(evt);
            }
        });
        PopupMenuTabla.add(EliminarItem);

        limpiaritem.setText("Limpiar");
        limpiaritem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiaritemActionPerformed(evt);
            }
        });
        jPopupTrasanccion.add(limpiaritem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movimiento de Transacciones");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(700, 651));
        setMinimumSize(new java.awt.Dimension(700, 651));
        setPreferredSize(new java.awt.Dimension(700, 651));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(39, 38, 44));
        bg.setMaximumSize(new java.awt.Dimension(700, 622));
        bg.setMinimumSize(new java.awt.Dimension(700, 622));
        bg.setName(""); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(700, 622));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabecerapanel.setBackground(new java.awt.Color(64, 68, 237));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movimiento de Transaccion");

        javax.swing.GroupLayout cabecerapanelLayout = new javax.swing.GroupLayout(cabecerapanel);
        cabecerapanel.setLayout(cabecerapanelLayout);
        cabecerapanelLayout.setHorizontalGroup(
            cabecerapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecerapanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        cabecerapanelLayout.setVerticalGroup(
            cabecerapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecerapanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bg.add(cabecerapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 70));

        Cabecera.setBackground(new java.awt.Color(39, 38, 44));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NO.Documento");

        documenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documenttxtActionPerformed(evt);
            }
        });
        documenttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                documenttxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                documenttxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Documento");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion");

        descriptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descriptxtKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Monto");

        tipo_documentcbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipo_documentcbxItemStateChanged(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Creado por :");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("HORA:");

        javax.swing.GroupLayout CabeceraLayout = new javax.swing.GroupLayout(Cabecera);
        Cabecera.setLayout(CabeceraLayout);
        CabeceraLayout.setHorizontalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CabeceraLayout.createSequentialGroup()
                        .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabeceraLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(documenttxt)
                    .addComponent(descriptxt)
                    .addComponent(tipo_documentcbx, 0, 188, Short.MAX_VALUE)
                    .addComponent(montotxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabeceraLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabeceraLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabeceraLayout.createSequentialGroup()
                        .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(user_status_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(hrstxt))
                        .addContainerGap())))
        );
        CabeceraLayout.setVerticalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeceraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(documenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CabeceraLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tipo_documentcbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(descriptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(montotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CabeceraLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_status_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bg.add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 670, 170));

        Transacciones.setBackground(new java.awt.Color(39, 38, 44));
        Transacciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NO. Cuenta");

        num_cuentatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_cuentatxtActionPerformed(evt);
            }
        });
        num_cuentatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_cuentatxtKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripcion");

        descrip_cuentatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descrip_cuentatxtKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Debito");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Credito");

        debitotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                debitotxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                debitotxtKeyTyped(evt);
            }
        });

        creditotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                creditotxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditotxtKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Comentario");

        commenttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                commenttxtKeyPressed(evt);
            }
        });

        agregarbt.setBackground(new java.awt.Color(64, 68, 237));
        agregarbt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregarbt.setForeground(new java.awt.Color(255, 255, 255));
        agregarbt.setText("Agregar");
        agregarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransaccionesLayout = new javax.swing.GroupLayout(Transacciones);
        Transacciones.setLayout(TransaccionesLayout);
        TransaccionesLayout.setHorizontalGroup(
            TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TransaccionesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(num_cuentatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransaccionesLayout.createSequentialGroup()
                        .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descrip_cuentatxt)
                            .addComponent(debitotxt))))
                .addGap(18, 18, 18)
                .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarbt)
                    .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(commenttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(creditotxt)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        TransaccionesLayout.setVerticalGroup(
            TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaccionesLayout.createSequentialGroup()
                .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransaccionesLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(num_cuentatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransaccionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(creditotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(descrip_cuentatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(commenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransaccionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agregarbt))
                    .addGroup(TransaccionesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(debitotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bg.add(Transacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 670, 140));

        Tabla.setBackground(new java.awt.Color(39, 38, 44));
        Tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        Tabla.setForeground(new java.awt.Color(255, 255, 255));

        registrojt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sec.", "Cuenta", "Descripcion", "Debito", "Credito", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(registrojt);

        javax.swing.GroupLayout TablaLayout = new javax.swing.GroupLayout(Tabla);
        Tabla.setLayout(TablaLayout);
        TablaLayout.setHorizontalGroup(
            TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        TablaLayout.setVerticalGroup(
            TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bg.add(Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, 680, 180));

        guardarbt.setBackground(new java.awt.Color(64, 68, 237));
        guardarbt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guardarbt.setForeground(new java.awt.Color(255, 255, 255));
        guardarbt.setText("Guardar");
        guardarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtActionPerformed(evt);
            }
        });
        bg.add(guardarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        limpiarbt.setBackground(new java.awt.Color(64, 68, 237));
        limpiarbt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarbt.setForeground(new java.awt.Color(255, 255, 255));
        limpiarbt.setText("Limpiar");
        limpiarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtActionPerformed(evt);
            }
        });
        bg.add(limpiarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        salirbt.setBackground(new java.awt.Color(255, 0, 0));
        salirbt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salirbt.setForeground(new java.awt.Color(255, 255, 255));
        salirbt.setText("Salir");
        salirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtActionPerformed(evt);
            }
        });
        bg.add(salirbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void documenttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documenttxtActionPerformed

   String doc = documenttxt.getText();
        try {
            boolean encontrado = false;
            Scanner s;
            File t = new File("C:\\Datos\\Cabecera Transacciones.txt");

            s = new Scanner(t);

            while (s.hasNextLine() && !encontrado) {
                String linea = s.nextLine();
                Scanner s1 = new Scanner(linea);

                s1.useDelimiter("\\s*;\\s*");

                String codigoT = s1.next();
                String fecha = s1.next();
                String tipo = s1.next();
                String Descripcion = s1.next();
                String hechoPor = s1.next();
                String monto = s1.next();
                String fechaAc = s1.next();
                String estado = s1.next();

                if (doc.equals(codigoT)) {

                    if (estado.equals("true")) {
                        JOptionPane.showMessageDialog(this, "Esta transaccion ya esta Actualizada");
                        limpiarbtActionPerformed(evt);
                    } else {
                        if (documenttxt.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
                            documenttxt.grabFocus();
                        } else {
                            descriptxt.requestFocus();
                        }

                        int index = Integer.parseInt(tipo);
                        tipo_documentcbx.setSelectedIndex(index);
                        descriptxt.setText(Descripcion);
                        montotxt.setText(monto);

                        LineaAntigua = documenttxt.getText() + " ; " + fechatxt.getText() + " ; " + tipo_documentcbx.getSelectedIndex()
                                + " ; " + descriptxt.getText() + " ; " + user_status_txt.getText() + " ; " + montotxt.getText() + " ; "
                                + fechaAc + " ; " + status;

                        TablaC(codigoT); //para mostar las transacciones del txt en la tabla para su modificacion
                        sec = TablaM.getRowCount();

                        Modificar = true;
                        encontrado = true;
                    }
                } else {
                    documenttxt.setText(doc);
                    Modificar = false;
                    encontrado = false;
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
        }

    }//GEN-LAST:event_documenttxtActionPerformed

    private void num_cuentatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_cuentatxtActionPerformed
         if (num_cuentatxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
            num_cuentatxt.grabFocus();
        } else {
            debitotxt.requestFocus();
        }

        String auxc = num_cuentatxt.getText();
        int tipo;
        int cuenta = Integer.parseInt(auxc);

        boolean encontrado = false;
        Scanner s;

        try {

            File f = new File("C:\\Datos\\Catalogo de cuenta.txt");
            if (!f.exists()) {

            } else {

                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {

                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    try {
                        if (cuenta == Integer.parseInt(s1.next())) {

                            num_cuentatxt.setText(auxc);
                            descrip_cuentatxt.setText(s1.next());
                            tipo = Integer.parseInt(s1.next());

                            if (tipo == 1) {
                                JOptionPane.showMessageDialog(this, "Esta cuenta no puede realizar transacciones");
                                num_cuentatxt.setText("");
                                descrip_cuentatxt.setText("");
                                debitotxt.setText("");
                                creditotxt.setText("");
                                commenttxt.setText("");
                                num_cuentatxt.requestFocus();
                            }

                            encontrado = true;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println(e);
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(this, "Este No. de cuenta no existe");
                    num_cuentatxt.setText("");
                    num_cuentatxt.requestFocus();
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_num_cuentatxtActionPerformed

    private void guardarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtActionPerformed
     if (documenttxt.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para Guardar");
    documenttxt.requestFocus();
} else if (tipo_documentcbx.getSelectedItem() == null) {
    JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para Guardar");
} else if (montotxt.getText().isEmpty() && sec < 2) {
    JOptionPane.showMessageDialog(this, "Debe realizar transacciones para Guardar");
    num_cuentatxt.requestFocus();
} else if (num_cuentatxt.getText().isEmpty() && creditotxt.getText().isEmpty() && debitotxt.getText().isEmpty() && sec < 2) {
    JOptionPane.showMessageDialog(this, "Debe realizar transacciones para Guardar");
    num_cuentatxt.grabFocus();
} else if (sec < 2) {
    JOptionPane.showMessageDialog(rootPane, "Para guardar debe involucrar al menos dos cuentas", "ERROR", JOptionPane.ERROR_MESSAGE);
    num_cuentatxt.grabFocus();
} else {
         if (sec< 2) {
            JOptionPane.showMessageDialog(rootPane, "Para guardar Debe al menos involucrar dos cuentas", "ERROR", HEIGHT);
            num_cuentatxt.grabFocus();
        } else {

            double totaldb = 0, totalcr = 0;
            String monto;
        try {
        for (int i = 0; i < TablaM.getRowCount(); i++) {
            Object debitoValue = TablaM.getValueAt(i, 3);
            Object creditoValue = TablaM.getValueAt(i, 4);

            if (debitoValue != null) {
                totaldb += Double.parseDouble(debitoValue.toString());
            }

            if (creditoValue != null) {
                totalcr += Double.parseDouble(creditoValue.toString());
       }
}
                
                 if (totaldb == totalcr) {

                    monto = Double.toString(totaldb);
                    montotxt.setText(monto);

                    File d = new File("C:\\Datos\\Transacciones.txt");
                    if (!d.exists()) {
                        d.createNewFile();
                    }

                    String se = (String) TablaM.getValueAt(seleccionar, 0);
                    String cuenta = (String) TablaM.getValueAt(seleccionar, 1);
                    String desc = (String) TablaM.getValueAt(seleccionar, 2);
                    String db = (String) TablaM.getValueAt(seleccionar, 3);
                    String cr = (String) TablaM.getValueAt(seleccionar, 4);
                    String coment = (String) TablaM.getValueAt(seleccionar, 5);

                    String LineaActual1 = documenttxt.getText() + " ; " + se + " ; " + cuenta + " ; " + desc
                            + " ; " + db + " ; " + cr + " ; " + coment;
     
                     File f = new File("C:\\Datos\\Cabecera Transacciones.txt");
                    Archivo file = new Archivo();
                    Archivo fL = new Archivo();
                
                      if (!f.exists()) {
                        f.createNewFile();
                    }

                    String LineaActual = documenttxt.getText() + " ; " + fechatxt.getText() + " ; " + tipo_documentcbx.getSelectedIndex() + " ; "
                            + descriptxt.getText() + " ; " + user_status_txt.getText() + " ; " + montotxt.getText() + " ; " + fechaAc
                            + " ; " + status;
                    
                              if (Modificar) {
                        file.Modificar(LineaAntigua, LineaActual, f);
                        fL.Modificar(LineaAntigua1, LineaActual1, d);

                        if (sec > maxSequence) {
                            maxSequence = sec;
                            int fila = TablaM.getRowCount() - 1;

                            String tsec = (String) TablaM.getValueAt(fila, 0);
                            String tcuent = (String) TablaM.getValueAt(fila, 1);
                            String tdesc = (String) TablaM.getValueAt(fila, 2);
                            String tdebito = (String) TablaM.getValueAt(fila, 3);
                            String tcred = (String) TablaM.getValueAt(fila, 4);
                            String tcomt = (String) TablaM.getValueAt(fila, 5);

                            String LineaGuardar = documenttxt.getText() + " ; " + tsec + " ; " + tcuent + " ; " + tdesc
                                    + " ; " + tdebito + " ; " + tcred + " ; " + tcomt;

                            fL.GuardarDatos(LineaGuardar, d);

                        }

                        if (eliminar) {
                            eliminarR();
                            eliminar = false;
                        }

                        limpiarbtActionPerformed(evt);
                        Modificar = false;
                        documenttxt.requestFocus();
                    } else {
                        file.GuardarDatos(LineaActual, f);

                        BufferedWriter writer = new BufferedWriter(new FileWriter(d, true));

                        for (int i = 0; i < TablaM.getRowCount(); i++) {
                            writer.write(documenttxt.getText());
                            writer.write(" ; ");
                            for (int j = 0; j < TablaM.getColumnCount(); j++) {
                                 Object value = TablaM.getValueAt(i, j);
                                 if( value != null){
                                writer.write(TablaM.getValueAt(i, j).toString());}

                                if (j < TablaM.getColumnCount() - 1) {
                                    writer.write(" ; ");
                                }
                            }
                            writer.newLine();
                        }
                        writer.close();
                       limpiarbtActionPerformed(evt);
                        documenttxt.requestFocus();
                    }

                    JOptionPane.showMessageDialog(rootPane, "Registro guardado");

                } else {
                    JOptionPane.showMessageDialog(rootPane, "La cantidad de Debitos y Creditos deben ser iguales", "ERROR", HEIGHT);
                    num_cuentatxt.requestFocus();
                }
            } catch (IOException | NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Error al guardar los Datos");
            }
        }
       }
    }//GEN-LAST:event_guardarbtActionPerformed

    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed
        documenttxt.setText("");
        tipo_documentcbx.setSelectedItem(null);
        descriptxt.setText("");
        montotxt.setText("");
        num_cuentatxt.setText("");
        descrip_cuentatxt.setText("");
        debitotxt.setText("");
        creditotxt.setText("");
        commenttxt.setText("");
        TablaM.setRowCount(0);
        documenttxt.requestFocus();
                              
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void creditotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditotxtKeyPressed
        if (!creditotxt.getText().isEmpty() && debitotxt.getText().isEmpty()) {
            debitotxt.setEditable(false);
        } else {
            debitotxt.setEditable(true);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            commenttxt.requestFocus();
        }
    }//GEN-LAST:event_creditotxtKeyPressed

    private void debitotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_debitotxtKeyPressed
              if (!debitotxt.getText().isEmpty() && creditotxt.getText().isEmpty()) {
            creditotxt.setEditable(false);
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                commenttxt.requestFocus();
            }
        } else {
            creditotxt.setEditable(true);
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                creditotxt.requestFocus();
            }
        }
    }//GEN-LAST:event_debitotxtKeyPressed

    private void agregarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarbtActionPerformed
     if (!(creditotxt.getText().isEmpty() || creditotxt.getText().equals("0")) && !(debitotxt.getText().isEmpty() || debitotxt.getText().equals("0"))) {
            JOptionPane.showMessageDialog(rootPane, "Una cuenta no puede tener una transaccion de creditos y debitos en la misma linea", "ERROR", HEIGHT);
        }
        if (num_cuentatxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Rellene el No. de cuenta antes de agregar", "ERROR", HEIGHT);
            num_cuentatxt.grabFocus();
        } else if (creditotxt.getText().isEmpty() && debitotxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Rellene Creditos o Debitos antes de agregar", "ERROR", HEIGHT);
        } else {

            File d = new File("C:\\Datos\\Transacciones.txt");

            int maxSecuencia = obtenerMaximaSecuencia();

            sec= maxSecuencia + 1;

            if (mod) {
                TablaM.setValueAt(secuenciaGlobal, seleccionar, 0);
                TablaM.setValueAt(num_cuentatxt.getText(), seleccionar, 1);
                TablaM.setValueAt(descrip_cuentatxt.getText(), seleccionar, 2);
                TablaM.setValueAt(debitotxt.getText(), seleccionar, 3);
                TablaM.setValueAt(creditotxt.getText(), seleccionar, 4);
                TablaM.setValueAt(commenttxt.getText(), seleccionar, 5);

                mod = false;
               limpiaritemActionPerformed(evt);
            } else {
                secf = String.format("%03d", sec);
                String debito, credito;
                String cuenta = num_cuentatxt.getText();
                String descrip = descrip_cuentatxt.getText();

                if (debitotxt.getText().isEmpty()) {
                    debito = "0";
                    montotxt.setText(creditotxt.getText());
                } else {
                    debito = debitotxt.getText();
                }

                if (creditotxt.getText().isEmpty()) {
                    credito = "0";
                    montotxt.setText(debitotxt.getText());
                } else {
                    credito = creditotxt.getText();
                }

                double acumD = Double.parseDouble(debito);
                double acumC = Double.parseDouble(credito);
                Debit = acumD;
                Credit = acumC;

                String coment = commenttxt.getText();

                TablaM.addRow(new Object[]{secf, cuenta, descrip, debito, credito, coment});
                limpiaritemActionPerformed(evt);
                num_cuentatxt.requestFocus();
            }
        }
    }//GEN-LAST:event_agregarbtActionPerformed

    private void tipo_documentcbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipo_documentcbxItemStateChanged
      num_cuentatxt.requestFocus();
    }//GEN-LAST:event_tipo_documentcbxItemStateChanged

    private void descrip_cuentatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descrip_cuentatxtKeyPressed
      debitotxt.requestFocus();
    }//GEN-LAST:event_descrip_cuentatxtKeyPressed

    private void commenttxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commenttxtKeyPressed
     if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           agregarbt.doClick();}
    }//GEN-LAST:event_commenttxtKeyPressed

    private void documenttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documenttxtKeyTyped
        String allowedCharacters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER)) {
            evt.consume();
        }
    }//GEN-LAST:event_documenttxtKeyTyped

    private void num_cuentatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_cuentatxtKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_num_cuentatxtKeyTyped

    private void debitotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_debitotxtKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || debitotxt.getText().contains("."))) {
            evt.consume();
        }
        
        String debitoText = debitotxt.getText().trim();
        String creditoText = creditotxt.getText().trim();

        if (!debitoText.isEmpty() && creditoText.isEmpty()) {
            creditotxt.setEditable(false);
        } else {
            creditotxt.setEditable(true);
        }

        if (Modificar) {
            if ("0".equals(debitoText)) {
                debitotxt.setEditable(false);
                creditotxt.setEditable(true);
            } else if ("0".equals(creditoText)) {
                creditotxt.setEditable(false);
                debitotxt.setEditable(true);
            } else if ("0".equals(debitoText) && "0".equals(creditoText)) {
                debitotxt.setEditable(true);
                creditotxt.setEditable(true);
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            commenttxt.requestFocus();
        }
    }//GEN-LAST:event_debitotxtKeyTyped

    private void creditotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditotxtKeyTyped
      
       char c = evt.getKeyChar();
        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || creditotxt.getText().contains("."))) {
            evt.consume();
        }
        
        String creditoText = creditotxt.getText().trim();
        String debitoText = debitotxt.getText().trim();

        if (!creditoText.isEmpty() && debitoText.isEmpty()) {
            debitotxt.setEditable(false);
        } else {
            debitotxt.setEditable(true);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            commenttxt.requestFocus();
        }

        if (Modificar) {
            if ("0".equals(creditoText)) {
                creditotxt.setEditable(false);
                debitotxt.setEditable(true);
            } else if ("0".equals(debitoText)) {
                debitotxt.setEditable(false);
                creditotxt.setEditable(true);
            } else if ("0".equals(debitoText) && "0".equals(creditoText)){
                debitotxt.setEditable(true);
                creditotxt.setEditable(true);
            }
        }
    }//GEN-LAST:event_creditotxtKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea cerrar la ventana de Transacciones?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if (resp == JOptionPane.NO_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void salirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtActionPerformed
     this.dispose();
    }//GEN-LAST:event_salirbtActionPerformed

    private void documenttxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documenttxtKeyPressed
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            descriptxt.requestFocus();
        }
    }//GEN-LAST:event_documenttxtKeyPressed

    private void modificaritemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaritemActionPerformed
      seleccionar = registrojt.getSelectedRow();

        debitotxt.setEditable(false);
        creditotxt.setEditable(false);
        if (seleccionar >= 0) {
            secuenciaGlobal = String.valueOf(registrojt.getValueAt(seleccionar, 0));
            num_cuentatxt.setText(String.valueOf(registrojt.getValueAt(seleccionar, 1)));
            descrip_cuentatxt.setText(String.valueOf(registrojt.getValueAt(seleccionar, 2)));
            debitotxt.setText(String.valueOf(registrojt.getValueAt(seleccionar, 3)));
            creditotxt.setText(String.valueOf(registrojt.getValueAt(seleccionar, 4)));
            commenttxt.setText(String.valueOf(registrojt.getValueAt(seleccionar, 5)));

            LineaAntigua1 = documenttxt.getText() + " ; " + secuenciaGlobal + " ; " + num_cuentatxt.getText() + " ; " + descrip_cuentatxt.getText() + " ; " + debitotxt.getText()
                    + " ; " + creditotxt.getText() + " ; " + commenttxt.getText();

//            if (txtDebito.getText().equals("0")) {
//                txtCredito.setEditable(true);
//            } else if (txtCredito.getText().equals("0")) {
//                txtDebito.setEditable(true);
//            }
//            else {
//                txtDebito.setEditable(true);
//                txtCredito.setEditable(true);
//            }

            descrip_cuentatxt.setEditable(false);
            mod = true;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione la fila de la cuenta que desea eliminar", "ERROR", HEIGHT);
        }

    }//GEN-LAST:event_modificaritemActionPerformed

    private void descriptxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptxtKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            num_cuentatxt.requestFocus();}
    }//GEN-LAST:event_descriptxtKeyPressed

    private void EliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarItemActionPerformed
                   // Obtén el índice de la fila seleccionada en la tabla
  int selectedRow = registrojt.getSelectedRow();

if (selectedRow != -1) {
    DefaultTableModel model = (DefaultTableModel) registrojt.getModel();
    String secuenciaEliminar = model.getValueAt(selectedRow, 0).toString(); // Obtén la secuencia a eliminar
    
    eliminarDatoDelArchivo(secuenciaEliminar); // Llama a un método para eliminar del archivo
    
    model.removeRow(selectedRow);
} else {
    JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.", "Error", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_EliminarItemActionPerformed

    private void limpiaritemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiaritemActionPerformed
       num_cuentatxt.setText("");
       descrip_cuentatxt.setText("");
       debitotxt.setText("");
       creditotxt.setText("");
       commenttxt.setText("");
    }//GEN-LAST:event_limpiaritemActionPerformed
  
        private void cargarEstados() {
        try {
            File archivo = new File("C:\\Datos\\Mantenimiento de documento.txt");
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(" ; ");

                if (partes.length >= 2) {

                    String des = partes[1].trim();
                    tipo_documentcbx.addItem(des);
                }
            }

            br.close();
        } catch (IOException e) {
            }
          }
    
         private void TablaC(String nombreDoc) {
    ArrayList<String[]> datos = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Datos\\Transacciones.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(linea, ";");

            String aux = tokens.nextToken().trim();

            if (aux.equals(nombreDoc)) {
                String[] fila = new String[TablaM.getColumnCount()];
                for (int j = 0; j < TablaM.getColumnCount(); j++) {
                    if (tokens.hasMoreTokens()) {
                        fila[j] = tokens.nextToken().trim();
                    } else {
                        fila[j] = "";
                    }
                }

                datos.add(fila);
            }
        }
        br.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    TablaM.setRowCount(0);
    for (String[] fila : datos) {
        TablaM.addRow(fila);
    }
}
      
           private void Asecuencia() {
        for (int i = 0; i < TablaM.getRowCount(); i++) {
            TablaM.setValueAt(String.format("%03d", i + 1), i, 0);
        }
    }
           
         private int obtenerMaximaSecuencia() {
    int maxSecuencia = 0;

    for (int i = 0; i < TablaM.getRowCount(); i++) {
        Object valor = TablaM.getValueAt(i, 0);
        if (valor != null) {
            String valorString = valor.toString().trim();
            if (!valorString.isEmpty()) {
                try {
                    int valorSecuencia = Integer.parseInt(valorString);
                    maxSecuencia = Math.max(maxSecuencia, valorSecuencia);
                } catch (NumberFormatException e) {
                    System.out.println("El valor en la fila " + i + " no es numérico");
                    e.printStackTrace();
                }
            }
        }
    }

    return maxSecuencia;
}
  public void eliminarR() {
        File archivo = new File("C:\\Datos\\Transacciones.txt");
        File archivoNuevo = new File("C:\\Datos\\Transacciones_temp.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoNuevo));

            String linea;

            while ((linea = reader.readLine()) != null) {

                if (linea.equals(LineaTabla)) {
                    System.out.println("es la que se va");

                } else {
                    System.out.println("es la que se queda");
                    writer.write(linea);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            archivo.delete();
            archivoNuevo.renameTo(archivo);

            JOptionPane.showMessageDialog(this, "Registro eliminado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el registro");
        }
    }
    private void eliminarDatoDelArchivo(String secuenciaEliminar) {
    File archivo = new File("C:\\Datos\\Transacciones.txt");
    File archivoTemp = new File("C:\\Datos\\Transacciones_temp.txt");
    
    try (BufferedReader reader = new BufferedReader(new FileReader(archivo));
         BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemp))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(" ; ");
            if (partes.length > 1 && partes[1].equals(secuenciaEliminar)) {
                // No escribe la línea que debe ser eliminada
            } else {
                writer.write(linea);
                writer.newLine();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    if (archivo.exists()) {
        archivo.delete();
    }
    
    archivoTemp.renameTo(archivo);
}
    
       public static String hora() {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        return horaActual.format(hora);
    }
     
//          public static void addToDebit(double amount) {
//        Debit += amount;
//    }
//
//    public static void addToCredit(double amount) {
//        Credit += amount;
//    }
//
//    public static double getDebit() {
//        return Debit;
//    }
//
//    public static double getCredit() {
//        return Credit;
//    }

        
            public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat(" dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
     
 
   
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
            java.util.logging.Logger.getLogger(TrasaccionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrasaccionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrasaccionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrasaccionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TrasaccionesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JMenuItem EliminarItem;
    private javax.swing.JPopupMenu PopupMenuTabla;
    private javax.swing.JPanel Tabla;
    private javax.swing.JPanel Transacciones;
    private javax.swing.JButton agregarbt;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cabecerapanel;
    private javax.swing.JTextField commenttxt;
    private javax.swing.JTextField creditotxt;
    private javax.swing.JTextField debitotxt;
    private javax.swing.JTextField descrip_cuentatxt;
    private javax.swing.JTextField descriptxt;
    private javax.swing.JTextField documenttxt;
    private javax.swing.JTextField fechatxt;
    private javax.swing.JButton guardarbt;
    private javax.swing.JTextField hrstxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupTrasanccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JMenuItem limpiaritem;
    private javax.swing.JMenuItem modificaritem;
    private javax.swing.JTextField montotxt;
    private javax.swing.JTextField num_cuentatxt;
    private javax.swing.JTable registrojt;
    private javax.swing.JButton salirbt;
    private javax.swing.JComboBox<String> tipo_documentcbx;
    private javax.swing.JTextField user_status_txt;
    // End of variables declaration//GEN-END:variables
}
