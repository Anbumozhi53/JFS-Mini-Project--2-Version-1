@Entity
public class Medication {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String dosage;

    @ManyToOne
    private Patient patient;

    // Getters and Setters
}


public interface PatientRepository extends JpaRepository<Patient, Long> {}
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {}
public interface MedicationRepository extends JpaRepository<Medication, Long> {}


@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired private PatientRepository repo;

    @PostMapping
    public Patient register(@RequestBody Patient p) {
        return repo.save(p);
    }

    @GetMapping
    public List<Patient> list() {
        return repo.findAll();
    }
}
