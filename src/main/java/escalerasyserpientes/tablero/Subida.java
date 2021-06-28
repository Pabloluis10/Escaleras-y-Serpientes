package escalerasyserpientes.tablero;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author pabloluis
 */
public class Subida extends Celda {
    
    private final int filaFinal;
    private final int columnaFinal;
    private int numCeldaSube;

    public Subida(int filaFinal, int columnaFinal) {
        this.celda = new JLabel();
        this.filaFinal = filaFinal;
        this.columnaFinal = columnaFinal;
        this.tipo = "Subida";
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
        celda.setText("<html><body>SUBE A<br>CASILLAS "+numCeldaSube+"</body></html>");
    }    
    
    public int getNumCeldaSube() {
        return numCeldaSube;
    }

    public void setNumCeldaSube(int numCeldaSube) {
        this.numCeldaSube = numCeldaSube;
    }

    public int getFilaFinal() {
        return filaFinal;
    }

    public int getColumnaFinal() {
        return columnaFinal;
    }    
}
