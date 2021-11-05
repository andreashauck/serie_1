package de.ostfalia.se.bigmacindex.control;

import de.ostfalia.se.bigmacindex.entity.BigMacIndex;
import de.ostfalia.se.bigmacindex.entity.BigMacIndexId;
import de.ostfalia.se.control.AbstractService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class BigMacService extends AbstractService<BigMacIndex, BigMacIndexId> {

    @PersistenceContext(unitName = "localRES")
    EntityManager em;


    @Override
    protected Class<BigMacIndex> getEntityClass() {
        return BigMacIndex.class;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected TypedQuery<BigMacIndex> getAllQuery() {
        return em.createNamedQuery("bmi.getAll", BigMacIndex.class);
    }

    public List<String> getCountrys() {
        TypedQuery<String> query = em.createNamedQuery("bmi.getCountrys", String.class);
        return query.getResultList();
    }

    public List<BigMacIndex> getCountryValues(String country) {
        TypedQuery<BigMacIndex> query = em.createNamedQuery("bmi.country.values", BigMacIndex.class);
        query.setParameter("country_iso", country);
        return query.getResultList();
    }


}
