package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloPersona extends Persona {

    ConexionPG conpg = new ConexionPG();

    //ELIMINAR PERSONA EN CASO DE NO CREARSE LA CLASE QUE HEREDA
    public boolean eliminarPersonaNoCreada(String cedula) {
        String sql = "DELETE FROM persona where per_cedula = '" + cedula + "';";

        return conpg.accion(sql);
    }

    public boolean crearPersona() {
        String sql = "INSERT INTO persona(per_cedula, per_nombre, per_apellido, per_fechaNac, per_telefono, per_direccion) VALUES ('" + getPer_cedula() + "', '" + getPer_nombre() + "', '" + getPer_apellido() + "', '" + getPer_fechaNac() + "', '" + getPer_telefono() + "', '" + getPer_direccion() + "');";

        return conpg.accion(sql);
    }

    public boolean modificarPersona() {
        String sql = "UPDATE persona SET per_nombre = '" + getPer_nombre() + "', per_apellido = '" + getPer_apellido() + "', per_fechaNac = '" + getPer_fechaNac() + "',per_telefono = '" + getPer_telefono() + "', per_direccion = '" + getPer_direccion() + "' WHERE per_cedula = '" + getPer_cedula() + "';";

        return conpg.accion(sql);
    }

    public int validarRepetidos(String cedula) { //Metodo que sirve para validar la cantidad de cedulas existentes en la BD
        int cantidad = 0;
        try {

            String sql = "select COUNT(*) from persona where per_cedula='" + cedula + "'";

            ResultSet rs = conpg.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                cantidad = rs.getInt("COUNT"); //Trae la cantidad de dni repetidos

            }

            //Cierro la conexion a la BD
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cantidad;
    }

    public int traerCodigoDePersonaCreada() {
        int codigo = 0;
        try {

            String sql = "select max(per_codigo) from persona;";

            ResultSet rs = conpg.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                codigo = rs.getInt("max"); //Trae el codigo de la persona recien creada

            }

            //Cierro la conexion a la BD
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);

        }

        return codigo;
    }
}
