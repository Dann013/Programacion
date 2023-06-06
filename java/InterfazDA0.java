import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazDA0 {

    public abstract boolean insertar (Object obj)throws SQLException;

    public abstract boolean update(Object obj)throws SQLException;

    public abstract boolean delete(String id)throws SQLException;

    public abstract ArrayList Obtenertodo()throws SQLException;

    public abstract Object buscarPorId (String id )throws SQLException;
}
