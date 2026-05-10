public class EntregadorBike extends Entregador {
    private double taxaFixa = 10.0;

    public EntregadorBike(String nome) {
        super(nome, "Bicicleta");
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Entrega sustentável sendo realizada por: " + getNome());
    }

    @Override
    public double calcularCusto(double distancia) {
        return this.taxaFixa + distancia * 0.5;
    }

}
