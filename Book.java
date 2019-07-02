public class Book{
    private String bookName;
    private int bookPrice;
    private String authorName;
   
   public void setBookName(String bookName){
       this.bookName = bookName;
   }
   public String getBookName(){
       return bookName;
   }
   
   public void setBookPrice(int bookPrice){
       this.bookPrice = bookPrice;
   }
   public int getBookPrice(){
       return bookPrice;
   }
   
   public void setAuthorName(String authorName){
       this.authorName = authorName;
   }
   
   public  String getAuthorName(){
       return authorName;
   }
}