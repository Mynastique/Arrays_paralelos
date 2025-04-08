public class Main {
    public static void main(String[] args) {
        // Array meses
        String[] meses = {"Enero",
        "Febrero",
        "Marzo",
        "Abril",
        "Mayo",
        "Junio",
        "Julio",
        "Agosto",
        "Septiembre",
        "Octubre",
        "Noviembre",
        "Diciembre"};
        // Array temperatura
        double[] temperatura = { 1.0, 3.2, 6.2, 12.2, 20.1, 19.7, 21.2, 29.3, 20.2, 10.3, 6.3, 2.2};
        // Array probabilidades de lluvia
        double[] lluvias = {10.3, 3.2, 99.0, 97.2, 34.8, 24.8, 5.3, 1.2, 20.3, 28.0, 30.2, 10.3};
        // Apartado B ¿Cuál es el més más lluvioso?
        double comparador = lluvias [0];
        int posicion = 0;
        for (int i = 0; i < meses.length; i++) {
            if (lluvias [i] > comparador) {
                comparador = lluvias [i];
                posicion = i;
                System.out.println("El mes más lluvioso es " + meses[posicion]);
            }
        }
        // Apartado C ¿Cuál es la media de temperatura del año 2022?
        double suma = 0;
        for(int i = 0; i < temperatura.length; i++) {
            suma += temperatura[i];
            }
        System.out.println("El temperatura media es: " + suma/temperatura.length);
        // Apartado D Algoritmo para ir los mejores meses
        String mejoresMeses = " ";
        for (int i = 0; i < meses.length; i++ ) {
            if (lluvias [i] <= 25 && temperatura[i]>=10 && temperatura[i] <=25) {
                mejoresMeses += meses[i] + " ";
            }
        }
        System.out.println("Los mejores meses para visitar Disneyland son: " + mejoresMeses);


    }
}