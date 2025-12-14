package br.com.oliveira.health_tracker.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Refeicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String nome;
    private String tipo; // Café da Manhã, Almoço, Jantar
    private Double quantidade; //  em Gramas, ML, ou porções
}