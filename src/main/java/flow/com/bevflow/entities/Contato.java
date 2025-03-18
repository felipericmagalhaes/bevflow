package flow.com.bevflow.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contato {
    private String nome;
    private boolean principal;
}