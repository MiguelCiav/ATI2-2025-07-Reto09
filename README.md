# Reto 09

### 1. ¿Cuáles son sus conclusiones?

Se implementó exitosamente una arquitectura de microservicios utilizando el ecosistema de Spring Cloud Netflix y Docker. Pensaría en que la conclusión principal es que con esto es posible desacoplar la infraestructura de la lógica de negocio.

Algo fundamental es la independencia de los servicios, ya que cada uno puede ser desplegado y escalado por separado. Además, la seguridad de red es un aspecto importante, ya que los microservicios de negocio están ocultos y protegidos. Solo se puede acceder a ellos a través del Gateway, ya que no expusimos sus puertos al host.

Durante la realización del laboratorio, tuve ciertas dificultades al momento de desplegar los microservicios. Algunas de las principales fueron la incompatibilidad de versiones (Intenté usar las últimas versiones de Java, Maven y Spring boot, pero la compatibilidad en las dependencias se me hizo compleja de manejar) y la falta de experiencia con el ecosistema de Spring Cloud Netflix. Sin embargo, pude corregir los bugs que surgieron al momento de desplegar los microservicios, entendiendo que la compatibilidad de versiones es crítica.

### 2. ¿Cuál es el poder de la combinación de estas herramientas?

Me parece que el poder radica en la automatización que ofrecen estas herramientas, ante la complejidad que tienen los sistemas distribuidos, que requieren de un montón de configuraciones y que a veces son difíciles de mantener.

Por ejemplo, usar Eureka y SpringBoot resuelve el problema de descubrir los servicios, en lugar de configurar IPs estáticas manualmente (que cambiarían constantemente en la nube), los servicios se "auto-registran" y se encuentran dinámicamente.

Además, el Gateway, me recuerda a los semáforos, ya que actúa como un semáforo inteligente que maneja el enrutamiento, la seguridad y el monitoreo en un solo punto de entrada, gestionando el tráfico de entrada y salida de la aplicación efectivamente.

Por último, Docker, es como tener un contenedor virtual que se encarga de empaquetar todas las dependencias (incluyendo el JDK específico) dentro de la imagen, garantizando que el despliegue sea idéntico en desarrollo y producción.

### 3. ¿Qué utilidad le ve en el desarrollo de una aplicación?

Considero que esta arquitectura es ideal para aplicaciones que necesitan ser escalables y flexibles, similar a casos de éxito como Netflix.

Nombraría varios puntos del laboratorio que me parecen relevantes para esta pregunta, lo primero es que, si un servicio llega a tener mucha carga, podríamos desplegar 5 instancias del mismo contenedor. Eureka y el Gateway (con Ribbon) balancearían la carga automáticamente entre ellas sin cambiar el código. También, si una instancia falla, Eureka la marca como inactiva y deja de enviarle tráfico, evitando que toda la aplicación colapse. Y finalmente, en lo que respecta al desarrollo ágil, y uno de los puntos más importantes para mí, es que permite que diferentes equipos trabajen en diferentes microservicios (incluso usando diferentes herramientas como Maven o Gradle) sin bloquearse entre sí.

### 4. ¿Cómo podríamos aprovechar estos conceptos al desarrollar la aplicación propuesta para el proyecto del semestre?

Estos conceptos se pudieran aprovechar de diferentes maneras, por ejemplo, para la aplicación propuesta para el proyecto del semestre, podríamos dividir la lógica en microservicios específicos según la funcionalidad del proyecto (ej. `Servicio-Usuarios`, `Servicio-Pedidos`, `Servicio-Inventario`).

También, podríamos aprovechar el Gateway para gestionar el enrutamiento, la seguridad y el monitoreo en un solo punto de entrada, gestionando el tráfico de entrada y salida de la aplicación efectivamente.

Todo esto, usando un entorno limpio de ejecución (Docker) para que todos tengan el mismo entorno de trabajo.

### TODO

- [] Recomendación: Opino que sería bueno especificar más claramente en la guía que se trata de tres proyectos Maven independientes y no de un único proyecto raíz que gestiona todo desde el principio. Estuve intentando ejecutar 'mvn clean install' en la raíz del proyecto, pero no funcionaba, ya que debía ejecutarlo en cada proyecto individualmente. Había asumido que el proyecto raíz gestionaba todo cuando se pidió esto: "Desde el navegador eliminemos el directorio “src” del proyecto creado y lo reemplazamos
por el generado por spring initializr.", al leer eso asumí que el proyecto creado era el que se había hecho con IntelliJ al principio, pero más adelante en la guía noté que mi estructura de carpetas no coincidía con la que se esperaba y entendí que había que separar cada proyecto, después tuve que dedicarme un rato a acomodar la estructura e instalar dependencias de nuevo.

### Mi contacto

- Correo: miguelciavato@gmail.com