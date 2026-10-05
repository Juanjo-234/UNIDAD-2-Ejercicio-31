Resolución del ejercicio N°31 de la unidad 2 de programación 2.
Este programa implementa un sistema modular en Java para procesar y extraer texto de diferentes tipos de documentos (PDF, Word y texto plano) aplicando principios de diseño orientado a objetos como la abstracción, el polimorfismo y las validaciones de seguridad por extensión.
Las clases que conforman esta estructura son las siguientes:

LectorDocumento: Clase abstracta base que define el contrato común y las validaciones de extensión.
LectorPDF: Clase concreta encargada de procesar archivos en formato PDF.
LectorWord: Clase concreta encargada de procesar archivos de Word.
LectorTextoPlano: Clase concreta encargada de procesar archivos de texto plano.
