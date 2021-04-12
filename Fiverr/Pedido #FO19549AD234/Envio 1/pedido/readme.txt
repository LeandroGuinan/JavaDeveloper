Descripcion de proyecto:

IDE utilizado: Apache Netbeans 12.0
IDE bases de datos: MySQL Workbench 8.0 CE

Descripcion Basica: el programa se maneja bajo una base de datos de usuarios para hacer login
esta como tal es indiferente de la base de datos que gestiona a los clientes, para hacer login
simplemente agregue un nombre de usuario y contraseña validos, todos los componentes tienen
presente la funcion de permisos de administrador, pero esta es solo una bandera, dichas funciones
faltan por agregar...

la unica funcion de privilegios de administrador es acceder a un boton extra en el inicio, del cual
de ser un usuario de rol usuario estara desactivado

el sistema cuenta con una completa anatomia de un CRUD, todo usuario es capaz de realizar todas las
operaciones en la base de datos que corresponde a los clientes

Componentes:

java Empresarial:se implemento el patron de diseño MVC para la recopilacion de informacion y manejo
de objetos de entidad.

java persistence: se creo un persistence.xml para crear una conexion con la base de datos

funciones agregadas:
*Gestion De base de datos
*exportacion de informacion de base de datos a PDF Y Excel, a la carpeta base del proyecto
*creacion de un archivo para obtener la fecha del dia en cuestion y agregarlo como nombre del archivo.

Librerias Maven:

*javax: implementacion de java empresarial
*javax.persistence: implementacion de JPA
*org.eclipse.persistence: implementacion de JPA para trabajar con JTA
*mysql: conexion a mysql desde java
*com.itextpdf: creacion y gestion de archivos pdf
*org.apache.poi: creacion y gestion de archivos Excel

Adicional:

se agrega la base de datos creada en el ide MySql, y ademas un schema para visualizar la base de datos
de manera grafica