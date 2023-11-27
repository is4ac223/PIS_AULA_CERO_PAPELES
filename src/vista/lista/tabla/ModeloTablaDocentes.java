/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.lista.tabla;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jsbal
 */
public class ModeloTablaDocentes extends AbstractTableModel {
    
       // Datos ficticios para simular información de estudiantes
    private String[][] datosFicticios = {
            {"Juan", "Pérez", "12345678", "999888777","Ingeniero en Sistemas"},
            {"María", "Gómez", "87654321", "111222333","Matematico"},
            {"Carlos", "Rodríguez", "55554444", "777666555","Doctor en Minas"}
    };

    public int getRowCount() {
        return datosFicticios.length; // Devuelve la cantidad de filas según la cantidad de datos ficticios
    }

    public int getColumnCount() {
        return 4; // Devuelve la cantidad de columnas
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex >= 0 && rowIndex < datosFicticios.length) {
            // Devuelve los datos ficticios según la fila y columna solicitadas
            return datosFicticios[rowIndex][columnIndex];
        }
        return null;
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Apellido";
            case 2:
                return "DNI";
            case 3:
                return "CELULAR";
            case 4:
                return "TITULO";
            default:
                return null;
        }
    }
}


