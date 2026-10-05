public class LectorWord extends LectorDocumento{
    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".docx");
        System.out.println("Abriedno archivo WORD: " + ruta);
    }

    @Override
    public String extraerTexto() {
        return "Texto extraido del documento WORD.";
    }
}
