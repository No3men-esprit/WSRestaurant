package tp.rest.ws.restaurant.webRessources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tp.rest.ws.restaurant.entities.Client;
import tp.rest.ws.restaurant.entities.Reservation;
import tp.rest.ws.restaurant.entities.Table;

@Path("restaurant")
public class RestaurantWs {

	public static List<Client> clientListe = new ArrayList();
	public static List<Table> tableListe = new ArrayList();
	public static List<Table> reservationListe = new ArrayList();

	public RestaurantWs() {
		Table table = new Table(1, false, 1);
		Table table1 = new Table(2, true, 2);

		Table table2 = new Table(3, true, 3);

		Table table3 = new Table(4, false, 4);

		tableListe.add(table);
		tableListe.add(table1);
		tableListe.add(table2);
		tableListe.add(table3);
	}

	@Path("addClient")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	// @Produces(MediaType.APPLICATION_JSON)
	public String addClient(Client cla) {
		clientListe.add(cla);

		return "client " + cla.getNom();
	}

	@Path("clients")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> returnClient() {
		// clientListe.add(client);

		return clientListe;
	}

	@Path("tables")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Table> returnTables() {
		// clientListe.add(client);

		return tableListe;
	}

	@Path("addReservation/{idClient}/{idTable}/{/date}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	// @Produces(MediaType.APPLICATION_JSON)
	public String addReservation(@PathParam(value = "idClient") int idClient, @PathParam(value = "idTable") int idTable,
			String dateReservation) {

		Reservation res = new Reservation();

		return "client " + cla.getNom();
	}

	public boolean existClient(int clientId) {
		for (Client cla : clientListe) {
			if (cla.getId() == clientId)
				return true;
		}
		return false;
	}

	public Client findClient(int id) {
		for (Client cli : clientListe) {

			if (cli.getId() == id) {

				return cli;
			}

		}
		return null;
	}
	
	public Table findTable(int id) {
		for (Table tab : tableListe) {

			if (tab.getId() == id) {

				return tab;
			}

		}
		return null;
	}

	public boolean existTable(int tableId) {
		for (Table tla : tableListe) {
			if (tla.getId() == tableId)
				return true;
		}
		return false;
	}

}
