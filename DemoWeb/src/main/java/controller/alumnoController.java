
package controller;

import beans.Alumno;
import java.util.List;
import model.alumnoModel;


public class alumnoController {
    public List<Alumno> getLstAlumnoController(){
    
    return new alumnoModel().getLstAlumnoModel();
    
    }
}
