/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario iTC
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer num_tel;
    private String correo;
    private String contraseña;

    public Persona(String nombre, String apellido, Integer dni, Integer num_tel, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.num_tel = num_tel;
        this.correo = correo;
        this.contraseña = contraseña;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public Integer getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    /**
     * @return the num_tel
     */
    public Integer getNum_tel() {
        return num_tel;
    }

    /**
     * @param num_tel the num_tel to set
     */
    public void setNum_tel(Integer num_tel) {
        this.num_tel = num_tel;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
    
    
    
    
}
