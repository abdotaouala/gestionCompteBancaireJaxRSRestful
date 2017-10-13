package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path("/banque")
public class BanquerestService {
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "test";
	}
	@GET
	@Path("/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)
	public double conversion(@PathParam(value="montant") double mt) {
		return mt*11;
	}
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> list() {
		List<String> res=new ArrayList<String>();
		res.add("A");res.add("C");res.add("B");
		return res;
	}
	@GET
	@Path("/compte")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte getCompte(@QueryParam(value="code") int code) {
		Compte c=new Compte(code,9000,new Date() );
		return c;
	}
	@GET
	@Path("/listComptes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Compte> listComptes() {
		List<Compte> cptes=new ArrayList<Compte>();
		cptes.add(new Compte(1,9000,new Date() ));
		cptes.add(new Compte(2,9000,new Date() ));
		cptes.add(new Compte(3,9000,new Date() ));
		return cptes;

	}
	
}
