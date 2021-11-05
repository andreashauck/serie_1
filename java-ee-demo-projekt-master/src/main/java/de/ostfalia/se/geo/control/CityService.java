package de.ostfalia.se.geo.control;

import de.ostfalia.se.control.AbstractService;
import de.ostfalia.se.geo.entity.City;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class CityService extends AbstractService<City, Integer> {

    @PersistenceContext(unitName="localRES")
    EntityManager em;

    @Override
    protected Class<City> getEntityClass() {
        return City.class;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    protected TypedQuery<City> getAllQuery() {
        return em.createNamedQuery("city.getAll", City.class);
    }
}
