# avalancha

## Instalación

```
mvn install
```

## Como correr

### Tests(contiene los 15 casos de tests en la clase InputTest.java)

```
mvn test
```

### Ejemplo custom

```
mvn compile exec:java -Dexec.mainClass="main.java.AvalanchaRunner"
```

### Desde Eclipse IDE

1. Import maven Project
2. Run a la clase AvalanchaRunner.java. 
3. Insertar en la consola de Eclipse el ejemplo a correr.

## Generador de código

1. Correr las clases Generador[número de ejemplo].java
Por ejemplo. GeneradorUno para el ejemplo uno
2. Esto generará una archivo en el root del proyecto 01.cpp
3. Ejecutar desde la consola 

```
c++ 01.cpp -o 01
```

4. esto generara un 01.exe y ejecutar el mismo

Nota: 01 fue el ejemplo tomado, para cada ejercicio correspondiente a los casos provistos se corresponden al número de cada caso.
