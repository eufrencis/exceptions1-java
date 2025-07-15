package Assistente;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post_Q {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date moment;
    private String title ;
    private String content ;
    private Integer likes = 12;

    private List <Comment_Q> comments = new ArrayList<>();

   

    public Post_Q( String title, String content, Integer likes) {
        this.moment = new Date();
        this.title = title;
        this.content = content;
        this.likes = likes;
        
    }

    public Post_Q (){}

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

     public List<Comment_Q> getComment() {
        return comments;
    }

    public void addComment(Comment_Q comment){
        comments.add(comment);
    }
        public void removeComment(Comment_Q comment){
        comments.remove(comment);

        
    }
   
    public String toString(){
        StringBuilder sd = new StringBuilder();
        sd.append(title + "\n");
        sd.append(likes);
        sd.append(" Likes - ");
        sd.append(sdf.format(moment) + "\n");
        sd.append(content + "\n");
        sd.append("comments \n");
        for (Comment_Q c : comments){
            sd.append(c.getText() + "\n");

        }
        return sd.toString();
        }
    

}
