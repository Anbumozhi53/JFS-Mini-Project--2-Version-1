@Entity
public class Patient {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String contact;
    private String medicalHistory;

    // Getters and Setters
}
