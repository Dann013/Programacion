import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaAD implements TableModel {
    private ArrayList<animalesDomesticos> datos;
    public static final int columnas=6;
    private AnimalesDAO animalD;
    private AnimalesDAO adao;

    public ModeloTablaAD() {
        animalD = new AnimalesDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaAD(ArrayList<animalesDomesticos> datos) {
        this.datos = datos;
        animalD = new AnimalesDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Lugar";
            case 3:
                return "claseTaxonomiica";
            case 4:
                return "TipoAlimento";
            case 5:
                return "URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        animalesDomesticos tmp =datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getLugar();
            case 3:
                return tmp.getClaseTaxonomica();
            case 4:
                return tmp.getTipoAlimentacion();
            case 5:
                return tmp.getURL();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
            break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setLugar((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setClaseTaxonomica((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setTipoAlimentacion((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setURL((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            ArrayList<animalesDomesticos> tirar =animalD.Obtenertodo();
            System.out.println(tirar);
            datos =animalD.Obtenertodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public boolean agregarAnimalD(animalesDomesticos animal ){
        boolean resultado =false;
        try {
            if(animalD.insertar(animal)){
                datos.add(animal);
                resultado =true;
            }else{
                resultado= false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
//esteee
    public animalesDomesticos getAnimalDAtIndex(int index){
        return datos.get(index);
    }
/*
     public boolean EliminarAnimalD(animalesDomesticos animal ){
        boolean resultado =false;
        try {
            if(animal.delete(get)){
                resultado =true;
            }else{
                resultado= false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

 */

    }


