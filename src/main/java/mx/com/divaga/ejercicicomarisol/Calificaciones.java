package mx.com.divaga.ejercicicomarisol;

import javax.swing.JOptionPane;

public class Calificaciones {

    public static void main(String[] args) {

        Alumno objeto = new Alumno("MARISOL HURTADO", 100, 90, 80, 100, 71, 100);

        int sumaCalificaciones = objeto.suma();

        // AQUI SE CALCULA EL PROMEDIO
        objeto.promedio = sumaCalificaciones / 6;

        if (esPar(objeto.getCal1())) {
            objeto.sumaCalsPares += objeto.getCal1();
        } else {
            objeto.sumaCalsInpares += objeto.getCal1();
        }

        if (esPar(objeto.getCal2())) {
            objeto.sumaCalsPares += objeto.getCal2();
        } else {
            objeto.sumaCalsInpares += objeto.getCal2();
        }

        if (esPar(objeto.getCal3())) {
            objeto.sumaCalsPares += objeto.getCal3();
        } else {
            objeto.sumaCalsInpares += objeto.getCal3();
        }

        if (esPar(objeto.getCal4())) {
            objeto.sumaCalsPares += objeto.getCal4();
        } else {
            objeto.sumaCalsInpares += objeto.getCal4();
        }

        if (esPar(objeto.getCal5())) {
            objeto.sumaCalsPares += objeto.getCal5();
        } else {
            objeto.sumaCalsInpares += objeto.getCal5();
        }

        if (esPar(objeto.getCal6())) {
            objeto.sumaCalsPares += objeto.getCal6();
        } else {
            objeto.sumaCalsInpares += objeto.getCal6();
        }

        JOptionPane.showMessageDialog(null, "EL PROMEDIO DE " + objeto.nombreCompleto + "ES: " + String.valueOf(objeto.promedio) + "\nSUMA IMPARES: " + String.valueOf(objeto.sumaCalsInpares) + "\nSUMA DE PARES: " + String.valueOf(objeto.sumaCalsPares));

    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

}
