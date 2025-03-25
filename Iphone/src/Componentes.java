import app.AparelhoTelefonico;
import app.NavegadorInternet;
import app.ReprodutorMusical;

public class Componentes implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void tocar(){
        System.out.println("Tocar musica");
    };
    
    public void pausar(){
        System.out.println("Pausar musica");
    };
    
    public void selecionarMusica(String musica){
        System.out.println("Selecionar a musica: "+musica);
    };
    
    public void ligar(String numero){
        System.out.println("Ligar para o numero "+numero);
    };
    
    public void atender(){
        System.out.println("Atender ligação");
    };
    
    public void iniciarCorreioVoz(){
        System.out.println("Iniciar correio de voz");
    };
    
    public void exibirPagina(String url){
        System.out.println("Exibir pagina "+url);
    };
    
    public void adicionarNovaAba(){
        System.out.println("Adicionar nova aba");
    };
    
    public void atualizarPagina(){
        System.out.println("Atualizar pagina");
    };
    
}

