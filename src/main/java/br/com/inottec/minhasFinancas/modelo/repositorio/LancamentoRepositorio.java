package br.com.inottec.minhasFinancas.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.inottec.minhasFinancas.modelo.Lancamento;

public interface LancamentoRepositorio extends JpaRepository<Lancamento, Long> {

}
