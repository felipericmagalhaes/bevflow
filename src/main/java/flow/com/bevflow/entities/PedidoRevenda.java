package flow.com.bevflow.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Document(collection = "pedidos_revenda")
public class PedidoRevenda {
    @Id
    private String id;
    private String revendaId;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private LocalDateTime criadoEm;
}
