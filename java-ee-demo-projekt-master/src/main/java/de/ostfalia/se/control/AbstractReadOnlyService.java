package de.ostfalia.se.control;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


/**
 * Abstract representation of every service
 *
 * @param <T> Type of managed {@link Entity}
 * @param <I> Type of primary key
 */
public abstract class AbstractReadOnlyService<T, I> {

    protected abstract Class<T> getEntityClass();

    protected abstract EntityManager getEntityManager();

    //read

    /**
     * Finds {@link Entity} managed by the service
     * @param id ID of the {@link Entity}
     * @return instance of the searched {@link Entity} or null
     */
    public T findById(I id) {
        return getEntityManager().find(getEntityClass(), id);
    }


    /**
     * Gets all managed Entities
     *
     * @return List of all managed Entities
     */
    public List<T> getAll() {
        TypedQuery<T> query = getAllQuery();
        return query.getResultList();
    }

    protected abstract TypedQuery<T> getAllQuery();

}
