# PruebaTecnica
Calculadora

-La estructura del proyecto:

	-> El proyecto esta compuesto por  por 5 paquetes utiles, principalmente.

		-> Paquete Controller -> Paquete mediante el cual se podra hacer uso de las distintas operaciones.

		-> Paquete Exceptions -> Paquete en el cual se almacenan las clases necesarias para manejar exceptiones.

		-> Paquete Service -> Paquete en el cual se establecen las distintas funcionalidades que tendra nuestra aplicación.

		-> Paquete ServiceImplemente -> Paquete en el que se almacenaran la implementacion de los distintos servicios. 

		-> Paquete Util -> Paquete en el que se almacenaran las clases necesarias para desarrollar utilidades que posteriormente se necesitaran en la aplicación
	
 	-> Dependencias utilizadas:
		
		- springfox-swagger2

		- springfox-swagger-ui

		- maven-install-plugin

		- lombok

		- junit

		- spring-boot-starter-web
	
	-> Las funcionalidades implementadas y alcance del servicio 

		- Suma

		- Resta

	-> Los procedimientos de compilación y ejecución.

		- Para el correcto funcionamiento del codigo sera necesario installar "https://projectlombok.org/download".
		-
 
	-> Ejemplos de llamadas de la API

		- http://localhost:8080/suma/1/2
		- http://localhost:8080/resta/5/7

