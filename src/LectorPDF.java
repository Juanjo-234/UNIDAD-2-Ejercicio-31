public class LectorPDF extends LectorDocumento{
    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".PDF");
        System.out.println("Abriedno archivo PDF: " + ruta);
    }

    @Override
    public String extraerTexto() {
        return "Texto extraido del documento PDF.";
    }
}
