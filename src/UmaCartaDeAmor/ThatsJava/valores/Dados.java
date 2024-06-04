package UmaCartaDeAmor.ThatsJava.valores;

import java.time.LocalDate;

public class Dados {
    DadosDaCarta meusDadosDaCarta = new DadosDaCarta();

    public static void main(String[] args) {
        String Autor;
        Autor = "Christoffer Isac, o seu eterno companheiro";

        LocalDate DataCarta = LocalDate.of(2024, 6, 2);
        System.out.println("última atualização: " + DataCarta);

        LocalDate DataRelacionamento = LocalDate.of(2023, 3, 21);
    }
}
