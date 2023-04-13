package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State{


	@Override
	public void start(ToDoItem context) {
		context.setState(new InProgress());
		context.setStart(LocalDateTime.now());
	}

	@Override
	public void togglePaused(ToDoItem context) {
		throw new RuntimeException("ERROR: No se puede pausar o despausar una tarea pendiente");
	}

	@Override
	public void finish(ToDoItem context) {
		
	}

	@Override
	public Duration workedTime(ToDoItem context) {
		throw new RuntimeException("ERROR: La tarea todavía no se inicio");
	}

}
