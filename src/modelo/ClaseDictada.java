/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;

/**
 *
 * @author Usuario iTC
 */
public class ClaseDictada {
    private String tema;
    private List<Estudiante> estudiante;

    public ClaseDictada(String tema, List<Estudiante> estudiante) {
        this.tema = tema;
        this.estudiante = estudiante;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the estudiante
     */
    public List<Estudiante> getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }
    
    
    
    
}
