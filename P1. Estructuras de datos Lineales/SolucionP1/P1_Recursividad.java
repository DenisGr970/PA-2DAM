public class P1_Recursividad {


        public static int sumarDigitos(int numero) {

            // Caso base
            if (numero == 0) {
                return 0;
            }

            // Caso recursivo
            return numero % 10
                    + sumarDigitos(numero / 10);
        }

        public static void main(String[] args) {

            int numero = 5832;

            int resultado =
                    sumarDigitos(numero);

            System.out.println(
                    "Resultado: " + resultado
            );
        }
    }

