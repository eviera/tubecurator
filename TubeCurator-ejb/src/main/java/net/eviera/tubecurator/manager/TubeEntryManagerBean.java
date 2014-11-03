package net.eviera.tubecurator.manager;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.eviera.tubecurator.entity.TubeEntry;

@Stateless
public class TubeEntryManagerBean {

    @PersistenceContext
    private EntityManager em;

    public TubeEntryManagerBean() {
    	
	}
    
    public List<TubeEntry> getAll() {
    	Query query = em.createQuery("from TubeEntry order by id desc");
    	@SuppressWarnings("unchecked")
		List<TubeEntry> result = query.getResultList();
    	if (result == null) {
    		result = new ArrayList<TubeEntry>();
    	}
    	return result;
    }
    
}
