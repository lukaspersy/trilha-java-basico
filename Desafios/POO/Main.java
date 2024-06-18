package Desafios.POO;

import Desafios.POO.Interface.AparelhoTelefonico;
import Desafios.POO.Interface.NavegadorInternet;
import Desafios.POO.Interface.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        NavegadorInternet navegador = new NavegadorInternetImpl();

        Iphone meuiPhone = new Iphone (reprodutor, telefone, navegador);

        // Exemplo de uso
        meuiPhone.getReprodutor().tocar();
        meuiPhone.getTelefone().ligar("123456789");
        meuiPhone.getNavegador().exibirPagina("https://www.exemplo.com");
    }
}