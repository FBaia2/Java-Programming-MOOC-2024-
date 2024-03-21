public class Book {
    private String m_title;
    private Integer m_pages;
    private Integer m_year;




    public Book(String title, Integer pages, Integer year) {
        m_title = title;
        m_pages = pages;
        m_year = year;
    }
    
    public String getTitle() {
        return m_title;
    }
    public Integer getPages() {
        return m_pages;
    }
    public Integer getYear() {
        return m_year;
    }




    @Override
    public String toString() {
        return m_title + ", " + m_pages + " pages, " + m_year ;
    }
}
