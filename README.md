# Lector del nivel de la calidad del agua en el Atlántico

En el año 2015, los líderes mundiales adoptaron un conjunto de objetivos globales para erradicar la pobreza, proteger el planeta y asegurar la prosperidad para todos como parte de una nueva agenda de desarrollo sostenible. Cada objetivo tiene metas específicas que deben alcanzarse en los próximos 15 años.

El departamento del Atlántico se ha comprometido con esta causa y por ello ha decidido adoptar estos retos, se lista uno de los principales relacionados con el agua potable:

De aquí a 2030, se busca lograr el acceso universal y equitativo al agua potable a un precio asequible para todos.

Algunas ONG’s se atribuyeron la tarea de poder diseñar un dispositivo para analizar la calidad del agua de poblaciones apartadas. Para comenzar, requieren que el dispositivo cuente con un lector de la calidad del agua. Después de la lectura, el dispositivo nos entrega el índice de riesgo de la calidad del agua, IRCA, y según este resultado debe indicar el nivel de riesgo.


| Clasificación IRCA (%) | Nivel de riesgo | Entidades a notificar | Entidades a tomar acciones |
| --- | --- | --- | --- |
| 80.1 - 100 | INVIABLE SANITARIAMENTE | Persona prestadora, COVE, Alcaldía, Gobernación, Contraloría General, Procuraduría General | Gobernación |
| 35.1 - 80 | ALTO | Persona prestadora, COVE, Alcaldía, Gobernación, SSPD | Alcaldía | 
| 14.1 - 35 | MEDIO | Persona prestadora, COVE, Alcaldía, Gobernación	| Persona prestadora |
| 5.1 - 14	| BAJO	| Persona prestadora, COVE	| Persona prestadora |
| 0 - 5	| SIN RIESGO	| Continuar el control y la vigilancia | Continuar vigilancia	| 

Se requiere que usted desarrolle un programa que debe realizar lo siguiente:

Leer y almacenar en base de datos:
- El nombre de cada cuerpo de agua
- Número con el que se identifica
- El municipio del que forma parte 
- Tipo de cuerpo de agua
- Tipo de agua
- La clasificación IRCA
- La cantidad de habitantes en la zona

Con los datos ingresados el programa deberá:
- Indicar la clasificación IRCA de cada cuerpo de agua.
- Indicar cuántos cuerpos de agua tienen un nivel de riesgo MEDIO o inferior.
- Indicar el nombre de los cuerpos de agua que tienen un nivel de riesgo MEDIO separados por espacio, en caso de no haber ninguno devolver NA.
- Indicar la clasificación IRCA promedio de todos los cuerpos de agua ingresados.

En cuanto al diseño del programa se debe realizar lo siguiente:
- Implementar POO creando una super clase llamada ObjetoGeografico.
- Implementar POO creando una subclase llamada CuerpoDeAgua que extienda de ObjetoGeografico.
- Implementar un método tipo String dentro de la clase CuerpoDeAgua llamado nivel que calcule el nivel de riesgo de un cuerpo de agua de acuerdo con los valores de la instancia. 
- Implementar POO creando una subclase llamada DensidadPoblacional que extienda de ObjetoGeografico.
- Implementar un método tipo Int dentro de la clase DensidadPoblacional llamado afección que indique el nivel al cual la cantidad de habitantes en la zona del cuerpo de agua afecta activamente su nivel de riesgo según la siguiente tabla:

| # de habitantes | < 10000 | > 10000 y < 50000 | > 50000 |
| --- | --- | --- | --- |
| Afección | 0 | 1 | 2 |

- Diseñar una interfaz de usuario grafica por medio de la cual se puedan ingresar los datos del cuerpo de agua.
- Diseñar una interfaz de usuario grafica por medio de la cual se puedan ingresar los datos de la densidad poblacional.
- Desarrollar el diagrama UML de la aplicación.

Diseño UML

![Image text](https://raw.githubusercontent.com/henrycerpam/java-exercise5/main/src/UML.png)
