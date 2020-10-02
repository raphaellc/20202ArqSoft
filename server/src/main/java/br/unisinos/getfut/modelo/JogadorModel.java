package br.unisinos.getfut.modelo;

import java.time.ZonedDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Jogadores")
public class JogadorModel {
    private Long id;
    private String nome;
    private ZonedDateTime dataNascimento;
    private String email;

    protected JogadorModel() {
    }

    public JogadorModel(String nome, ZonedDateTime dataNascimento, String email) {
        this.nome = Objects.requireNonNull(nome);
        this.dataNascimento = Objects.requireNonNull(dataNascimento);
        this.email = Objects.requireNonNull(email);
    }

    void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    public ZonedDateTime getDataNascimento() {
        return this.dataNascimento;
    }

    void setDataNascimento(ZonedDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return this.email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("nome", nome)
                .add("dataNascimento", dataNascimento)
                .add("email", email)
                .toString();
    }
}
