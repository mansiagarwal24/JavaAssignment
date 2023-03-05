/*
    Write a program to display values of
    enums using a constructor & getPrice() method (Example display house & their prices)
 */
package JavaAssignment3;

public class Enum {
    enum typeOfHouse {
        flat(50),
        bungalow(95),
        building(65);

        private int price;

        typeOfHouse(int p) {
            this.price = p;
        }

        int getPrice() {
            return price;
        }
    }
        public static void main(String[] args){
            System.out.println("All types of house prices:");
            for (typeOfHouse house : typeOfHouse.values()) {
                System.out.println(house + " costs " + house.getPrice() + " lakhs.");
            }
        }

}
