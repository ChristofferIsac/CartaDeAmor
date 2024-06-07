import java.util.Scanner;
import java.time.LocalDate;

public class CartaParaBelle {

    public static void main(String[] args) {

        //Dados incluídos na carta
        String Autor = "Christoffer Isac, o seu eterno companheiro";
        String Leitor ="Isabelle Belizotti";

        LocalDate DataCarta = LocalDate.of(2024, 6, 7);
        System.out.println("última atualização: " + DataCarta);

        LocalDate DataRelacionamento = LocalDate.of(2023, 3, 21);

        //Introdução da Carta
        System.out.println("Não é muito, mas este projeto foi feito com  muito amor...");
        System.out.println("Dedico esta carta para "+  Leitor + ", minha namorada e eterna companheira");



        //Primeiro Parágrafo
        String CartaDeAmor;
        CartaDeAmor = """ 
                ----------------------------------------
                Amor, você se lembra de como esta rosa floresceu? Do exato momento quando esta flor
                da nossa relação pode então encontrar a luz de nossa própria paixão...? Podemos juntos relembrar
                cada um destes pequenos momentos dos quais nos trouxeram até aqui...?
                ----------------------------------------""";

        System.out.println(CartaDeAmor);
        System.out.println("Você se lembra de quando ela floresceu?");

        //Iniciar o Scanner
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("21/03/2023")) {
            System.out.println("Foi nesta data e foi neste instante... " + DataRelacionamento + ", o momento em que nossa relação começou");

            //Segundo Parágrafo
            CartaDeAmor = """ 
                    ----------------------------------------
                    Logo após o florescer, surgiram os primeiros espinhos, as nossas primeiras dificuldades,
                    mas que ao cultivar esta flor, vieram a perder as pontas, tornado-se somente detalhes de uma bela rosa e
                    assim regamos e cultivamos o nosso amor. Não somente de flores fizemos nossa relação, mas também de jóias e metais,
                    como a prata da qual fundiu nossa promessa e como a esmeralda dos seus olhos, que com esta preciosidade obteve a
                    minha fixação.
                    ----------------------------------------
                    """;


            System.out.println(CartaDeAmor);

            System.out.println(""" 
                    
                    Tudo começou aqui:""" + DataRelacionamento);

            System.out.println("""
                   
                    Foi quando nasceu o nosso amor...""");

            String Memorias = "posso me aprofundar na história de nossa relação?";
            System.out.println(Memorias);

        } else {
            System.out.println("Qual é a nossa chave, a data em que tudo começou...?");

        }

        Scanner scanner1 = new Scanner(System.in);
        String resposta1 = scanner.nextLine();


        if (resposta1.equalsIgnoreCase("Sim")) {
            System.out.println("E então assim a rosa obteve sua beleza...");

            CartaDeAmor = """ 
               ----------------------------------------
               Da beleza daquela flor e de seu charme, obtivemos uma oportunidade de então termos nosso campo de flores,
               ali onde então nos encontrariamos, onde a esmeralda que brilha em teus olhos me seduziu e no mesmo lugar
               onde o conforto de seus abraços prenderam-me. Agora daquele campo não haviam somente rosas, mas também girassóis,
               que em direção ao brilho dos seus olhos seguiam. Desta luz, veio o aquecer e deste calor surge então... o
               nosso primeiro beijo
               ----------------------------------------""";

            System.out.println(CartaDeAmor);

            CartaDeAmor = """ 
               ----------------------------------------
               Ali naquele instante foi onde quando os girassóis cresceram, gerando nosso campo de flores, com as rosas que
               aos seus lábios se assemelham e com a admiração dos girrásois pelo teu brilho. Foi naquele lugar que eu puder ter
               a certeza do que é amar. Mas não a qualquer uma, mas sim a mais bela flor de meu campo.
               ----------------------------------------""";

            System.out.println(CartaDeAmor);

            String Memorias1 = "Do cuidado que daquela rosa cultivei, ela então floresceu...";
            System.out.println(Memorias1);


        }

        else {
            System.out.println("Amor, para prosseguirmos você pode digitar sim ou não");

        }

        System.out.println("----------------------------------------");
        System.out.println("Esta carta foi escrita por: " + Autor);
        System.out.println("Que Deus nos guarde e juntos possamos fazer disto um amor eterno");


        scanner.close();
        scanner1.close();
    }




    }




