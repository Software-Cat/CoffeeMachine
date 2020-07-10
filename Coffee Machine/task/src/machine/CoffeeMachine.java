package machine;

public class CoffeeMachine {
    enum MachineState {
        IDLE,
        BUY,
        FILL_WATER,
        FILL_MILK,
        FILL_BEAN,
        FILL_CUP,
        OFF;
    }

    static MachineState currentState = MachineState.IDLE;
    static int waterSupply = 400;
    static int milkSupply = 540;
    static int beanSupply = 120;
    static int cupSupply = 9;
    static int money = 550;

    public static void main(String input) {
        switch (currentState) {
            case IDLE:
                System.out.println();
                switch (input) {
                    case "buy":
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                        currentState = MachineState.BUY;
                        return;
                    case "fill":
                        System.out.println("Write how many ml of water do you want to add: ");
                        currentState = MachineState.FILL_WATER;
                        return;
                    case "take":
                        System.out.println("I gave you $" + money);
                        money = 0;
                        break;
                    case "remaining":
                        System.out.println("The coffee machine has:");
                        System.out.println(waterSupply + " of water");
                        System.out.println(milkSupply + " of milk");
                        System.out.println(beanSupply + " of coffee beans");
                        System.out.println(cupSupply + " of disposable cups");
                        System.out.println("$" + money + " of money");
                        break;
                    case "exit":
                        currentState = MachineState.OFF;
                        return;
                    default:
                        break;
                }
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
            case BUY:
                switch (input) {
                    case "1":
                        if (waterSupply < 250) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (beanSupply < 16) {
                            System.out.println("Sorry, not enough coffee beans");
                            break;
                        } else if (cupSupply < 1) {
                            System.out.println("Sorry, not enough cups");
                            break;
                        }

                        waterSupply -= 250;
                        beanSupply -= 16;
                        cupSupply -= 1;
                        money += 4;
                        break;
                    case "2":
                        if (waterSupply < 350) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (milkSupply < 75) {
                            System.out.println("Sorry, not enough milk");
                            break;
                        } else if (beanSupply < 20) {
                            System.out.println("Sorry, not enough coffee beans");
                            break;
                        } else if (cupSupply < 1) {
                            System.out.println("Sorry, not enough cups");
                            break;
                        }

                        waterSupply -= 350;
                        milkSupply -= 75;
                        beanSupply -= 20;
                        cupSupply -= 1;
                        money += 7;
                        break;
                    case "3":
                        if (waterSupply < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milkSupply < 100) {
                            System.out.println("Sorry, not enough milk");
                        } else if (beanSupply < 12) {
                            System.out.println("Sorry, not enough coffee beans");
                        } else if (cupSupply < 1) {
                            System.out.println("Sorry, not enough cups");
                        }

                        waterSupply -= 200;
                        milkSupply -= 100;
                        beanSupply -= 12;
                        cupSupply -= 1;
                        money += 6;
                        break;
                    default:
                        break;
                }
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                currentState = MachineState.IDLE;
                break;
            case FILL_WATER:
                waterSupply += Integer.parseInt(input);
                System.out.println("Write how many ml of milk do you want to add: ");
                currentState = MachineState.FILL_MILK;
                break;
            case FILL_MILK:
                milkSupply += Integer.parseInt(input);
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                currentState = MachineState.FILL_BEAN;
                break;
            case FILL_BEAN:
                beanSupply += Integer.parseInt(input);
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                currentState = MachineState.FILL_CUP;
                break;
            case FILL_CUP:
                cupSupply += Integer.parseInt(input);
                System.out.println();
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                currentState = MachineState.IDLE;
            default:
                break;
        }
    }
}