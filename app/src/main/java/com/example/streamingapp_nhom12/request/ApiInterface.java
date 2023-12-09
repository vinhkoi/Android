package com.example.streamingapp_nhom12.request;


import com.example.streamingapp_nhom12.network.movie.GenreMoviesResponse;
import com.example.streamingapp_nhom12.network.movie.SimilarMoviesResponse;
import com.example.streamingapp_nhom12.network.movie.Movie;
import com.example.streamingapp_nhom12.network.movie.MovieCreditsResponse;
import com.example.streamingapp_nhom12.network.movie.NowShowingMoviesResponse;
import com.example.streamingapp_nhom12.network.movie.PopularMoviesResponse;
import com.example.streamingapp_nhom12.network.movie.TopRatedMoviesResponse;
import com.example.streamingapp_nhom12.network.series.AiringTodaySeriesResponse;
import com.example.streamingapp_nhom12.network.series.OnTheAirSeriesResponse;
import com.example.streamingapp_nhom12.network.series.PopularSeriesResponse;
import com.example.streamingapp_nhom12.network.series.SeasonDetailsResponse;
import com.example.streamingapp_nhom12.network.series.Series;
import com.example.streamingapp_nhom12.network.series.SeriesCreditsResponse;
import com.example.streamingapp_nhom12.network.series.SimilarSeriesResponse;
import com.example.streamingapp_nhom12.network.series.TopRatedSeriesResponse;
import com.example.streamingapp_nhom12.network.videos.TrailersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    // Movie
    //Lấy danh sách các bộ phim đang chiếu của theo yêu cầu của người dùng.
    @GET("movie/now_playing")
    Call<NowShowingMoviesResponse> getNowShowingMovies(@Query("api_key") String apiKey, @Query("page") Integer page, @Query("region") String region);

    // Gửi yêu cầu HTTP GET đến API của trang web về các bộ phim phổ biến nhất.
    @GET("movie/popular")
    Call<PopularMoviesResponse> getPopularMovies(@Query("api_key") String api_key, @Query("page") int page);

    // Lấy danh sách các bộ phim được xếp hạng cao nhất.
    @GET("movie/top_rated")
    Call<TopRatedMoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey, @Query("page") Integer page, @Query("region") String region);

    // Truy xuất thông tin chi tiết của một bộ phim
    @GET("movie/{movie_id}")
    Call<Movie> getMovieDetails(@Path("movie_id") Integer movieId, @Query("api_key") String apiKey);


    //lấy thông tin trailer của một bộ phim.
    @GET("movie/{id}/videos")
    Call<TrailersResponse> getMovieVideos(@Path("id") Integer movieId, @Query("api_key") String apiKey);


    // lấy thông tin về các diễn viên và những người tham gia sản xuất cho một bộ phim.
    @GET("movie/{id}/credits")
    Call<MovieCreditsResponse> getMovieCredits(@Path("id") Integer movieId, @Query("api_key") String apiKey);

    //lấy danh sách các phim tương tự
    @GET("movie/{id}/similar")
    Call<SimilarMoviesResponse> getSimilarMovies(@Path("id") Integer movieId, @Query("api_key") String apiKey, @Query("page") Integer page);


    //lấy danh sách các bộ phim thuộc một thể loại cụ thể
    @GET("discover/movie")
    Call<GenreMoviesResponse> getMoviesByGenre(@Query("api_key") String apiKey, @Query("with_genres") Integer genreNumber, @Query("page") Integer page);

    // Series
    //lấy thông tin về các bộ phim truyền hình đang được phát sóng trong ngày
    @GET("tv/airing_today")
    Call<AiringTodaySeriesResponse> getAiringTodaySeries(@Query("api_key") String apiKey, @Query("page") Integer page);

    //lấy danh sách các series TV đang phát sóng trên TV trong ngày hôm đó.
    @GET("tv/on_the_air")
    Call<OnTheAirSeriesResponse> getOnTheAirSeries(@Query("api_key") String apiKey, @Query("page") Integer page);

    //lấy danh sách các series TV phổ biến nhất hiện tại.
    @GET("tv/popular")
    Call<PopularSeriesResponse> getPopularSeries(@Query("api_key") String apiKey, @Query("page") Integer page);

    //lấy danh sách các series TV được đánh giá cao nhất.
    @GET("tv/top_rated")
    Call<TopRatedSeriesResponse> getTopRatedSeries(@Query("api_key") String apiKey, @Query("page") Integer page);

    //lấy thông tin chi tiết của một series TV bằng cách cung cấp tvShowId và apiKey.
    @GET("tv/{id}")
    Call<Series> getSeriesDetails(@Path("id") Integer tvShowId, @Query("api_key") String apiKey, @Query("append_to_response") String append_to_response);

    //lấy video trailer của một series TV bằng cách cung cấp tvShowId và apiKey.
    @GET("tv/{id}/videos")
    Call<TrailersResponse> getSeriesVideos(@Path("id") Integer movieId, @Query("api_key") String apiKey);

    //lấy thông tin về các diễn viên và nhân viên tham gia trong một series TV bằng cách cung cấp tvShowId và apiKey.
    @GET("tv/{id}/credits")
    Call<SeriesCreditsResponse> getSeriesCredits(@Path("id") Integer movieId, @Query("api_key") String apiKey);

    // lấy danh sách các series TV tương tự với một series TV bằng cách cung cấp tvShowId, apiKey và page.
    @GET("tv/{id}/similar")
    Call<SimilarSeriesResponse> getSimilarSeries(@Path("id") Integer movieId, @Query("api_key") String apiKey, @Query("page") Integer page);

    // lấy thông tin chi tiết của một season trong một series TV bằng cách cung cấp id, season_number và apiKey.
    @GET("tv/{id}/season/{season}")
    Call<SeasonDetailsResponse> getSeasonDetails(@Path("id") Integer id, @Path("season") Integer season_number, @Query("api_key") String apiKey);

}
