# School Management System
## Primer Actividad
 * Realizar el primer commit incluyendo todos los archivos necesarios, excepto los definidos en .gitignore.

## Segunda Actividad
### Fundamentos de POO
* Crear una nueva rama llamada feature-students-system-model para trabajar los cambios sobre esta rama. 
* Desarrollo de Clases en Java:
  * **Estudiante** (id, nombre, apellido, fechaDeNacimiento, estado). 
  * **Curso** (id, nombre, descripción, numeroCreditos, versión). 
  * **GestorAcademico** Crear ArrayList para almacenar estudiantes, otro ArrayList para cursos y un HashMap para mantener la lista de estudiantes inscritos en cada curso.
*  Realizar un commit de las clases creadas en la rama feature-students-system-model.
### Herencia, Interfaces y Excepciones
#### Crear Interfaz ServiciosAcademicosI
* método matricularEstudiante(Estudiante estudiante): Agrega un estudiante a la lista, si no está ya matriculado.
* método gregarCurso(Curso curso): Añade un nuevo curso a la lista, si no está ya creado.
* método inscribirEstudianteCurso(Estudiante estudiante, int idCurso): Inscribir a un estudiante en un curso, lanzando EstudianteYaInscritoException si ya está inscrito.
* método desinscribirEstudianteCurso(int idEstudiante, int idCurso): Desinscribir a un estudiante de un curso, lanzando EstudianteNoInscritoEnCursoException si no está inscrito o el ID del curso no es válido.
#### Implementación en GestorAcademico
* Hacer que GestorAcademico implemente ServiciosAcademicosI. 
* Implementar los métodos definidos en la interfaz ServiciosAcademicosI.
#### Herencia con la Clase Persona
* Crear la clase Persona y trasladar a ella la información común de Estudiante.
* Modificar Estudiante para que extienda de Persona. 
#### Ejecuta y Verifica tu Aplicación
* Clase main: Si no existe, implementar la clase main para ejecutar la aplicación.
* Crear 2 instancias de las clases Estudiante y Curso.
* Instanciar GestorAcademico y probar la inscripción de estudiantes , creación de cursos y todos los métodos de esta clase.
* Verificar que todos los métodos funcionan según las especificaciones.


