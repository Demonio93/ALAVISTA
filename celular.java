package vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class celular extends javax.swing.JFrame {

    public celular() {
        this.setLocation(350, 150);
        initComponents();
        this.setVisible(true);
        jPanel1.setOpaque(false);
        lblFondo.setOpaque(false);
        jLabel1.setOpaque(false);
        jLabel2.setOpaque(false);
        jLabel3.setOpaque(false);
        ImageIcon ImagenMorelos = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\morelos.png");
        Icon iconoMorelos = new ImageIcon(ImagenMorelos.getImage().getScaledInstance(lblMapa.getWidth(), lblMapa.getHeight(), Image.SCALE_DEFAULT));
        lblMapa.setIcon(iconoMorelos);
        botones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUbicacion = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        lblMapa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JButton();
        btnVoz = new javax.swing.JButton();
        cmbMunicipios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 20, 20));

        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 20, 20));
        getContentPane().add(lblMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 260, 190));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 40, 30));

        btnVoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVozActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoz, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 40, 30));

        cmbMunicipios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipios", "Amacuzac", "Ayala", "Jiutepec", "Jojutla", "Temoac", "Tepalcingo", "Tetecala", "Tlayacapan", "Totolapan" }));
        cmbMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMunicipiosActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMunicipios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 130, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 280, 190));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 260, 360));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVozActionPerformed
        int o=0;
        while(o<500000000){
            o++;
        }
        new ven();
    }//GEN-LAST:event_btnVozActionPerformed

    private void cmbMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMunicipiosActionPerformed
        if (cmbMunicipios.getSelectedIndex() == 0) {
            ImageIcon ImagenMorelos = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\morelos.png");
            Icon iconoMorelos = new ImageIcon(ImagenMorelos.getImage().getScaledInstance(lblMapa.getWidth(), lblMapa.getHeight(), Image.SCALE_DEFAULT));
            lblMapa.setIcon(iconoMorelos);
            lblMapa.updateUI();
        } else {
            if (cmbMunicipios.getSelectedIndex() == 1) {
                ImageIcon ImagenAmacuzac = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\amacuzac.PNG");
                Icon iconoAmacuzac = new ImageIcon(ImagenAmacuzac.getImage().getScaledInstance(lblMapa.getWidth(), lblMapa.getHeight(), Image.SCALE_DEFAULT));
                lblMapa.setIcon(iconoAmacuzac);
                lblMapa.updateUI();
            }
        }
    }//GEN-LAST:event_cmbMunicipiosActionPerformed

    private void btnUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbicacionActionPerformed
        JOptionPane.showMessageDialog(null, "Mostrare tu ubicacion actual");
    }//GEN-LAST:event_btnUbicacionActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        new ven();
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if(cmbMunicipios.getSelectedIndex()==1){
            new ven();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnUbicacion;
    private javax.swing.JButton btnVoz;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<String> cmbMunicipios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMapa;
    // End of variables declaration//GEN-END:variables
    private void botones() {
        ImageIcon ImagenFondoCel = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\fondo.jpg");
        Icon iconoFondoCel = new ImageIcon(ImagenFondoCel.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(iconoFondoCel);

        ImageIcon ImagenFondo = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\iphone-160307_1280.png");
        Icon iconoFondo = new ImageIcon(ImagenFondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(iconoFondo);

        ImageIcon ImagenUbicacion = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\pin-de-ubicacion.png");
        Icon iconoUbicacion = new ImageIcon(ImagenUbicacion.getImage().getScaledInstance(btnUbicacion.getWidth(), btnUbicacion.getHeight(), Image.SCALE_DEFAULT));
        btnUbicacion.setIcon(iconoUbicacion);
        btnUbicacion.setBorder(null);
        btnUbicacion.setContentAreaFilled(false);

        ImageIcon ImagenBuscar = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\busqueda.png");
        Icon iconoBuscar = new ImageIcon(ImagenBuscar.getImage().getScaledInstance(btnbuscar.getWidth(), btnbuscar.getHeight(), Image.SCALE_DEFAULT));
        btnbuscar.setIcon(iconoBuscar);
        btnbuscar.setBorder(null);
        btnbuscar.setContentAreaFilled(false);

        ImageIcon ImagenInformacion = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\icon.png");
        Icon iconoInformacion = new ImageIcon(ImagenInformacion.getImage().getScaledInstance(btnInformacion.getWidth(), btnInformacion.getHeight(), Image.SCALE_DEFAULT));
        btnInformacion.setIcon(iconoInformacion);
        btnInformacion.setBorder(null);
        btnInformacion.setContentAreaFilled(false);

        ImageIcon ImagenAlexa = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\microfono.png");
        Icon iconoAlexa = new ImageIcon(ImagenAlexa.getImage().getScaledInstance(btnVoz.getWidth(), btnVoz.getHeight(), Image.SCALE_DEFAULT));
        btnVoz.setIcon(iconoAlexa);
        btnVoz.setBorder(null);
        btnVoz.setContentAreaFilled(false);
    }
}
