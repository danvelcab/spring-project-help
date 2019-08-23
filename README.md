# spring-project-help


## Glosario
**Proyecto:** Se refiere a información de un proyecto que se quiere realizar y para el que se quiere pedir una
 determinada ayuda. Almacenerá datos del nombre, descripción y tipo.

## Requisitos funcionales

### Proyectos
- Se debe poder crear / editar proyectos
- Se debe poder eliminar proyectos
- Se debe poder obtener información de un proyecto
- Se debe poder obtener un listado de los proyectos del sistema. Campo búsqueda por nombre y descripción y filtro por tipo




## Requisitos no funcionales
- Todos los listados deben permitir la paginación con los parámetros "page" (para indicar el número de página) 
y "size" (para indicar el  número de elementos por página)
- Todos los listados deben permitir un campo de búsqueda search. Cada listado tiene que tener una configuración
de los campos sobre los que va a filtrar cuando venga ese parámetro search


## Librerías
**tkaczmarzyk/specification-arg-resolver** : para los filtros de los listados