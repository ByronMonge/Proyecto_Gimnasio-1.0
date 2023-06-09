package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaNutricionista extends javax.swing.JInternalFrame {

    public VistaNutricionista() {
        initComponents();
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getImprimir() {
        return imprimir;
    }

    public void setImprimir(JButton imprimir) {
        this.imprimir = imprimir;
    }
    

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JDateChooser getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(JDateChooser fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public JDialog getjDlgNutricionista() {
        return jDlgNutricionista;
    }

    public void setjDlgNutricionista(JDialog jDlgNutricionista) {
        this.jDlgNutricionista = jDlgNutricionista;
    }

    public JSpinner getSpinnerAniosExperiencia() {
        return spinnerAniosExperiencia;
    }

    public void setSpinnerAniosExperiencia(JSpinner spinnerAniosExperiencia) {
        this.spinnerAniosExperiencia = spinnerAniosExperiencia;
    }

    public JTable getTblNutricionista() {
        return tblNutricionista;
    }

    public void setTblNutricionista(JTable tblNutricionista) {
        this.tblNutricionista = tblNutricionista;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtCodigoNutricionista() {
        return txtCodigoNutricionista;
    }

    public void setTxtCodigoNutricionista(JTextField txtCodigoNutricionista) {
        this.txtCodigoNutricionista = txtCodigoNutricionista;
    }

    public JSpinner getSpinnerSalario() {
        return spinnerSalario;
    }

    public void setSpinnerSalario(JSpinner spinnerSalario) {
        this.spinnerSalario = spinnerSalario;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDlgNutricionista = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spinnerAniosExperiencia = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fechaDeNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCodigoNutricionista = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spinnerSalario = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNutricionista = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(889, 495));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setText("Cedula:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 191, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 191, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setText("Salario:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        spinnerAniosExperiencia.setModel(new javax.swing.SpinnerNumberModel());
        jPanel2.add(spinnerAniosExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 80, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel15.setText("Apellido:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 191, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setText("Fecha Nacimiento:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        jPanel2.add(fechaDeNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 191, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel11.setText("Teléfono:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 191, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel9.setText("Dirección:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 191, -1));

        btnGuardar.setBackground(new java.awt.Color(153, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 130, 50));

        btnCancelar.setBackground(new java.awt.Color(153, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, 50));

        txtCodigoNutricionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoNutricionistaActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigoNutricionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 45, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setText("Años de experiencia:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        spinnerSalario.setModel(new javax.swing.SpinnerNumberModel());
        jPanel2.add(spinnerSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 120, -1));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 25)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrar nutricionista");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(209, 209, 209)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

        javax.swing.GroupLayout jDlgNutricionistaLayout = new javax.swing.GroupLayout(jDlgNutricionista.getContentPane());
        jDlgNutricionista.getContentPane().setLayout(jDlgNutricionistaLayout);
        jDlgNutricionistaLayout.setHorizontalGroup(
            jDlgNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        jDlgNutricionistaLayout.setVerticalGroup(
            jDlgNutricionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(209, 232, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Buscar:");

        btnCrear.setBackground(new java.awt.Color(255, 255, 204));
        btnCrear.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCrear.setText("Guardar");

        btnModificar.setBackground(new java.awt.Color(255, 255, 204));
        btnModificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");

        btnActualizar.setBackground(new java.awt.Color(255, 255, 204));
        btnActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");

        btnEliminar.setBackground(new java.awt.Color(255, 255, 204));
        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.jpg"))); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setText("GIMNASIO ONE- PIECE");

        jLabel16.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 153));
        jLabel16.setText("REGISTRO NUTRICIONISTA");

        imprimir.setBackground(new java.awt.Color(255, 255, 204));
        imprimir.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        imprimir.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrear)
                        .addGap(44, 44, 44)
                        .addComponent(btnModificar)
                        .addGap(36, 36, 36)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imprimir)
                            .addComponent(btnEliminar))
                        .addGap(21, 21, 21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel16)))
                .addGap(8, 8, 8)
                .addComponent(imprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCrear)
                        .addComponent(btnModificar)
                        .addComponent(btnActualizar)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tblNutricionista.setBackground(new java.awt.Color(232, 242, 185));
        tblNutricionista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código de nutricionista", "Cédula", "Nombre", "Apellido", "Años de experiencia", "Salario"
            }
        ));
        jScrollPane1.setViewportView(tblNutricionista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoNutricionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoNutricionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoNutricionistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private com.toedter.calendar.JDateChooser fechaDeNacimiento;
    private javax.swing.JButton imprimir;
    private javax.swing.JDialog jDlgNutricionista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerAniosExperiencia;
    private javax.swing.JSpinner spinnerSalario;
    private javax.swing.JTable tblNutricionista;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoNutricionista;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
