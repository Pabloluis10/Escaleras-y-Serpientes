package escalerasyserpientes.tablero;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author pabloluis
 */
public class Normal implements Celda {

    private JLabel celda;
    private int numCelda;
    private String tipo;
    
    public Normal() {
        celda = new JLabel();
        tipo = "Normal";
    }

    @Override
    public void diseñar() {
        celda.setSize(60, 60);
        celda.setVisible(true);
        celda.setOpaque(true);
        celda.setHorizontalAlignment(SwingConstants.CENTER);
        celda.setForeground(Color.WHITE);
        if (numCelda == 1) {    
            celda.setBackground(Color.ORANGE);
            celda.setText("Inicio\n "+String.valueOf(numCelda));//establecemos el número de celda como texto
            celda.setHorizontalAlignment(SwingConstants.CENTER);//texto centrado
            celda.setVerticalAlignment(SwingConstants.CENTER);
        } else {
            celda.setBackground(Color.BLACK);
            celda.setText("Inicio\n "+String.valueOf(numCelda));//establecemos el número de celda como texto
            celda.setHorizontalAlignment(SwingConstants.CENTER);//texto centrado
            celda.setVerticalAlignment(SwingConstants.CENTER);
        }
    }
    
    public void diseñarFina(){
        celda.setVisible(true);
        celda.setOpaque(true);
        celda.setForeground(Color.BLUE);
        celda.setBackground(Color.DARK_GRAY);
        celda.setText("Fin!!!");
    }

    public JLabel getCelda() {
        return celda;
    }

    public int getNumCelda() {
        return numCelda;
    }

    public String getTipo() {
        return tipo;
    }
}
