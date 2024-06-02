import java.util.Scanner;
import java.time.LocalDate;

public class CartaParaBelle {

    public static void main(String[] args) {
        System.out.println("Não é muito, mas este projeto foi feito com  muito amor...");
        System.out.println("Dedico esta carta para Isabelle Belizotti, minha namorada e eterna companheira");


        //Dados incluídos na carta

        String Autor;
        Autor = "Christoffer Isac, o seu eterno companheiro";

        LocalDate DataCarta = LocalDate.of(2024, 6, 2);
        System.out.println("última atualização: " + DataCarta);

        LocalDate DataRelacionamento = LocalDate.of(2023, 3, 21);

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

            System.out.println(""" 
                    
                    Tudo começou aqui:""" +  DataRelacionamento);

            System.out.println("""
                    
                    Foi quando nasceu o nosso amor...""");

            String Memorias = "Quer se aprofundar ainda mais na história desse relacionamento?";
            System.out.println(Memorias);


        } else if (resposta.equalsIgnoreCase("Não")) {
            System.out.println("Encerrando a execução do código.");

            CartaDeAmor = """ 
                
                Respeito sua descisão... Se esta é sua resposta imagino que possa estar em um momento ruim amor,
                porém independente de como esteja, eu sempre estarei contigo. Igualmente Deus sempre lhe guardará.""";

            System.out.println(CartaDeAmor);


        } else {
            System.out.println("Amor, para prosseguirmos você pode digitar sim ou não");
            // Adicione aqui o código que deve ser executado em caso de resposta inválida
        }

        Scanner scanner1 = new Scanner(System.in);
        String resposta1 = scanner.nextLine();


        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("E foi...");

            CartaDeAmor = """ 
               
               Desde aquele instante iniciamos essa luta pela nossa relação, tendo que conviver com
               a distância estabelecida entre nós dois. Além das grandes dificuldades de aceitação dos seus pais,
               que continuam existindo até os dias atuais. Mas mesmo com tudo isto que tentou nos derrubar e
               impedir o prosseguimento da nossa relação, você não desistiu e igualmente eu jamais desistirei.
               Assim fomos para o nosso segundo encontro...""";

            System.out.println(CartaDeAmor);

            CartaDeAmor = """ 
               
               Que a princípio demorou quase 6 meses para conseguirmos esta oportunidade, mas que felizmente aconteceu.
               Foi quando nossa relação de fato saiu das telas, foi quando nosso amor pôde ser concretizado através dos
               nossos pequenos gestos... Foi naquele instante que eu tive a certeza de que seria para sempre, não somente
               uma fase, mas sim uma vida. Mas ainda tinhámos que aprender muitas coisas...""";

            System.out.println(CartaDeAmor);

            String Memorias1 = "Posso contar um pouco mais?";
            System.out.println(Memorias1);


        } else if (resposta.equalsIgnoreCase("Não")) {
            System.out.println("Encerrando a execução do código.");

            CartaDeAmor = """ 
                
                Respeito sua descisão... Se esta é sua resposta imagino que possa estar em um momento ruim amor,
                porém independente de como esteja, eu sempre estarei contigo. Igualmente Deus sempre lhe guardará.""";

            System.out.println(CartaDeAmor);


        } else {
            System.out.println("Amor, para prosseguirmos você pode digitar sim ou não");

        }



        scanner.close();
    }




    }




