public class NumeroFlotanteRossi {
    public static void main(String[] args) {
        double numeroInicial = 7.54;
        double numeroDecimal = numeroInicial % 1; //Devuelve el resto de dividir el numero inicial por 1 para restar la parte entera a la decimal
        double numeroEntero = numeroInicial - numeroDecimal; //Resta el numero decimal al numero inicial
        int enteroCast = (int) numeroEntero; //Casting de dato floating a integer para eliminar decimales
        System.out.println(numeroInicial);
        System.out.println(enteroCast);
        System.out.println(numeroDecimal);
    }
}
