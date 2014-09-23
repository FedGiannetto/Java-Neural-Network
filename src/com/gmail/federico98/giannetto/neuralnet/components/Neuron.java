package com.gmail.federico98.giannetto.neuralnet.components;

import java.util.ArrayList;
import java.util.List;

public class Neuron {
	
	protected int id;
	protected double currentValue;
	protected int layer; // The number of the layer the neuron is in
	protected List<Connection> inConnections = new ArrayList<Connection>(); // The list of incoming connections as a List of Connection objects
	// See #setIncomingConnections() for further information about that list
	
	public Neuron(int id) {
		this.id = id;
	}
	
	public double calculateWeightedSum() {
		return 0;
	}
	
	public Connection createConnection(int toId) {
		return new Connection(this.id, toId);
	}
	
	public List<Connection> getIncomingConnections() {
		return inConnections;
	}

	// This could be removed in future versions, as the class Layer is doing most of the work with the connections
	public void setIncomingConnections(List<Connection> inConnections) {
		this.inConnections = inConnections;
	}
	
	public int getLayer() {
		return layer;
	}

	public int getId() {
		return id;
	}
	

}
