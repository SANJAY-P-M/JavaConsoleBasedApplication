/*                                                    AUTHOR : SANJAY P M
 *                                                    EX NO  : 2
 *                                                    TOPIC  : INHERITANCE
 */
import java.util.Scanner;
public class Driver {
    public static void main(String[] a){
        Bus b1;
        Truck t1;
        Vehicle v;
        byte option = 0;
        Scanner scan = new Scanner(System.in);
        while(option != 3)
        {
            System.out.println("    1) Add new bus");
            System.out.println("    2) Add new Truck");
            System.out.println("    3) Exit");
            System.out.print("Enter your choice : ");
            option = scan.nextByte();
            switch(option){
                case 1:
                    System.out.print("Enter number of seats available in bus your : ");
                    int seats;
                    seats = scan.nextInt();
                    System.out.println("    Is Driver and Conductor name available : ");
                    System.out.println("        1) YES");
                    System.out.println("        2) NO");
                    System.out.print("Enter your choice : ");
                    option = scan.nextByte();
                    scan.nextLine();
                    if(option == 1){
                        String name1;
                        String name2;
                        System.out.print("Enter Driver name : ");
                        name1 = scan.nextLine();
                        System.out.print("Enter Conductor name : ");
                        name2 = scan.nextLine();
                        b1 = new Bus(seats,name1,name2);
                        v = b1;
                    }
                    else{
                        b1 = new Bus(seats);
                        v = b1;
                    }
                    while(option != 7)
                    {    
                        System.out.printf("%n    1) Set driver%n");
                        System.out.println("    2) Set Conductor");
                        System.out.println("    3) Check seats available");
                        System.out.println("    4) Book seats");
                        System.out.println("    5) Check total number of bus owned by SRT travels");
                        System.out.println("    6) Print all details of Bus");
                        System.out.printf("    7) exit%n%n");
                        System.out.print("Enter your choice : ");
                        option = scan.nextByte();
                        scan.nextLine();
                        switch(option)
                        {
                            case 1:
                                System.out.print("Enter driver name : ");
                                b1.setDriverName(scan.nextLine());
                                break;
                            case 2:
                                System.out.print("Enter conductor name : ");
                                b1.setHelperName(scan.nextLine());
                                break;
                            case 3:
                                System.out.println("Available seats : "+b1.getAvailableSeats());
                                break;
                            case 4:
                                System.out.print("Enter no of seats to book : ");
                                b1.bookSeat(scan.nextInt());
                                break;
                            case 5:
                                System.out.print("Number of Buses Available" + Bus.numberOfBuses);
                                break;
                            case 6:
                                v.printAllDetails();// Implements dynamic polymorphism
                                break;
                            
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter load capacity of truck : ");
                    int load;
                    load = scan.nextInt();
                    System.out.println("    Is Driver and helper name available : ");
                    System.out.println("        1) YES");
                    System.out.println("        2) NO");
                    System.out.print("Enter your choice : ");
                    option = scan.nextByte();
                    scan.nextLine();
                    if(option == 1)
                    {   String name1,name2;
                        System.out.print("Enter Driver name : ");
                        name1 = scan.nextLine();
                        System.out.print("Enter Helper name : ");
                        name2 = scan.nextLine();
                        t1 = new Truck(load,name1,name2);
                        v = t1;
                    }
                    else{
                        t1 = new Truck(load);
                        v = t1;
                    }
                    while(option != 5)
                    {    
                        System.out.printf("%n    1) Set driver%n");
                        System.out.println("    2) Check load capacity available");
                        System.out.println("    3) Check total number of trucks owned by SRT travels");
                        System.out.println("    4) Print all details of Truck");
                        System.out.printf("    5) exit%n%n");
                        System.out.print("Enter your choice : ");
                        option = scan.nextByte();
                        scan.nextLine();
                        switch(option){
                            case 1:
                                System.out.print("Enter driver name : ");
                                t1.setDriverName(scan.nextLine());
                            break;
                            case 2:
                                System.out.printf("1) Check for your load capacity%n2) Just check if capacity available");
                                byte choice = scan.nextByte();
                                switch(choice){
                                    case 1:
                                        System.out.print("Enter your maximum load capacity : ");
                                        if(t1.isCapacityAvailable(scan.nextInt()))     // calling a overloaded function function  
                                            System.out.printf("%n        ***Yes this can truck carry your load*** %n%n");
                                        else
                                        {
                                            System.out.printf("%n        **Sorry doode check for other trucks**%n");
                                            System.out.printf("          **Current trucks load capacity is : %d**%n%n",t1.loadCapacity);
                                        }
                                    break;
                                    case 2:
                                        if(t1.isCapacityAvailable())                  //This implements a static polymorphism || Method binding occurs during compile time
                                            System.out.printf("%n        ***Yes this can truck carry your load*** %n%n");
                                        else
                                        {
                                            System.out.printf("%n        **Sorry doode check for other trucks**%n");
                                            System.out.printf("          **Truck is full :( **%n%n");
                                        }
                                }
                            break;
                            case 3:
                                System.out.println("Available trucks by SRT : "+Truck.numberOfTrucks);
                            break;
                            case 4:
                                v.printAllDetails();// Implements dynamic polymorphism
                            break;
                        }
                    }
                    break;    
            }
        }
        scan.close();
    }
}