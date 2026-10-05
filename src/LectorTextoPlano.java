public class LectorTextoPlano extends  LectorDocumento{
    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".txt");
        System.out.println("Abriedno archivo texto plano: " + ruta);
    }

    @Override
    public String extraerTexto() {
        return "Texto extraido del documento texto plano.";
    }
}
