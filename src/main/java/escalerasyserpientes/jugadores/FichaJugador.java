package escalerasyserpientes.jugadores;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author pabloluis
 */
public class FichaJugador extends JLabel{
    
    private int id;
    private boolean pierdeTurno;
    
    public FichaJugador(int id){
        this.id = id;
        this.pierdeTurno = false;
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
