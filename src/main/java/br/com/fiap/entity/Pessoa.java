package br.com.fiap.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="TB_PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SQ_PESSOA")
    @SequenceGenerator(name="SQ_PESSOA",sequenceName="SQ_PESSOA",allocationSize=1)
    @Column(name="ID_PESSOA")
    private Long id;

    @Column(name="NM_PESSOA")
    private String nome;

    private LocalDate nascimento;

}
