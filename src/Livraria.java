import java.util.ArrayList;

public class Livraria {
    private String nome;
    private String endereco;

    private Cliente clientes;

    private ArrayList<Estante> estantes;


    public Livraria(String nome, String endereco, Cliente clientes, ArrayList<Estante> estantes){
        this.nome = nome;
        this.endereco = endereco;
        this.clientes = clientes;
        this.estantes = estantes;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public ArrayList<Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(ArrayList<Estante> estantes) {
        this.estantes = estantes;
    }

    public String toString() {
        return "Livraria{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", clientes=" + clientes +
                '}';
    }

    public void consultaLivro(){}

    public void comprarLivro(){}

}
