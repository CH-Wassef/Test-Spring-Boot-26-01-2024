package com.example.testwassefchargui.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Composant")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "nomBlock")
    private long idComposant;

    @Column(name = "nomComposant")
    private String nomComposant;

    @Column(name = "prix")
    private float prix;
    @ManyToOne
    Menu menu;
}
