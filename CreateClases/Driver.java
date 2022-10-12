import java.util.Scanner;
public class Driver {
    public static void main(String[] a){
        Bus b1;
        Truck t1;
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
                    System.out.print("Enter number of seats available in bus : ");
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
                    }
                    else
                        b1 = new Bus(seats);
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
                                b1.setConductorName(scan.nextLine());
                                break;
                            case 3:
                                System.out.println("Available seats : "+b1.isSeatAvailable());
                                break;
                            case 4:
                                System.out.print("Enter no of seats to book : ");
                                b1.bookSeat(scan.nextInt());
                                break;
                            case 5:
                                Bus.showNumberOfBuses();
                                break;
                            case 6:
                                b1.printAllDetails();
                                break;
                            
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter load capacity of truck : ");
                    int load;
                    load = scan.nextInt();
                    System.out.println("    Is Driver name available : ");
                    System.out.println("        1) YES");
                    System.out.println("        2) NO");
                    System.out.print("Enter your choice : ");
                    option = scan.nextByte();
                    scan.nextLine();
                    if(option == 1)
                    {   String name1;
                        System.out.print("Enter Driver name : ");
                        name1 = scan.nextLine();
                        t1 = new Truck(load,name1);
                    }
                    else
                        t1 = new Truck(load);
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
                                System.out.print("Enter your maximum load capacity : ");
                                if(t1.isCheckCapacity(scan.nextInt()))
                                    System.out.printf("%n        ***Yes this can truck carry your load*** %n%n");
                                else
                                {
                                    System.out.printf("%n        **Sorry doode check for other trucks**%n");
                                    System.out.printf("          **Current trucks load capacity is : %d**%n%n",t1.loadCapacity);
                                }
                                break;
                            case 3:
                                System.out.println("Available trucks by SRT : "+Truck.numberOfTrucks);
                                break;
                            case 4:
                                t1.printAllDetails();
                                break;
                        }
                    }
                    break;    
            }
        }
        scan.close();
    }
}