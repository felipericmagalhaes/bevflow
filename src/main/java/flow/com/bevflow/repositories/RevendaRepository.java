package flow.com.bevflow.repositories;

import flow.com.bevflow.entities.Revenda;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RevendaRepository extends MongoRepository<Revenda, String> {
    Optional<Revenda> findByCnpj(String cnpj);
}
