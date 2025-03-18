package flow.com.bevflow.controllers;

import flow.com.bevflow.dtos.PedidoRevendaDto;
import flow.com.bevflow.entities.PedidoRevenda;
import flow.com.bevflow.services.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/revendas/{revendaId}/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoRevenda> criarPedido(@PathVariable String revendaId,
                                                     @RequestBody PedidoRevendaDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(pedidoService.criarPedido(revendaId, dto));
    }
}
