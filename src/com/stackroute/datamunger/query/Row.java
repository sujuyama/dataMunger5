package com.stackroute.datamunger.query;

import java.util.HashMap;
import java.util.Map;

//Contains the row object as ColumnName/Value. Hence, HashMap is being used
public class Row extends HashMap<String, String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Map<String,String> row ;
	
	public Row() {
	
	}

	public Row(Map<String,String> row){
		this.row=row;
	}
	
	public Map<String, String> getRow() {
		return row;
	}

	public void setRow(Map<String, String> row) {
		this.row = row;
	}
	
	
}
