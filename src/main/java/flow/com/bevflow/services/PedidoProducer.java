package flow.com.bevflow.services;

import flow.com.bevflow.entities.PedidoRevenda;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoProducer {

    private final RabbitTemplate rabbitTemplate;

    public void enviarPedido(PedidoRevenda pedido) {
        rabbitTemplate.convertAndSend("bevflow.exchange", "bevflow.routingkey.pedido", pedido);
    }
}
