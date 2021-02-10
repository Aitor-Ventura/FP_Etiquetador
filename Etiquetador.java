package es.ulpgc.eii.strings;

//Aitor Ventura Delgado
//12.02.2019

//Método auxiliar que añadirá [target] y [endtarget] a una frase en los espacios que contengan
//carácteres de otra frase.

public class StringUtils {
    public static String tagger(String s1, String s2){
        String result = "";
        boolean flag = false; //creamos una flag (indicador)
        for (int i = 0; i < s1.length(); i++){
            if (s2.indexOf(s1.charAt(i)) > -1){ //si se encuentra un carácter de la segunda frase, hacer
                if (!flag){ //si el indicador es falso, es decir, que no hemos pasado por aquí antes, añadiremos un
                    result += "[target]" + s1.charAt(i);
                    flag = true;    //y cambiamos el estado del indicador
                } else {
                    result += s1.charAt(i); //si el indicador es verdadero, se copia tal cual
                }
            } else { //si no se encuentra el carácter, entonces
                if (flag){  //si el indicador es positivo, es decir, terminamos de estar aquí hacer
                    result += "[endtarget]" + s1.charAt(i); 
                    flag = false; //y cambiamos el estado del indicador
                } else { //si el indicador es falso, copiar tal cual
                    result += s1.charAt(i);
                }
            }
        }
        if (flag){  //si el indicador es verdadero, (última palabra), hacer
            result = result + "[endtarget]";
        }
        
        return result; //devolver resultado
    }
}