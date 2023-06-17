public class EnumEx {

        public static void main(String[] args) {

            System.out.println( Direction.EAST.getDirection());

            System.out.println(Direction.WEST.ordinal()); //returns the position of an enum constant

            System.out.println(Direction.EAST.compareTo(Direction.SOUTH));//compares the enum constants based on their ordinal value

            System.out.println(Direction.WEST.toString()); // returns the string representation of the enum constants

            System.out.println(Direction.valueOf("WEST"));//The valueOf() method takes a string and returns an enum constant having the same string name

        }
    }
    enum Direction {
        NORTH,SOUTH,EAST,WEST;
        public String getDirection() {

            switch (this) {
                case NORTH:
                    return "north";

                case SOUTH:
                    return "south";

                case EAST:
                    return "east";

                case WEST:
                    return "west";

                default:
                    return null;
            }
        }
    }



