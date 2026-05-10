public abstract class Entregador implements Entregavel {
    private String nome;
    private String veiculo;

    public Entregador(String nome, String veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public String getNome() {return nome;}
    public String getVeiculo() {return veiculo;}

    @Override
    public abstract void realizarEntrega();

    @Override
    public abstract double calcularCusto(double distancia);
}
