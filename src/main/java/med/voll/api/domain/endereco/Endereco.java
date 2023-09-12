package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = getLogradouro();
        }
        if (dados.bairro() != null) {
            this.bairro = getBairro();
        }
        if (dados.cep() != null) {
            this.cep = getCep();
        }
        if (dados.uf() != null) {
            this.uf = getUf();
        }
        if (dados.cidade() != null) {
            this.cidade = getCidade();
        }
        if (dados.numero() != null) {
            this.numero = getNumero();
        }
        if (dados.complemento() != null) {
            this.complemento = getComplemento();
        }
    }
}
