package fed.it.neuralnet;

import java.util.ArrayList;
import java.util.List;

import fed.it.neuralnet.components.HiddenNeuron;
import fed.it.neuralnet.components.InputNeuron;
import fed.it.neuralnet.components.OutputNeuron;

public class Manager {
	
	// Current layer
	private int layerCounter;
	// Layers 
	List<InputNeuron> input = new ArrayList<InputNeuron>();
	List<HiddenNeuron> hidden = new ArrayList<HiddenNeuron>();
	List<OutputNeuron> output = new ArrayList<OutputNeuron>();
	
	// Constructor - List of input neurons and List of hidden neurons
	
	public Manager(List<Double> values) { // Possible OutpuNeurons ?
		this.layerCounter = 0;
		this.sendValue(input, values);
	}
	
	// Send values
	public void sendValue(List<InputNeuron> inputNeurons, List<Double> inValues) {
		for(InputNeuron inputNeur : inputNeurons) {
			
		}
	}
	
	public void sendHiddenValues(List<HiddenNeuron> hiddenNeurons, List<Double> inValues) {
		
	}

}
