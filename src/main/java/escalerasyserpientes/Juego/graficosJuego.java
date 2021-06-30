package escalerasyserpientes.Juego;

import escalerasyserpientes.jugadores.*;
import escalerasyserpientes.tablero.*;
import javax.swing.JLabel;

/**
 *
 * @author pabloluis
 */
public class graficosJuego extends javax.swing.JFrame {
    private Juego partida;
    private Tablero tablero;
    private Jugador [] jugadores;
  
    public graficosJuego(Tablero tablero, Jugador [] jugadores) {
        this.tablero = tablero;
        this.jugadores = jugadores;
        this.partida = new Juego(tablero, jugadores);
        initComponents();
       
    }
    
    public void darForma(){
        jLayeredPane2.setLayout(new java.awt.GridLayout(tablero.getFilas(), tablero.getColumnas()));
        
        for(int i=0; i<tablero.getFilas(); i++){
            for(int j=0; j<tablero.getColumnas(); j++){
                JLabel aux = tablero.getDiseñoTablero()[i][j];
                jLayeredPane2.add(aux);
            }
        }
        
        //pintar fichas jugadores
        JLabel inicio = tablero.getDiseñoTablero()[0][0];
        int posX = inicio.getX();
        int posY = inicio.getY();
        for(int i=0; i<jugadores.length; i++){
            FichaJugador aux = jugadores[i].getFicha();
            jLayeredPane1.add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, aux.getWidth(), aux.getHeight()));
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dado = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 630));
        setSize(new java.awt.Dimension(900, 630));

        Dado.setText("Tirar Dado");
        Dado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadoActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(720, 550));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(720, 550));
        jLayeredPane2.setLayout(new java.awt.GridLayout());
        jLayeredPane1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadoActionPerformed
        
    }//GEN-LAST:event_DadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dado;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
