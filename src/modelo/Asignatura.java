/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Date;

/**
 *
 * @author Usuario iTC
 */
public class Asignatura {
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    private float fecha;
    private Integer id_Asg;

    public Asignatura(String nombre, Date fecha_inicio, Date fecha_fin, float fecha, Integer id_Asg) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.fecha = fecha;
        this.id_Asg = id_Asg;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fecha_inicio
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * @param fecha_inicio the fecha_inicio to set
     */
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * @return the fecha_fin
     */
    public Date getFecha_fin() {
        return fecha_fin;
    }

    /**
     * @param fecha_fin the fecha_fin to set
     */
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    /**
     * @return the fecha
     */
    public float getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(float fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the id_Asg
     */
    public Integer getId_Asg() {
        return id_Asg;
    }

    /**
     * @param id_Asg the id_Asg to set
     */
    public void setId_Asg(Integer id_Asg) {
        this.id_Asg = id_Asg;
    }
    
    
    
    
    
}
