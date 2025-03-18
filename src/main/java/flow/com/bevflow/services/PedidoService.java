package flow.com.bevflow.services;

import flow.com.bevflow.dtos.PedidoRevendaDto;
import flow.com.bevflow.entities.PedidoRevenda;
import flow.com.bevflow.repositories.PedidoRevendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRevendaRepository pedidoRepo;
    private final PedidoProducer pedidoProducer;

    public PedidoRevenda criarPedido(String revendaId, PedidoRevendaDto dto) {
        if (dto.getItens() == null || dto.getItens().isEmpty())
            throw new IllegalArgumentException("Pedido deve conter pelo menos um item.");

        PedidoRevenda pedido = PedidoRevenda.builder()
                .revendaId(revendaId)
                .cliente(dto.getCliente())
                .itens(dto.getItens())
                .criadoEm(LocalDateTime.now())
                .build();

        PedidoRevenda pedidoSalvo = pedidoRepo.save(pedido);
        pedidoProducer.enviarPedido(pedidoSalvo);

        return pedidoSalvo;
    }
}
