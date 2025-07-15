package Principal;



import java.text.ParseException;


import Assistente.Comment_Q;
import Assistente.Post_Q;

public class Instagram_Q {
    public static void main(String[] args) throws ParseException {
        
       

        Comment_Q c1 = new Comment_Q("Have a nice trip!");
        Comment_Q c2 = new Comment_Q("Wow that's awesome!");

        Post_Q p1 = new Post_Q(
        
         "Traveling to New Zealand",
          "I'm going to visit this wonderful country!", 
          12);

          p1.addComment(c1);
          p1.addComment(c2);

          System.out.println(p1);
        
        
         

        
        
    }
}
