package org.techforumist.jwt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Contrato;
import org.techforumist.jwt.service.ContratoService;
import org.techforumist.jwt.service.DepartamentoService;
import org.techforumist.jwt.service.EducacaoService;
import org.techforumist.jwt.service.GestorService;
import org.techforumist.jwt.service.PosiccaoService;
import org.techforumist.jwt.service.ProgramaService;
import org.techforumist.jwt.service.SupervisorService;

@RestController
@RequestMapping("contrato")
public class ContratoController {

	@Autowired
	private ContratoService personService;
	@Autowired
	private EducacaoService areaaService;

	@Autowired
	private DepartamentoService departamentoservice;

	@Autowired
	private EducacaoService educacaoService;

	@Autowired
	private GestorService gestorService;

	@Autowired
	private PosiccaoService posiccaoService;

	@Autowired
	private SupervisorService supervisorService;

	@Autowired
	private ProgramaService programaService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public Object index() {
		return personService.findAll();
	}

	@RequestMapping(value = "/areaa", method = RequestMethod.GET)
	@ResponseBody
	public Object areaa() {
		return areaaService.findAll();
	}

	@RequestMapping(value = "/educacao", method = RequestMethod.GET)
	@ResponseBody
	public Object educacao() {
		return educacaoService.findAll();
	}

	@RequestMapping(value = "/departamento", method = RequestMethod.GET)
	@ResponseBody
	public Object departament() {
		return departamentoservice.findAll();
	}

	@RequestMapping(value = "/gestor", method = RequestMethod.GET)
	@ResponseBody
	public Object gestor() {
		return gestorService.findAll();
	}

	@RequestMapping(value = "/supervisor", method = RequestMethod.GET)
	@ResponseBody
	public Object supervisor() {
		return supervisorService.findAll();
	}

	@RequestMapping(value = "/programa", method = RequestMethod.GET)
	@ResponseBody
	public Object programa() {
		return programaService.findAll();
	}

	@RequestMapping(value = "/posiccao", method = RequestMethod.GET)
	@ResponseBody
	public Object posiccao() {
		return posiccaoService.findAll();
	}

	// @RequestMapping(value = "/", method = RequestMethod.POST)
	// public ResponseEntity<?> create(@RequestBody Contrato areaa) {
	// personService.save(areaa);
	// return new ResponseEntity<>(areaa, HttpStatus.OK);
	// }
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Contrato> createUser(@RequestBody Contrato appUser) {

		return new ResponseEntity<Contrato>(personService.save(appUser), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<?> updd(@RequestBody Contrato departamento) {
		personService.save(departamento);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id) {
		personService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
