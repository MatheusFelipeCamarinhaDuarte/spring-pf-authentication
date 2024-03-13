package br.com.fiap.springpfauthentication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="TB_SISTEMA")
        public class Sistema {

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SQ_SISTEMA")
        @SequenceGenerator(name="SQ_SISTEMA",sequenceName="SQ_SISTEMA",allocationSize=1)
        @Column(name="ID_SISTEMA")
        private Long id;

        @Column(name="NM_SISTEMA")
        private String nome;

        @Column(name="SG_SISTEMA")
        private String sigla;

        @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.MERGE, CascadeType.PERSIST})
        @JoinTable(
                name = "TB_SISTEMA_USUARIO",
                    joinColumns = {
                        @JoinColumn(
                                name = "ID_SISTEMA",
                                referencedColumnName = "ID_SISTEMA",
                                foreignKey = @ForeignKey(name = "FK_SISTEMA_USUARIO")
                        )
                    },
                inverseJoinColumns = {
                    @JoinColumn(
                            name = "ID_USUARIO",
                            referencedColumnName = "ID_USUARIO",
                            foreignKey = @ForeignKey(name = "FK_USUARIO_SISTEMA")
                    )
                }
        )
        private Set<Usuario> responsaveis = new LinkedHashSet<>();

        }
