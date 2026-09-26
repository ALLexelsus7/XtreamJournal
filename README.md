# 🏔️ Xtreme Journal - Bitácora de Viajes Extremos

> **Aplicación Móvil Nativa para Android**

Xtreme Journal es una aplicación local-first diseñada para que los entusiastas del turismo de aventura y los deportes extremos puedan registrar, visualizar y gestionar una bitácora digital estructurada y privada de sus expediciones.

## 🛠️ Stack Tecnológico y Arquitectura

*   **Lenguaje & Entorno:** Kotlin, Android Studio.
*   **Interfaz de Usuario (UI/UX):** XML, Material Design 3 (MaterialCardView, Chips), SplashScreen API y ViewPager2 para los carruseles multimedia. Desarrollo responsivo usando *nested layouts* y lógica de clipToOutline para bordes consistentes.
*   **Persistencia de Datos:** Base de datos relacional SQLite3 gestionada mediante la librería **Room**. Estructura robusta con Entities, DAOs y Foreign Keys con borrado en cascada (Integridad ACID).
*   **Patrones de Arquitectura:** Uso del patrón de diseño *Mappers* mediante funciones de extensión para traducir y separar los modelos de dominio de las entidades de la base de datos.
*   **AI-Assisted Development:** Integración del agente Gemini en el flujo de trabajo para acelerar la depuración de vistas XML, optimización de consultas locales y refactorización de código.

## ✨ Características Principales

*   **Perfil Único y Privado:** Sistema de onboarding dinámico que detecta si el usuario ya existe en la base de datos local y personaliza la experiencia.
*   **Gestión Multimedia Inteligente:** Captura de hasta 3 fotografías por viaje con persistencia permanente. Las imágenes seleccionadas de la galería se copian al almacenamiento interno privado (`filesDir`) para evitar que se rompan los enlaces al reiniciar el dispositivo.
*   **Interacciones Físicas y Táctiles:** Listas interactivas en el RecyclerView con *Haptic Feedback* (respuesta de vibración). Incluye gestos nativos de arrastrar para reordenar (Drag & Drop) y deslizar para eliminar (Swipe-to-Delete).

## ⚙️ Instrucciones de Ejecución Local

1. Clona este repositorio: `git clone [URL_DEL_REPOSITORIO]`
2. Abre el directorio en **Android Studio**.
3. Espera a que termine la sincronización de **Gradle**.
4. Ejecuta la aplicación en un emulador de Android o en un dispositivo físico conectado.

Proyecto desarrollado en equipo por: Alex Ruiz Jordan, Juan Pablo Lopez Hernandez, 
Samuel de Jesus Torres Godoy y Renulfo Leonel Martinez Haro (Centro de Enseñanza Técnica e Industrial).
