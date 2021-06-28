/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes.tablero;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author pabloluis
 */
public class Bajada extends Celda {
    
    private final int filaFinal;
    private final int columnaFinal;
    private int numCeldaBaja;

    public Bajada(int filaFinal, int columnaFinal) {
        this.celda = new JLabel();
        this.filaFinal = filaFinal;
        this.columnaFinal = columnaFinal;
        this.tipo = "Bajada";
    }

     @Override
    public void diseñar() {
        celda.setSize(60, 60);
        celda.setVisible(true);
        celda.setOpaque(true);
        celda.setHorizontalAlignment(SwingConstants.CENTER);
        celda.setVerticalAlignment(SwingConstants.CENTER);
        celda.setBackground(Color.WHITE);
        celda.setForeground(Color.BLUE);
        celda.setBorder(BorderFactory.createLineBorder(Color.yellow));
        celda.setText("<html><body>BAJA A<br>CASILLAS "+numCeldaBaja+"</body></html>");
    }    
    
    public int getNumCeldaBaja() {
        return numCeldaBaja;
    }

    public void setNumCeldaBaja(int numCeldaBaja) {
        this.numCeldaBaja = numCeldaBaja;
    }

    public int getFilaFinal() {
        return filaFinal;
    }

    public int getColumnaFinal() {
        return columnaFinal;
    }
    
}
