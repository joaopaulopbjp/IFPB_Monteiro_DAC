package br.edu.ifpb.dac.livraria.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWord {

	private String input;
	private String output;
	
	public void submit() {
		output = "Hello Word. Vc digitou: "+input;
	}
	
	public HelloWord() {
		
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}


	public void setOutput(String output) {
		this.output = output;
	}

}
