public class Utilidades {

    public static void salidaMayusculaMinusculaLetraPorLetra(String textoIntroducido) {

        for (int i = 0; i < textoIntroducido.length(); i++) {
            String textoMinusculas = textoIntroducido.toLowerCase();
            char caracterCadena = textoMinusculas.charAt(i);

            boolean posicionPar = i % 2 == 0;

            if (posicionPar) {
                char caracterMayus = Character.toUpperCase(caracterCadena);
                System.out.print(caracterMayus);
            } else {
                char caracterMinus = Character.toLowerCase(caracterCadena);
                System.out.print(caracterMinus);
            }
            System.out.print("");
        }
    }
}
