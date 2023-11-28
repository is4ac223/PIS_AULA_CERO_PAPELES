/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.utiles;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author leona
 */
public class Utiles {
    
    //METODO PARA VALIDAD CEDULAS 
    public static boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
        // Coeficientes de validación cédula
        // El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta; 
        
    }
 
    //METODO PARA VALIDAR LA FECHA. NO PUEDE SER UNA FECHA FUTURA
    
    public static Boolean validarFechaNoPasada(Date fecha){
        Date fechaActual = new Date();
        //Se compara con la fecha actual, si se pasa es incorrecta
        return !fecha.after(fechaActual);
    }
    
    //METODO QUE VALIDA QUE UNA FECHA NO SEA INFERIOR A OTRA 

    public static boolean compararFechas(Date fechaInicio, Date fechaFin) {
        // Comparar las fechas
        return fechaInicio.before(fechaFin);
    }

    //METODO PARA VERIFICAR QUE EL USUARIO MANDA UN DOUBLE VALIDO
    public static boolean validarDouble(String doubleTexto) {
        try {
            // Intentar castear el String a Double
            Double.parseDouble(doubleTexto);
            return true;
        } catch (NumberFormatException e) {
            // Si no jala retornar false
            return false;
        }
    }
    
    public static boolean verificarCelular(String codigo) {
        // Verificar si la cadena tiene exactamente 10 caracteres
        if (codigo.length() != 10) {
            return false;
        }

        // Verificar si todos los caracteres son dígitos
        for (char c : codigo.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        // Si pasa ambas verificaciones, entonces es un código válido
        return true;
    }   
    
}