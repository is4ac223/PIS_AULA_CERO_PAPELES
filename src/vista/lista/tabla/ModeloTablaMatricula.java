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
public class ModeloTablaMatricula extends AbstractTableModel {
         // Datos ficticios para simular información de estudiantes
    private String[][] datosFicticios = {
            {"2", "12/03/2023", "2", },
            {"1", "11/12/2023", "1", },
            {"3", "11/12/2023", "1", }
    };

    public int getRowCount() {
        return datosFicticios.length; // Devuelve la cantidad de filas según la cantidad de datos ficticios
    }

    public int getColumnCount() {
        return 3; // Devuelve la cantidad de columnas
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
                return "Ciclo";
            case 1:
                return "Registro";
            case 2:
                return "Num Matricula";
            
            default:
                return null;
        }
    }
}
