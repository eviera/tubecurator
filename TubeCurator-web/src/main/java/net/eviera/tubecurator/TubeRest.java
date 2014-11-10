package net.eviera.tubecurator;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.eviera.tubecurator.entity.TubeEntry;
import net.eviera.tubecurator.manager.TubeEntryManagerBean;

@Path("/tubeentries")
public class TubeRest {

	@EJB
	private TubeEntryManagerBean tubeEntryManager;

	@GET
	@Produces("application/json")
	public List<TubeEntry> getAll() {
		List<TubeEntry> result = tubeEntryManager.getAll();
		return result;
	}

	@GET
	@Path("{id}")
	@Produces("application/json")
	public TubeEntry getById(@PathParam("id") Long id) {
		TubeEntry result = tubeEntryManager.getById(id);
		return result;
	}
}
