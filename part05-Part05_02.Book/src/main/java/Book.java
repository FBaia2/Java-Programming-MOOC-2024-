public class Book {
    private String m_author;
    private String m_name;
    private int m_pages;

    public Book(String author, String name, int pages) {
        m_author = author;
        m_name = name;
        m_pages = pages;

    }

    public String getAuthor() {
        return m_author;

    }

    public String getName() {
        return m_name;

    }

    public int getPages() {
        return m_pages;

    }

@Override
    public String toString(){
        return m_author + ", " + m_name + ", " + m_pages + " pages";
    }

}
