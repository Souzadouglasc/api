package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosAtualizacaoPaciente(
        @NotNull long id,
        String nome,
        String email,
        String telefone,
        DadosEndereco endereco
) {
}
