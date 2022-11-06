package io.github.matirosen.tdas.interfaces;

public interface Checkable {
	
	void checkEmptiness() throws RuntimeException;

	void checkFullness() throws RuntimeException;

}
