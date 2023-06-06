import InterfazAD.VentanaAnimalD;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;


public class ControladorAD extends MouseAdapter {
    private VentanaAnimalD view;
    private ModeloTablaAD modelo;

    public ControladorAD(VentanaAnimalD view) {
        this.view = view;
        modelo = new ModeloTablaAD();
        this.view.getTblAnimalesDomesticos().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblAnimalesDomesticos().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {
            modelo.cargarDatos();
            this.view.getTblAnimalesDomesticos().setModel(modelo);
            this.view.getTblAnimalesDomesticos().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()) {
            animalesDomesticos animal = new animalesDomesticos();
            animal.setId(0);
            animal.setNombre(this.view.getTxtNombre().getText());
            animal.setLugar(this.view.getTxtLugar().getText());
            animal.setClaseTaxonomica(this.view.getTxtClaseTaxonomica().getText());
            animal.setTipoAlimentacion(this.view.getTxtTipoAlimento().getText());
            animal.setURL(this.view.getTxtURL().getText());
            if (modelo.agregarAnimalD(animal)) {
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblAnimalesDomesticos().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos.Revise su conexion",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }

        if (e.getSource() == view.getTblAnimalesDomesticos()) {
            int index = this.view.getTblAnimalesDomesticos().getSelectedRow();
            animalesDomesticos tmp = modelo.getAnimalDAtIndex(index);
            try {
                this.view.getImagen().setIcon(tmp.getImagen());
            } catch (MalformedURLException mfue) {
                System.out.println(e.toString());
            }
        }
        if (e.getSource() == this.view.getBtnActualizar()) {
            animalesDomesticos animal = new animalesDomesticos();
            if(this.view.getTxtIdAct() != null){
                animal.setId(Integer.parseInt(this.view.getTxtIdAct().getText()));
            }
            if(this.view.getTxtNombreAct() != null){
                animal.setNombre(this.view.getTxtNombreAct().getText());
            }
            if(this.view.getTxtLugarAct() != null){
                animal.setLugar(this.view.getTxtLugarAct().getText());
            }
            if(this.view.getTxtClaseTaxonomicaAct() != null) {
                animal.setClaseTaxonomica(this.view.getTxtClaseTaxonomicaAct().getText());
            }
            if(this.view.getTxtTipoAlimentoAct() != null) {
                animal.setTipoAlimentacion(this.view.getTxtTipoAlimentoAct().getText());
            }
            if(this.view.getTxtURLAct() != null) {
                animal.setURL(this.view.getTxtURLAct().getText());
            }
            if (modelo.agregarAnimalD(animal)) {
                JOptionPane.showMessageDialog(view, "Se actualizo correctamente", "aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblAnimalesDomesticos().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo actualizar.Revise su conexion",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }

        if (e.getSource() == this.view.getBtnEliminar()) {
            AnimalesDAO animalD = new AnimalesDAO();
            int respuesta = JOptionPane.showConfirmDialog(view, "¿Deseas borrar esta informacion?", "Confirmacion", JOptionPane.YES_NO_OPTION);

            if(respuesta == JOptionPane.YES_NO_OPTION){
                animalD.delete(this.view.getTxtIdElim());
            }
            if (animalD.delete(Integer.parseInt(this.view.getTxtIdElim()))) {
                JOptionPane.showMessageDialog(view, "Se actualizo correctamente", "aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblAnimalesDomesticos().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo actualizar.Revise su conexion",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
