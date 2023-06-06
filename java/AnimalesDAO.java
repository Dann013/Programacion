import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class AnimalesDAO implements InterfazDA0{

    public AnimalesDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert ="INSERT INTO Animales (nombre, lugar, claseTaxonomica, TipoAlimentacion, URL) VALUES (?, ?, ?, ?, ?)";
        //String sqlInsert ="INSERT INTO libros (titulo,autor) VALUES (?,?)";
        int rowCount =0;
        PreparedStatement pstm =ConexionSingleton.getInstance("animalesBD.db").getConnection().prepareStatement(sqlInsert);
        //pstm.setString(1, ((Libro)obj).getTitulo());
       // pstm.setString(2, ((Libro)obj).getAutor());

        pstm.setString(1, ((animalesDomesticos)obj).getNombre());
        pstm.setString(2, ((animalesDomesticos)obj).getLugar());
        pstm.setString(3, ((animalesDomesticos)obj).getClaseTaxonomica());
        pstm.setString(4, ((animalesDomesticos)obj).getTipoAlimentacion());
        pstm.setString(5, ((animalesDomesticos)obj).getURL());

        rowCount =pstm.executeUpdate();
        return rowCount > 0 ;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate ="UPDATE Animales Domesticos SET nombre = ?, lugar = ?, claseTaxonomica = ?, TipoAlimentacion = ? , URL = ?  WHERE id  = ? ; ";
        int rowCount =0;
        PreparedStatement pstm =ConexionSingleton.getInstance("animalesBD.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((animalesDomesticos)obj).getNombre());
        pstm.setString(2, ((animalesDomesticos)obj).getLugar());
        pstm.setString(3, ((animalesDomesticos)obj).getClaseTaxonomica());
        pstm.setString(4, ((animalesDomesticos)obj).getTipoAlimentacion());
        pstm.setString(5,((animalesDomesticos)obj).getURL());
        pstm.setInt(6,((animalesDomesticos)obj).getId());

        rowCount =pstm.executeUpdate();
        return rowCount > 0 ;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete ="DELETE FROM Animales WHERE id = ? ;)";
        int rowCount =0;
        PreparedStatement pstm = ConexionSingleton.getInstance("animalesBD.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList Obtenertodo() throws SQLException {
            String sql = "SELECT * FROM Animales";
            ArrayList<animalesDomesticos> resultado = new ArrayList<>();

                Statement stm = ConexionSingleton.getInstance("animalesBD.db").getConnection().createStatement();
                ResultSet rst = stm.executeQuery(sql);
                while (rst.next()){
                    resultado.add(new animalesDomesticos(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
                }
            return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sqlSearch ="SELECT * FROM Animales WHERE id  = ? ; ";
        animalesDomesticos animal = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("animalesBD.db").getConnection().prepareStatement(sqlSearch);
        pstm.setInt(1,Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                animal = new animalesDomesticos(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
                return animal;
            }
        return null;
    }


}
