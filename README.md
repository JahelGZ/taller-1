# TALLER NIVELACION PI A PII

---
## Markdown
Es una herramienta o también considerado lenguaje de escritura que nos permite redactar contenido de manera sencilla, manteniendo un diseño legible en su código en todo momento y facilidad para convertirse en HTML. Se usa para dar formato automático a texto plano con sintaxis basada en símbolos (#, *, [], etc.).  que se transforman y muestran el texto con un tipo de diseño. Es muy usado en GitHub, documentación técnica, blogs, foros, notas personales y últimamente para interactuar con sistemas de IA.


# GIT
- **Pregunta 1:** Un repositorio es un espacio digital donde almacenamos archivos, código, documentos y recursos de un proyecto. Se diferencia de un proyecto normal principalmente en que su almacenamiento ira a un solo lugar y lo mas importante de un repositorio como Git es su control de versiones, cada vez que guardemos cambios podemos ver quién realizó la edición, cuándo la hizo y qué se modificó. Nos da la seguridad de no perder nuestro proyecto por ejemplo si algún compañero borra algo podemos volver a la versión anterior y resolver un problema muy rápido.

- **Pregunta 2:** 
    - **Working Directory:** Directorio de trabajo, es la carpeta física en el computador donde podemos modificar los archivos. Son cambios que en este punto se consideran como “no guardados” por Git y si se modifica el código se hace directo.

    - **Staging Area/Index:** Funciona como archivo temporal que actúa como borrar antes del guardado, aquí se seleccionan los cambios que harán parte del git add.

    - **Repository:** Es la base de datos oficial oculta dentro de la carpeta .git en ella guarda de forma permanente el historial de versiones del proyecto, se almacenan los cambios usando el comando git commit para el local y git push para el remoto. 
      
- **Pregunta 3:** Git maneja los cambios por debajo como si fuera un sistema de archivos y para eso usa cuatro objetos. Los blobs, que son los que guardan el contenido puro de los archivos. los trees, son los que actúan como las carpetas para organizar esos archivos. Los commits, que son como la foto del estado del proyecto en ese momento y guardan quién hizo el cambio.Por ultimo los tags, que son etiquetas fijas que le ponemos a versiones importantes.

- **Pregunta 4:** Para crear un commit tiramos el comando git commit -m "El mensaje de lo que se hizo". Ese objeto commit guarda un puntero hacia el tree principal con el estado de los archivos, quién es el autor, la fecha y la hora, y también el enlace al commit anterior (su padre) para ir armando el historial.

- **Pregunta 5:** Git fetch simplemente descarga la información nueva del repositorio remoto a nuestra máquinam pero no toca nuestro código de trabajo. En cambio, git pull hace el fetch y de una vez intenta fusionar esos cambios nuevos directamente en la rama en la que estamos trabajando.

- **Pregunta 6:** Una rama es un puntero que se va moviendo y apuntando a un commit específico. Git sabe en qué rama estamos parados en todo momento gracias a un puntero especial llamado HEAD. Cada vez que hacemos un commit nuevo, el puntero de nuestra rama actual avanza automáticamente hacia ese nuevo punto.

- **Pregunta 7:** El merge se hace con git merge "nombre-rama ". El problema de los conflictos se da cuando intentamos unir ramas y resulta que en ambas se modificó la misma línea del mismo archivo de forma diferente. Para cuadrar eso, nos toca abrir el archivo en el editor, revisar las marcas que deja Git, elegir qué porción de código es la que sirve, borrar, guardar, y finalmente hacer un git add y un git commit nuevo para sellar la fusión.

- **Pregunta 8:** El staging area es como una sala de espera donde preparamos exactamente qué modificaciones queremos mandar en el próximo commit. Si nos saltamos el git add, pues Git simplemente asume que no queremos incluir esos archivos en el commit, y los cambios se quedan ahí sueltos en nuestro entorno de trabajo.

- **Pregunta 9:** Es un archivo de texto donde le decimos a Git qué cosas debe ignorar completamente. Esto nos salva de subir por error archivos temporales o contraseñas al repositorio.

- **Pregunta 10:** Un commit nuevo añade un paso extra al historial. Por el contrario, el git commit --amend coge el último commit que acabamos de hacer y lo sobrescribe o "parchea".

- **Pregunta 11:** Se usa ejecutando git stash. Lo que hace es guardar temporalmente nuestros cambios locales que aún no están confirmados y nos deja el entorno limpio. Es un salvavidas cuando uno está programando algo a medias y de la nada le toca cambiar de rama urgente para arreglar un error, así no perdemos lo que llevábamos ni nos toca hacer un commit incompleto.

- **Pregunta 12:** 
    - **Git chekout:** Para echar para atrás modificaciones en un archivo local que todavía no hemos mandado al staging.

    - **Git reset:** Mueve el historial hacia atrás. Dependiendo de si usamos soft o hard, nos deja los cambios en el editor o los borra del todo.
    - **Git revert:** Es la forma más segura si el código ya está subido, porque en vez de borrar historial, crea un commit nuevo que hace exactamente lo contrario al commit que la embarró.

- **Pregunta 13:** Por defecto, al clonar un repositorio, ese remoto principal se llama origin. Cuando trabajamos con un fork (una copia de un proyecto ajeno), usamos upstream para apuntar al repositorio original base. Para configurarlo tiramos "git remote add upstream url" y para traernos las actualizaciones de ese proyecto original usamos "git fetch upstream".

- **Pregunta 14:** Para auditar cómo va avanzando el proyecto usamos los siguientes comandos:

    - **Git log:** Nos muestra todo el listado de commits que se han hecho en la rama.

    - **Git diff:** Sirve para ver qué líneas de código exactas cambiaron, ya sea entre nuestro código actual, el staging o entre dos commits distintos.

    - **Git show commit:** Nos detalla un commit en específico y nos muestra exactamente qué código se agregó o se quitó en ese paso.

    ***


# Programación

- **Pregunta 15:** En Java hay ocho tipos primitivos, que son los datos básicos. Para números enteros usamos byte, short, int y long. Para los decimales están float y double. Para guardar un solo carácter usamos char, y para valores lógicos de verdadero o falso, usamos boolean.

- **Pregunta 16:** El if / else evalúa una condición booleana para decidir si ejecuta un bloque de código o el otro. El switch es ideal cuando tenemos una variable que puede tomar valores muy específicos como un menú de opciones y evaluamos múltiples "casos". Los bucles (for, while y do-while) nos sirven para repetir una tarea automáticamente mientras una condición se siga cumpliendo.

- **Pregunta 17:** Un ejemplo es digamos si nombramos una variable x o dato1, en una semana ni nosotros mismos nos vamos a acordar para qué servía. Usar nombres significativos y descriptivos como calcularTotal o salarioNeto hace que el código se lea de forma más natural, facilitando el mantenimiento y el trabajo en equipo para no enredarnos la vida leyendo el proyecto más adelante.

- **Pregunta 18:** Aqui es donde dejamos de ver el código como una lista de instrucciones que se ejecutan de arriba a abajo, y empezamos a modelar componentes del mundo real. Para esto creamos  clases que son como los moldes y a partir de ellas instanciamos objetos. Estos objetos tienen su propio estado a través de atributos (características) y comportamientos a través de métodos (acciones).

- **Pregunta 19:** 
    - **Abstracción:** Extraer y quedarse solo con las características esenciales de un objeto para el sistema, ignorando los detalles complejos que no aportan al funcionamiento.

    - **Encapsulamiento:** Ocultar y proteger los datos internos de un objeto para que no los puedan modificar arbitrariamente desde afuera.

    - **Herencia:** Crear nuevas clases a partir de unas ya existentes para reciclar todo su código.

    - **Polimorfismo:** La capacidad que tienen objetos de diferentes clases de responder de manera distinta al llamado de un mismo método.

- **Pregunta 20:** La herencia permite que una clase hija reciba todos los atributos y métodos de una clase padre, lo cual es clave para no repetir código innecesariamente. Se implementa con la palabra reservada extends. Por ejemplo, si tenemos una clase padre Persona, podemos crear Estudiante extends Persona, y así el estudiante hereda todo lo básico de una persona.

- **Pregunta 21:** Son palabras clave que ponemos antes de declarar clases, variables o métodos para controlar desde qué otras partes del proyecto se pueden ver o utilizar, garantizando así el principio de encapsulamiento. Los mas comunes son public, private y protected.

- **Pregunta 22:** Son variables configuradas directamente en el sistema operativo que guardan rutas y datos globales del equipo. Para Java son vitales porque le indican a Windows o Linux dónde están los binarios del compilador (javac) y la máquina virtual (java). Gracias a esto, la consola reconoce los comandos y podemos compilar o correr nuestros proyectos desde cualquier carpeta del computador.
---




