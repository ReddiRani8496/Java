public class Cars {
    private String brand;
    private int mileage;
    private boolean havingAC;
 
    private double price;
    private int seatingCapacity;
 
     public String getBrand() {
         return brand;
     }
 
     public void setBrand(String brand) {
         this.brand = brand;
     }
 
     public int getMileage() {
         return mileage;
     }
 
     public void setMileage(int mileage) {
         this.mileage = mileage;
     }
 
     public boolean isHavingAC() {
         return havingAC;
     }
 
     public void setHavingAC(boolean havingAC) {
         this.havingAC = havingAC;
     }
 
     public double getPrice() {
         return price;
     }
 
     public void setPrice(double price) {
         this.price = price;
     }
 
     public int getSeatingCapacity() {
         return seatingCapacity;
     }
 
     public void setSeatingCapacity(int seatingCapacity) {
         this.seatingCapacity = seatingCapacity;
     }
 
     @Override
     public String toString() {
         return "Cars{" +
                 "brand='" + brand + '\'' +
                 ", mileage=" + mileage +
                 ", havingAC=" + havingAC +
                 ", price=" + price +
                 ", seatingCapacity=" + seatingCapacity +
                 '}';
     }
 }

