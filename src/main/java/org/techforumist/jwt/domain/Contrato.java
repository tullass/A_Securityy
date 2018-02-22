package org.techforumist.jwt.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Contrato implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 122851118996647291L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String apelido;
	private String datainicio;
	private String datafim;
	private String experiencia;
	private String datanascimento;
	private String intervalo;
	private String genero;
	private String civil;
	private String salariobase;
	private String salarioactual;
	private String email;
	private String telefone1;
	private String telefone2;
	private String inss;
	private String nib;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Departamento departamento;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Areaa areaa;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Educacao educacao;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Gestor gestor;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Posiccao posiccao;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Programa programa;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Supervisor supervisor;

	@ManyToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	@ManyToOne(cascade = CascadeType.ALL)
	private Contactos contrato;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private AppUser appUser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}

	public String getDatafim() {
		return datafim;
	}

	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(String intervalo) {
		this.intervalo = intervalo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCivil() {
		return civil;
	}

	public void setCivil(String civil) {
		this.civil = civil;
	}

	public String getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(String salariobase) {
		this.salariobase = salariobase;
	}

	public String getSalarioactual() {
		return salarioactual;
	}

	public void setSalarioactual(String salarioactual) {
		this.salarioactual = salarioactual;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getInss() {
		return inss;
	}

	public void setInss(String inss) {
		this.inss = inss;
	}

	public String getNib() {
		return nib;
	}

	public void setNib(String nib) {
		this.nib = nib;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Areaa getAreaa() {
		return areaa;
	}

	public void setAreaa(Areaa areaa) {
		this.areaa = areaa;
	}

	public Educacao getEducacao() {
		return educacao;
	}

	public void setEducacao(Educacao educacao) {
		this.educacao = educacao;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Posiccao getPosiccao() {
		return posiccao;
	}

	public void setPosiccao(Posiccao posiccao) {
		this.posiccao = posiccao;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contactos getContrato() {
		return contrato;
	}

	public void setContrato(Contactos contrato) {
		this.contrato = contrato;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}
}
