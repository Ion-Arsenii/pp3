 public class ticket
{
//atributes  
static String cinema_name;
static String movie_title;
 int row;
 int seat;
 double price;

 public ticket(String movie_title, int row, int seat){
     if(row <3){
         this.price = 10.00;
     }else{
         this.price = 25.00;
     }
     this.movie_title = movie_title;
     this.row = row;
     this.seat = seat;
 }
 
 
 public void displayData(){
    System.out.println("Cinema name:" + " Movie Title:"
     +"Row number:" +"Seat number:" +"Price:");
} 
public static void main(String[]args){
    ticket t1= new ticket();
    ticket t2= new ticket();
    
    t1.movie_title= "Harry Potter";
    t1.row=4;
    t1.seat=7;
    t1.price= 16.20;
    
    t2.movie_title = "bob";
    t2.row=5;
    t2.seat=9;
    t2.price= 14.40;
    

    
}
}



    



    


