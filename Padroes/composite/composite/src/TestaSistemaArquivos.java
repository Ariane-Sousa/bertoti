public class TestaSistemaArquivos {
    public static void main(String[] args) {
        Arquivo foto = new Arquivo("Foto.jpg");
        Arquivo documento = new Arquivo("Documento.txt");

        Pasta pasta1 = new Pasta("Fotos");
        pasta1.adicionarComponente(foto);

        Pasta pasta2 = new Pasta("Documentos");
        pasta2.adicionarComponente(documento);

        Pasta pastaPrincipal = new Pasta("Usuário");
        pastaPrincipal.adicionarComponente(pasta1);
        pastaPrincipal.adicionarComponente(pasta2);

        pastaPrincipal.imprimir();
    }
}