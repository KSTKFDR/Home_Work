public class Movie {
    String name;
    int total_min;
    String director;

    Movie(String name, int total_min, String director) {
        this.name = name;
        this.total_min = total_min;
        this.director = director;
    }

    void setName(String name) {
        this.name = name;
    }

    void setTotal_min(int total_min) {
        this.total_min = total_min;
    }

    void setDirector(String director) {
        this.director = director;
    }

    String getName() {
        return name;
    }

    int getTotal_min() {

        return total_min;
    }

    String getDirector() {
        return director;
    }
}