package escalerasyserpientes.tablero;

import javax.swing.JLabel;

/**
 *
 * @author pabloluis
 */
public class Tablero {
   
    //Atributos
    private Celda[][] tablero;
    private JLabel[][] diseñoTablero ;
    private int filas ;
    private int columnas ;

    public Tablero() {
        
    }
    
    public void iniciarAtributos(int filas, int columnas) {
        this.tablero = new Celda[filas][columnas];
        this.diseñoTablero = new JLabel[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
    }
    
    
    public void diseñarTablero(){
        int numCelda=0;
        int finFila = filas - 1;
        int finColumna = columnas - 1;
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                numCelda++;
                if(tablero[i][j] != null){//asignamos un número de columna
                   tablero[i][j].setNumCelda(numCelda);
                } else if(i==0 && j==0){
                    tablero[i][j] = new Normal(numCelda);
                    tablero[i][j].diseñar();
                } else if(i==finFila && j==finColumna){
                    tablero[i][j] = new Normal(numCelda, "Fin");
                    Normal aux = (Normal)tablero[i][j];
                    aux.diseñarFinal();
                } else {
                    tablero[i][j] = new Normal(numCelda);
                    tablero[i][j].diseñar();
                }
            }
        }
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                if(tablero[i][j] instanceof Subida) {
                    Subida aux = (Subida)tablero[i][j];
                    int filaFinal = aux.getFilaFinal();
                    int columnaFinal =aux.getColumnaFinal();
                    aux.setNumCeldaSube(tablero[filaFinal][columnaFinal].getNumCelda());
                    aux.diseñar();
                } else if(tablero[i][j] instanceof Bajada) {
                    Bajada aux = (Bajada)tablero[i][j];
                    int filaFinal = aux.getFilaFinal();
                    int columnaFinal =aux.getColumnaFinal();
                    aux.setNumCeldaBaja(tablero[filaFinal][columnaFinal].getNumCelda());
                    aux.diseñar();
                } else {
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
    
    public void establecerCelda(int fila, int columna, Celda aux){
        tablero[fila][columna] = aux;
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
