/**
 * Defined within Plot management package
 */
package PlotManagement;

/**
 * (Package-private) class for representing chapters
 */
class Chapters {

    //Constants for default chapter object
    public static final int INIT_CHAPTER_ID = 1;
    public static final int INIT_CHAPTER_NUMBER = 1;
    public static final String INIT_CHAPTER_TEXT = "<Enter text>";

    /**
     * Chapter attributes (chapter ID, chapter number, chapter text, previous chapter, next chapter)
     */
    private int id;
    private int number;
    private String text;
    private Chapters prev;
    private Chapters next;

    /**
     * Constructs a chapter with default values
     */
    public Chapters() {
        this(INIT_CHAPTER_ID, INIT_CHAPTER_NUMBER, INIT_CHAPTER_TEXT, null, null);
    }

    /**
     * Constructor for a Chapter object
     * @param id    Chapter ID
     * @param number Chapter number
     * @param text  Chapter text
     * @param prev  Previous chapter (may be null)
     * @param next  Next chapter (may be null)
     */
    public Chapters(int id, int number, String text, Chapters prev, Chapters next) {
        this.id = id;
        this.number = number;
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
     * get chapter number
     * @return chapter number
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Set chapter number
     * @param number chapter number
     */
    public void setNumber(int number) {
        this.number = number;
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

    /**
     * Get previous chapter
     * @return Previous chapter
     */
    public Chapters getPrev() {
        return this.prev;
    }

    /**
     * Set previous chapter
     * @param prev Previous chapter
     */
    public void setPrev(Chapters prev) {
        this.prev = prev;
    }

    /**
     * Get next chapter
     * @return Next chapter
     */
    public Chapters getNext() {
        return this.next;
    }

    /**
     * Set next chapter
     * @param next Next chapter
     */
    public void setNext(Chapters next) {
        this.next = next;
    }

    /**
     * Override the hashcode method as two chapters with the same ID are the same chapter
     */
    @Override
    public int hashCode() {
        return this.id;
    }

    /**
     * Override the equals method as two chapters with the same ID are the same chapter
     */
    @Override
    public boolean equals(Object o) {
        return (o instanceof Chapters) ? (Chapters)o == this : false;
    }
}