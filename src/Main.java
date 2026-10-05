//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    try {
        LectorDocumento lector = new LectorPDF();
        lector.abrirArchivo("documento.pdf");
        System.out.println(lector.extraerTexto());

        LectorDocumento lectorTxt = new LectorTextoPlano();
        lectorTxt.abrirArchivo("reporte.pdf");

    } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
    }

}
