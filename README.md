# Calculadora FXML

Implementar en JavaFX una calculadora redimensionable ([responsive](https://es.wikipedia.org/wiki/Diseño_web_adaptablehttps://es.wikipedia.org/wiki/Diseño_web_adaptable)), siguiendo el patrón de diseño MVC, de forma que sus componentes se ajusten al tamaño de la ventana para ocupar toda su superficie, por lo que será necesario utilizar los paneles adecuados.

La interfaz se deberá implementar en FXML y el aspecto de la misma es el siguiente:

![](https://github.com/Ayoamaro/CalculadoraFXML/blob/main/docs/images/vista1.png?raw=true)

Si aumentáramos el tamaño de la ventana, los componentes deberán presentarse de la siguiente forma:

![](https://github.com/Ayoamaro/CalculadoraFXML/blob/main/docs/images/vista2.png?raw=true)

La **lógica de negocio** de la calculadora se implementa en la clase **Calculadora.java** (disponible abajo) que deberá incluirse en el proyecto, y que adaptaremos para que funcione con "Properties" de JavaFX donde corresponda y así también sirva de modelo. A continuación se describen los métodos que hay que utilizar de esta clase:

- El botón "CE" se corresponde con el método "borrarTodo()".
- El botón "C" se corresponde con "borrar()".
- Cuando se pulsa un dígito habrá que llamar al método "insertar(char digito)".
- Cuando se pulsa el botón para introducir decimales se llamará al método "insertarComa()".
- Para las operaciones (+, -, *, /) se dispone del método "operar(char)", al que se le pasará una constante: IGUAL, SUMAR, RESTAR, DIVIDIR, ...
- Para saber lo que hay en la pantalla de la calculadora debes usar el método "String getPantalla()".

Ejemplo de uso de la clase "Calculadora":

```
// instancio la calculadora
Calculadora calc = new Calculadora();

// queremos sumar 15 + 8,5 
        
// insertamos el 15
calc.insertar('1');
calc.insertar('5');

// pulsamos el botón "+"
calc.operar(Calculadora.SUMAR);
        
// insertamos 8,5
calc.insertar('8');
calc.insertarComa();
calc.insertar('5');
        
// pulsamos el botón "="
calc.operar(Calculadora.IGUAL);
        
// muestra el contenido de la pantalla de la calculadora (23.5)
System.out.println(calc.getPantalla());
```

