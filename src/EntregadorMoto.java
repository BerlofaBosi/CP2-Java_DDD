public class EntregadorMoto extends Entregador{
    private double taxaFixa = 15.0;

    public EntregadorMoto(String nome) {
        super(nome, "Moto");
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Entrega rápida saindo com o entregador: " + getNome());
    }

    @Override
    public double calcularCusto(double distancia) {
        return this.taxaFixa + distancia * 1.2;
    }
}
