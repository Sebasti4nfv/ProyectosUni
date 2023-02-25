
package model;
import beans.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import bd.Conexion;
import java.sql.CallableStatement;

public class alumnoModel {
   
    public List<Alumno> getLstAlumnoModel()
    {
        try{
        
        List<Alumno> lst = new ArrayList<>();
        
        CallableStatement s = Conexion.ObtenerConexion().prepareCall("{CALL uspListarTodos}");
        ResultSet rSet = s.executeQuery();
        while (rSet.next()){
            Alumno obj = new Alumno();
            
            obj.setCodigo(rSet.getString("Id_alumno"));
            obj.setPaterno(rSet.getString("alu_paterno"));
            obj.setMaterno(rSet.getString("alu_materno"));
            obj.setSexo(rSet.getString("alu_sexo"));
            obj.setCodModular(rSet.getString("alu_codigo"));
            obj.setEstadoCivil(rSet.getString("alu_estadocivil"));
            obj.setCorreo(rSet.getString("alu_email"));
            
            lst.add(obj);
            }
        Conexion.ObtenerConexion().close();
        rSet.close();
        
        return lst;
        
        }catch(SQLException ex){System.out.println("Ocurrio un error, pipipipi" + ex.getMessage());}
    
        return null;
    }
}
