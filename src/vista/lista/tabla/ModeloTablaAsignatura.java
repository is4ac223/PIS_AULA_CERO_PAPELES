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
public class ModeloTablaAsignatura extends AbstractTableModel {
     // Datos ficticios para simular información de estudiantes
    private String[][] datosFicticios = {
            {"Analisis Matematico", "11/08/2023", "11/08/2023"},
            {"Estructura de Datos", "11/08/2023","11/08/2023"},
            {"POO",  "11/08/2023","11/08/2023"}
    };

    public int getRowCount() {
        return datosFicticios.length; // Devuelve la cantidad de filas según la cantidad de datos ficticios
    }

    public int getColumnCount() {
        return 3; // Devuelve la cantidad de columnas
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex >= 0 && rowIndex < datosFicticios.length) {
           
            return datosFicticios[rowIndex][columnIndex];
        }
        return null;
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NOMBRE";
            case 1:
                return "Fecha Inicio";
            case 2:
                return "Fecha Fin";
           
            default:
                return null;
        }
    }
}
