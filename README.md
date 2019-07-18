# manejo-errores-android

**En desarrollo**

Repositorio para meetup "Manejo de Errores" Android Devs Bs AS

En los distintos branchs se puede observar como mejora el manejo de errores al migrar de Java a Kotlin, como manejar correctamente las excepciones, como mostrar errores, etc.

Existen 3 branches:
- _android-java-legacy:_ representa una aplicación Android con código Legacy. Utiliza AsyncTasks, manejo de nulos con ifs, Observers/Listeners de Tasks con interfaces, Queries a mano con SQLite, Mapeo y Conexión a Base de Datos manual, etc.
- _android-java:_ representa la aplicación Android de código Legacy, pero utilizando nuevas tecnologías para mostrar como se pueden solucionar errores comunes. Sigue utilizanado AsyncTasks, manejo de nulos con ifs, Observers/Listeners de Tasks con interfaces, etc.
- _android-kotlin:_ representa la aplicación con código Legacy que fue migrada a kotlin, utilizando manejo de nulos, sin AsyncTasks y Coroutines. Se puede observar como cambio la gestión de los errores, contemplando menos situaciones conflictivas.
- _android-kotlin-improvement:_ misma aplicación que se encuentra en el branch anterior, pero implementando un approach para hacer más transparente el manejo de errores.
