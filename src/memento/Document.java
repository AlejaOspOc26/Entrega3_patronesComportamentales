package memento;

public class Document {
	private String content = "";
	
    public void appendContent(String content) {
        this.content += content;
    }

    public String getContent() {
        return content;
    }

    public DocumentMemento saveToDocument() {
        return new DocumentMemento(content);
    }

    public void restoreFromMemento(Object memento) {
        content = ((DocumentMemento)memento).getContent();
    }
    
    private class DocumentMemento {
        String content;

        private String getContent() {
            return this.content;
        }
        
        private DocumentMemento(String content) {
            this.content = content;
        }
    }

}
