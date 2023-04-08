package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;

public class Finished extends State{

	@Override
	public void togglePaused(ToDoItem context) {
		throw new RuntimeException("ERROR: No se puede pausar o despausar una tarea terminada");
	}

	@Override
	public void finish(ToDoItem context) {
		
	}

	@Override
	public Duration workedTime(ToDoItem context) {
		return Duration.between(context.getStart(), context.getEnd());
	}

	@Override
	public void addComment(ToDoItem context,String comment) {

	}

}
