package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.AgendamentoLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendamentoLogRepository extends MongoRepository<AgendamentoLog, String> {
}