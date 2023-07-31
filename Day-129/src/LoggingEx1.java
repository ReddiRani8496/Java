import java.util.logging.Level;
import java.util.logging.Logger;

 class Hostel {

    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(Hostel.class.getName());

        boolean student = false;
        //boolean student = true;

        if(student) {

            logger.log(Level.INFO, "student is there"); // it is used to display normal information

        } else {

            //boolean studen1 = true;
            boolean student1 = false;

            if (student1) {

                logger.log(Level.WARNING, "Student is there ,but it's Okay!"); // it is used to indicate warnings
                logger.warning("Student is there");

            } else {

                logger.log(Level.SEVERE, "Student is  not there, it's not Okay"); // indicates severe, which is the highest level of severity
                logger.severe("Student is not there");

            }
        }

        Hostel2 hostel2 = new Hostel2();
        hostel2.getLOgInfo();
    }
}

class Hostel2 {

    String name = "Radhika";

    private final Logger logger = Logger.getLogger(Hostel2.class.getName());

    void getLOgInfo() {

        if(name.equalsIgnoreCase("Radhika")) {

            logger.log(Level.SEVERE,"She is a terrorist");

        } else {

            logger.log(Level.INFO,"No problem with her");

        }

    }
}
