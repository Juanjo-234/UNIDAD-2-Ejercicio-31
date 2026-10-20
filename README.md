Este programa está diseñado para modelar y gestionar la lectura y extracción de texto de diferentes formatos de archivos informáticos mediante el uso de polimorfismo, una interfaz común y validaciones de compatibilidad de extensiones utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la interfaz LectorDocumento: Establece el contrato modular estándar que todas las unidades de lectura deben cumplir, declarando los métodos abstractos fundamentales: abrirArchivo(String ruta) y extraerTexto(), además de un método para verificar la extensión compatible.

Implementa clases concretas (LectorPDF, LectorWord, LectorTextoPlano): Heredan y ejecutan la interfaz adaptando la lógica de procesamiento a las particularidades de cada formato (como validación de cabeceras o flujos de texto plano).

Incorpora validaciones de formato: Cada lector analiza la ruta del archivo recibido; si la extensión no coincide con la esperada (por ejemplo, intentar abrir un archivo .pdf con el lector de Word), la operación es rechazada automáticamente para evitar fallos de lectura.

Ejecuta la prueba polimórfica (main): Agrupa diferentes lectores y archivos en una lista de prueba, procesa de forma modular iterando sobre los elementos aplicando polimorfismo, y muestra los textos extraídos o los mensajes de rechazo por consola.
