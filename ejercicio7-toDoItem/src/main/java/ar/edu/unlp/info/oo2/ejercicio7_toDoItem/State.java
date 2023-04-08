package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import java.time.Duration;

public abstract class State {
	
	
	public void start(ToDoItem context) {
		
	}
	public abstract void togglePaused(ToDoItem context);
	public abstract void finish(ToDoItem context);
	public abstract Duration workedTime(ToDoItem context);
	
	public void addComment(ToDoItem context, String comment) {
		context.getComentarios().add(comment);
	}

}
