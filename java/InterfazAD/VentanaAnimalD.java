package InterfazAD;

import javax.swing.*;
import java.awt.*;

public class VentanaAnimalD extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblLugar;
    private JLabel lblClaseTaxonomica;
    private JLabel lblTipoAlimento;
    private JLabel lblURL;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtLugar;
    private JTextField txtClaseTaxonomica;
    private JTextField txtTipoAlimento;
    private JTextField txtURL;
    private JLabel lblIdAct;
    private JLabel lblNombreAct;
    private JLabel lblLugarAct;
    private JLabel lblClaseTaxonomicaAct;
    private JLabel lblTipoAlimentoAct;
    private JLabel lblURLAct;
    private JTextField txtIdAct;
    private JTextField txtNombreAct;
    private JTextField txtLugarAct;
    private JTextField txtClaseTaxonomicaAct;
    private JTextField txtTipoAlimentoAct;
    private JTextField txtURLAct;
    private JTextField txtIdElim;
    private JLabel msjActualizar;
    private JLabel msjEliminar;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnK;
    private JTable tblAnimalesDomesticos;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1; //Formulario para datos
    private JPanel panel2; //Tabla
    private JPanel panel3; //imagen deacurdo a la tabla
    private JPanel panel4; //eliminar y actualizacion
    private JLabel imagen;

    public VentanaAnimalD(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);
        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(224, 169, 169));
        lblId = new JLabel("Id: ");
        lblNombre = new JLabel("Nombre del animal domestico: ");
        lblLugar = new JLabel("Donde vive: ");
        lblClaseTaxonomica = new JLabel("Clase Taxonomica");
        lblTipoAlimento = new JLabel("Alimento: ");
        lblURL = new JLabel("URL: ");
        txtId = new JTextField(4);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(7);
        txtLugar = new JTextField(7);
        txtClaseTaxonomica = new JTextField(7);
        txtTipoAlimento = new JTextField(9);
        txtURL = new JTextField(15);
        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblLugar);
        panel1.add(txtLugar);
        panel1.add(lblClaseTaxonomica);
        panel1.add(txtClaseTaxonomica);
        panel1.add(lblTipoAlimento);
        panel1.add(txtTipoAlimento);
        panel1.add(lblURL);
        panel1.add(txtURL);
        panel1.add(btnAgregar);


        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(45, 119, 87, 123));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblAnimalesDomesticos = new JTable();
        scrollPane = new JScrollPane(tblAnimalesDomesticos);
        panel2.add(scrollPane);


        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(175, 35, 123));
        imagen = new JLabel("....");
        panel3.add(imagen);


        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(118, 88, 169));
        msjActualizar = new JLabel("Ingrese el id del campo que quiera actualizar: ");
        panel4.add(msjActualizar);
        lblIdAct = new JLabel("Id: ");
        lblNombreAct = new JLabel("Nombre del animal domestico: ");
        lblLugarAct = new JLabel("Donde vive: ");
        lblClaseTaxonomicaAct = new JLabel("Clase Taxonomica");
        lblTipoAlimentoAct = new JLabel("Alimento: ");
        lblURLAct = new JLabel("URL: ");
        txtIdAct = new JTextField(4);
        txtNombreAct = new JTextField(7);
        txtLugarAct = new JTextField(7);
        txtClaseTaxonomicaAct = new JTextField(7);
        txtTipoAlimentoAct = new JTextField(9);
        txtURLAct = new JTextField(15);

        panel4.add(lblIdAct);
        panel4.add(txtIdAct);
        panel4.add(lblNombreAct);
        panel4.add(txtNombreAct);
        panel4.add(lblLugarAct);
        panel4.add(txtLugarAct);
        panel4.add(lblClaseTaxonomicaAct);
        panel4.add(txtClaseTaxonomicaAct);
        panel4.add(lblTipoAlimentoAct);
        panel4.add(txtTipoAlimentoAct);
        panel4.add(lblURLAct);
        panel4.add(txtURLAct);
        btnActualizar = new JButton("Actualizar los cambios");
        panel4.add(btnActualizar);
        msjEliminar = new JLabel("Ingrese el id del campo que quiera eliminar: ");
        panel4.add(msjEliminar);
        txtIdElim = new JTextField(4);
        panel4.add(txtIdElim);
        btnEliminar = new JButton("Eliminar");
        panel4.add(btnEliminar);


        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }
    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JTable getTblAnimalesDomesticos() {
        return tblAnimalesDomesticos;
    }


    public void setTblAnimalesDomesticos(JTable tblAnimalesDomesticos) {
        this.tblAnimalesDomesticos = tblAnimalesDomesticos;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtLugar() {
        return txtLugar;
    }

    public void setTxtLugar(JTextField txtLugar) {
        this.txtLugar = txtLugar;
    }

    public JTextField getTxtClaseTaxonomica() {
        return txtClaseTaxonomica;
    }

    public void setTxtClaseTaxonomica(JTextField txtClaseTaxonomica) {
        this.txtClaseTaxonomica = txtClaseTaxonomica;
    }

    public JTextField getTxtTipoAlimento() {
        return txtTipoAlimento;
    }

    public void setTxtTipoAlimento(JTextField txtTipoAlimento) {
        this.txtTipoAlimento = txtTipoAlimento;
    }

    public JTextField getTxtURL() {
        return txtURL;
    }

    public void setTxtURL(JTextField txtURL) {
        this.txtURL = txtURL;
    }

    public JLabel getLblURL() {
        return lblURL;
    }

    public void setLblURL(JLabel lblURL) {
        this.lblURL = lblURL;
    }

    public JButton getBtnK() {
        return btnK;
    }

    public void setBtnK(JButton btnK) {
        this.btnK = btnK;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }

    public JTextField getTxtIdAct() {
        return txtIdAct;
    }

    public JTextField getTxtNombreAct() {
        return txtNombreAct;
    }

    public JTextField getTxtLugarAct() {
        return txtLugarAct;
    }

    public void setTxtLugarAct(JTextField txtLugarAct) {
        this.txtLugarAct = txtLugarAct;
    }

    public void setTxtNombreAct(JTextField txtNombreAct) {
        this.txtNombreAct = txtNombreAct;
    }

    public void setTxtIdAct(JTextField txtIdAct) {
        this.txtIdAct = txtIdAct;
    }

    public JTextField getTxtClaseTaxonomicaAct() {
        return txtClaseTaxonomicaAct;
    }

    public void setTxtClaseTaxonomicaAct(JTextField txtClaseTaxonomicaAct) {
        this.txtClaseTaxonomicaAct = txtClaseTaxonomicaAct;
    }

    public JTextField getTxtTipoAlimentoAct() {
        return txtTipoAlimentoAct;
    }

    public void setTxtTipoAlimentoAct(JTextField txtTipoAlimentoAct) {
        this.txtTipoAlimentoAct = txtTipoAlimentoAct;
    }

    public JTextField getTxtURLAct() {
        return txtURLAct;
    }

    public void setTxtURLAct(JTextField txtURLAct) {
        this.txtURLAct = txtURLAct;
    }

    public JTextField getTxtIdElim() {
        return txtIdElim;
    }

    public void setTxtIdElim(JTextField txtIdElim) {
        this.txtIdElim = txtIdElim;
    }

    public void limpiar(){
        txtNombre.setText("");
        txtLugar.setText("");
        txtClaseTaxonomica.setText("");
        txtTipoAlimento.setText("");
        txtURL.setText("");
    }
}
