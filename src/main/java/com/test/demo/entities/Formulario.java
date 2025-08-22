package com.test.demo.entities;



import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "forms")
public class Formulario {
    @Id
    public UUID id = UUID.randomUUID();

    @Column(name = "response_id", length = 512)
    public String responseID = "";
}
