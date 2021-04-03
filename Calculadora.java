public class Calculadora {
    /* En este proyecto lo que trato de hacer es crear un programa de una calculadora, con las operaciones basicas.
     * cuando el usuario elija que operacion quiera hacer, este debe ingresar dos valores y retornara un valor, dependiendo
     * de que opearacion elija.
     */

     int resultado = 0;

    /* Muestra la suma de los dos valores elegidos por el usuario.
     */
    public void suma(int n1, int n2) {
         resultado = n1 + n2;
         System.out.println(resultado);
    }

    /* Muestra la resta de los dos valores elegidos por el usuario.
     */
    public void resta(int n1, int n2) {
        resultado = n1 - n2;
        System.out.println(resultado);
    }

    /* Muestra la multiplicacion de los dos valores elegidos por el usuario.
     */
    public void multiplicacion(int n1, int n2) {
        resultado = n1 * n2;
        System.out.println(resultado);
    }

    /* Muestra la division de los dos valores elegidos por el usuario.
     */
    public void division(int n1, int n2) {
        resultado = n1 / n2;
        System.out.println(resultado);
    }
}
