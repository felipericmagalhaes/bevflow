package flow.com.bevflow.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {
    private String id;
    private String nome;
}
