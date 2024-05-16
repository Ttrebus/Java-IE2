// Feel free to add here any import statements that you need
/* Timothy Trebus COP2513

/** TOTAL = 5 points
   This class models information we keep about a book chapter.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class BookChapter {
   
   /* TASK #1 - 1 point
      Declare the following attributes as private:
         title          of data type   String   (0.5 point)
         numberOfPages  of data type   int      (0.5 point)
   */
   private String title;
   private int numberOfPages;

   
   /* TASK #2 - 2 points
      Write the code for the following constructor.
      Do not alter the name of the parameters.
      Initialize appropriately all attributes (1 point).
      If the numberOfPages is negative or zero, set it to 1 instead (1 point).
   */
   public BookChapter(String title, int numberOfPages){
      this.title = title;
      this.numberOfPages = numberOfPages;
      if(this.numberOfPages <= 0){
         this.numberOfPages = 1;
      }//end IF

   }// end constructor
   
   
   
   /* TASK #3 - 1 point
      Write the code for the get method for the numberOfPages attribute.
   */
   public int getNumberOfPages(){
      return this.numberOfPages;
   }// end getNumberOfPages method
   


   /* TASK #4 - 1 point
      Write the code for the get method for the title attribute.
   */
   public String getTitle(){
      return this.title;
   }// end getTitle method
   
   
}// end class
