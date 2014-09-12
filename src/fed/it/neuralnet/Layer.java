package fed.it.neuralnet;

import java.util.ArrayList;
import java.util.List;

import fed.it.neuralnet.components.Neuron;

public class Layer {

	private List<Neuron> neurons = new ArrayList<Neuron>();
	private int layerCount;
	
	public Layer(int neuronsCount, int layerCount) {
		// Creates the neurons for this layer
		for(int i = 0; i < neuronsCount; i++) {
			neurons.add(new Neuron(i));
		}
		
		int idNeuronInNextLayer = 0;
		
		// Creates the connections
		for(Neuron neur : neurons) {
			neur.createConnection(idNeuronInNextLayer);
			idNeuronInNextLayer++;
			// Tecnically this isn't necessary, but we try to support an eventual net with layers with different
			// numbers of neurons
			if(idNeuronInNextLayer == Manager.nextLayerCount(this.layerCount + 1)) {
				break;
			}
		}
	}
	
	public int getNeuronsCount() {
		return neurons.size();
	}
	

}
