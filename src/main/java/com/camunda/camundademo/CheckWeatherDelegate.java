package com.camunda.camundademo;

import java.util.Random;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckWeatherDelegate implements JavaDelegate {

	private final Logger LOGGER = Logger.getLogger(CheckWeatherDelegate.class.getName());
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		execution.setVariable("Name", "WeatherReport");
		execution.setVariable("weatherOK", rand.nextBoolean());
		
		LOGGER.info("\n\n  ... CheckWeatherDelegate invoked by "
	            + "activtyName='" + execution.getCurrentActivityName() + "'"
	            + ", activtyId=" + execution.getCurrentActivityId()
	            + ", processDefinitionId=" + execution.getProcessDefinitionId()
	            + ", processInstanceId=" + execution.getProcessInstanceId()
	            + ", businessKey=" + execution.getProcessBusinessKey()
	            + ", executionId=" + execution.getId()
	            + ", variables=" + execution.getVariables()
	            + " \n\n");
	}

}
