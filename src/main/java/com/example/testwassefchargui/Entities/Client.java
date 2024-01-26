package com.example.testwassefchargui.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Client")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idClient")
    private long idClient;

    @Column(name = "identifiant")
    private  String identifiant;

    private LocalDate datePremiereVisite;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Menu> menus;
}
