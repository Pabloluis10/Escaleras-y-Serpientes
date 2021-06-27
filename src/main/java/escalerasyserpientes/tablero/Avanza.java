/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes.tablero;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author pabloluis
 */
public class Avanza implements Celda {
    
    private JLabel celda;
    private int numCelda;
    private String tipo;
    private int cantAvanza;
    
    public Avanza(int canAvanza){
        this.cantAvanza = cantAvanza;
        celda = new JLabel();
        tipo = "Avanza";
    }

    @Override
    public void diseñar() {
        celda.setSize(60, 60);
        celda.setVisible(true);
        celda.setOpaque(true);
        celda.setHorizontalAlignment(SwingConstants.CENTER);
        celda.setVerticalAlignment(SwingConstants.CENTER);
        celda.setBackground(Color.CYAN);
        celda.setForeground(Color.BLACK);
        celda.setText("AVANZA");
    }

    public int getNumCelda() {
        return numCelda;
    }

    public void setNumCelda(int numCelda) {
        this.numCelda = numCelda;
    }

    public JLabel getCelda() {
        return celda;
    }

    public String getTipo() {
        return tipo;
    }    
    
    public int getCantAvanza() {
        return cantAvanza;
    }
}

