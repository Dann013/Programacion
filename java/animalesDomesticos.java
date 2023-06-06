import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

public class animalesDomesticos {
    private int id;
    private String nombre;
    private String lugar;
    private String claseTaxonomica;
    private String TipoAlimentacion;
    private String URL;

    public animalesDomesticos() {
    }
    public animalesDomesticos(int  id ,String nombre, String lugar , String claseTaxonomica, String TipoAlimentacion ,String URL) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.claseTaxonomica = claseTaxonomica;
        this.TipoAlimentacion = TipoAlimentacion;
        this.URL = URL;
    }
    public String getTipoAlimentacion() {
        return TipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        TipoAlimentacion = tipoAlimentacion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClaseTaxonomica() {
        return claseTaxonomica;
    }

    public void setClaseTaxonomica(String claseTaxonomica) {
        this.claseTaxonomica = claseTaxonomica;
    }

    @Override
    public String toString() {
        return "animalesDomesticos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", lugar='" + lugar + '\'' +
                ", claseTaxonomica='" + claseTaxonomica + '\'' +
                ", TipoAlimentacion='" + TipoAlimentacion + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

    public ImageIcon getImagen()throws MalformedURLException {
        java.net.URL urlImagen = new URL(this.URL);
        return new ImageIcon(urlImagen);

    }
}
