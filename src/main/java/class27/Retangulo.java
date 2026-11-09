package class27;

/*
Enunciado:
Crie a classe Retangulo com atributos largura e altura,
e um método calcularArea() que retorna o produto dos dois.

Exemplo de entrada/saída:

largura	altura	calcularArea()
5.0	3.0	15.0
 */

public class Retangulo {
    private double largura;
    private double altura;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3);

        System.out.printf("Área do retangulo = %10.2f",
                retangulo.calcularArea());
    }

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return this.altura * this.largura;
    }
}
