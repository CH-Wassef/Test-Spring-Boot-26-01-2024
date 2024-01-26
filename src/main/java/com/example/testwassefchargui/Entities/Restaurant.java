package com.example.testwassefchargui.Entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "Restaurant")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRestaurant;

    @Column(name = "nom")
    private String nom;

    @Column(name = "nomBlock")
    private long nbPlacesMax;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Menu> menus;
}
