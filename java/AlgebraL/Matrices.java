package AlgebraL;
import java.util.Arrays;

public class Matrices {
/*
    private double[] matriz = {0, 0, 2, 5, 2, 0, 1, 0, 0, 3, 0, 2, 5, 0, 2, -1};
    private String codigo = "hola mundo";
    private String codigoEncriptado;

    public Matrices() {
    }

    public Matrices(double[] matriz) {
        this.matriz = matriz;
    }

    public double[] getMatriz() {
        return matriz;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCodigoEncriptado() {
        return codigoEncriptado;
    }

    public void setMatriz(double[] matriz) {
        this.matriz = matriz;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCodigoEncriptado(String codigoEncriptado) {
        this.codigoEncriptado = codigoEncriptado;
    }

    public double[] convertANum() {
        char[] digitos = this.getCodigo().toCharArray();
        double[] numeros = new double[digitos.length];
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] ==' ') {
                numeros[i] = 0;
            }
            if (digitos[i] =='a') {
                numeros[i] = 1;
            }
            if (digitos[i] == 'b') {
                numeros[i] = 2;
            }
            if (digitos[i] == 'c') {
                numeros[i] = 3;
            }
            if (digitos[i] == 'd') {
                numeros[i] = 4;
            }
            if (digitos[i] == 'e') {
                numeros[i] = 5;
            }
            if (digitos[i] == 'f') {
                numeros[i] = 6;
            }
            if (digitos[i] == 'g') {
                numeros[i] = 7;
            }
            if (digitos[i] == 'h') {
                numeros[i] = 8;
            }
            if (digitos[i] == 'i') {
                numeros[i] = 9;
            }
            if (digitos[i] == 'j') {
                numeros[i] = 10;
            }
            if (digitos[i] == 'k') {
                numeros[i] = 11;
            }
            if (digitos[i] == 'l') {
                numeros[i] = 12;
            }
            if (digitos[i] == 'm') {
                numeros[i] = 13;
            }
            if (digitos[i] == 'n') {
                numeros[i] = 14;
            }
            if (digitos[i] == 'ñ'){
                numeros[i] = 15;
            }
            if (digitos[i] == 'o') {
                numeros[i] = 16;
            }
            if (digitos[i] == 'p') {
                numeros[i] = 17;
            }
            if (digitos[i] == 'q') {
                numeros[i] = 18;
            }
            if (digitos[i] == 'r') {
                numeros[i] = 19;
            }
            if (digitos[i] == 's') {
                numeros[i] = 20;
            }
            if (digitos[i] == 't') {
                numeros[i] = 21;
            }
            if (digitos[i] == 'u') {
                numeros[i] = 22;
            }
            if (digitos[i] == 'v') {
                numeros[i] = 23;
            }
            if (digitos[i] == 'w') {
                numeros[i] = 24;
            }
            if (digitos[i] == 'x') {
                numeros[i] = 25;
            }
            if (digitos[i] == 'y') {
                numeros[i] = 26;
            }
            if (digitos[i] == 'z') {
                numeros[i] = 27;
            }
            if (digitos[i] == '.') {
                numeros[i] = 28;
            }
            if (digitos[i] == ',') {
                numeros[i] = 29;
            }
            if (digitos[i] == '1') {
                numeros[i] = 30;
            }
            if (digitos[i] == '2') {
                numeros[i] = 31;
            }
            if (digitos[i] == '3') {
                numeros[i] = 32;
            }
            if (digitos[i] == '4') {
                numeros[i] = 33;
            }
            if (digitos[i] == '5') {
                numeros[i] = 34;
            }
            if (digitos[i] == '6') {
                numeros[i] = 35;
            }
            if (digitos[i] == '7') {
                numeros[i] = 36;
            }
            if (digitos[i] == '8') {
                numeros[i] = 37;
            }
            if (digitos[i] == '9') {
                numeros[i] = 38;
            }
            if (digitos[i] == '0') {
                numeros[i] = 39;
            }
        }
        return numeros;
    }

    public String convertALetras() {
        return null;
    }

    public double[] prepararMatrizDeEncriptacion() {
        double[][] matrice = Matrices.ConvertMatriz(this.getMatriz());
        int filas = (int) (Math.sqrt(this.getMatriz().length));
        int tamaño = (int) Math.ceil(this.convertANum().length / filas) + 1;
        double[] digitos = this.convertANum();
        double[] albacea = new double[filas * tamaño];
        int contador = 0;
        for (int l = 0; l < tamaño; l++) {
            for (int k = 0; k < albacea.length; k++) {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < filas; j++) {
                        if (j == 0) {
                            albacea[k] = (matrice[j][i] * digitos[contador]);
                        } else {
                            albacea[k] += (matrice[j][i] * digitos[contador]);
                        }
                    }
                }
                if (contador > albacea.length - tamaño) {
                }
                contador++;
            }
        }
        return albacea;
    }

    public double[] desencriptar() {
        this.matrizInversa();

        return null;
    }

    public double[] matrizInversa() {
        double determinante = Matrices.calcularDeterminante(Matrices.ConvertMatriz(this.getMatriz()));
        double[] adjunta = Matrices.procesarMatrizAdjunta(this.getMatriz());

        for (int i = 0; i < adjunta.length; i++) {
            adjunta[i] = (adjunta[i] / determinante);
        }
        return adjunta;
    }

    public static double[][] ConvertMatriz(double[] matriz) {
        int filas = (int) Math.sqrt(matriz.length);
        double[][] arreglo = new double[filas][filas];
        int suma = 0;
        // asigna a cada espacio de la matriz cuadrada un numero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                arreglo[i][j] = matriz[suma];
                suma++;
            }
        }
        return arreglo;
    }

    public static double calcularDeterminante(double[][] matriz) {
        int n = matriz.length;

        if (n == 1) {
            return matriz[0][0];
        }

        double determinante = 0;
        int signo = 1;

        for (int i = 0; i < n; i++) {
            double[][] submatriz = generarSubmatriz(matriz, i, 0);
            determinante += signo * matriz[i][0] * calcularDeterminante(submatriz);
            signo *= -1;
        }

        return determinante;
    }

    public static double[][] generarSubmatriz(double[][] matriz, double filaExcluida, double columnaExcluida) {
        int n = matriz.length;
        double[][] submatriz = new double[n - 1][n - 1];

        int filaSubmatriz = 0;
        int columnaSubmatriz = 0;

        for (int i = 0; i < n; i++) {
            if (i != filaExcluida) {
                for (int j = 0; j < n; j++) {
                    if (j != columnaExcluida) {
                        submatriz[filaSubmatriz][columnaSubmatriz] = matriz[i][j];
                        columnaSubmatriz++;
                    }
                }
                filaSubmatriz++;
                columnaSubmatriz = 0;
            }
        }

        return submatriz;
    }

    public static double[] procesarMatrizAdjunta(double[] matrizA) {
        int filas = (int) Math.sqrt(matrizA.length);
        double[][] matriz = new double[filas][filas];
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                matriz[i][j] = matrizA[suma];
                suma++;
            }
        }
        suma = 0;
        double[][] adjunta = calcularMatrizAdjunta(matriz);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                matrizA[suma] = adjunta[i][j];
                suma++;
            }
        }
        return matrizA;
    }

    public static double[][] calcularMatrizAdjunta(double[][] matriz) {
        int n = matriz.length;
        double[][] adjunta = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double[][] submatriz = obtenerSubmatriz(matriz, i, j);
                int signo = (int) Math.pow(-1, i + j);
                double determinante = obtenerDeterminante(submatriz);
                adjunta[j][i] = signo * determinante;
            }
        }

        return adjunta;
    }

    public static double[][] obtenerSubmatriz(double[][] matriz, double filaExcluida, double columnaExcluida) {
        int n = matriz.length;
        double[][] submatriz = new double[n - 1][n - 1];

        int filaDestino = 0;
        int columnaDestino = 0;

        for (int i = 0; i < n; i++) {
            if (i != filaExcluida) {
                for (int j = 0; j < n; j++) {
                    if (j != columnaExcluida) {
                        submatriz[filaDestino][columnaDestino] = matriz[i][j];
                        columnaDestino++;
                    }
                }
                filaDestino++;
                columnaDestino = 0;
            }
        }

        return submatriz;
    }

    public static double obtenerDeterminante(double[][] matriz) {
        int n = matriz.length;

        if (n == 1) {
            return matriz[0][0];
        }

        if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        double determinante = 0;

        for (int j = 0; j < n; j++) {
            double[][] submatriz = obtenerSubmatriz(matriz, 0, j);
            int signo = (int) Math.pow(-1, j);
            determinante += signo * matriz[0][j] * obtenerDeterminante(submatriz);
        }

        return determinante;
    }

    public static void main(String[] args) {
        Matrices matriz = new Matrices();
        System.out.println();
        matriz.matrizInversa();
    }

 */
}
