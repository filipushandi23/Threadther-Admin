
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSAdmin", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSAdmin {


    /**
     * 
     * @return
     *     returns java.util.List<services.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getShowingMovies", targetNamespace = "http://WS/", className = "services.GetShowingMovies")
    @ResponseWrapper(localName = "getShowingMoviesResponse", targetNamespace = "http://WS/", className = "services.GetShowingMoviesResponse")
    @Action(input = "http://WS/WSAdmin/getShowingMoviesRequest", output = "http://WS/WSAdmin/getShowingMoviesResponse")
    public List<Movie> getShowingMovies();

    /**
     * 
     * @return
     *     returns java.util.List<services.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMovie", targetNamespace = "http://WS/", className = "services.GetAllMovie")
    @ResponseWrapper(localName = "getAllMovieResponse", targetNamespace = "http://WS/", className = "services.GetAllMovieResponse")
    @Action(input = "http://WS/WSAdmin/getAllMovieRequest", output = "http://WS/WSAdmin/getAllMovieResponse")
    public List<Movie> getAllMovie();

    /**
     * 
     * @param address
     * @param province
     * @param city
     * @param cinemaName
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCinema", targetNamespace = "http://WS/", className = "services.AddCinema")
    @ResponseWrapper(localName = "addCinemaResponse", targetNamespace = "http://WS/", className = "services.AddCinemaResponse")
    @Action(input = "http://WS/WSAdmin/addCinemaRequest", output = "http://WS/WSAdmin/addCinemaResponse")
    public Boolean addCinema(
        @WebParam(name = "cinema_name", targetNamespace = "")
        String cinemaName,
        @WebParam(name = "address", targetNamespace = "")
        String address,
        @WebParam(name = "city", targetNamespace = "")
        String city,
        @WebParam(name = "province", targetNamespace = "")
        String province);

    /**
     * 
     * @param address
     * @param province
     * @param city
     * @param cinemaName
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editCinema", targetNamespace = "http://WS/", className = "services.EditCinema")
    @ResponseWrapper(localName = "editCinemaResponse", targetNamespace = "http://WS/", className = "services.EditCinemaResponse")
    @Action(input = "http://WS/WSAdmin/editCinemaRequest", output = "http://WS/WSAdmin/editCinemaResponse")
    public Boolean editCinema(
        @WebParam(name = "cinema_name", targetNamespace = "")
        String cinemaName,
        @WebParam(name = "address", targetNamespace = "")
        String address,
        @WebParam(name = "city", targetNamespace = "")
        String city,
        @WebParam(name = "province", targetNamespace = "")
        String province);

    /**
     * 
     * @param duration
     * @param rating
     * @param synopsis
     * @param title
     * @param poster
     * @param status
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addMovie", targetNamespace = "http://WS/", className = "services.AddMovie")
    @ResponseWrapper(localName = "addMovieResponse", targetNamespace = "http://WS/", className = "services.AddMovieResponse")
    @Action(input = "http://WS/WSAdmin/addMovieRequest", output = "http://WS/WSAdmin/addMovieResponse")
    public Boolean addMovie(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "synopsis", targetNamespace = "")
        String synopsis,
        @WebParam(name = "rating", targetNamespace = "")
        double rating,
        @WebParam(name = "duration", targetNamespace = "")
        int duration,
        @WebParam(name = "poster", targetNamespace = "")
        String poster,
        @WebParam(name = "status", targetNamespace = "")
        int status);

    /**
     * 
     * @return
     *     returns java.util.List<services.Cinema>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCinema", targetNamespace = "http://WS/", className = "services.GetAllCinema")
    @ResponseWrapper(localName = "getAllCinemaResponse", targetNamespace = "http://WS/", className = "services.GetAllCinemaResponse")
    @Action(input = "http://WS/WSAdmin/getAllCinemaRequest", output = "http://WS/WSAdmin/getAllCinemaResponse")
    public List<Cinema> getAllCinema();

    /**
     * 
     * @param movieId
     * @return
     *     returns services.Movie
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovie", targetNamespace = "http://WS/", className = "services.GetMovie")
    @ResponseWrapper(localName = "getMovieResponse", targetNamespace = "http://WS/", className = "services.GetMovieResponse")
    @Action(input = "http://WS/WSAdmin/getMovieRequest", output = "http://WS/WSAdmin/getMovieResponse")
    public Movie getMovie(
        @WebParam(name = "movie_id", targetNamespace = "")
        int movieId);

    /**
     * 
     * @param movieId
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMovie", targetNamespace = "http://WS/", className = "services.DeleteMovie")
    @ResponseWrapper(localName = "deleteMovieResponse", targetNamespace = "http://WS/", className = "services.DeleteMovieResponse")
    @Action(input = "http://WS/WSAdmin/deleteMovieRequest", output = "http://WS/WSAdmin/deleteMovieResponse")
    public Boolean deleteMovie(
        @WebParam(name = "movie_id", targetNamespace = "")
        int movieId);

    /**
     * 
     * @param duration
     * @param rating
     * @param movieId
     * @param synopsis
     * @param title
     * @param poster
     * @param status
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editMovie", targetNamespace = "http://WS/", className = "services.EditMovie")
    @ResponseWrapper(localName = "editMovieResponse", targetNamespace = "http://WS/", className = "services.EditMovieResponse")
    @Action(input = "http://WS/WSAdmin/editMovieRequest", output = "http://WS/WSAdmin/editMovieResponse")
    public Boolean editMovie(
        @WebParam(name = "movie_id", targetNamespace = "")
        int movieId,
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "synopsis", targetNamespace = "")
        String synopsis,
        @WebParam(name = "rating", targetNamespace = "")
        double rating,
        @WebParam(name = "duration", targetNamespace = "")
        int duration,
        @WebParam(name = "poster", targetNamespace = "")
        String poster,
        @WebParam(name = "status", targetNamespace = "")
        int status);

    /**
     * 
     * @param email
     * @return
     *     returns services.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://WS/", className = "services.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://WS/", className = "services.GetUserResponse")
    @Action(input = "http://WS/WSAdmin/getUserRequest", output = "http://WS/WSAdmin/getUserResponse")
    public User getUser(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param password
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://WS/", className = "services.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://WS/", className = "services.LoginResponse")
    @Action(input = "http://WS/WSAdmin/loginRequest", output = "http://WS/WSAdmin/loginResponse")
    public boolean login(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param cinemaName
     * @return
     *     returns java.util.List<services.Studio>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudiosByCinemaName", targetNamespace = "http://WS/", className = "services.GetStudiosByCinemaName")
    @ResponseWrapper(localName = "getStudiosByCinemaNameResponse", targetNamespace = "http://WS/", className = "services.GetStudiosByCinemaNameResponse")
    @Action(input = "http://WS/WSAdmin/getStudiosByCinemaNameRequest", output = "http://WS/WSAdmin/getStudiosByCinemaNameResponse")
    public List<Studio> getStudiosByCinemaName(
        @WebParam(name = "cinemaName", targetNamespace = "")
        String cinemaName);

    /**
     * 
     * @param movieId
     * @return
     *     returns java.util.List<services.Schedule>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllScheduleByMovieId", targetNamespace = "http://WS/", className = "services.GetAllScheduleByMovieId")
    @ResponseWrapper(localName = "getAllScheduleByMovieIdResponse", targetNamespace = "http://WS/", className = "services.GetAllScheduleByMovieIdResponse")
    @Action(input = "http://WS/WSAdmin/getAllScheduleByMovieIdRequest", output = "http://WS/WSAdmin/getAllScheduleByMovieIdResponse")
    public List<Schedule> getAllScheduleByMovieId(
        @WebParam(name = "movieId", targetNamespace = "")
        int movieId);

    /**
     * 
     * @return
     *     returns java.util.List<services.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComingSoonMovies", targetNamespace = "http://WS/", className = "services.GetComingSoonMovies")
    @ResponseWrapper(localName = "getComingSoonMoviesResponse", targetNamespace = "http://WS/", className = "services.GetComingSoonMoviesResponse")
    @Action(input = "http://WS/WSAdmin/getComingSoonMoviesRequest", output = "http://WS/WSAdmin/getComingSoonMoviesResponse")
    public List<Movie> getComingSoonMovies();

}