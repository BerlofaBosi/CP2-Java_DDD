public class EntregadorCarro extends Entregador{
    private double taxaFixa = 20.0;

    public EntregadorCarro(String nome) {
        super(nome, "Carro");
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Entrega de maior capacidade saindo com o entregador: " + getNome());
    }

    @Override
    public double calcularCusto(double distancia) {
        return this.taxaFixa + distancia * 2.0;
    }
}
