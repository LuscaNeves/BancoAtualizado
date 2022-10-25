package projeto.ltp.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LerHistoria<Historia>{    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Character tipo;
    
    @OneToOne(mappedBy = "lerHistoria") 
    private Historia historia;
    
    public LerHistoria() {
    }

    public LerHistoria(Long id, Character tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Historia getHistoria() {
        return historia;
    }

    public void setHistoria(Historia historia) {
        this.historia = historia;
    }
}
