
import java.util.Scanner; // que importa scanner dentro del paquete java.util

// Mi clase en Java
// Public ya que es una clase que vamos a acceder de manera pública
// class = palabra reservada
// todo debe de estar escrito respetando las mayúsculas y minúsculas

public class HolaMundo {

    // Definimos la función main que nos permitirá ejecutar nuestro programa
    public static void main(String args[]) {
        // Definimos la variable
//        int miVariableEntera = 10;
//        System.out.println("miVariableEntera = " + miVariableEntera);
//        // Modificamos el valor de esta variable
//        miVariableEntera = 5;
//        System.out.println("miVariableEntera = " + miVariableEntera);
//
//        String miVariableCadena = "Saludos";
//        System.out.println("miVariableCadena = " + miVariableCadena);
//
//        miVariableCadena = "Adiós";
//        System.out.println("miVariableCadena = " + miVariableCadena);
//
//        // var - Inferencia de tipos de Java
//        // A partir de la versión 10 - Inferencia de tipos
//        var miVariableEntera2 = 15;
//        System.out.println("miVariableEntera2 = " + miVariableEntera2);
//
//        var miVariableCadena2 = "Gracias";
//        System.out.println("miVariableCadena2 = " + miVariableCadena2);
//
//        // Valores permitidos en el nombre de nuestras variables
//        var miVariable = 1; // Correcto
//        var _miVariable = 2; // Correcto
//        var $MiVariable = 3; // Correcto
//        // var áMiVariable = 4; No se recomienda utilizar
//        // var #miVariable = 5; No se permite utilizar caracteres especiales
//
//        // Concatenación de Cadenas
//        var usuario = "Fernando";
//        var titulo = "Ingeniero";
//        var union = titulo + " " + usuario;
//        System.out.println("union = " + union);
//        
//        var i = 3;
//        var j = 4;
//        
//        System.out.println(i + j); // se realiza la suma de numeros
//        System.out.println(i + j + usuario); // Evaluación de izquierda a derecha
//        System.out.println(usuario + i + j); // contexto cadena, todo es una cadena
//        System.out.println(usuario + (i + j)); // uso de parentesis modifica la prioridad en la envaluacion
//        
//        // Caracteres especiales con java
//        var nombre = "Fernando";
//        System.out.println("Nueva linea: \n" + nombre); // caracter de salto de linea
//        System.out.println("Tabulador: \t" + nombre); // tabulador
//        System.out.println("Retroceso: \b\b" + nombre); // este caracter nos devuelve un retroceso en 1(no se imprime los 2 puntos
//        System.out.println("Comilla simple: \'" + nombre + "\'"); // El valor nombre está envuelto en comillas simples
//        System.out.println("Comilla doble: \"" + nombre + "\""); // El valor del nombre está envuelto en comillas dobles
//        
//        // Clase Scanner en Java
//        System.out.print("Escribe tu nombre: ");
//        Scanner consola = new Scanner(System.in); // in.. metodo input
//        var usuario2 = consola.nextLine(); // nextLine -- lee todo la linea
//        System.out.println("usuario2 = " + usuario2);
//        System.out.print("Ingrese su título: ");
//        var titulo2 = consola.nextLine();
//        System.out.println("titulo2 = " + titulo2 + " " + usuario2);
//        
//        // tarea
//        System.out.print("Proporciona el título: ");
//        var titulo3 = consola.nextLine();
//        System.out.print("Proporciona el autor: ");
//        var autor3 = consola.nextLine();
//        System.out.println(titulo3 + " fue escrito por " + autor3);

          // Tipos primitivos en java
          /*
            tipos primitivos enteros: byte, short, int, long
          */
//          byte numeroByte = (byte)129; // byte = 8 bits
//          System.out.println("Valor númeor: " + numeroByte);
//          System.out.println("Valor mínimo del byte = " + Byte.MIN_VALUE);
//          System.out.println("Valor máximo del byte = " + Byte.MAX_VALUE);
          
//          short numeroShort = (short)32768; // short 16 bits --obligamos a convertir a tipo short pero perdemos precisión
//          System.out.println("numeroShort = " + numeroShort);
//          System.out.println("Valor mínimo del short: " + Short.MIN_VALUE);
//          System.out.println("Valor máximo del short: " + Short.MAX_VALUE);
////          
//          int numeroInt = (int)2147483648L; // la "L" significa que es una literal de tipo long
//          System.out.println("numeroInt = " + numeroInt);
//          System.out.println("Valor mínimo del Int: " + Integer.MIN_VALUE);
//          System.out.println("Valor máximo del Int: " + Integer.MAX_VALUE);

//          long numeroLong = 9223372036854775807L;
//          System.out.println("numeroLong = " + numeroLong);
//          System.out.println("Valor mínimo del Int: " + Long.MIN_VALUE);
//          System.out.println("Valor máximo del Int: " + Long.MAX_VALUE);
            /*
                Tipos primitivos de tipo flotante
            */
//          float numeroFloat = (float)3.4028235E38D; // (float)10.0
//          System.out.println("numeroFloat = " + numeroFloat);
//          System.out.println("Valor mínimo tipo float: " + Float.MIN_VALUE);
//          System.out.println("Valor máximo tipo float: " + Float.MAX_VALUE);
            
//        double numeroDouble = 1.7976931348623157E308D; // d opcional ya que un decimal es double por defecto
//        System.out.println("numeroDouble = " + numeroDouble);
//        System.out.println("Valor mínimo tipo float: " + Double.MIN_VALUE);
//        System.out.println("Valor máximo tipo float: " + Double.MAX_VALUE);

//        var numeroEntero = 10;
//        System.out.println("numeroEntero = " + numeroEntero);
//        
//        var numeroDouble = 10.0;
//        System.out.println("numeroDouble = " + numeroDouble);
//        
//        var numeroFloat = 10.0F;
//        System.out.println("numeroFloat = " + numeroFloat);

//        // char = 16bits
//        char miCaracter = 'a';
//        System.out.println("miCaracter = " + miCaracter);
//        
//        char varChar = '\u0021'; // !
//        System.out.println("varChar = " + varChar);
//        
//        char varCharDecimal = 33; // !
//        System.out.println("varCharDecimal = " + varCharDecimal);
//        
//        char varCharSimbol = '!';
//        System.out.println("varCharSimbol = " + varCharSimbol);
//                
//        var varChar1 = '\u0021'; // inferencia char por \u!
//        System.out.println("varChar = " + varChar1);
//        
//        var varCharDecimal1 = 33; // Aquí inferirá una variable de tipo int
//        System.out.println("varCharDecimal = " + varCharDecimal1);
//        
//        var varCharSimbol1 = '!'; // detecta que hay un caracter así que var inferirá tipo char
//        System.out.println("varCharSimbol = " + varCharSimbol1);
//        
//        int variableEnteraSimbolo = '!'; // 33 = el caracter se convierte automáticamente a su valor decimal
//        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
//        
//        int letra = 'a'; // a y A son diferentes https://en.wikipedia.org/wiki/List_of_Unicode_characters
//        System.out.println("letra = " + letra);

        // Tipos booleanos
//        boolean varBoolean = true;
//        System.out.println("varBoolean = " + varBoolean);
//        
//        if(varBoolean) {
//            System.out.println("La bandera es verdadera");
//        } else {
//            System.out.println("la bandera es falsa");
//        }
//        
//        var edad = 30;
//        if (edad >= 18) {
//            System.out.println("La persona es mayor de edad");
//        } else {
//            System.out.println("la persona es menor de edad");
//        }
        // Convertir tipo String a un tipo int
//        var edad = Integer.parseInt("20"); // método passInt definido dentro de la clase Integer
//        System.out.println("edad = " + (edad + 1));
//        
//        var valorPI = Double.parseDouble("3.141592");
//        System.out.println("valorPI = " + valorPI);
        
        // Pedir un valor y convertimos el valor
//        var consola = new Scanner(System.in);
//        System.out.print("Ingresa la edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
//        var edadText = String.valueOf(24);
//        System.out.println("edadText = " + edadText);
//        
//        var caracter = "Hola".charAt(0);
//        System.out.println("caracter = " + caracter);
//        
//        System.out.print("Proporcionar un caracter: ");
//        caracter = consola.nextLine().charAt(1);
//        System.out.println("caracter = " + caracter);
        
        // Tarea
//        var console = new Scanner(System.in);
//        System.out.println("Proporciona el nombre:");
//        var nombre = console.nextLine();
//        System.out.println("Proporcionar el id:");
//        var id = Integer.parseInt(console.nextLine());
//        System.out.println("Proporcinar el precio:");
//        var precio = Double.parseDouble(console.nextLine());
//        System.out.println("Proporcionar el envio gratuito: ");
//        var envioGratuito = Boolean.parseBoolean(console.nextLine());
//        System.out.println(nombre + " #" + id);
//        System.out.println("Precio: $" + precio);
//        System.out.println("Envio Gratuito: " + envioGratuito);

        int a = 3, b = 2; // var = tenemos que definir cada variable en cada linea
        var resultado = a + b;
        System.out.println("resultado = " + resultado);
        
    }
}
