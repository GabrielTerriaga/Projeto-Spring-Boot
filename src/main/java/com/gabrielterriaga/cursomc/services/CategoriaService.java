package com.gabrielterriaga.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielterriaga.cursomc.domain.Categoria;
import com.gabrielterriaga.cursomc.repositories.CategoriaRepository;
import com.gabrielterriaga.cursomc.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	// MUDAR TIPO DE MENSAGEM DE TRATAMENTO APRESENTADO AO USUARIO!!!
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException(("Desculpe, não fui capaz de encontrar essa categoria: " + id + ". Por favor tente novamente ou outra :)")));
	}
}
