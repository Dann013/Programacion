package AlgebraL;

import java.awt.Color;
import java.awt.FlowLayout;
import static java.awt.Frame.E_RESIZE_CURSOR;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgramEncrip extends JFrame {
/*
    private JLabel lblEtiqueta1;
    private JTextField txtEmisor;
    private JTextField txtReceptor;
    private JLabel lblEtiqueta2;
    private JButton botonEncriptar;
    private JButton botonDesencriptar;
    private JButton botonIntroducirMatriz;
    private ProgramEncrip print;
    private ProgramEncrip print2;
    private int[] matriz;
    private Matrices met;
    private JLabel nuevo;

    public ProgramEncrip() throws HeadlessException {
        super("INDEX");
        this.setSize(300, 150);
        setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(211, 237, 248));
        lblEtiqueta1 = new JLabel("¿Que desea hacer?");
        this.getContentPane().add(lblEtiqueta1);
        botonEncriptar = new JButton("Encriptar");
        this.getContentPane().add(botonEncriptar);
        botonDesencriptar = new JButton("Desencriptar");
        this.getContentPane().add(botonDesencriptar);

        botonEncriptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                print = new ProgramEncrip("Encriptar");

            }
        });

        botonDesencriptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                print = new ProgramEncrip("Desencriptar");

            }
        });

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public ProgramEncrip(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 200);
        setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(199, 178, 203));
        lblEtiqueta1 = new JLabel("Escribe el codigo:");
        this.getContentPane().add(lblEtiqueta1);
        txtEmisor = new JTextField(25);
        this.getContentPane().add(txtEmisor);
        lblEtiqueta2 = new JLabel("Aqui se mostrara tu matriz encriptada:");
        this.getContentPane().add(lblEtiqueta2);
        txtReceptor = new JTextField(25);
        this.getContentPane().add(txtReceptor);
        botonEncriptar = new JButton("Encriptar");
        this.getContentPane().add(botonEncriptar);
        botonIntroducirMatriz = new JButton("Cambiar la matriz");
        this.getContentPane().add(botonIntroducirMatriz);
        nuevo = new JLabel("Hola");
        this.getContentPane().add(nuevo);
        botonEncriptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                met.setCodigo(txtEmisor.getText());
                nuevo.setText(Arrays.toString(met.convertANum()));

            }
        });

        botonIntroducirMatriz.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                PintarPanel.PanelChico("Matrices");
            }
        });

        this.setVisible(true);
        this.setDefaultCloseOperation(E_RESIZE_CURSOR);
    }

    public static void main(String args[]) {
        ProgramEncrip ventana = new ProgramEncrip();
    }


 */

}
