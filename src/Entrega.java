public class Entrega {
    private int id;
    private String destino;
    private String status;
    private Entregador entregador;

    public Entrega(int id, String destino) {
        this.id = id;
        this.destino = destino;
        this.status = "Pendente";
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void atualizarStatus(String novoStatus, String observacao) {
        this.status = novoStatus;
        System.out.println("Status atualizado para " + novoStatus + ". Obs: " + observacao);
    }

    public void setEntregador(Entregador entregador) {this.entregador = entregador;}
    public String getResumo() {
        return "ID: " + id + " | Destino: " + destino + " | Status: " + status +
                " | Entregador: " + (entregador != null ? entregador.getNome() : "Não atribuído");
    }
}
