package fed.it.neuralnet;

import java.util.ArrayList;
import java.util.List;

import fed.it.neuralnet.components.Neuron;

public class Manager {
	
	// Current layer
	private static int layerCounter;
	private static int inputNeurons;
	private static int outputNeurons;
	private static List<Layer> layers = new ArrayList<Layer>();
	
	// Constructor
	/**
	 * @param layerscount - The amount of layers
	 * @param neuronsPerLayer - The neurons for each layer
	 * @param outputNeuronsCount - The number of output neurons *COULD CHANGE*
	 * @param inputNeuronsCount - The number of input neurons *COULD CHANGE*
	 */
	public static void createNetwork(int layerscount, int neuronsPerLayer, int outputNeuronsCount, int inputNeuronsCount) { // Possible OutpuNeurons ?
		layerCounter = 0;					// This could disappear
		inputNeurons = inputNeuronsCount;	//   "    "       "
		outputNeurons = outputNeuronsCount;
		// Creates the layers
		for(int i = 0; i < layerscount; i++) {
			layers.add(new Layer(neuronsPerLayer, i));
		}
	}
	
	
	// Send values
	public static void sendValue(List<Neuron> inputNeurons, List<Double> inValues) {
		for(Layer layer : layers) {
			
		}
	}
	
	/**
	 * @param layerId
	 * @return Int - the count of neurons in the next layer
	 */
	public static int nextLayerCount(int layerId) {
		int nextLayerId = layerId + 1;
		Layer nextLayer = getLayerById(nextLayerId);
		int neuronsCount = nextLayer.getNeuronsCount();
		return neuronsCount;
	}
	
	/**
	 * @param id
	 * @return Layer - the layer corresponding the given id
	 */
	private static Layer getLayerById(int id) {
		Layer layer = layers.get(id);
		return layer;
	}
	

}
