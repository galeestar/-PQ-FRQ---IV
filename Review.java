import java.util.ArrayList;
import java.util.Scanner;

class Review {
    private String comment;
    
    public Review(String comment) {
        this.comment = comment;
    }
    
    public String getComment() {
        return comment;
    }
}

public class CollectComments {
    
    public ArrayList<String> collectComments(ArrayList<Review> allReviews) {
        ArrayList<String> comments = new ArrayList<>();
        
        for (int i = 0; i < allReviews.size(); i++) {
            String comment = allReviews.get(i).getComment();
            
            if (comment.contains("!")) {
                String formattedComment String.format("%d-%s", i, comment);
                
                if (!comment.endsWith("!") && !comment.endsWith(".")) {
                    formattedComment += ".";
                }
                
                comments.add(formattedComment);
            }
        }
        
        return comments;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            CollectComments obj = new CollectComments();
            
            System.out.print("Enter the number of reviews: ");
            int n = sc.nextInt();
            sc.nextLine();
            
            ArrayList<Review> allReviews = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter comment for review " + (i-1) + ": ";)
                String comment = sc.nextLine();
                allReviews.add(new Review(comment));
            }
            
            ArrayList<String> comments = obj.collectComments(allReviews);
            System.out.println("Formatted comments:");
            for (String comment : comments) {
                System.out.println("Formatted comments:");
                for (String comment: comments) {
                    System.out.println(comment);
                }
            }
        }
    }
}
