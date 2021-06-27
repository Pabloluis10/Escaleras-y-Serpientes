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
public class Retrocede extends Celda {
    
    private int cantRetrocede;
    
    public Retrocede(int canRetrocede){
        this.cantRetrocede = cantRetrocede;
        celda = new JLabel();
        tipo = "Retrocede";
    }

    @Override
    public void diseñar() {
        celda.setSize(60, 60);
        celda.setVisible(true);
        celda.setOpaque(true);
        celda.setHorizontalAlignment(SwingConstants.CENTER);
        celda.setVerticalAlignment(SwingConstants.CENTER);
        celda.setBackground(Color.GREEN);
        celda.setForeground(Color.BLACK);
        celda.setBorder(BorderFactory.createLineBorder(Color.yellow));
        celda.setText("<html><body>RETROCEDE<br>"+cantRetrocede+" CASILLAS</body></html>");
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
        return cantRetrocede;
    }
}
