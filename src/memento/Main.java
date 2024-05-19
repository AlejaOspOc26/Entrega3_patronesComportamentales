package memento;

public class Main {
	public static void main (String[] args) {
		Document document = new Document();
		DocumentHistory history = new DocumentHistory();
		
		document.appendContent("This is the initial content of the document.");
		history.saveVersion(document);
		System.out.println(document.getContent());
		
		document.appendContent(" This is the first edit.");
		history.saveVersion(document);
		System.out.println(document.getContent());
		
		document.appendContent(" This is the second edit.");
		System.out.println(document.getContent());
		
		history.restoreVersion(document);
		System.out.println(document.getContent());
		
		history.restoreVersion(document);
		System.out.println(document.getContent());
		
	}
}
