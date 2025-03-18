package flow.com.bevflow.controllers;

import flow.com.bevflow.dtos.RevendaDto;
import flow.com.bevflow.entities.Revenda;
import flow.com.bevflow.services.RevendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/revendas")
@RequiredArgsConstructor
public class RevendaController {

    private final RevendaService revendaService;

    @PostMapping
    public ResponseEntity<Revenda> criarRevenda(@RequestBody RevendaDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(revendaService.criar(dto));
    }
}
