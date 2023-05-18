
public abstract class Main {
   public static void calculateWhatYear(int year) {
       year = 1999;
       if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
           System.out.println("год високосный");
       } else {
           System.out.println("год не високосный");
       }
   }

   public static void chooseSystemForPhone (){
       int phoneCreateYear = 2015;
       int phoneSysType = 1;
       int currentYear = 2023;
       int systemIosType = 0;
       int systemAndroidType = 1;

       if (phoneCreateYear<currentYear && phoneSysType==1) {
           System.out.println("скачайте облегченную версию приложения для вашего андройд устройства");
       } else if (phoneCreateYear<currentYear && phoneSysType == 0) {
           System.out.println("скачайте облегченную версию для вашего IOS устройства");
       } else if (phoneCreateYear == currentYear && phoneSysType == 1) {
           System.out.println("скачайте новую версию нашего приложения по ссылке для андройду устройств");
       }else if (phoneCreateYear == currentYear && phoneSysType == 0) {
           System.out.println("скачайте новую версию приложения по ссылке для вашего IOS устройства");
       }

   }
   public static int calculateDeliveryTime(){
       int km = 35;
       int deliveryDays = 0;
      if (km<=20){
          deliveryDays = deliveryDays + 1;
          System.out.println("доставка займет " + deliveryDays + "день");
      } else if(km > 20 && km < 60){
          deliveryDays = deliveryDays + 1;
           System.out.println("доставка займет " + deliveryDays+  "суток");
       } else if(km>60 && km<100){
          deliveryDays = deliveryDays + 1;
           System.out.println("доставка займет " + deliveryDays + " суток");
       } else if (km>100){
           System.out.println("доставка не осуществляется");
       }
       return deliveryDays;
   }

    public static void main(String[] args) {


    }
    }
