package projeto.ltp.projeto.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class PublicarMuitosParaMuitos<Historia> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;

    @JsonBackReference
    @ManyToMany(mappedBy = "publicarMuitosParaMuitos")
    private List<Historia> historias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Historia> getHistoria() {
        return historias;
    }

    public void setHistorias(List<Historia> historias) {
        this.historias = historias;
    }
}
