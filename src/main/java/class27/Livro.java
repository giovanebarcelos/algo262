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

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo,
                 String autor,
                 int numeroPaginas)
            throws Exception {
        this.autor = autor;
        this.titulo = titulo;
        this.setNumeroPaginas(numeroPaginas);
    }

    public void setNumeroPaginas(int numeroPaginas)
            throws Exception {
        if (numeroPaginas < 1){
            throw new Exception(
            "Número de paginas deve ser maior que 0");
        }

        this.numeroPaginas = numeroPaginas;
    }

    public void exibirFicha() {
        System.out.printf("%s - %s (%d páginas)\n",
                this.titulo, this.autor,
                this.numeroPaginas);
    }
}


