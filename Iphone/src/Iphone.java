public class Iphone {
    public static void main(String[] args) throws Exception {
        
        Componentes iphone = new Componentes();

        System.out.println("\nReprodutor Musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Dio - java");

        System.out.println("\nAparelho Telefônico");
        iphone.ligar("16963251234");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nNavegador Internet");
        iphone.exibirPagina("https://www.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
