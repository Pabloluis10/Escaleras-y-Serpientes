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
public class Avanza extends Celda {
    
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
        celda.setBorder(BorderFactory.createLineBorder(Color.yellow));
        celda.setText("<html><body>AVANZA<br>"+cantAvanza+" CASILLAS</body></html>");
    }
}

