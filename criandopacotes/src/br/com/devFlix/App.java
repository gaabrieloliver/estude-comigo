package br.com.devFlix;
import br.com.devFlix.gui.*;
import br.com.devFlix.gui.botoes.BotaoPlay;
import br.com.devFlix.videos.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Acessar o pacote de videos e acessar a classe Filme e criar um novo objeto dessa classe;
        br.com.devFlix.videos.Filme filme = new br.com.devFlix.videos.Filme();

        /*Poreḿ iria ficar chato ficar informando onde as classes estão, para resolver isso faríamos. Pra * isso podemos fazer uma importação;
         * Podemos utilizar
         * import videos.Filme para especificar ou
         * import videos.* para importar todas as classes que estão na pasta videos.
        */

        Novela novela = new Novela();
        Documentario documentario = new Documentario();

        Janela janelinha = new Janela();
        MiniaturaVideo miniatura = new MiniaturaVideo();

        BotaoPlay botaoPlay = new BotaoPlay();
    }
}
