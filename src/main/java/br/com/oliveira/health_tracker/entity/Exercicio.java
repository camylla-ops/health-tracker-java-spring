package br.com.oliveira.health_tracker.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data 
@NoArgsConstructor
@AllArgsConstructor 
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String nome;
    private Integer series;
    private Integer repeticoes;
    private Double carga;
    private Integer tempo; 
}