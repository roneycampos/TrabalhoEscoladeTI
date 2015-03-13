package br.unicesumar.restserver.disciplina;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina{
    @Id
    private Long id;
    private String nome;
    private Integer cargahoraria;
    private Double peso;

    public Disciplina() {
    }

    public Disciplina(Long id, String nome, Integer cargahoraria, Double peso) {
        this.id = id;
        this.nome = nome;
        this.cargahoraria = cargahoraria;
        this.peso = peso;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DisciplinaController{" + "id=" + id + ", nome=" + nome + ", cargahoraria=" + cargahoraria + ", peso=" + peso + '}';
    }
    
    
}
