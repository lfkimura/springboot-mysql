package luis.rest;

import java.util.List;

import luis.domain.Rain;
import luis.domain.RainRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rain")
public class RainRest {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@Autowired
	private RainRepository rains;// <<< Repositório de Rains.

	@GetMapping("/{id}")
	public Rain buscar(@PathVariable Long id) {
		return rains.findOne(id);
	}

	@GetMapping("/rains")
	public List<Rain> pesquisar() {
		return rains.findAll();
	}

	@PostMapping
	public Rain salvar(@RequestBody Rain Rain) {
		return rains.save(Rain);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		rains.delete(id);
	}

}
