package com.example.testwassefchargui.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Table(name = "Menu")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMenu;

    @Column(name = "libelleMenu")
    private String libelleMenu;

    @Column(name = "prixTotal")
    private float prixTotal;

    @Enumerated(EnumType.STRING)
    TypeMenu typeMenu;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "menu")
    private List<Composant> composants;

    @ManyToMany(mappedBy = "menus", cascade = CascadeType.ALL)
    private List<Client> clients;
}
