import java.util.Scanner;

public class CartaParaBelle {

    public static void main(String[] args) {
        System.out.println("Não é muito, mas foi feito com amor");
        System.out.println("Nossas Memórias");


        //Data do início do nosso relacionamento

        int dia = 21;
        int mes = 3;
        int ano  = 2023;

        //Dados incluídos na carta

        String Autor;
        Autor = "Amor da sua vida";

        /* Carta MinhaCarta;
        Carta = MinhaCarta = new Carta(); */


        System.out.println("Tudo começou aqui: " + dia + "/" + mes + "/" +  ano);

        String CartaDeAmor;
        CartaDeAmor = """ 
                
                Faz muito tempo mesmo meu amor, já se passou mais de 1 ano desde o momento
                em que nos conhecemos e serão muitos momentos dos quais iremos viver a partir daqui.
                Quer relembrar todas estas memórias?""";

        System.out.println(CartaDeAmor);

        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Juntos estaremos sempre...");

            CartaDeAmor = """ 
                
                Vamos começar do início, de quando tudo de fato começou, de modo inusitado
                mas que é inegavél o agir de Deus em nossa relação desde aquele instante.
                Foi como um dia qualquer, para mim nada diferente ou de grande importância acontecia,
                até o instante que recebi a sua notificação. Naquele momento ainda não nos conheciamos,
                na verdade sequer sabíamos que ali nasceria o nosso amor. Mas então, não muito tempo passou e
                já estavámos juntos, especificamente dia 21/03/2023, quando me tornei o seu namorado e quando
                você viria a ser muito mais do que somente a minha namorada...""";

            System.out.println(CartaDeAmor);


        } else if (resposta.equalsIgnoreCase("Não")) {
            System.out.println("Encerrando a execução do código.");

            CartaDeAmor = """ 
                
                Respeito sua descisão... Se esta é sua resposta imagino que possa estar em um momento ruim amor,
                porém independente de como esteja, eu sempre estarei contigo. Igualmente Deus sempre lhe guardará.""";

            System.out.println(CartaDeAmor);


        } else {
            System.out.println("Amor, para prosseguirmos você digitar sim ou não");
            // Adicione aqui o código que deve ser executado em caso de resposta inválida
        }

        scanner.close();
    }




    }




