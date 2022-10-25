package projeto.ltp.projeto.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Historia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String historia;
    private String titulo;
    private String depoimento;

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "fk_lerHistoria")
    private LerHistoria lerHistoria;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="historia_fk")
    private List<Publicar> rotulos = new ArrayList<>();
   
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "associacao_livro_rotulo", joinColumns = @JoinColumn(name = "fk_historia"), inverseJoinColumns = @JoinColumn(name = "fk_publicar"))
    private List<PublicarMuitosParaMuitos> publicarMuitosParaMuitos;

    public Historia() {
    }

    public Historia(Long id, String historia, String titulo, String depoimento, LerHistoria lerHistoria,
            List<Publicar> rotulos, List<PublicarMuitosParaMuitos> publicarMuitosParaMuitos) {
        this.id = id;
        this.historia = historia;
        this.titulo = titulo;
        this.depoimento = depoimento;
        this.lerHistoria = lerHistoria;
        this.rotulos = rotulos;
        this.publicarMuitosParaMuitos = publicarMuitosParaMuitos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getHistoria() {
        return historia;
    }



    public void setHistoria(String historia) {
        this.historia = historia;
    }



    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getDepoimento() {
        return depoimento;
    }



    public void setDepoimento(String depoimento) {
        this.depoimento = depoimento;
    }



    public LerHistoria getLerHistoria() {
        return lerHistoria;
    }



    public void setLerHistoria(LerHistoria lerHistoria) {
        this.lerHistoria = lerHistoria;
    }



    public List<Publicar> getRotulos() {
        return rotulos;
    }



    public void setRotulos(List<Publicar> rotulos) {
        this.rotulos = rotulos;
    }



    public List<PublicarMuitosParaMuitos> getPublicarMuitosParaMuitos() {
        return publicarMuitosParaMuitos;
    }



    public void setPublicarMuitosParaMuitos(List<PublicarMuitosParaMuitos> publicarMuitosParaMuitos) {
        this.publicarMuitosParaMuitos = publicarMuitosParaMuitos;
    }
}

