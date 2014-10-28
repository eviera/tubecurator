package net.eviera.tubecurator;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.eviera.tubecurator.entity.TubeEntry;
import net.eviera.tubecurator.manager.TubeEntryManagerBean;

@Path("/tube")
public class TubeRest {

	@EJB
	private TubeEntryManagerBean tubeEntryManager;

	@GET
	@Path("/all")
	@Produces("application/json")
	public List<TubeEntry> getAll() {
		List<TubeEntry> result = tubeEntryManager.getAll();
		return result;
	}

}
