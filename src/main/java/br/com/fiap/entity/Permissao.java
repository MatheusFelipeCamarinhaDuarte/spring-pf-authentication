package br.com.fiap.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="TB_PERMISSAO")
        public class Permissao {

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SQ_PERMISSAO")
        @SequenceGenerator(name="SQ_PERMISSAO",sequenceName="SQ_PERMISSAO",allocationSize=1)
        @Column(name="ID_PERMISSAO")
        private Long id;

        @Column(name="NM_PERMISSAO")
        private String nome;

        private Sistema sistema;

        }
