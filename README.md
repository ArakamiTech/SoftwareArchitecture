# Principios SOLID en Java

## Descripción

Este proyecto contiene ejemplos prácticos en Java de los cinco principios SOLID, utilizados para desarrollar software más mantenible, extensible y desacoplado.

Los ejemplos fueron desarrollados utilizando Java 17 y muestran tanto implementaciones incorrectas como soluciones aplicando correctamente cada principio.

---

# ¿Qué es SOLID?

SOLID es un conjunto de principios de diseño orientado a objetos propuestos por Robert C. Martin ("Uncle Bob") para mejorar la calidad del software.

| Letra | Principio                       |
| ----- | ------------------------------- |
| S     | Single Responsibility Principle |
| O     | Open/Closed Principle           |
| L     | Liskov Substitution Principle   |
| I     | Interface Segregation Principle |
| D     | Dependency Inversion Principle  |

---

# Single Responsibility Principle (SRP)

## Definición

Una clase debe tener una única razón para cambiar.

## Objetivo

Separar responsabilidades para facilitar el mantenimiento y la evolución del código.

### Incorrecto

Una única clase maneja:

* Persistencia
* Correos electrónicos
* Reportes

### Correcto

Se crean clases independientes:

* UsuarioService
* EmailService
* ReporteService

---

# Open/Closed Principle (OCP)

## Definición

Las entidades de software deben estar abiertas para extensión y cerradas para modificación.

## Objetivo

Permitir agregar nuevas funcionalidades sin modificar código existente.

### Ejemplo

Sistema de descuentos:

* DescuentoVip
* DescuentoNormal
* DescuentoPremium

Todas las implementaciones siguen el contrato definido por la interfaz `Descuento`.

---

# Liskov Substitution Principle (LSP)

## Definición

Las clases derivadas deben poder sustituir a sus clases base sin alterar el comportamiento esperado.

## Objetivo

Garantizar que las jerarquías de herencia sean consistentes.

### Ejemplo

Sistema de animales voladores:

* Aguila
* Ave
* Pinguino
* Volador

Las aves que permiten volar implementan la interfaz `Volador`, evitando comportamientos inesperados y excepciones en tiempo de ejecución.

---

# Interface Segregation Principle (ISP)

## Definición

Los clientes no deben depender de métodos que no utilizan.

## Objetivo

Crear interfaces pequeñas y específicas.

### Ejemplo

Interfaces:

* Trabajable
* Comible
* Dormible

Implementaciones:

* Persona
* Robot

Cada clase implementa únicamente las capacidades que realmente necesita.

---

# Dependency Inversion Principle (DIP)

## Definición

Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

## Objetivo

Reducir el acoplamiento y facilitar pruebas, mantenimiento y extensibilidad.

### Ejemplo

Repositorio de usuarios:

```java
public interface UsuarioRepository {
    void guardar();
}
```

Implementaciones:

* MySqlRepository
* OracleRepository

Servicio:

```java
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void guardar() {
        repository.guardar();
    }
}
```

Uso:

```java
UsuarioRepository repository =
        new OracleRepository();

UsuarioService service =
        new UsuarioService(repository);

service.guardar();
```

La implementación puede cambiar sin modificar la lógica de negocio.

---

# Estructura del Proyecto

```text
src
└── main
    └── java
        └── com
            └── arakamitech
                └── softwarearchitecture
					└── solidprinciples
						├── S
						├── O
						├── L
						├── I
						└── D
```

---

# Tecnologías Utilizadas

* Java 17
* Maven
* NetBeans

---

# Beneficios de SOLID

* Código más limpio
* Menor acoplamiento
* Mayor reutilización
* Facilidad para realizar pruebas unitarias
* Mayor facilidad para extender funcionalidades
* Menor impacto de cambios futuros

---

# Autor

Desarrollado por Arakamitech como proyecto de estudio y práctica de principios de diseño orientado a objetos utilizando Java.
