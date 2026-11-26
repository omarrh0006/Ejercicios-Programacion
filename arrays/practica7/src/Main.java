import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        int opcion;
        int suma;
        int fila;
        int columna;
        double media;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU\n" +
                            "1. Rellenar matriz\n" +
                            "2. Sumar fila\n" +
                            "3. Sumar columna\n" +
                            "4. Sumar diagonal principal\n" +
                            "5. Sumar diagonal inversa\n" +
                            "6. Calcular media\n" +
                            "7. Salir"));

            switch (opcion) {

                case 1:

                    for (int i = 0; i < matriz.length; i++) {

                        for (int j = 0; j < matriz[i].length; j++) {

                            matriz[i][j] = Integer.parseInt(
                                    JOptionPane.showInputDialog("Introduce un número"));
                        }
                    }

                    break;

                case 2:

                    fila = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce la fila que quieres sumar (1-4):"));

                    if (fila >= 1 && fila <= 4) {

                        suma = 0;

                        for (int j = 0; j < matriz[fila - 1].length; j++) {

                            suma = suma + matriz[fila - 1][j];
                        }

                        JOptionPane.showMessageDialog(null, "La suma de la fila es: " + suma);

                    } else {

                        JOptionPane.showMessageDialog(null, "Fila incorrecta");
                    }

                    break;

                case 3:

                    columna = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce la columna que quieres sumar (1-4):"));

                    if (columna >= 1 && columna <= 4) {

                        suma = 0;

                        for (int i = 0; i < matriz.length; i++) {

                            suma = suma + matriz[i][columna - 1];
                        }

                        JOptionPane.showMessageDialog(null, "La suma de la columna es: " + suma);

                    } else {

                        JOptionPane.showMessageDialog(null, "Columna incorrecta");
                    }

                    break;

                case 4:

                    suma = 0;

                    for (int i = 0; i < matriz.length; i++) {

                        suma = suma + matriz[i][i];
                    }

                    JOptionPane.showMessageDialog(null, "La suma de la diagonal principal es: " + suma);

                    break;

                case 5:

                    suma = 0;

                    for (int i = 0; i < matriz.length; i++) {

                        suma = suma + matriz[i][3 - i];
                    }

                    JOptionPane.showMessageDialog(null, "La suma de la diagonal inversa es: " + suma);

                    break;

                case 6:

                    suma = 0;

                    for (int i = 0; i < matriz.length; i++) {

                        for (int j = 0; j < matriz[i].length; j++) {

                            suma = suma + matriz[i][j];
                        }
                    }

                    media = (double) suma / 16;

                    JOptionPane.showMessageDialog(null, "La media de la matriz es: " + media);

                    break;

                case 7:

                    JOptionPane.showMessageDialog(null, "Programa finalizado");

                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }

        } while (opcion != 7);

    }
}