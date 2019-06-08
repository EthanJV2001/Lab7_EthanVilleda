
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.awt.Color;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        updateChefs();
        updateClientes();
        adminB=new administrarBarra(jProgressBar1, jt_Tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_AgregarCliente = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_NombreCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sp_EdadCliente = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        cb_GeneroCliente = new javax.swing.JComboBox<>();
        jb_AgCliente = new javax.swing.JButton();
        jd_AgregarChef = new javax.swing.JDialog();
        tf_NombreChef = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sp_EdadChef = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        cb_GeneroChef = new javax.swing.JComboBox<>();
        jb_AgChef = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jd_Ordenar = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_Sopas = new javax.swing.JComboBox<>();
        cb_Entrada = new javax.swing.JComboBox<>();
        cb_PlatoFuerte = new javax.swing.JComboBox<>();
        cb_Postre = new javax.swing.JComboBox<>();
        jb_Orden = new javax.swing.JButton();
        popup_EliminarCliente = new javax.swing.JPopupMenu();
        mi_Eliminar = new javax.swing.JMenuItem();
        popup_EliminarChef = new javax.swing.JPopupMenu();
        mi_EliminarCh = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jb_CrearCliente = new javax.swing.JButton();
        jb_CrearChef = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_Clientes = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_Chefs = new javax.swing.JList<>();
        jb_Ordenar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_Tabla = new javax.swing.JTable();

        jLabel4.setText("Agregar cliente");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Edad:");

        sp_EdadCliente.setModel(new javax.swing.SpinnerNumberModel(20, null, null, 1));

        jLabel7.setText("Genero:");

        cb_GeneroCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        jb_AgCliente.setText("Agregar");
        jb_AgCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_AgClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_AgregarClienteLayout = new javax.swing.GroupLayout(jd_AgregarCliente.getContentPane());
        jd_AgregarCliente.getContentPane().setLayout(jd_AgregarClienteLayout);
        jd_AgregarClienteLayout.setHorizontalGroup(
            jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarClienteLayout.createSequentialGroup()
                .addGroup(jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)
                        .addGroup(jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_NombreCliente)
                            .addComponent(sp_EdadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_GeneroCliente, 0, 163, Short.MAX_VALUE)))
                    .addGroup(jd_AgregarClienteLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jb_AgCliente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_AgregarClienteLayout.setVerticalGroup(
            jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sp_EdadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_GeneroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jb_AgCliente)
                .addContainerGap())
        );

        jLabel8.setText("Edad:");

        sp_EdadChef.setModel(new javax.swing.SpinnerNumberModel(20, null, null, 1));

        jLabel9.setText("Genero:");

        cb_GeneroChef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        jb_AgChef.setText("Agregar");
        jb_AgChef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_AgChefMouseClicked(evt);
            }
        });

        jLabel10.setText("Agregar chef");

        jLabel11.setText("Nombre:");

        javax.swing.GroupLayout jd_AgregarChefLayout = new javax.swing.GroupLayout(jd_AgregarChef.getContentPane());
        jd_AgregarChef.getContentPane().setLayout(jd_AgregarChefLayout);
        jd_AgregarChefLayout.setHorizontalGroup(
            jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarChefLayout.createSequentialGroup()
                .addGroup(jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarChefLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(46, 46, 46)
                        .addGroup(jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_NombreChef)
                            .addComponent(sp_EdadChef, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_GeneroChef, 0, 163, Short.MAX_VALUE)))
                    .addGroup(jd_AgregarChefLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jb_AgChef))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_AgregarChefLayout.setVerticalGroup(
            jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarChefLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_NombreChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sp_EdadChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarChefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_GeneroChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jb_AgChef)
                .addContainerGap())
        );

        jLabel13.setText("Ordenar");

        jLabel14.setText("Seleccione sopa: ");

        jLabel15.setText("Seleccione plato fuerte: ");

        jLabel16.setText("Seleccione postre: ");

        jLabel17.setText("Seleccione entrada: ");

        cb_Sopas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tortilla", "Res", "Pollo", "Capirotada" }));

        cb_Entrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anafre parisiense", "Empanada", "Huevos rellenos" }));

        cb_PlatoFuerte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pollo", "Espaguetis", "Hamburgesa", "Salmon", "Cordero" }));

        cb_Postre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pie de limon", "Cheesecake", "Tiramisu", "Crepa" }));

        jb_Orden.setText("Ordenar");
        jb_Orden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_OrdenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_OrdenarLayout = new javax.swing.GroupLayout(jd_Ordenar.getContentPane());
        jd_Ordenar.getContentPane().setLayout(jd_OrdenarLayout);
        jd_OrdenarLayout.setHorizontalGroup(
            jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OrdenarLayout.createSequentialGroup()
                .addGroup(jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_OrdenarLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jd_OrdenarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(37, 37, 37)
                        .addGroup(jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_Sopas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_Entrada, 0, 163, Short.MAX_VALUE)
                            .addComponent(cb_PlatoFuerte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_Postre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jd_OrdenarLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jb_Orden)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_OrdenarLayout.setVerticalGroup(
            jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OrdenarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_Sopas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cb_PlatoFuerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_OrdenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_Postre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jb_Orden)
                .addContainerGap())
        );

        mi_Eliminar.setText("Eliminar cliente");
        mi_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_EliminarActionPerformed(evt);
            }
        });
        popup_EliminarCliente.add(mi_Eliminar);

        mi_EliminarCh.setText("Eliminar chef");
        mi_EliminarCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_EliminarChActionPerformed(evt);
            }
        });
        popup_EliminarChef.add(mi_EliminarCh);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mamarr'e");

        jb_CrearCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_CrearCliente.setText("CREAR CLIENTE");
        jb_CrearCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearClienteMouseClicked(evt);
            }
        });

        jb_CrearChef.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_CrearChef.setText("CREAR CHEF");
        jb_CrearChef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearChefMouseClicked(evt);
            }
        });

        jl_Clientes.setModel(new DefaultListModel());
        jl_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_ClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_Clientes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Clientes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Chefs");

        jl_Chefs.setModel(new DefaultListModel());
        jl_Chefs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_ChefsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_Chefs);

        jb_Ordenar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_Ordenar.setText("ORDENAR");
        jb_Ordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_OrdenarMouseClicked(evt);
            }
        });

        jLabel12.setText("*Seleccione de la lista 'Clientes' y 'Chefs'");

        jLabel18.setText("*Para eliminar seleccione uno y haga click derecho");

        jt_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tiempo"
            }
        ));
        jScrollPane3.setViewportView(jt_Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jb_CrearChef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_CrearCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jb_Ordenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addContainerGap(80, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_CrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jb_CrearChef, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jb_Ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_CrearClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearClienteMouseClicked
        jd_AgregarCliente.pack();
        jd_AgregarCliente.setModal(true);
        jd_AgregarCliente.setVisible(true);
    }//GEN-LAST:event_jb_CrearClienteMouseClicked

    private void jb_AgClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_AgClienteMouseClicked
        char genero='*';
        if(cb_GeneroCliente.getSelectedIndex()==0){
            genero='M';
        }if(cb_GeneroCliente.getSelectedIndex()==1){
            genero='F';
        }if(cb_GeneroCliente.getSelectedIndex()==2){
            genero='O';
        }
        clientes.add(new Cliente(tf_NombreCliente.getText(), (int)sp_EdadCliente.getValue(), genero));
        updateClientes();
        tf_NombreCliente.setText("");
        sp_EdadCliente.setValue(20);
        cb_GeneroCliente.setSelectedIndex(0);
        jd_AgregarCliente.setVisible(false);
    }//GEN-LAST:event_jb_AgClienteMouseClicked

    private void jb_CrearChefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearChefMouseClicked
        jd_AgregarChef.pack();
        jd_AgregarChef.setModal(true);
        jd_AgregarChef.setVisible(true);
    }//GEN-LAST:event_jb_CrearChefMouseClicked

    private void jb_AgChefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_AgChefMouseClicked
        char genero='*';
        if(cb_GeneroChef.getSelectedIndex()==0){
            genero='M';
        }if(cb_GeneroChef.getSelectedIndex()==1){
            genero='F';
        }if(cb_GeneroChef.getSelectedIndex()==2){
            genero='O';
        }
        chefs.add(new Chef(tf_NombreChef.getText(), (int)sp_EdadChef.getValue(), genero));
        updateChefs();
        tf_NombreChef.setText("");
        sp_EdadChef.setValue(20);
        cb_GeneroChef.setSelectedIndex(0);
        jd_AgregarChef.setVisible(false);
    }//GEN-LAST:event_jb_AgChefMouseClicked

    private void jb_OrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_OrdenarMouseClicked
        posCliente=jl_Clientes.getSelectedIndex();
        posChef=jl_Chefs.getSelectedIndex();
        if(jl_Clientes.getSelectedIndex()>=0){
            if(jl_Chefs.getSelectedIndex()>=0){
                jd_Ordenar.pack();
                jd_Ordenar.setModal(true);
                jd_Ordenar.setVisible(true);
            }
        }
    }//GEN-LAST:event_jb_OrdenarMouseClicked

    private void jb_OrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_OrdenMouseClicked
        Date fecha=new Date();
        if(cb_Sopas.getSelectedIndex()==0){
            clientes.get(posCliente).getPlatillos().add(new Sopas("Tortillas", 9, 11, fecha, Color.RED));
            chefs.get(posChef).getPlatillos().add(new Sopas("Tortillas", 9, 11, fecha, Color.RED));
        }else{
            if(cb_Sopas.getSelectedIndex()==1){
                clientes.get(posCliente).getPlatillos().add(new Sopas("Res", 12, 12, fecha, Color.BLACK));
                chefs.get(posChef).getPlatillos().add(new Sopas("Res", 12, 12, fecha, Color.BLACK));
            }else{
                if(cb_Sopas.getSelectedIndex()==2){
                        clientes.get(posCliente).getPlatillos().add(new Sopas("Pollo", 10, 13, fecha, Color.YELLOW));
                        chefs.get(posChef).getPlatillos().add(new Sopas("Pollo", 10, 13, fecha, Color.YELLOW));
                }else{
                    clientes.get(posCliente).getPlatillos().add(new Sopas("Capirotada", 7, 14, fecha, Color.WHITE));
                    chefs.get(posChef).getPlatillos().add(new Sopas("Capirotada", 7, 14, fecha, Color.WHITE));
                }
            }
        }
        if(cb_Entrada.getSelectedIndex()==0){
            clientes.get(posCliente).getPlatillos().add(new Entradas("Anafre Paraisense", 5, 21, fecha, Color.BLACK));
            chefs.get(posChef).getPlatillos().add(new Entradas("Anafre Paraisense", 5, 21, fecha, Color.BLACK));
        }else{
            if(cb_Entrada.getSelectedIndex()==1){
                clientes.get(posCliente).getPlatillos().add(new Entradas("Empanada", 7, 22, fecha, Color.RED));
                chefs.get(posChef).getPlatillos().add(new Entradas("Empanada", 7, 22, fecha, Color.RED));
            }else{
                clientes.get(posCliente).getPlatillos().add(new Entradas("Huevos Rellenos", 3, 23, fecha, Color.WHITE));
                chefs.get(posChef).getPlatillos().add(new Entradas("Huevos Rellenos", 3, 23, fecha, Color.WHITE));
            }
        }
        if(cb_PlatoFuerte.getSelectedIndex()==0){
            clientes.get(posCliente).getPlatillos().add(new PlatoFuerte("Pollo con pure", 15, 31, fecha, Color.BLACK));
            chefs.get(posChef).getPlatillos().add(new PlatoFuerte("Pollo con pure", 15, 31, fecha, Color.BLACK));
        }else{
            if(cb_PlatoFuerte.getSelectedIndex()==1){
                clientes.get(posCliente).getPlatillos().add(new PlatoFuerte("Espaguetis", 13, 32, fecha, Color.RED));
                chefs.get(posChef).getPlatillos().add(new PlatoFuerte("Espaguetis", 13, 32, fecha, Color.RED));
            }else{
                if(cb_PlatoFuerte.getSelectedIndex()==2){
                    clientes.get(posCliente).getPlatillos().add(new PlatoFuerte("Hamburguesa", 11, 33, fecha, Color.YELLOW));
                    chefs.get(posChef).getPlatillos().add(new PlatoFuerte("Hamburguesa", 11, 33, fecha, Color.YELLOW));
                }else{
                    if(cb_PlatoFuerte.getSelectedIndex()==3){
                        clientes.get(posCliente).getPlatillos().add(new PlatoFuerte("Salmon", 18, 34, fecha, Color.PINK));
                        chefs.get(posChef).getPlatillos().add(new PlatoFuerte("Salmon", 18, 34, fecha, Color.PINK));
                    }else{
                        clientes.get(posCliente).getPlatillos().add(new PlatoFuerte("Cordero", 16, 35, fecha, Color.WHITE));
                        chefs.get(posChef).getPlatillos().add(new PlatoFuerte("Cordero", 16, 35, fecha, Color.WHITE));
                    }
                }
            }
        }
        if(cb_Postre.getSelectedIndex()==0){
            clientes.get(posCliente).getPlatillos().add(new Postre("Pie de limon", 7, 41, fecha, Color.GREEN));
            chefs.get(posChef).getPlatillos().add(new Postre("Pie de limon", 7, 41, fecha, Color.GREEN));
        }else{
            if(cb_Postre.getSelectedIndex()==1){
                clientes.get(posCliente).getPlatillos().add(new Postre("Cheesecake", 8, 42, fecha, Color.RED));
                chefs.get(posChef).getPlatillos().add(new Postre("Cheesecake", 8, 42, fecha, Color.RED));
            }else{
                if(cb_Postre.getSelectedIndex()==2){
                    clientes.get(posCliente).getPlatillos().add(new Postre("Tiramisu", 9, 43, fecha, Color.BLACK));
                    chefs.get(posChef).getPlatillos().add(new Postre("Tiramisu", 9, 43, fecha, Color.BLACK));
                }else{
                    clientes.get(posCliente).getPlatillos().add(new Postre("Crepa", 6, 44, fecha, Color.YELLOW));
                    chefs.get(posChef).getPlatillos().add(new Postre("Crepa", 6, 44, fecha, Color.YELLOW));
                }
            }
        }
        jd_Ordenar.setVisible(false);
        updateChefs();updateClientes();
        DefaultTableModel modelo=(DefaultTableModel)jt_Tabla.getModel();
        DefaultListModel modeloLista=(DefaultListModel)jl_Clientes.getModel();
        if(jl_Clientes.getSelectedIndex()>=0){
            modelo.setRowCount(0);
            Cliente cl=(Cliente)modeloLista.getElementAt(jl_Clientes.getSelectedIndex());
            ArrayList<Platillos> plat= cl.getPlatillos();
            for (Platillos pla : plat) {
                adminB.getPlati().add(pla);
            }
            adminB.setAvanzar(true);
        }
    }//GEN-LAST:event_jb_OrdenMouseClicked

    private void jl_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_ClientesMouseClicked
        if(jl_Clientes.getSelectedIndex()>=0){
            if(evt.isMetaDown()){
                popup_EliminarCliente.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_ClientesMouseClicked

    private void mi_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_EliminarActionPerformed
        clientes.remove(jl_Clientes.getSelectedIndex());
        updateClientes();
    }//GEN-LAST:event_mi_EliminarActionPerformed

    private void mi_EliminarChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_EliminarChActionPerformed
        chefs.remove(jl_Chefs.getSelectedIndex());
        updateChefs();
    }//GEN-LAST:event_mi_EliminarChActionPerformed

    private void jl_ChefsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_ChefsMouseClicked
        if(jl_Chefs.getSelectedIndex()>=0){
            if(evt.isMetaDown()){
                popup_EliminarChef.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_ChefsMouseClicked

    public void updateChefs(){
        DefaultListModel modelo=new DefaultListModel();
        for (int i = 0; i < chefs.size(); i++) {
            modelo.addElement(chefs.get(i).getNombre() + ", " + chefs.get(i).getEdad() + ", " + chefs.get(i).getGenero() + ", " + chefs.get(i).getPlatillos());
        }
        jl_Chefs.setModel(modelo);
    }
    
    public void updateClientes(){
        DefaultListModel modelo=new DefaultListModel();
        for (int i = 0; i < clientes.size(); i++) {
            modelo.addElement(clientes.get(i).getNombre() + ", " + clientes.get(i).getEdad() + ", " + clientes.get(i).getGenero());
        }
        jl_Clientes.setModel(modelo);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Entrada;
    private javax.swing.JComboBox<String> cb_GeneroChef;
    private javax.swing.JComboBox<String> cb_GeneroCliente;
    private javax.swing.JComboBox<String> cb_PlatoFuerte;
    private javax.swing.JComboBox<String> cb_Postre;
    private javax.swing.JComboBox<String> cb_Sopas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_AgChef;
    private javax.swing.JButton jb_AgCliente;
    private javax.swing.JButton jb_CrearChef;
    private javax.swing.JButton jb_CrearCliente;
    private javax.swing.JButton jb_Orden;
    private javax.swing.JButton jb_Ordenar;
    private javax.swing.JDialog jd_AgregarChef;
    private javax.swing.JDialog jd_AgregarCliente;
    private javax.swing.JDialog jd_Ordenar;
    private javax.swing.JList<String> jl_Chefs;
    private javax.swing.JList<String> jl_Clientes;
    private javax.swing.JTable jt_Tabla;
    private javax.swing.JMenuItem mi_Eliminar;
    private javax.swing.JMenuItem mi_EliminarCh;
    private javax.swing.JPopupMenu popup_EliminarChef;
    private javax.swing.JPopupMenu popup_EliminarCliente;
    private javax.swing.JSpinner sp_EdadChef;
    private javax.swing.JSpinner sp_EdadCliente;
    private javax.swing.JTextField tf_NombreChef;
    private javax.swing.JTextField tf_NombreCliente;
    // End of variables declaration//GEN-END:variables
    ArrayList<Cliente> clientes=new ArrayList();
    ArrayList<Chef> chefs=new ArrayList();
    int posCliente;
    int posChef;
    administrarBarra adminB;
}
