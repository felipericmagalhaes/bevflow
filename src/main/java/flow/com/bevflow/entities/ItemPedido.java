package flow.com.bevflow.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemPedido {
    private String produtoId;
    private int quantidade;
}
