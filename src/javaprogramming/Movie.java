package javaprogramming;



class Movie {
    int movieId;
    String movieName;
    String heroName;
    int availableSeats;
    static String theaterName;
    static String managerName;
    void displayMovieDetails() {
        System.out.println("Movie ID          : " + movieId);
        System.out.println("Movie Name        : " + movieName);
        System.out.println("Hero Name         : " + heroName);
        System.out.println("Available Seats   : " + availableSeats);
    }
    void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;

            System.out.println("Seat booked successfully.");
        }

        else {

            System.out.println("Seats are not available.");
        }
    }


    // Static method
    // Displays common theater details
    static void displayTheaterDetails() {

        System.out.println("Theater Name : " + theaterName);
        System.out.println("Manager Name : " + managerName);
    }


    // Static method
    // Changes the manager name
    static void changeManager(String newManagerName) {

        managerName = newManagerName;
    }


    public static void main(String[] args) {

        // Creating first Movie object
        Movie m1 = new Movie();

        // Creating second Movie object
        Movie m2 = new Movie();


        // Assigning values to static variables
        // These values are common to both objects
        theaterName = "PVR Cinemas";
        managerName = "Ramesh";


        // Assigning values to first movie
        m1.movieId = 101;
        m1.movieName = "Pushpa 2";
        m1.heroName = "Allu Arjun";
        m1.availableSeats = 10;


        // Assigning values to second movie
        m2.movieId = 102;
        m2.movieName = "RRR";
        m2.heroName = "Ram Charan";
        m2.availableSeats = 20;


        // Displaying theater details
        System.out.println("===== THEATER DETAILS =====");

        displayTheaterDetails();


        // Displaying first movie details
        System.out.println("\n===== MOVIE 1 DETAILS =====");

        m1.displayMovieDetails();


        // Displaying second movie details
        System.out.println("\n===== MOVIE 2 DETAILS =====");

        m2.displayMovieDetails();


        // Booking one seat for first movie
        // 50 seats becomes 49
        System.out.println("\n===== BOOK SEAT =====");

        m1.bookSeat();
        m1.bookSeat();


        // Booking one seat for second movie
        // 40 seats becomes 39
        m2.bookSeat();


        // Displaying updated movie details
        System.out.println("\n===== UPDATED MOVIE DETAILS =====");


        // Updated details of first movie
        System.out.println("\nMovie 1:");

        m1.displayMovieDetails();


        // Updated details of second movie
        System.out.println("\nMovie 2:");

        m2.displayMovieDetails();


        // Changing manager name
        System.out.println("\n===== CHANGE MANAGER =====");

        changeManager("Suresh");


        // Displaying updated theater details
        System.out.println("\n===== UPDATED THEATER DETAILS =====");

        displayTheaterDetails();
    }
}
