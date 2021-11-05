package de.ostfalia.se.geo.control;

import de.ostfalia.se.control.AbstractService;
import de.ostfalia.se.geo.entity.Region;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class StateService extends AbstractService<Region,Integer> {

    @PersistenceContext(unitName="localRES")
    EntityManager em;

    @Override
    protected Class<Region> getEntityClass() {
        return Region.class;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    protected TypedQuery<Region> getAllQuery() {
        return em.createNamedQuery("state.getAll", Region.class);
    }
}
