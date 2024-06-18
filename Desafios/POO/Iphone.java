package Desafios.POO;


import Desafios.POO.Interface.AparelhoTelefonico;
import Desafios.POO.Interface.NavegadorInternet;
import Desafios.POO.Interface.ReprodutorMusical;

public class Iphone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public Iphone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }

    public void setReprodutor(ReprodutorMusical reprodutor) {
        this.reprodutor = reprodutor;
    }

    public AparelhoTelefonico getTelefone() {
        return telefone;
    }

    public void setTelefone(AparelhoTelefonico telefone) {
        this.telefone = telefone;
    }

    public NavegadorInternet getNavegador() {
        return navegador;
    }

    public void setNavegador(NavegadorInternet navegador) {
        this.navegador = navegador;


    }
}
