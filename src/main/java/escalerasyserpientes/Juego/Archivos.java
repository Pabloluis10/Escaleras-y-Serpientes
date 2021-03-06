package escalerasyserpientes.Juego;

import escalerasyserpientes.ManejoDeArchivos.ManejoArchivos;
import escalerasyserpientes.tablero.*;

/**
 *
 * @author pabloluis
 */
public class Archivos extends javax.swing.JFrame {
    //atributos
    private Tablero tablero;
    private ManejoArchivos archivos;
    
    public Archivos(Tablero tablero) {
        this.tablero = tablero;
        this.archivos = new ManejoArchivos();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        tituloLecturaDeArchivo = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jTextFieldUbicacion = new javax.swing.JTextField();
        jButtonLeerArchivo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        titulo.setBackground(new java.awt.Color(243, 122, 8));
        titulo.setFont(new java.awt.Font("TlwgMono", 3, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(14, 14, 7));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ARCHIVOS");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo.setOpaque(true);

        tituloLecturaDeArchivo.setBackground(new java.awt.Color(1, 1, 1));
        tituloLecturaDeArchivo.setForeground(new java.awt.Color(254, 254, 254));
        tituloLecturaDeArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLecturaDeArchivo.setText("Lectura de archivo tablero");
        tituloLecturaDeArchivo.setOpaque(true);

        jLabelUbicacion.setText("Ingrese la ubicación del archivo a leer:");

        jTextFieldUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUbicacionActionPerformed(evt);
            }
        });

        jButtonLeerArchivo.setText("LEER");
        jButtonLeerArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeerArchivoActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir a menú");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(tituloLecturaDeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButtonLeerArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tituloLecturaDeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButtonLeerArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUbicacionActionPerformed

    private void jButtonLeerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeerArchivoActionPerformed
        String pathname = jTextFieldUbicacion.getText();
        archivos.leerArchivo(tablero, pathname);
        jTextFieldUbicacion.setText("");
    }//GEN-LAST:event_jButtonLeerArchivoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLeerArchivo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JTextField jTextFieldUbicacion;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloLecturaDeArchivo;
    // End of variables declaration//GEN-END:variables
}
