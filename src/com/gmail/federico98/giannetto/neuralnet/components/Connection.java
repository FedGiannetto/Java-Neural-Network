package com.gmail.federico98.giannetto.neuralnet.components;

public class Connection {
	
	private double value;
	private double weigth;
	private int fromId;
	private int toId;
	
	public Connection(int fromId, int toId) {
		this.fromId = fromId;
		this.toId = toId;
	}
	
	// Getters and setters
	public double getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public double getWeigth() {
		return weigth;
	}
	
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	public int getFromId() {
		return fromId;
	}

	public int getToId() {
		return toId;
	}

}
