package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State{



	@Override
	public void togglePaused(ToDoItem context) {
		context.setState(new InProgress());
		
	}


	@Override
	public Duration workedTime(ToDoItem context) {
		return Duration.between(context.getStart(),LocalDateTime.now());
	}


}
