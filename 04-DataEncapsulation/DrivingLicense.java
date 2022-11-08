public class DrivingLicense {
   private String driverName;
   private String driverSurname;
   private String postalCode;
   private String adress;
   private String city;
   private String dlNumber;
   private int yearIssue;
   private String dCat;

   public String toString(){
    String details = "";
    details += driverName + "," +driverSurname + "\n";
    details += adress + "," +postalCode + "," + city;
    details += dlNumber + "," + dCat + "," +yearIssue;
    return details;
   }


   public String getdriverName(){
    return driverName;
   }
   public void setdriverName(String driverName){
    this.driverName = driverName;
   }
   public String getdriverSurname(){
    return driverSurname;
   }
   public void setdriverSurname(String driverSurname){
    this.driverSurname= driverSurname;
   }
   public String getpostalCode(){
    return postalCode;
   }
   public void setpostalCode(String postalCode){
    this.postalCode = postalCode;
   }
   public String getadress(){
    return adress;
   }
   public void setadress(String adress){
    this.adress= adress;
   }
   public String getcity(){
    return city ;
   }
   public void setcity(String city ){
    this.city= city;
   }
   public String getdlNumber(){
    return dlNumber;
   }
   public void setdlNumber(String dlNumber){
    this.dlNumber= dlNumber;
   }
   public int getyearIssue(){
    return yearIssue;
   }
   public void setyearIssue(int yearIssue){
      if(yearIssue<1980 || yearIssue>2022){
         System.out.println("\nImpossible year!\n");
         return;
      }
    this.yearIssue = yearIssue;
   }
   public String getdCat(){
    return dCat;
   }
   public void setdCat(String dCat){
    this.dCat= dCat;
   }
}


