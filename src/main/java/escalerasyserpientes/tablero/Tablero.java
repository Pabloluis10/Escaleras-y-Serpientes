package escalerasyserpientes.tablero;

import javax.swing.JLabel;

/**
 *
 * @author pabloluis
 */
public class Tablero {
   
    //Atributos
    private final Celda[][] tablero;
    private final JLabel [][] diseñoTablero;
    private final int filas;
    private final int columnas;

    public Tablero(int filas, int columnas) {
        this.tablero = new Celda[filas][columnas];
        this.diseñoTablero = new JLabel[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
    }
    
    public void diseñarTablero(){
        int numCelda=0;
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                numCelda++;
                if(tablero[i][j] != null){//asignamos un número de columna
                   tablero[i][j].setNumCelda(numCelda);
                   tablero[i][j].diseñar();
                } else if(i==0 && j==0){
                    tablero[i][j] = new Normal(numCelda);
                    tablero[i][j].diseñar();
                } else if(i==filas-1 && j==columnas-1){
                    tablero[i][j] = new Normal(numCelda, "Fin");
                } else {
                    tablero[i][j] = new Normal(numCelda);
                    tablero[i][j].diseñar();
                }
                //tablero de jlabels
                diseñoTablero[i][j] = tablero[i][j].getCelda();
            }
        }
    }

    public Celda[][] getTablero() {
        return tablero;
    }

    public JLabel[][] getDiseñoTablero() {
        return diseñoTablero;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }    
}
