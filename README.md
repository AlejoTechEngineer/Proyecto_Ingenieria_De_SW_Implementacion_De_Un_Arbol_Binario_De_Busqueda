<div align="center">

# Árbol Binario de Búsqueda (BST) — Implementación en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![Data Structures](https://img.shields.io/badge/Estructuras-Datos-8E24AA?style=for-the-badge)

> Implementación completa de árbol binario de búsqueda en Java con NetBeans/Ant: inserción, búsqueda, eliminación y recorridos.

## Descripción

</div>

---

Implementación de la estructura de datos **Binary Search Tree (BST)** en Java usando **NetBeans IDE** con sistema de build **Apache Ant**. Se implementan todas las operaciones fundamentales con análisis de su complejidad temporal en casos promedio y peor caso.

## Operaciones implementadas

| Operación | Complejidad Promedio | Complejidad Peor Caso |
|---|---|---|
| Inserción | O(log n) | O(n) árbol degenerado |
| Búsqueda | O(log n) | O(n) árbol degenerado |
| Eliminación | O(log n) | O(n) árbol degenerado |
| Recorrido inorden | O(n) | O(n) |
| Recorrido preorden | O(n) | O(n) |
| Recorrido postorden | O(n) | O(n) |

## Arquitectura

```mermaid
flowchart TD
    A[BST_Java_NetBeans] --> B[src/BinarySearchTree.java]
    A --> C[build.xml - Apache Ant]
    A --> D[dist/ - JAR Ejecutable]
    B --> E[insert - O-log n]
    B --> F[search - O-log n]
    B --> G[delete - O-log n]
    B --> H[inorder / preorder / postorder - O-n]
    C --> I[Compilacion y Empaquetado]
    I --> D
```

## Estructura del proyecto

```
proyecto/
├── src/               # Código fuente Java
├── build/             # Clases compiladas
├── dist/              # JAR ejecutable
├── build.xml          # Configuración Apache Ant
└── manifest.mf        # Manifiesto del JAR
```

## Contexto académico

**Asignatura:** Ingeniería de Software / Estructuras de Datos · **Institución:** Ingeniería Informática
**Autor:** Alejandro De Mendoza — Ingeniero Informático · Especialista Ingeniería de Software

---

## Autor

**Alejandro De Mendoza**  
Ingeniero Informático · Especialista en IA · Especialista en Ingeniería de Software · Máster en Arquitectura de Software

[![GitHub](https://img.shields.io/badge/GitHub-AlejoTechEngineer-181717?style=for-the-badge&logo=github)](https://github.com/AlejoTechEngineer)
