package flow.com.bevflow.dtos;

import flow.com.bevflow.entities.Cliente;
import flow.com.bevflow.entities.ItemPedido;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PedidoRevendaDto {
    private Cliente cliente;
    private List<ItemPedido> itens;
}
