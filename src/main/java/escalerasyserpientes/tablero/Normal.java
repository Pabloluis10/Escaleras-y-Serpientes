package escalerasyserpientes.tablero;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author pabloluis
 */
public class Normal extends Celda {
    //constructores
    public Normal(int numCelda) {
        this.numCelda = numCelda;
        celda = new JLabel();
        tipo = "Normal";
    }
    
    public Normal(int numCelda, String tipo){
        this.numCelda = numCelda;
        celda = new JLabel();
        this.tipo = tipo;
        this.diseñarFinal();
    }

    //metodos
    @Override
    public void diseñar() {
        celda.setSize(60, 60);
        celda.setVisible(true);
        celda.setOpaque(true);
        celda.setForeground(Color.WHITE);
        celda.setHorizontalAlignment(SwingConstants.CENTER);//texto centrado
        celda.setVerticalAlignment(SwingConstants.CENTER);
        celda.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        if (numCelda == 1) {    
            celda.setBackground(Color.ORANGE);
            celda.setText("Inicio "+numCelda);//establecemos el número de celda como texto
        } else {
            celda.setBackground(Color.BLACK);
            celda.setText(String.valueOf(numCelda));//establecemos el número de celda como texto
        }
    }
    
    public void diseñarFinal(){
        celda.setSize(60, 60);
        celda.setVisible(true);
        celda.setOpaque(true);
        celda.setHorizontalAlignment(SwingConstants.CENTER);
        celda.setVerticalAlignment(SwingConstants.CENTER);
        celda.setForeground(Color.BLUE);
        celda.setBackground(Color.DARK_GRAY);
        celda.setBorder(BorderFactory.createLineBorder(Color.yellow));
        celda.setText("Fin!!!");
    }
}
