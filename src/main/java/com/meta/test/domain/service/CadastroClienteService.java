package com.meta.test.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.test.domain.exception.NegocioException;
import com.meta.test.domain.model.Cliente;
import com.meta.test.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente salvarCliente(Cliente cliente) {

		Cliente vendedorExistente = clienteRepository.findByCpf(cliente.getCpf());
		if (vendedorExistente != null && !vendedorExistente.equals(cliente)) {
			throw new NegocioException("Já Existe um cliente com este CPF!");
		}
		return clienteRepository.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}

}
