package flow.com.bevflow.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "revendas")
public class Revenda {
    @Id
    private String id;
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String email;
    private List<String> telefones;
    private List<Contato> contatos;
    private List<Endereco> enderecosEntrega;
}
