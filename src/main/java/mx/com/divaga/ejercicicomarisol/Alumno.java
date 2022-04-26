package mx.com.divaga.ejercicicomarisol;

public class Alumno {

    String nombreCompleto;
    int cal1;
    int cal2;
    int cal3;
    int cal4;
    int cal5;
    int cal6;
    int sumaCalsInpares;
    int sumaCalsPares;
    double promedio;

    public Alumno() {
    }

    public int suma() {

        return this.cal1 + this.cal2 + this.cal3 + this.cal4 + this.cal5 + this.cal6;
    }
    
    

    public Alumno(String nombreCompleto, int cal1, int cal2, int cal3, int cal4, int cal5, int cal6) {
        this.nombreCompleto = nombreCompleto;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        this.cal5 = cal5;
        this.cal6 = cal6;
        this.sumaCalsInpares = 0;
        this.sumaCalsPares = 0;
        this.promedio = 0.0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCal1() {
        return cal1;
    }

    public void setCal1(int cal1) {
        this.cal1 = cal1;
    }

    public int getCal2() {
        return cal2;
    }

    public void setCal2(int cal2) {
        this.cal2 = cal2;
    }

    public int getCal3() {
        return cal3;
    }

    public void setCal3(int cal3) {
        this.cal3 = cal3;
    }

    public int getCal4() {
        return cal4;
    }

    public void setCal4(int cal4) {
        this.cal4 = cal4;
    }

    public int getCal5() {
        return cal5;
    }

    public void setCal5(int cal5) {
        this.cal5 = cal5;
    }

    public int getCal6() {
        return cal6;
    }

    public void setCal6(int cal6) {
        this.cal6 = cal6;
    }

    public int getSumaCalsInpares() {
        return sumaCalsInpares;
    }

    public void setSumaCalsInpares(int sumaCalsInpares) {
        this.sumaCalsInpares = sumaCalsInpares;
    }

    public int getSumaCalsPares() {
        return sumaCalsPares;
    }

    public void setSumaCalsPares(int sumaCalsPares) {
        this.sumaCalsPares = sumaCalsPares;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
