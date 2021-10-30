
public class Movie_1912488  implements Comparable<Movie_1912488>{
	private String movie_name=null;
	private String releaseDate=null;
	private int rating=0;
	private String genre=null;
	
	public Movie_1912488() {
	}
	public Movie_1912488(String movie_name, String releaseDate, int rating, String genre) {
		super();
		this.movie_name = movie_name;
		this.releaseDate = releaseDate;
		this.rating = rating;
		this.genre = genre;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie Name: " + movie_name + "\nRelease Date: " + releaseDate + ",\nRating :" + rating + ",\nGenre : "
				+ genre + "]";
	}
	@Override
public int compareTo(Movie_1912488 m) {
		return this.rating-m.rating;
	}
	
	
	

}
