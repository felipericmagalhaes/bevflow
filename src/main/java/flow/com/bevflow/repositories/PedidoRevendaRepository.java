package flow.com.bevflow.repositories;

import flow.com.bevflow.entities.PedidoRevenda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRevendaRepository extends MongoRepository<PedidoRevenda, String> {}

