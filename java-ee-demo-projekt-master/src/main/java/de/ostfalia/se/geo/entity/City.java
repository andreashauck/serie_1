package de.ostfalia.se.geo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@NamedQuery(name = "city.getAll", query = "select c from City c order by c.region.country.name, c.region.name,c.name")

@Entity
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue()
    private int id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name="Region")
    private Region region;

}
