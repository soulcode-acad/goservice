package com.soulcode.goserviceapp.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "usuarios")
public class UsuarioLog {
    @Id
    private String id;
    private String nome;
    private String email;
}
