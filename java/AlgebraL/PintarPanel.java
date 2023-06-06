package AlgebraL;

import java.awt.Color;
import java.awt.FlowLayout;
import static java.awt.Frame.E_RESIZE_CURSOR;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PintarPanel extends JFrame {
/*
    private JLabel lblMatriz;
    private JLabel lblModi;
    private JTextField txtEmisor;
    private JTextField txtNuevaMatriz;
    private JTextField txtReceptor;
    private JButton botonCambio;
    private JButton botonMostrarM;
    private JButton boton;
    private Matrices met = new Matrices();
    private PintarPanel h;

    public PintarPanel(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 230);
        setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(211, 237, 248));
        lblMatriz = new JLabel("La matriz actual es la siguiente:");
        this.getContentPane().add(lblMatriz);
        txtEmisor = new JTextField(25);
        this.getContentPane().add(txtEmisor);
        txtEmisor.setText(Arrays.toString(met.getMatriz()));
        botonMostrarM = new JButton("Mostar la inversa");
        this.getContentPane().add(botonMostrarM);
        lblModi = new JLabel("Escribe la nueva matriz cuadrada: [1, 2, 4, 6]");
        this.getContentPane().add(lblModi);
        txtNuevaMatriz = new JTextField(25);
        this.getContentPane().add(txtNuevaMatriz);
        txtReceptor = new JTextField(25);
        txtReceptor.setText("Aqui aparecera si tu matriz se puede cargar...");
        this.getContentPane().add(txtReceptor);
        botonCambio = new JButton("Cambiar");
        this.getContentPane().add(botonCambio);

        botonMostrarM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtEmisor.setText(Arrays.toString(met.matrizInversa()));
            }
        });

        botonCambio.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                boolean dig = true;
                String[] digitos = txtNuevaMatriz.getText().split(",");
                double[] numeros = new double[digitos.length];
                for (int j = 0; j < txtNuevaMatriz.getText().length(); j++) {
                    for (int k = 0; k < digitos.length; k++) {
                        if (digitos.equals("a") || digitos.equals("b") || digitos.equals("c") || digitos.equals("d") || digitos.equals("e") || digitos.equals("f") || digitos.equals("g") || digitos.equals("h") || digitos.equals("i") || digitos.equals("j") || digitos.equals("k") || digitos.equals("l") || digitos.equals("m") || digitos.equals("n") || digitos.equals("ñ") || digitos.equals("o") || digitos.equals("p") || digitos.equals("q") || digitos.equals("r") || digitos.equals("s") || digitos.equals("t") || digitos.equals("u") || digitos.equals("v") || digitos.equals("x") || digitos.equals("y") || digitos.equals("z")) {
                            dig = false;
                            break;
                        } else {
                            numeros[k] = Double.parseDouble(digitos[k]);
                        }
                    }
                    if (dig == true) {
                        if (numeros[j] >= 0 && numeros[j] <= 1000) {
                            int nones = 0;
                            for (int i = 1; i <= 1000; i += nones) {
                                if (numeros.length == i) {
                                    double determinante = Matrices.calcularDeterminante(Matrices.ConvertMatriz(numeros));
                                    if (determinante != 0) {
                                        met.setMatriz(numeros);
                                        txtEmisor.setText(Arrays.toString(met.getMatriz()));
                                        txtReceptor.setText("LA MATRIZ SE CARGO CON EXITO!!");
                                        lblMatriz.setText("La nueva matriz es:");
                                        break;
                                    } else {
                                        txtReceptor.setText("EL DETERMINANTE ES 0");
                                        break;
                                    }
                                } else {
                                    if (i >= numeros.length) {
                                        txtReceptor.setText("LA MATRIZ NO ES CUADRADA!!");
                                        break;
                                    }
                                }
                                if (i == 1) {
                                    nones = 3;
                                } else {
                                    nones += 2;
                                }
                            }
                            break;
                        }
                    } else {
                        txtReceptor.setText("SOLO DEBE ESCRIBIR NUMEROS");
                    }
                    break;
                }
            }
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(E_RESIZE_CURSOR);
    }

    public static Object PanelChico(String title) {
        return new PintarPanel(title);
    }

    public static void main(String[] args) {
        PintarPanel.PanelChico("Hola Nuevo");
    }



 */
}
