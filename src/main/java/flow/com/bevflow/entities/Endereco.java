package flow.com.bevflow.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Endereco {
    private String logradouro;
    private String numero;
    private String cidade;
    private String cep;
}
