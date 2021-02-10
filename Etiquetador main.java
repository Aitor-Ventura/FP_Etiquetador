import es.ulpgc.eii.strings.StringUtils;

public class Main {
    /**
     * Prueba el método StringUtils.tagger
     * @param input - ristra de búsqueda
     * @param pattern patrón de búsqueda
     * @param expected - resultado esperado
     */
    static void test(String input, String pattern, String expected) {
    	// Se informa del caso que se está probando
    	System.out.println("probando: tagger(\"" + input + "\", \"" + pattern + "\")");
    	
        // Llamada al método a probar
        String result = StringUtils.tagger(input, pattern);
        
        // Comprobación de los resultados
        if (!result.equals(expected)) {
            System.out.print(">> Resultado erróneo, deberia ser: \"" + expected + "\"");
            System.out.println(" y es: \"" + result + "\"");
        } else {
            System.out.println(">> Resultado correcto: \"" + result + "\"");
        }        
    }

    /**
     * @param args
     */
    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.dates
     * @param args
     */
    public static void main(String[] args) {
        test("aksdfja129048askf8934j893ew q3m",
             "0123456789",
             "aksdfja[target]129048[endtarget]askf[target]8934[endtarget]j[target]893[endtarget]ew q[target]3[endtarget]m");
    }

}
