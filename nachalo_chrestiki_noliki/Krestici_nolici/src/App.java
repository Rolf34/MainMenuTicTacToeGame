//v etom kode dolzhno bit 4 knopki 
//1. play
//2. settings
//3. exit
    import java.util.Scanner;

    public class App {
        public static void main(String[] args) throws Exception {
            Scanner arbuz = new Scanner(System.in);
            boolean vihod = false;
            boolean ready = false; 
            boolean Setingi = false; 

            while (!vihod) {
                System.out.println("""
                    ===Start menu===
                    1. POTUZHNO GRATI
                    2. NE potuzhni nalashtuvanya
                    3. Potuzhno viyti""");
                if (arbuz.hasNextInt()) {
                    int vibir = arbuz.nextInt(); 

                    switch (vibir) {
                        case 1:
                            System.out.println("Pes patron vas vitaye!");
                            System.out.print("Vi gotovi? Press (0) if you are ready, or (1) to return to the main menu: ");
                            if (arbuz.hasNextInt()) {
                                int AreYouReady = arbuz.nextInt();

                                if (AreYouReady == 0) {
                                    System.out.println("OKAYYYY LET'S GOOOOOOO!");
                                    ready = true;
                                } else if (AreYouReady == 1) {
                                    System.out.println("potuzhno deltuemo to menu...");
                                } else {
                                    System.out.println("Ne potuzhniy vvid, sprobuyte she raz.");
                                }
                            } else {
                                System.out.println("Ne potuzniy vibir, sprobuyte she raz..");
                                arbuz.next(); 
                            }
                            break;

                        case 2:
                            System.out.println("==Settings menu==\n" +
                                            "1. Setting\n" +
                                            "2. Setting\n" +
                                            "3. Leave to main menu");
                            System.out.print("Cho hosh? Vibiray: ");

                            if (arbuz.hasNextInt()) {
                                int SettingsChoose = arbuz.nextInt();

                                switch (SettingsChoose) {
                                    case 1:
                                        System.out.println("Setting is going 1 (coming soon).");
                                        break;
                                    case 2:
                                        System.out.println("Setting is going 2 (coming soon).");
                                        break;
                                    case 3:
                                        System.out.println("return to main menu...");
                                        break;
                                    default:
                                        System.out.println("Wrong choice.");
                                        break;
                                }
                            } else {
                                System.out.println("Wrong input, returning to main menu...");
                                arbuz.next(); 
                            }
                            break;

                        case 3:
                            System.out.println("Leaving...");
                            vihod = true;
                            break;

                        default:
                            System.out.println("Wrong choice.");
                    }
                } else {
                    System.out.println("Wrong choice.. select one number");
                    arbuz.next();
                }
            }

            arbuz.close();
        }
    }
