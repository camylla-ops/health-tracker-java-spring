package br.com.oliveira.health_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oliveira.health_tracker.entity.Exercicio;


public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
  
}