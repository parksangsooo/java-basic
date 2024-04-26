package extends1.ex;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.actor = actor;
        this.director = director;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 영화감독:" + director + ", 배우:"+actor);
    }
}
