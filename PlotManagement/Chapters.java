/**
 * Defined within Plot management package
 */
package PlotManagement;

/**
 * (Package-private) class for representing chapters
 */
class Chapters {

    public static final int INIT_CHAPTER_ID = 1;
    public static final String INIT_CHAPTER_TEXT = "<Enter text>";

    /**
     * Chapter attributes (chapter ID, chapter text, previous chapter, next chapter)
     */
    private int id;
    private String text;
    private Chapters prev;
    private Chapters next;

    public Chapters() {
        this(INIT_CHAPTER_ID, INIT_CHAPTER_TEXT, null, null);
    }

    /**
     * Constructor for a Chapter object
     * @param id    Chapter ID
     * @param text      Chapter text
     */
    public Chapters(int id, String text, Chapters prev, Chapters next) {
        this.id = id;
        this.text = text;
        this.prev = prev;
        this.next = next;
    }

    /**
     * Get chapter ID
     * @return  Chapter ID
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set chapter id
     * @param id    New chapter ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get chapter text
     * @return  Chapter text
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set chapter text
     * @param text  New chapter text
     */
    public void setText(String text) {
        this.text = text;
    }

    public Chapters getPrev() {
        return this.prev;
    }

    public void setPrev(Chapters prev) {
        this.prev = prev;
    }

    public Chapters getNext() {
        return this.next;
    }

    public void setNext(Chapters next) {
        this.next = next;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Chapters) ? (Chapters)o == this : false;
    }
}