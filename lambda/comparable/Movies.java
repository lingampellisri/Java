package comparable;

import java.util.ArrayList;
import java.util.Collections;

class Movie {
    String name;
    Double rating;
    Integer year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name :" + name + ", Rating :" + rating + ", Year :" + year + "\n";
    }

    public static int sortByYearAsc(Movie m1, Movie m2) {
        return m1.getYear().compareTo(m2.getYear());
    }

    public static int sortByYearDsc(Movie m1, Movie m2) {
        return m2.getYear().compareTo(m1.getYear());
    }

    public static int sortByRatingAsc(Movie m1, Movie m2) {
        return m1.getRating().compareTo(m2.getRating());
    }

    public static int sortByRatingDsc(Movie m1, Movie m2) {
        return m2.getRating().compareTo(m1.getRating());
    }

    public static int sortByNameAsc(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }

    public static int sortByNameDsc(Movie m1, Movie m2) {
        return m2.getName().compareTo(m1.getName());
    }

}






public class Movies {

    public static void main(String[] args) {

        ArrayList<Movie> l = new ArrayList<>();
        l.add(new Movie("Star Wars", 8.7, 1999));
        l.add(new Movie("Empire Strikes Back", 8.8, 1980));
        l.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(l, Movie::sortByYearAsc);
        System.out.println("=========Movies By Year Sorting Ascending Order===========");
        System.out.println(l);

        Collections.sort(l, Movie::sortByYearDsc);
        System.out.println("=========Movies By  Year Sorting Desending Order===========");
        System.out.println(l);

        Collections.sort(l, Movie::sortByRatingAsc);
        System.out.println("=========Movies By  Rating Sorting Ascending Order===========");
        System.out.println(l);

        Collections.sort(l, Movie::sortByRatingDsc);
        System.out.println("=========Movies By  Rating Sorting Desending Order===========");
        System.out.println(l);

        Collections.sort(l, Movie::sortByNameAsc);
        System.out.println("=========Movies By  Name Sorting Ascending Order===========");
        System.out.println(l);

        Collections.sort(l, Movie::sortByNameDsc);
        System.out.println("=========Movies By  Name Sorting Desending Order===========");
        System.out.println(l);

    }

}