class hillStations{
  void location{
    System.out.println("Location is: ");
  }
  void famousFor{
    System.out.println("Famous For: ");
  }
}

class manali extends hillStations{
  void location{
    System.out.println("Manali is located in Himachal Pradesh.");
  }
  void famousFor{
    System.out.println("It is famous for Hadlimba Temple & adventure sports.");
  }
}

class mussoorie extends hillStations{
  void location{
    System.out.println("Mussoorie is located in Uttarakhand.");
  }
  void famousFor{
    System.out.println("It is famous for the hills. It is the best in October. The hills are covered with wild Dhalias, the Sun is delicious, and at night you can sit in front of a log fire. The roads are quite deserted.");
  }
}

class manali extends hillStations{
  void location{
    System.out.println("Manali is located in Himachal Pradesh.");
  }
  void famousFor{
    System.out.println("It is famous for Hadlimba Temple & adventure sports.");
  }
}

class main{
  public static void main(String args[){
    hillStations A = new hillStations();
    hillStations M = new manali();
    hillStations Mu = new mussoorie();

    A.location();
    A.famousFor();
  }
}
