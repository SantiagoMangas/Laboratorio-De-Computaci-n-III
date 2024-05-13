package ar.edu.utn.frbb.tup.utils;

public class SimpleAdder {
    private static int sumaHistorica;
    private Integer[] arreglo = new Integer[10]; //10 es un ejemplo

    public SimpleAdder() {
    }

    public int add(int a, int b) {
        int resultado = a + b;
        this.setSumaHistorica(resultado);

        //almacenar el resultado en el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = resultado;
                break;
            }
        }
        return resultado;
    }

    public int getSumaHistorica() {
        return sumaHistorica;
    }

    public void setSumaHistorica(int sumando) {
        SimpleAdder.sumaHistorica = SimpleAdder.sumaHistorica + sumando; //aparecia un error y decia que estás tratando de acceder al campo estático sumaHistorica de la clase SimpleAdder de una manera que no es la recomendada para campos estáticos.
    }
}
