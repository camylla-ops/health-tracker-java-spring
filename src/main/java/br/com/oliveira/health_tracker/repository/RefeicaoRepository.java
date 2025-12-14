package br.com.oliveira.health_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oliveira.health_tracker.entity.Refeicao;

public interface RefeicaoRepository extends JpaRepository<Refeicao, Long> {
    
}