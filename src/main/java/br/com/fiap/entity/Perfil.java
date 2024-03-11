package br.com.fiap.entity;

import br.com.fiap.entity.Permissao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="TB_PERFIL")
public class Perfil{

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SQ_PERFIL")
    @SequenceGenerator(name="SQ_PERFIL",sequenceName="SQ_PERFIL",initialValue = 1,allocationSize=1)
    @Column(name="ID_PERFIL")
    private Long id;

    @Column(name="NM_PERFIL")
    private String nome;


    @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TB_PERFIL_PERMISSAO",
            joinColumns = {
                    @JoinColumn(
                            name = "PERFIL",
                            referencedColumnName = "ID_PERFIL",
                            foreignKey = @ForeignKey(name = "FK_PERFIL_PERMISSAO")
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "PERMISSAO",
                            referencedColumnName = "ID_PERMISSAO",
                            foreignKey = @ForeignKey(name = "FK_PERMISSAO_PERFIL")
                    )
            }
    )
    private Set<Perfil> Permissoes = new LinkedHashSet<>();

}

