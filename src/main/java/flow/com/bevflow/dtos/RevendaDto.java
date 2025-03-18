package flow.com.bevflow.dtos;

import flow.com.bevflow.entities.Contato;
import flow.com.bevflow.entities.Endereco;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RevendaDto {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String email;
    private List<String> telefones;
    private List<Contato> contatos;
    private List<Endereco> enderecosEntrega;
}
