package tp.rest.ws.restaurant.entities;

import java.io.Serializable;
import java.util.List;

public class Table implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private boolean isAvailable;
	private int num;
	
	
	public Table(int id, boolean isAvailable, int num) {
		this.id = id;
		this.isAvailable = isAvailable;
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	
	

}
