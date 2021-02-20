package tp.rest.ws.restaurant.entities;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {

	private int id;
	private Date dateRes;
	private String ref;
	private Client client;
	private Table table;
	public Reservation(int id, Date dateRes, String ref, Client client, Table table) {
		super();
		this.id = id;
		this.dateRes = dateRes;
		this.ref = ref;
		this.client = client;
		this.table = table;
	}
	
	
	public Reservation() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateRes() {
		return dateRes;
	}
	public void setDateRes(Date dateRes) {
		this.dateRes = dateRes;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	
	
}
