package de.ostfalia.se.control;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


/**
 * Abstract representation of every service
 *
 * @param <T> Type of managed {@link javax.persistence.Entity}
 * @param <I> Type of primary key
 */
public abstract class AbstractService<T, I> {

    protected abstract Class<T> getEntityClass();

    protected abstract EntityManager getEntityManager();

    //create

    /**
     * Inserts a {@link javax.persistence.Entity} to the service
     * @param entity
     */
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    //read

    /**
     * Finds {@link javax.persistence.Entity} managed by the service
     * @param id ID of the {@link javax.persistence.Entity}
     * @return instance of the searched {@link javax.persistence.Entity} or null
     */
    public T findById(I id) {
        return getEntityManager().find(getEntityClass(), id);
    }

    //update

    /**
     * Updates the value of a given {@link javax.persistence.Entity}
     * @param entity Entity to update
     * @return instance of the changed Entity
     */
    public T update(T entity) {
        return getEntityManager().merge(entity);
    }

    //delete

    /**
     * Removes the given {@link javax.persistence.Entity}
     * @param entity to remove
     */
    public void remove(T entity) {
        entity = getEntityManager().merge(entity);
        getEntityManager().remove(entity);
    }

    /**
     * Gets all managed Payments
     *
     * @return List of all managed Payments
     */
    public List<T> getAll() {
        TypedQuery<T> query = getAllQuery();
        return query.getResultList();
    }

    protected abstract TypedQuery<T> getAllQuery();

}
