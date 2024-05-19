package memento;
import java.util.Stack;

public class DocumentHistory {
	 Stack <Object> history;
	 
	 public DocumentHistory() {
		 history = new Stack<>();
	 }
	 
	 public void saveVersion(Document document) {
		 history.push(document.saveToDocument());
	 }
	 
	 public void restoreVersion(Document document) {
		 Object version = history.pop();
		 document.restoreFromMemento(version);
	 }
}
