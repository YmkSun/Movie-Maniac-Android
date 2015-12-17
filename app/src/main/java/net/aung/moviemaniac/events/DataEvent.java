package net.aung.moviemaniac.events;

import net.aung.moviemaniac.data.vos.MovieVO;
import net.aung.moviemaniac.restapi.responses.MovieDiscoverResponse;
import net.aung.moviemaniac.restapi.responses.MovieTrailerResponse;
import net.aung.moviemaniac.restapi.responses.GenreListResponse;

import java.util.ArrayList;

/**
 * Created by aung on 12/12/15.
 */
public class DataEvent {

    public static class LoadedMovieDiscoverEvent {
        private MovieDiscoverResponse response;
        private boolean isForce;

        public LoadedMovieDiscoverEvent(MovieDiscoverResponse response, boolean isForce) {
            this.response = response;
            this.isForce = isForce;
        }

        public MovieDiscoverResponse getResponse() {
            return response;
        }

        public boolean isForce() {
            return isForce;
        }
    }

    public static class ShowMovieListEvent {
        private ArrayList<MovieVO> movieList;
        private boolean isForce;
        private int pageNumber;

        public ShowMovieListEvent(ArrayList<MovieVO> movieList, boolean isForce, int pageNumber) {
            this.movieList = movieList;
            this.isForce = isForce;
            this.pageNumber = pageNumber;
        }

        public ArrayList<MovieVO> getMovieList() {
            return movieList;
        }

        public boolean isForce() {
            return isForce;
        }

        public int getPageNumber() {
            return pageNumber;
        }
    }

    public static class FailedToLoadDataEvent {
        private String message;

        public FailedToLoadDataEvent(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static class LoadedMovieDetailEvent {
        private MovieVO movie;
        private int movieId;

        public LoadedMovieDetailEvent(MovieVO movie, int movieId) {
            this.movie = movie;
            this.movieId = movieId;
        }

        public MovieVO getMovie() {
            return movie;
        }

        public int getMovieId() {
            return movieId;
        }
    }

    public static class LoadedMovieTrailerEvent {
        private MovieTrailerResponse response;
        private int movieId;

        public LoadedMovieTrailerEvent(MovieTrailerResponse response, int movieId) {
            this.response = response;
            this.movieId = movieId;
        }

        public MovieTrailerResponse getResponse() {
            return response;
        }

        public int getMovieId() {
            return movieId;
        }
    }

    public static class LoadedGenreListEvent {
        private GenreListResponse response;

        public LoadedGenreListEvent(GenreListResponse response) {
            this.response = response;
        }

        public GenreListResponse getResponse() {
            return response;
        }
    }
}