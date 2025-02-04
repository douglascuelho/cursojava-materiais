package br.com.squad04.consultoria.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.squad04.consultoria.model.Consultores;
import br.com.squad04.consultoria.service.ConsultoresService;

@Controller
@RequestMapping("/consultores")
public class ConsultoresController {
    @Autowired
    private ConsultoresService consultoresService;

    @GetMapping
    public String getAllConsultores(Model model){
        List<Consultores> consultores = consultoresService.getAllConsultores();
        model.addAttribute("consultores", consultores);
        return "consultor/list";
    }

    @GetMapping("/novo")
    public String showForm(Consultores consultor){
        return "consultor/form";
    }

    @PostMapping
    public String saveConsultor(@ModelAttribute Consultores consultor){
        // Atualiza o timestamp de dataCadastro
        consultor.setDataCadastro(new Timestamp(System.currentTimeMillis()));
        consultoresService.saveConsultor(consultor);
        return "redirect:/consultores";
    }

    @GetMapping("/visualizar/{idConsultor}")
    public String viewConsultor(@PathVariable("idConsultor") long idConsultor, Model model){
        Consultores consultor = consultoresService.getConsultorById(idConsultor)
            .orElseThrow(() -> new IllegalArgumentException("ID do Consultor inválida: " + idConsultor));
        model.addAttribute("consultor", consultor);
        return "consultor/view";
    }

    @GetMapping("editar/{idConsultor}")
    public String showUpdateForm(@PathVariable("idConsultor") long idConsultor, Model model){
        Consultores consultor = consultoresService.getConsultorById(idConsultor).orElseThrow(() -> new IllegalArgumentException("ID do Consultor inválida: " + idConsultor));
        model.addAttribute("consultor", consultor);
        return "consultor/form";
    }

    @GetMapping("/deletar/{idConsultor}")
    public String deleteConsultor(@PathVariable("idConsultor") long idConsultor){
        consultoresService.deleteConsultor(idConsultor);
        return "redirect:/consultores";
    }
}
