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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setBackground(new java.awt.Color(243, 122, 8));
        titulo.setFont(new java.awt.Font("TlwgMono", 3, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(14, 14, 7));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ARCHIVOS");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo.setOpaque(true);

        tituloLecturaDeArchivo.setBackground(new java.awt.Color(1, 1, 1));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(tituloLecturaDeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jButtonLeerArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tituloLecturaDeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButtonLeerArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUbicacionActionPerformed

    private void jButtonLeerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeerArchivoActionPerformed
        
    }//GEN-LAST:event_jButtonLeerArchivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLeerArchivo;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JTextField jTextFieldUbicacion;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloLecturaDeArchivo;
    // End of variables declaration//GEN-END:variables
}
