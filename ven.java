package vista;

import Controlador.Conexion;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ven extends javax.swing.JFrame {

    private String sql = "select id, ejercicio, fecha_inicio, fecha_termino, tipo_acto, num_control, fund_jur, uni_area from datos";
    private Conexion con = new Conexion();

    public ven() {
        initComponents();
        this.setLocation(350, 150);
        mostrarTablaGeneral();
        this.setVisible(true);
        JTable(jTable1, jScrollPane1);
        boton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnequis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnequis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequisActionPerformed(evt);
            }
        });
        getContentPane().add(btnequis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 20, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(600, 45));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 330));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amacuzac");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 25));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 260, 360));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnequisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequisActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnequisActionPerformed

    private void mostrarTablaGeneral() {
        DefaultTableModel dt = new DefaultTableModel();
        TableColumnModel col = jTable1.getColumnModel();

        dt.addColumn("ID");
        dt.addColumn("Ejercicio");
        dt.addColumn(" Fecha de Inicio Del Periodo Que Se Informa");
        dt.addColumn(" Fecha de Término Del Periodo Que Se Informa");
        dt.addColumn(" Tipo de Acto Jurídico (catálogo)");
        dt.addColumn("Contrato, Convenio, Concesión, entre Otros.");
        dt.addColumn(" Fundamento Jurídico por El Cual Se Llevó a Cabo El Act");
        dt.addColumn(" Unidad(es) O Área(s) Responsable(s) de Instrumentación");

        try {
            PreparedStatement consulta = con.getConecction().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                Object[] fila = new Object[8];

                for (int i = 0; i < fila.length; i++) {
                    fila[i] = resultado.getObject(i + 1).toString();
                }
                dt.addRow(fila);
            }

            jTable1.setModel(dt);
            col.getColumn(0).setPreferredWidth(55);
            col.getColumn(1).setPreferredWidth(55);
            col.getColumn(2).setPreferredWidth(55);
            col.getColumn(3).setPreferredWidth(55);
            col.getColumn(4).setPreferredWidth(55);
            col.getColumn(5).setPreferredWidth(55);
            col.getColumn(6).setPreferredWidth(55);
            col.getColumn(7).setPreferredWidth(55);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnequis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables

    private void boton() {
        ImageIcon ImagenEquis = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\cierre.png");
        Icon iconoEquis = new ImageIcon(ImagenEquis.getImage().getScaledInstance(btnequis.getWidth(), btnequis.getHeight(), Image.SCALE_DEFAULT));
        btnequis.setIcon(iconoEquis);
        btnequis.setBorder(null);
        btnequis.setContentAreaFilled(false);

        ImageIcon ImagenFondo = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\iphone-160307_1280.png");
        Icon iconoFondo = new ImageIcon(ImagenFondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(iconoFondo);
        
        ImageIcon ImagenFondoCel = new ImageIcon("D:\\NetBeans\\proyecto_transparencia\\src\\vista\\imagenes\\fondo.jpg");
        Icon iconoFondoCel = new ImageIcon(ImagenFondoCel.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(iconoFondoCel);
    }

    public void JTable(JTable tabla, JScrollPane scroll) {
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        tabla.setOpaque(false);
        tabla.setShowGrid(false);
    }
}
