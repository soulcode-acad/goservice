package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.UsuarioLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioLogRepository extends MongoRepository<UsuarioLog, String> {
}
