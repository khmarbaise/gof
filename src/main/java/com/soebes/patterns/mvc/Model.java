package com.soebes.patterns.mvc;

public class Model {

	private ModelState currentState;

	public enum ModelState {
		FirstState,
		SecondState,
		ThirdState
	}

	public Model() {
		currentState = ModelState.FirstState;
	}
	
	public void changeState() {
		//currentState.ordinal();
	}
}
