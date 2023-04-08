/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio7_toDoItem;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	private ToDoItem pending;
	private ToDoItem inProgress;
	private ToDoItem finished;
	private ToDoItem paused;
	
	@BeforeEach
	void setUp() throws Exception {
		pending = new ToDoItem("tarea1");
		inProgress = new ToDoItem("tarea2");
		finished = new ToDoItem("tarea3");
		paused = new ToDoItem("tarea4");
		inProgress.start();
		finished.start();
		finished.finish();
		paused.start();
		paused.togglePause();
	}
	
    @Test
    public void testStart() {
    	/**
    	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
    	* pending. Si se encuentra en otro estado, no hace nada.
    	*/

    	pending.start();
    	assertTrue(pending.getState() instanceof InProgress);
    	
    	inProgress.start();
    	assertTrue(inProgress.getState() instanceof InProgress);
    	
    	finished.start();
    	assertTrue(finished.getState() instanceof Finished);
    	
    	paused.start();
    	assertTrue(paused.getState() instanceof Paused);
    }
    
    @Test
    public void testTogglePause(){
    	/**Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
    	* estado es paused. Caso contrario (pending o finished) genera un error
    	* informando la causa específica del mismo.
		*/
    	
    	Exception ex = assertThrows(RuntimeException.class, () -> {pending.togglePause();});
    	assertEquals("ERROR: No se puede pausar o despausar una tarea pendiente",ex.getMessage());
    	
    	inProgress.togglePause();
    	assertTrue(inProgress.getState() instanceof Paused);
    	
    	paused.togglePause();
    	assertTrue(paused.getState() instanceof InProgress);
    	
    	Exception ex2 = assertThrows(RuntimeException.class, () -> {finished.togglePause();});
    	assertEquals("ERROR: No se puede pausar o despausar una tarea terminada",ex2.getMessage());
    }
    
    @Test
    public void testFinish() {
    	/**
    	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
    	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
    	*/
    	pending.finish();
    	assertTrue(pending.getState() instanceof Pending);
    	
    	inProgress.finish();
    	assertTrue(inProgress.getState() instanceof Finished);
    	
    	paused.finish();
    	assertTrue(paused.getState() instanceof Finished);
    	
    	finished.finish();
    	assertTrue(finished.getState() instanceof Finished);
    	
    }
    
    @Test
    public void testWorkedTime() {
    	/**
    	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
    	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
    	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
    	* genera un error informando la causa específica del mismo.
    	*/
    	Exception ex = assertThrows(RuntimeException.class, () -> {pending.workedTime();});
    	assertEquals("ERROR: La tarea todavía no se inicio",ex.getMessage());
    	
    	finished.setStart(LocalDateTime.of(2023, 4, 2, 12, 40, 0));
    	finished.setEnd(LocalDateTime.of(2023, 4, 2, 13, 25, 20));
    	assertEquals(2720,finished.workedTime().getSeconds());
    	
    	/*
    	 * Deberian probarse pero no se como porque se hace con LocalDateTime.now()
    	inProgress.setStart(LocalDateTime.of(0, 0, 0, 0, 0));
    	assertEquals();
    	
    	paused.setStart(LocalDateTime.of(0, 0, 0, 0, 0));
    	assertEquals();
    	*/
    }
    
    @Test
    public void testAddComment() {
    	/**
    	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
    	* contrario no hace nada."
    	*/
    	assertEquals(0,pending.getComentarios().size());
    	pending.addComment("Pending Comentario");
    	assertEquals("Pending Comentario",pending.getComentarios().get(0));
    	
    	assertEquals(0,inProgress.getComentarios().size());
    	inProgress.addComment("inProgress Comentario");
    	assertEquals("inProgress Comentario",inProgress.getComentarios().get(0));
    	
    	assertEquals(0,paused.getComentarios().size());
    	paused.addComment("Paused Comentario");
    	assertEquals("Paused Comentario",paused.getComentarios().get(0));
    	
    	assertEquals(0,finished.getComentarios().size());
    	finished.addComment("Finished Comentario");
    	assertEquals(0,finished.getComentarios().size());
    }
}
