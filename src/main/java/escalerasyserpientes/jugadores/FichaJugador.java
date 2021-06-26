package escalerasyserpientes.jugadores;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author pabloluis
 */
public class FichaJugador extends JLabel{
    
    private int id;
    private boolean turno;
    
    public FichaJugador(int id){
        this.id = id;
        this.turno = false;
        //metodos jLabel
        this.setVisible(true);
        this.setOpaque(true);
        this.setForeground(Color.CYAN);
        this.setSize(30,30);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(0, 0, 30, 30);
        g.setColor(Color.DARK_GRAY);
        g.drawString(String.valueOf(id), 10, 18);
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getId() {
        return id;
    }
}
