public abstract class LectorDocumento {
     String rutaArchivo;
    public abstract void abrirArchivo(String ruta);
    public abstract String extraerTexto();
     void validarExtension(String ruta, String extensionValida) {
        if (ruta == null || !ruta.toLowerCase().endsWith(extensionValida.toLowerCase())) {
            throw new IllegalArgumentException("Error: Extensión no compatible. Se esperaba " + extensionValida);
        }
        this.rutaArchivo = ruta;
    }
}
