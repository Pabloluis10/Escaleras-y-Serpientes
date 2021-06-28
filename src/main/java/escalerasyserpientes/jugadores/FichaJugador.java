package escalerasyserpientes.jugadores;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author pabloluis
 */
public class FichaJugador extends JLabel implements Serializable {
    
    private int id;
    private int posActual;
    private boolean pierdeTurno;
    
    public FichaJugador(int id){
        this.id = id;
        this.pierdeTurno = false;
        this.posActual = 0;
        //metodos jLabel
        this.setVisible(true);
        this.setOpaque(true);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setForeground(Color.CYAN);
        this.setSize(60,60);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(0, 0, 30, 30);//diseño ficha
        g.setColor(Color.DARK_GRAY);
        g.drawString(String.valueOf(id), 10, 18);//id como texto de la ficha
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public boolean getPierdeTurno() {
        return pierdeTurno;
    }

    public void setTurno(boolean estado) {
        this.pierdeTurno = estado;
    }

    public int getId() {
        return id;
    }
}
