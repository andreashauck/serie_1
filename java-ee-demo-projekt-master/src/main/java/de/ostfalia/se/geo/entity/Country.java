package de.ostfalia.se.geo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@NamedQuery(name = "country.getAll", query = "select c from Country c order by c.name")



@Entity
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue()
    private int id;

    @Column
    private String name;






}
