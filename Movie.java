class Movie{
	String movieName;
	String director;
	double imdbRating;
		void initialize(String m,String d,double imdb){
			this.movieName=m;
			this.director=d;
			this.imdbRating=imdb;
	}
public static void main(String[] args){
			Movie m1=new Movie();
			m1.initialize("bhaubali","rajmouli",9.1);
			Movie m2=new Movie();
			m2.initialize("chanduchampion","najarad",8.5);
			Movie m3=new Movie();
			m3.initialize("sitaram","rahul",9.5);
			System.out.println(m1.movieName+" "+m1.director+" "+m1.imdbRating+" ");
			System.out.println(m2.movieName+" "+m2.director+" "+m2.imdbRating+" ");
			System.out.println(m3.movieName+" "+m3.director+" "+m3.imdbRating+" ");

		}
}