package ar.edu.unlp.info.oo2.ejercicio13_baseDeDatos;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	
	private DatabaseAccess database;
    private boolean authenticated;

	public DatabaseProxy(DatabaseAccess database) {
		this.database = database;
		this.authenticated = false; //Por defecto los boolean se inicializan en false
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (! this.checkAccess()) {
			throw new RuntimeException("Access denied");
		}
		return this.database.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (! this.checkAccess()) {
			throw new RuntimeException("Access denied");
		}
		return this.database.insertNewRow(rowData);
	}
	
	public boolean checkAccess() {
		return this.authenticated;
	}
	
	public void authenticate() {
		this.authenticated = true;
	}
	
	public void logout() {
		this.authenticated  = false;
	}

}
