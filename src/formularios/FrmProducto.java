package formularios;

import dao.DProducto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Chang
 */
public class FrmProducto extends javax.swing.JFrame {
    DProducto dp = new DProducto();
    private int pos = 0;
    
    /**
     * Creates new form FrmProducto
     */
    public FrmProducto() {
        initComponents();
        
        //set tool tip text muestra un texto específico cuando el curso 
        //se posiciona encima del objeto
        jBtnLimpiar.setToolTipText("Limpiar");
        jBtnAgregar.setToolTipText("Agregar");
        jBtnEditar.setToolTipText("Editar");
        jBtnEliminar.setToolTipText("Eliminar");
        jBtnPrimero.setToolTipText("Primero");
        jBtnAnterior.setToolTipText("Anterior");
        jBtnSiguiente.setToolTipText("Siguiente");
        jBtnUltimo.setToolTipText("Ultimo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jBtnPrimero = new javax.swing.JButton();
        jBtnAnterior = new javax.swing.JButton();
        jBtnSiguiente = new javax.swing.JButton();
        jBtnUltimo = new javax.swing.JButton();
        jLblTituloTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblRegistroProd = new javax.swing.JTable();
        jTfCodigo = new javax.swing.JTextField();
        jTfNombre = new javax.swing.JTextField();
        jTfPrecio = new javax.swing.JTextField();
        jTfExistencia = new javax.swing.JTextField();
        jLblTituloCampos = new javax.swing.JLabel();
        jLblPrecio = new javax.swing.JLabel();
        jLblCodigo = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblExistencia = new javax.swing.JLabel();

        jTextField4.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Productos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar1.setRollover(true);

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/icon_imgs/nuevo-producto.png"))); // NOI18N
        jBtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnLimpiar.setFocusable(false);
        jBtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnLimpiar);

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/icon_imgs/disquete.png"))); // NOI18N
        jBtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAgregar.setFocusable(false);
        jBtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnAgregar);

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/icon_imgs/editar.png"))); // NOI18N
        jBtnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnEditar.setEnabled(false);
        jBtnEditar.setFocusable(false);
        jBtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEditar);

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/icon_imgs/boton-eliminar.png"))); // NOI18N
        jBtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnEliminar.setEnabled(false);
        jBtnEliminar.setFocusable(false);
        jBtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEliminar);
        jToolBar1.add(jSeparator1);

        jBtnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/icon_imgs/puntas-de-flecha-de-contorno-delgado-a-la-izquierda.png"))); // NOI18N
        jBtnPrimero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnPrimero.setFocusable(false);
        jBtnPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrimeroActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnPrimero);

        jBtnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/icon_imgs/flecha-izquierda.png"))); // NOI18N
        jBtnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAnterior.setFocusable(false);
        jBtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnteriorActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnAnterior);

        jBtnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/icon_imgs/flecha-correcta.png"))); // NOI18N
        jBtnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnSiguiente.setFocusable(false);
        jBtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSiguienteActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnSiguiente);

        jBtnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complemento/icon_imgs/puntas-de-flecha-delgadas-derechas.png"))); // NOI18N
        jBtnUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnUltimo.setFocusable(false);
        jBtnUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUltimoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnUltimo);

        jLblTituloTabla.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLblTituloTabla.setText("Registro de Productos");

        jTblRegistroProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTblRegistroProd);

        jLblTituloCampos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLblTituloCampos.setText("Agregar Valores a Campos:");

        jLblPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLblPrecio.setText("Precio:");

        jLblCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLblCodigo.setText("Código:");

        jLblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLblNombre.setText("Nombre:");

        jLblExistencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLblExistencia.setText("Existencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblCodigo)
                            .addComponent(jLblPrecio)
                            .addComponent(jLblNombre)
                            .addComponent(jLblExistencia))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLblTituloCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLblTituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLblTituloTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLblTituloCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblPrecio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblExistencia))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        
        //validar campo vacio codigo
        if(jTfCodigo.getText() == "" || jTfCodigo.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita Agregar un Código", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //validar campo vacio nombre
        if(jTfNombre.getText() == "" || jTfNombre.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita Agregar un Nombre", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //validar campo vacio precio
        if(jTfPrecio.getText() == "" || jTfPrecio.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita Agregar un Precio", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //validar campo vacio existencia
        if(jTfExistencia.getText() == "" || jTfExistencia.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita Agregar cantidad de Existencia", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int codigo = Integer.parseInt(jTfCodigo.getText());
        
        String nombre = jTfNombre.getText();
        
        int precio = Integer.parseInt(jTfPrecio.getText());
        
        int existencia = Integer.parseInt(jTfExistencia.getText());
        
        int b = dp.agregarProducto(codigo, precio, existencia, nombre);
        
        if(b == 1) {
            JOptionPane.showMessageDialog(this, "Registro Agregado...", 
                    "Guardar", JOptionPane.INFORMATION_MESSAGE);
            llenarTabla();
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar...", 
                    "Guardar", JOptionPane.ERROR_MESSAGE);
        }
        llenarTabla();
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrimeroActionPerformed
        // TODO add your handling code here:
        if (!dp.getListProducto().isEmpty()) {
            try {
                pos = 0;
                int codigo = dp.getListProducto().get(pos).getCodigoProd();
                int precio = dp.getListProducto().get(pos).getPrecioProd();
                int existencia = dp.getListProducto().get(pos).getExistenciaProd();
                String nombre = dp.getListProducto().get(pos).getNombreProd();
                
                jTfCodigo.setText("" + codigo);
                jTfNombre.setText(nombre);
                jTfPrecio.setText("" +  precio);
                jTfExistencia.setText("" + existencia);
                
                jBtnAgregar.setEnabled(false);  //se bloquea agregar
                jBtnEditar.setEnabled(true);    //se desbloquea editar
                jBtnEliminar.setEnabled(true);  //se desbloquea eliminar
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), 
                        "Error...", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros...", 
                        "Registros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnPrimeroActionPerformed

    private void jBtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUltimoActionPerformed
        // TODO add your handling code here:
        if (!dp.getListProducto().isEmpty()) {
            try {
                pos = dp.getListProducto().size() - 1;
                int codigo = dp.getListProducto().get(pos).getCodigoProd();
                int precio = dp.getListProducto().get(pos).getPrecioProd();
                int existencia = dp.getListProducto().get(pos).getExistenciaProd();
                String nombre = dp.getListProducto().get(pos).getNombreProd();
                
                jTfCodigo.setText("" + codigo);
                jTfNombre.setText(nombre);
                jTfPrecio.setText("" +  precio);
                jTfExistencia.setText("" + existencia);
                
                jBtnAgregar.setEnabled(false);  //se bloquea agregar
                jBtnEditar.setEnabled(true);    //se desbloquea editar
                jBtnEliminar.setEnabled(true);  //se desbloquea eliminar
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), 
                        "Error...", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros...", 
                        "Registros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnUltimoActionPerformed

    private void jBtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnteriorActionPerformed
        // TODO add your handling code here:
        if (!dp.getListProducto().isEmpty()) {
            try {
                pos--;
                if(pos < 0) pos = dp.getListProducto().size() - 1;
                int codigo = dp.getListProducto().get(pos).getCodigoProd();
                int precio = dp.getListProducto().get(pos).getPrecioProd();
                int existencia = dp.getListProducto().get(pos).getExistenciaProd();
                String nombre = dp.getListProducto().get(pos).getNombreProd();
                
                jTfCodigo.setText("" + codigo);
                jTfNombre.setText(nombre);
                jTfPrecio.setText("" +  precio);
                jTfExistencia.setText("" + existencia);
                
                jBtnAgregar.setEnabled(false);  //se bloquea agregar
                jBtnEditar.setEnabled(true);    //se desbloquea editar
                jBtnEliminar.setEnabled(true);  //se desbloquea eliminar
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), 
                        "Error...", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros...", 
                        "Registros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnAnteriorActionPerformed

    private void jBtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSiguienteActionPerformed
        // TODO add your handling code here:
        if (!dp.getListProducto().isEmpty()) {
            try {
                pos++;
                if (pos == dp.getListProducto().size()) pos = 0;
                int codigo = dp.getListProducto().get(pos).getCodigoProd();
                int precio = dp.getListProducto().get(pos).getPrecioProd();
                int existencia = dp.getListProducto().get(pos).getExistenciaProd();
                String nombre = dp.getListProducto().get(pos).getNombreProd();
                
                jTfCodigo.setText("" + codigo);
                jTfNombre.setText(nombre);
                jTfPrecio.setText("" +  precio);
                jTfExistencia.setText("" + existencia);
                
                jBtnAgregar.setEnabled(false);  //se bloquea agregar
                jBtnEditar.setEnabled(true);    //se desbloquea editar
                jBtnEliminar.setEnabled(true);  //se desbloquea eliminar
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), 
                        "Error...", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros...", 
                        "Registros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnSiguienteActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
        //validar campo vacio codigo
        if(jTfCodigo.getText() == "" || jTfCodigo.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita Agregar un Código", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //validar campo vacio nombre
        if(jTfNombre.getText() == "" || jTfNombre.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita Agregar un Nombre", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //validar campo vacio precio
        if(jTfPrecio.getText() == "" || jTfPrecio.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita Agregar un Precio", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //validar campo vacio existencia
        if(jTfExistencia.getText() == "" || jTfExistencia.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita Agregar cantidad de Existencia", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        dp.getListProducto().get(pos).setCodigoProd(Integer.parseInt(jTfCodigo.getText()));
        dp.getListProducto().get(pos).setNombreProd(jTfNombre.getText());
        dp.getListProducto().get(pos).setPrecioProd(Integer.parseInt(jTfPrecio.getText()));
        dp.getListProducto().get(pos).setExistenciaProd(Integer.parseInt(jTfExistencia.getText()));
        
        JOptionPane.showMessageDialog(this, "Cambios realizados...", "Editar", 
                JOptionPane.INFORMATION_MESSAGE);
        
        llenarTabla();
        Limpiar();
        
        jBtnAgregar.setEnabled(true);   //se vuelve a desbloquear agregar
        jBtnEditar.setEnabled(false);   //se bloquea editar
        jBtnEliminar.setEnabled(false); //se bloquea eliminar
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        int op;
        
        op = JOptionPane.showConfirmDialog(this, "¿Desea Eliminar?", "Eliminar", 
                JOptionPane.YES_NO_OPTION);
        
        if(op == 0) {
            dp.getListProducto().remove(pos);
            JOptionPane.showMessageDialog(this, "Ok");
            
            llenarTabla();
            Limpiar();
            
            jBtnAgregar.setEnabled(true);   //se vuelve a desbloquear agregar
            jBtnEditar.setEnabled(false);   //se bloquea editar
            jBtnEliminar.setEnabled(false); //se bloquea eliminar
            
        } else {
            JOptionPane.showMessageDialog(this, "Operacion cancelada.");
            jBtnAgregar.setEnabled(true);   //se vuelve a desbloquear agregar
            jBtnEditar.setEnabled(false);   //se bloquea editar
            jBtnEliminar.setEnabled(false); //se bloquea eliminar
            Limpiar();
        }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void llenarTabla() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl = dp.getListProd();
        jTblRegistroProd.setModel(tbl);
    }
    
    private void Limpiar() {
        jTfCodigo.setText("");
        jTfNombre.setText("");
        jTfPrecio.setText("");
        jTfExistencia.setText("");
        
        jTfCodigo.requestFocus();
    }
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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnAnterior;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnPrimero;
    private javax.swing.JButton jBtnSiguiente;
    private javax.swing.JButton jBtnUltimo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblExistencia;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JLabel jLblTituloCampos;
    private javax.swing.JLabel jLblTituloTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTblRegistroProd;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTfCodigo;
    private javax.swing.JTextField jTfExistencia;
    private javax.swing.JTextField jTfNombre;
    private javax.swing.JTextField jTfPrecio;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
