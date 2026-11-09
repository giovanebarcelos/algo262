package class27;
/*
Enunciado:
Modele a classe Livro com atributos titulo,
autor e numeroPaginas, e um método exibirFicha()
que imprime os três dados formatados.
Crie 2 objetos com dados diferentes e
chame o método em cada um.

Exemplo de saída esperada:

Objeto
titulo=“Dom Casmurro”,
autor=“Machado de Assis”,
numeroPaginas=256

Saída de exibirFicha()
Dom Casmurro - Machado de Assis (256 paginas)
*/

public class LivroApp {
    public static void main(String[] args)
            throws Exception {
        Livro livro1 =
                new Livro("Dom Casmurro",
                        "Machado de Assis",
                        256);
        Livro livro2 =
                new Livro("Clean Code",
                        "Uncle Bob",
                        300);

        livro1.exibirFicha();
        livro2.exibirFicha();
    }
}
