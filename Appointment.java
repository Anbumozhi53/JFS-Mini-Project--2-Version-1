

@Entity
public class Appointment {
    @Id @GeneratedValue
    private Long id;

    private String date;
    private String time;
    private String doctor;

    @ManyToOne
    private Patient patient;

    // Getters and Setters
}
