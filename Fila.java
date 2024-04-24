public class Fila {
    private static Fila instancia;//atributo estático para permitir a
    // referência do atributo sem a necessidade de uma instância

    private Fila() {} //Construtor privado para evitar a instanciação direta

    public static Fila getInstance() {
        if (instancia == null) {
            if (instancia == null) {
                instancia = new Fila();
            }
        }
        return instancia;
    }
    public void ImprimeDocumento() {}

    public void RemoveDocumento() {}

    public void RemoveTodosDocumentos() {}

}