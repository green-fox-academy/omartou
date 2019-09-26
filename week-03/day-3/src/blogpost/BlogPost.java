package blogpost;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {

        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;

    }
    public void printIt(){
        System.out.println(authorName);
        System.out.println(title);
        System.out.println(text);
        System.out.println(publicationDate);
    }
}
