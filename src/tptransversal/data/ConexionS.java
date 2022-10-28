package tptransversal.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionS {

    // completar los datos de conexion aca y conexion null
    private static String url = "jdbc:mysql://localhost/universidad";
    private static String usuario = "root";
    private static String password = "";
    private static ConexionS conexion = null;

    // poner privado para singleton
    private ConexionS() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver");
        }
    }

    //poner static
    public static Connection conectar() {
        Connection conn = null;
        if (conexion == null) {
            conexion = new ConexionS();
        }
        {
            try {
                conn = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de Conexion");
            }

            return conn;
        }
    }

}
