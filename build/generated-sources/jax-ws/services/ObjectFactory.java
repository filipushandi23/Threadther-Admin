
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCinema_QNAME = new QName("http://WS/", "addCinema");
    private final static QName _AddCinemaResponse_QNAME = new QName("http://WS/", "addCinemaResponse");
    private final static QName _AddMovie_QNAME = new QName("http://WS/", "addMovie");
    private final static QName _AddMovieResponse_QNAME = new QName("http://WS/", "addMovieResponse");
    private final static QName _DeleteMovie_QNAME = new QName("http://WS/", "deleteMovie");
    private final static QName _DeleteMovieResponse_QNAME = new QName("http://WS/", "deleteMovieResponse");
    private final static QName _EditCinema_QNAME = new QName("http://WS/", "editCinema");
    private final static QName _EditCinemaResponse_QNAME = new QName("http://WS/", "editCinemaResponse");
    private final static QName _EditMovie_QNAME = new QName("http://WS/", "editMovie");
    private final static QName _EditMovieResponse_QNAME = new QName("http://WS/", "editMovieResponse");
    private final static QName _GetAllCinema_QNAME = new QName("http://WS/", "getAllCinema");
    private final static QName _GetAllCinemaResponse_QNAME = new QName("http://WS/", "getAllCinemaResponse");
    private final static QName _GetAllMovie_QNAME = new QName("http://WS/", "getAllMovie");
    private final static QName _GetAllMovieResponse_QNAME = new QName("http://WS/", "getAllMovieResponse");
    private final static QName _GetAllScheduleByMovieId_QNAME = new QName("http://WS/", "getAllScheduleByMovieId");
    private final static QName _GetAllScheduleByMovieIdResponse_QNAME = new QName("http://WS/", "getAllScheduleByMovieIdResponse");
    private final static QName _GetComingSoonMovies_QNAME = new QName("http://WS/", "getComingSoonMovies");
    private final static QName _GetComingSoonMoviesResponse_QNAME = new QName("http://WS/", "getComingSoonMoviesResponse");
    private final static QName _GetMovie_QNAME = new QName("http://WS/", "getMovie");
    private final static QName _GetMovieResponse_QNAME = new QName("http://WS/", "getMovieResponse");
    private final static QName _GetShowingMovies_QNAME = new QName("http://WS/", "getShowingMovies");
    private final static QName _GetShowingMoviesResponse_QNAME = new QName("http://WS/", "getShowingMoviesResponse");
    private final static QName _GetStudiosByCinemaName_QNAME = new QName("http://WS/", "getStudiosByCinemaName");
    private final static QName _GetStudiosByCinemaNameResponse_QNAME = new QName("http://WS/", "getStudiosByCinemaNameResponse");
    private final static QName _GetUser_QNAME = new QName("http://WS/", "getUser");
    private final static QName _GetUserResponse_QNAME = new QName("http://WS/", "getUserResponse");
    private final static QName _Login_QNAME = new QName("http://WS/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://WS/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCinema }
     * 
     */
    public AddCinema createAddCinema() {
        return new AddCinema();
    }

    /**
     * Create an instance of {@link AddCinemaResponse }
     * 
     */
    public AddCinemaResponse createAddCinemaResponse() {
        return new AddCinemaResponse();
    }

    /**
     * Create an instance of {@link AddMovie }
     * 
     */
    public AddMovie createAddMovie() {
        return new AddMovie();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }

    /**
     * Create an instance of {@link DeleteMovie }
     * 
     */
    public DeleteMovie createDeleteMovie() {
        return new DeleteMovie();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

    /**
     * Create an instance of {@link EditCinema }
     * 
     */
    public EditCinema createEditCinema() {
        return new EditCinema();
    }

    /**
     * Create an instance of {@link EditCinemaResponse }
     * 
     */
    public EditCinemaResponse createEditCinemaResponse() {
        return new EditCinemaResponse();
    }

    /**
     * Create an instance of {@link EditMovie }
     * 
     */
    public EditMovie createEditMovie() {
        return new EditMovie();
    }

    /**
     * Create an instance of {@link EditMovieResponse }
     * 
     */
    public EditMovieResponse createEditMovieResponse() {
        return new EditMovieResponse();
    }

    /**
     * Create an instance of {@link GetAllCinema }
     * 
     */
    public GetAllCinema createGetAllCinema() {
        return new GetAllCinema();
    }

    /**
     * Create an instance of {@link GetAllCinemaResponse }
     * 
     */
    public GetAllCinemaResponse createGetAllCinemaResponse() {
        return new GetAllCinemaResponse();
    }

    /**
     * Create an instance of {@link GetAllMovie }
     * 
     */
    public GetAllMovie createGetAllMovie() {
        return new GetAllMovie();
    }

    /**
     * Create an instance of {@link GetAllMovieResponse }
     * 
     */
    public GetAllMovieResponse createGetAllMovieResponse() {
        return new GetAllMovieResponse();
    }

    /**
     * Create an instance of {@link GetAllScheduleByMovieId }
     * 
     */
    public GetAllScheduleByMovieId createGetAllScheduleByMovieId() {
        return new GetAllScheduleByMovieId();
    }

    /**
     * Create an instance of {@link GetAllScheduleByMovieIdResponse }
     * 
     */
    public GetAllScheduleByMovieIdResponse createGetAllScheduleByMovieIdResponse() {
        return new GetAllScheduleByMovieIdResponse();
    }

    /**
     * Create an instance of {@link GetComingSoonMovies }
     * 
     */
    public GetComingSoonMovies createGetComingSoonMovies() {
        return new GetComingSoonMovies();
    }

    /**
     * Create an instance of {@link GetComingSoonMoviesResponse }
     * 
     */
    public GetComingSoonMoviesResponse createGetComingSoonMoviesResponse() {
        return new GetComingSoonMoviesResponse();
    }

    /**
     * Create an instance of {@link GetMovie }
     * 
     */
    public GetMovie createGetMovie() {
        return new GetMovie();
    }

    /**
     * Create an instance of {@link GetMovieResponse }
     * 
     */
    public GetMovieResponse createGetMovieResponse() {
        return new GetMovieResponse();
    }

    /**
     * Create an instance of {@link GetShowingMovies }
     * 
     */
    public GetShowingMovies createGetShowingMovies() {
        return new GetShowingMovies();
    }

    /**
     * Create an instance of {@link GetShowingMoviesResponse }
     * 
     */
    public GetShowingMoviesResponse createGetShowingMoviesResponse() {
        return new GetShowingMoviesResponse();
    }

    /**
     * Create an instance of {@link GetStudiosByCinemaName }
     * 
     */
    public GetStudiosByCinemaName createGetStudiosByCinemaName() {
        return new GetStudiosByCinemaName();
    }

    /**
     * Create an instance of {@link GetStudiosByCinemaNameResponse }
     * 
     */
    public GetStudiosByCinemaNameResponse createGetStudiosByCinemaNameResponse() {
        return new GetStudiosByCinemaNameResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link ScheduleId }
     * 
     */
    public ScheduleId createScheduleId() {
        return new ScheduleId();
    }

    /**
     * Create an instance of {@link Studio }
     * 
     */
    public Studio createStudio() {
        return new Studio();
    }

    /**
     * Create an instance of {@link Cinema }
     * 
     */
    public Cinema createCinema() {
        return new Cinema();
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link SeatId }
     * 
     */
    public SeatId createSeatId() {
        return new SeatId();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link TicketId }
     * 
     */
    public TicketId createTicketId() {
        return new TicketId();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Admin }
     * 
     */
    public Admin createAdmin() {
        return new Admin();
    }

    /**
     * Create an instance of {@link Cashier }
     * 
     */
    public Cashier createCashier() {
        return new Cashier();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCinema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "addCinema")
    public JAXBElement<AddCinema> createAddCinema(AddCinema value) {
        return new JAXBElement<AddCinema>(_AddCinema_QNAME, AddCinema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCinemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "addCinemaResponse")
    public JAXBElement<AddCinemaResponse> createAddCinemaResponse(AddCinemaResponse value) {
        return new JAXBElement<AddCinemaResponse>(_AddCinemaResponse_QNAME, AddCinemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "addMovie")
    public JAXBElement<AddMovie> createAddMovie(AddMovie value) {
        return new JAXBElement<AddMovie>(_AddMovie_QNAME, AddMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "addMovieResponse")
    public JAXBElement<AddMovieResponse> createAddMovieResponse(AddMovieResponse value) {
        return new JAXBElement<AddMovieResponse>(_AddMovieResponse_QNAME, AddMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "deleteMovie")
    public JAXBElement<DeleteMovie> createDeleteMovie(DeleteMovie value) {
        return new JAXBElement<DeleteMovie>(_DeleteMovie_QNAME, DeleteMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "deleteMovieResponse")
    public JAXBElement<DeleteMovieResponse> createDeleteMovieResponse(DeleteMovieResponse value) {
        return new JAXBElement<DeleteMovieResponse>(_DeleteMovieResponse_QNAME, DeleteMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCinema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "editCinema")
    public JAXBElement<EditCinema> createEditCinema(EditCinema value) {
        return new JAXBElement<EditCinema>(_EditCinema_QNAME, EditCinema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCinemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "editCinemaResponse")
    public JAXBElement<EditCinemaResponse> createEditCinemaResponse(EditCinemaResponse value) {
        return new JAXBElement<EditCinemaResponse>(_EditCinemaResponse_QNAME, EditCinemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "editMovie")
    public JAXBElement<EditMovie> createEditMovie(EditMovie value) {
        return new JAXBElement<EditMovie>(_EditMovie_QNAME, EditMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "editMovieResponse")
    public JAXBElement<EditMovieResponse> createEditMovieResponse(EditMovieResponse value) {
        return new JAXBElement<EditMovieResponse>(_EditMovieResponse_QNAME, EditMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCinema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllCinema")
    public JAXBElement<GetAllCinema> createGetAllCinema(GetAllCinema value) {
        return new JAXBElement<GetAllCinema>(_GetAllCinema_QNAME, GetAllCinema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCinemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllCinemaResponse")
    public JAXBElement<GetAllCinemaResponse> createGetAllCinemaResponse(GetAllCinemaResponse value) {
        return new JAXBElement<GetAllCinemaResponse>(_GetAllCinemaResponse_QNAME, GetAllCinemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllMovie")
    public JAXBElement<GetAllMovie> createGetAllMovie(GetAllMovie value) {
        return new JAXBElement<GetAllMovie>(_GetAllMovie_QNAME, GetAllMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllMovieResponse")
    public JAXBElement<GetAllMovieResponse> createGetAllMovieResponse(GetAllMovieResponse value) {
        return new JAXBElement<GetAllMovieResponse>(_GetAllMovieResponse_QNAME, GetAllMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllScheduleByMovieId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllScheduleByMovieId")
    public JAXBElement<GetAllScheduleByMovieId> createGetAllScheduleByMovieId(GetAllScheduleByMovieId value) {
        return new JAXBElement<GetAllScheduleByMovieId>(_GetAllScheduleByMovieId_QNAME, GetAllScheduleByMovieId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllScheduleByMovieIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllScheduleByMovieIdResponse")
    public JAXBElement<GetAllScheduleByMovieIdResponse> createGetAllScheduleByMovieIdResponse(GetAllScheduleByMovieIdResponse value) {
        return new JAXBElement<GetAllScheduleByMovieIdResponse>(_GetAllScheduleByMovieIdResponse_QNAME, GetAllScheduleByMovieIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComingSoonMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getComingSoonMovies")
    public JAXBElement<GetComingSoonMovies> createGetComingSoonMovies(GetComingSoonMovies value) {
        return new JAXBElement<GetComingSoonMovies>(_GetComingSoonMovies_QNAME, GetComingSoonMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComingSoonMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getComingSoonMoviesResponse")
    public JAXBElement<GetComingSoonMoviesResponse> createGetComingSoonMoviesResponse(GetComingSoonMoviesResponse value) {
        return new JAXBElement<GetComingSoonMoviesResponse>(_GetComingSoonMoviesResponse_QNAME, GetComingSoonMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getMovie")
    public JAXBElement<GetMovie> createGetMovie(GetMovie value) {
        return new JAXBElement<GetMovie>(_GetMovie_QNAME, GetMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getMovieResponse")
    public JAXBElement<GetMovieResponse> createGetMovieResponse(GetMovieResponse value) {
        return new JAXBElement<GetMovieResponse>(_GetMovieResponse_QNAME, GetMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShowingMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getShowingMovies")
    public JAXBElement<GetShowingMovies> createGetShowingMovies(GetShowingMovies value) {
        return new JAXBElement<GetShowingMovies>(_GetShowingMovies_QNAME, GetShowingMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShowingMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getShowingMoviesResponse")
    public JAXBElement<GetShowingMoviesResponse> createGetShowingMoviesResponse(GetShowingMoviesResponse value) {
        return new JAXBElement<GetShowingMoviesResponse>(_GetShowingMoviesResponse_QNAME, GetShowingMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudiosByCinemaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getStudiosByCinemaName")
    public JAXBElement<GetStudiosByCinemaName> createGetStudiosByCinemaName(GetStudiosByCinemaName value) {
        return new JAXBElement<GetStudiosByCinemaName>(_GetStudiosByCinemaName_QNAME, GetStudiosByCinemaName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudiosByCinemaNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getStudiosByCinemaNameResponse")
    public JAXBElement<GetStudiosByCinemaNameResponse> createGetStudiosByCinemaNameResponse(GetStudiosByCinemaNameResponse value) {
        return new JAXBElement<GetStudiosByCinemaNameResponse>(_GetStudiosByCinemaNameResponse_QNAME, GetStudiosByCinemaNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
