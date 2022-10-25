package projeto.ltp.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projeto.ltp.projeto.model.Historia;
import projeto.ltp.projeto.repository.HistoriaRepository;


@RestController
public class HistoriaController {
    
    @Autowired
    HistoriaRepository repo;

    @PostMapping("/historia")
    public void adicionaHistoria(
        @RequestBody Historia historia
    ){
        repo.save(historia);
    }

    @GetMapping("/historia")
    public List<Historia> recuperaHistoria(){
        return (List<Historia>)repo.findAll();
    }
}
