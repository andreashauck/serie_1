package de.ostfalia.se.geo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@NamedQuery(name = "state.getAll", query = "select s from Region s order by s.country.name,s.name")
@Entity
@Getter
@Setter
public class Region {

    @Id
    @GeneratedValue()
    private int id;

    @Column
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Country")
    private Country country;

}
