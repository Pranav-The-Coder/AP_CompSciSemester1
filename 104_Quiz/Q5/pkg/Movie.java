package pkg;

public class Movie{
    String movieName;
    double Rating;
    int numberRatings;
    int Revenue;
    
    public Movie(){
        
    
        movieName = "Avengers";
        Rating = 8.0;
        numberRatings = 33;
        Revenue = 623357910;
    }    
    public Movie(String movieName, double Rating, int numberRatings, int Revenue){
        
    
        this.movieName = movieName;
        this.Rating = Rating;
        this.numberRatings = numberRatings;
        this.Revenue = Revenue;
    }
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + Rating); 
        System.out.println("Number Of Ratings: " + numberRatings);
        System.out.println("Revenue: " + Revenue);
        System.out.println(" ");
        
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return Revenue;
    }
    public void addRating(double Rating){
        this.Rating = (this.Rating*numberRatings)+Rating;
        numberRatings++;
        this.Rating = this.Rating/numberRatings;
    }
    public double getRating(){
        return Rating;
    }
    public boolean compareRatings(Movie movie){
        return movie.getRating() < this.Rating;
    }
    public Movie pirateMovie(){
        return new Movie(movieName, Rating, numberRatings, Revenue);
    }
}
