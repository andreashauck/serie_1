package de.ostfalia.se.geo.control;

import de.ostfalia.se.control.AbstractService;
import de.ostfalia.se.geo.entity.Country;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class CountryService extends AbstractService<Country,Integer> {


    static{
        System.out.println("static.CountryService");
    }

    @PersistenceContext(unitName="localRES")
    EntityManager em;

    @Override
    protected Class<Country> getEntityClass() {
        return Country.class;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em ;
    }


    protected TypedQuery<Country> getAllQuery() {
        return em.createNamedQuery("country.getAll", Country.class);
    }
}
