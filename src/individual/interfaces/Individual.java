package individual.interfaces;

public interface Individual {
	
	Individual mate (Individual other);
	double getFitness ();
	
}
