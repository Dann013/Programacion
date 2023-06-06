import InterfazAD.VentanaAnimalD;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaAnimalD view = new VentanaAnimalD("Tabla animales Domesticos");
        ControladorAD controll = new ControladorAD(view);

    }

}

