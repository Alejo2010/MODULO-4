public class ENTREGABLE3 {
    public static void main(String[] args) {
        String[] texto = {"Hola", "Mundo", "Grande", "Feo"};

        String textoConcatenado = "";

        for(String Concatendor : texto) {
            textoConcatenado = textoConcatenado + " " + Concatendor;
        }

        System.out.println(textoConcatenado);
    }
}
