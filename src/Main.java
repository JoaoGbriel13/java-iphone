import com.phoneLogic.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone1 = new iPhone("joaogbriel13","test");

        /* Logica do iTunes
        iTunes itunes1 = new iTunes();
        itunes1.addMusica("BMTH","Sleepwalking",4.20);
        itunes1.addMusica("Guns n roses", "Sweet Child O Mine",6.99);
        itunes1.addMusica("BMTH", "Kingslayer",3.99);
        itunes1.addMusica("Bad Omens", "Mercy", 5.22);
        System.out.printf("Valor total da compra - R$%.2f%n",itunes1.valorCarrinho());
        itunes1.tocarMusica(itunes1.getByMusicName("Sleepwalking"));
        itunes1.pausar(); */

        //Logica do navegador
        iphone1.exibirPagina("google.com");
        iphone1.adicionarAba();
        iphone1.atualizarPagina("google.com");

        //Logica do Telefone
        iphone1.ligar("81973265467","teste");
        iphone1.atender("81973265467");
    }
}
