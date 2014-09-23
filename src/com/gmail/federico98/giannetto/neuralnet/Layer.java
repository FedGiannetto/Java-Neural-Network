package com.gmail.federico98.giannetto.neuralnet;

import java.util.ArrayList;
import java.util.List;

import com.gmail.federico98.giannetto.neuralnet.components.Neuron;


public class Layer {

	private List<Neuron> neurons = new ArrayList<Neuron>();
	private int layerCount;
	
	public Layer(int neuronsCount, int layerCount) {
		// Creates the neurons for this layer
		for(int i = 0; i < neuronsCount; i++) {
			neurons.add(new Neuron(i));
		}
		
		int idNeuronInNextLayer = 0;
		
	}
	
	public void createConnections(int id) {
		// Creates the connections
				for(Neuron neur : neurons) {
					// neur.createConnection(idNeuronInNextLayer);
					// idNeuronInNextLayer++;
					
					Manager.nextLayerCount(this.layerCount + 1);
				}
	}
	
	public int getNeuronsCount() {
		return neurons.size();
	}
	

}
