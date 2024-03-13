package br.com.fiap.springpfauthentication.entity;

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
@Table(name="TB_USUARIO")
        public class Usuario {

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SQ_USUARIO")
        @SequenceGenerator(name="SQ_USUARIO",sequenceName="SQ_USUARIO",allocationSize=1)
        @Column(name="ID_USUARIO")
        private Long id;

        @Column(name="EMAIL")
        private String email;

        @Column(name="SENHA")
        private String senha;

        }
