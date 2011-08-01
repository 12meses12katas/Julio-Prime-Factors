Kata PrimeFactors.

Pasos realizados:

1. Con "1", el resultado debe ser []
2. Con "2", el resultado debe ser [2]
3. Con "3", el resultado debe ser [3]
4. Refactorizar tests:
  * Antes: una funcion para cada test
  * Ahora: uso de "dataProvider"
5. con "4", el resultado debe ser [2, 2]
6. Refactorizar "generate"
  * Si recibe "4", devolver [2, 2]
  * Si no, devolver [numero_recibido]
7. Con "6", el resultado debe ser [2, 3]
8. Refactorizar:
  * Las condiciones de los if son de cifras múltiplo de 2 (4 y 6)
  * Se pueden reoganizar en una única condición: "¿número es multiplo de 2?"
9. Con "8", el resultado debe ser [2, 2, 2]
  * Tan simple como cambiar el "if" por un "while".
10. Con "9", el resultado debe ser [3, 3]
  * Duplicar el while anterior pero usando un "3"
Nota:
  * El siguiente caso a tratar es el "25" (5*5)
  * 25 es el primero divisible dos veces por 5, una cifra no tratada aún.
  * Puede verse en http://en.wikipedia.org/wiki/Table_of_prime_factors
11. Con "25", el resultado debe ser [5, 5]
  * Duplicar el while usando un "5".
12. Refactorizar while
  * hasta ahora los factores han sido 2, 3 y 5.
  * Para cada uno de ellos, usar el while.
Nota:
  * El siguiente caso a tratar es el "49" (7*7)
13. Con "49", el resultado debe ser [7, 7]
14. Refactorizar
  * Eliminar la lista de factores
  * Recorrer de forma creciente los factores desde 2 hasta numero/2
  * Para cada factor, ejecutar el while que comprueba si el numero / factor == 0
15. Probar con 2*3*5*7*11 (todos numeros primos).
