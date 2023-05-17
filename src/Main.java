
public abstract class Main {
   public static int whatYear() {
       int year = 1999;
       if (year % 4 == 0 && year % 400 == 0) {
           System.out.println("год високосный");
       } else {
           System.out.println("год не високосный");
       }

       return year;
   }

   public static int systemForPhone (){
       int phoneCreateYear = 2015;
       int phoneSysType = 1;
       int currentYear = 2023;
       int systemIosType = 0;
       int systemAndroidType = 1;

       if (phoneCreateYear<currentYear && phoneSysType==1) {
           System.out.println("скачайте облегченную версию приложения для вашего андройд устройства");
       } if (phoneCreateYear<currentYear && phoneSysType == 0) {
           System.out.println("скачайте облегченную версию для вашего IOS устройства");
       } if (phoneCreateYear == currentYear && phoneSysType == 1) {
           System.out.println("скачайте новую версию нашего приложения по ссылке для андройду устройств");
       }if (phoneCreateYear == currentYear && phoneSysType == 0) {
           System.out.println("скачайте новую версию приложения по ссылке для вашего IOS устройства");
       }
return phoneCreateYear;

   }
   public static int deliveryTime(){
       int km = 35;
      if (km<=20){
          System.out.println("доставка займет сутки");
      } if(km > 20 && km < 60){
           System.out.println("доставка займет двое суток");
       } if(km>60 && km<100){
           System.out.println("доставка займет трое суток");
       } if (km>100){
           System.out.println("доставка не осуществляется");
       }
       return km;
   }

    public static void main(String[] args) {
       task1();
       task2();
       task3();

    }

    private static void task3() {
       int km = deliveryTime();
    }

    private static void task2() {
       int phoneSysAge = systemForPhone();
        System.out.println(phoneSysAge);
    }

    private static void task1() {
       int year = whatYear();
        System.out.println("год " + year + " - не високосный год");


    }
}