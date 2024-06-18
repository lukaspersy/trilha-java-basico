## Diagrama de Classe


classDiagram
    class iPhone {
        +String modelo
        +ReprodutorMusical reprodutor
        +AparelhoTelefonico telefone
        +NavegadorInternet navegador
    }
    
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    
    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    
    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    iPhone -- ReprodutorMusical : has-a
    iPhone -- AparelhoTelefonico : has-a
    iPhone -- NavegadorInternet : has-a
