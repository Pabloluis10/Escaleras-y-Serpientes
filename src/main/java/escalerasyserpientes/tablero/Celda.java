package escalerasyserpientes.tablero;

import javax.swing.JLabel;

/**
 *
 * @author pabloluis
 */
public abstract class Celda {
    
    protected JLabel celda;
    protected int numCelda;
    protected String tipo;
    
    public abstract void diseñar();
    
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
}
