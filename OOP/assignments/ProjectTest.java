class ProjectTest {
  public static void main(String[] args) {
    Project test1 = new Project();
    Project test2 = new Project("testing overloading","whatever");
    String what = test2.getName();
    System.out.println(test2.elevatorPitch());
    System.out.println(what);
    System.out.println(test1.elevatorPitch());




  }
}



// class VehicleTest {
//     public static void main(String[] args) {
//         Vehicle bike = new Vehicle();
//         Vehicle car = new Vehicle();
//         bike.setNumberOfWheels(2);
//         bike.setColor("red");
//         int bikeWheels = bike.getNumberOfWheels();
//         String bikeColor = bike.getColor();
//         car.setNumberOfWheels(4);
//         car.setColor("green");
//         int carWheels = car.getNumberOfWheels();
//         String carColor = car.getColor();
//         System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
//         System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
//     }
// }
