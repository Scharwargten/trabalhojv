public class Evento {

    private int codigo;
    private String nome;
    private String local;
    private double valorInscricao;
    private int vagasDisponiveis;
    private int cargaHoraria;

    public Evento(int codigo, String nome, String local, double valorInscricao, 
                  int vagasDisponiveis, int cargaHoraria) {

        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.valorInscricao = valorInscricao;
        this.vagasDisponiveis = vagasDisponiveis;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Código do Evento: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Local: " + local);
        System.out.println("Valor da Inscrição: R$ " + valorInscricao);
        System.out.println("Vagas Disponíveis: " + vagasDisponiveis);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }

    public boolean podeReceberDesconto() {
        return valorInscricao >= 300.00
    }
}