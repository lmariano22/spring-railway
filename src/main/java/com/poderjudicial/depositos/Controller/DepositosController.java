package com.poderjudicial.depositos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poderjudicial.depositos.Modelo.Deposito;
import com.poderjudicial.depositosInterfaceService.DepositoServicio;
import org.springframework.ui.Model;

@Controller
public class DepositosController {
	
	@Autowired
    private DepositoServicio depositoServicio;
	
	
	@GetMapping("/index")
	public String buscarDemandantfe() {
	
	    return "index";
	}
	
	@GetMapping("/home")
	public String buscarDefmandantfe() {
	
	    return "home";
	}
	
	
	@PostMapping("/index")
	public String buscarDemandante(@RequestParam("x_demandante") String x_demandante, Model model) {
	
		
	    model.addAttribute("resultados", depositoServicio.listardepositosuu(x_demandante));
	    return "index";
	}


}
