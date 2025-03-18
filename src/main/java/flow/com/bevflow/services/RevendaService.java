package flow.com.bevflow.services;

import flow.com.bevflow.dtos.RevendaDto;
import flow.com.bevflow.entities.Revenda;
import flow.com.bevflow.repositories.RevendaRepository;
import flow.com.bevflow.utils.ValidationUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RevendaService {

    private final RevendaRepository revendaRepository;

    public Revenda criar(RevendaDto dto) {
        if (!ValidationUtils.validarCnpj(dto.getCnpj()))
            throw new IllegalArgumentException("CNPJ inválido.");

        if (!ValidationUtils.validarEmail(dto.getEmail()))
            throw new IllegalArgumentException("Email inválido.");

        Revenda revenda = Revenda.builder()
                .cnpj(dto.getCnpj())
                .razaoSocial(dto.getRazaoSocial())
                .nomeFantasia(dto.getNomeFantasia())
                .email(dto.getEmail())
                .telefones(dto.getTelefones())
                .contatos(dto.getContatos())
                .enderecosEntrega(dto.getEnderecosEntrega())
                .build();

        return revendaRepository.save(revenda);
    }
}

