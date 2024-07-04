package br.com.professorisidro.projetoempresa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity                         //para indicar que a classe corresponde a uma enitdade armazenável
@Table(name = "departamento")   //para especificar o nome da tabela (pq não conhicide com o nome da classe)
public class Departamento {
    @Id                         //informo que o atributo é chave-primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //informo que é auto-iincrement
    @Column(name = "numero_id") //especifico o nome da coluna
    private int numeroId;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "andar", nullable = false)
    private int andar;

    @OneToMany(mappedBy = "depto", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("dpto")
    private List<Funcionario> listaFuncionarios;

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
}
