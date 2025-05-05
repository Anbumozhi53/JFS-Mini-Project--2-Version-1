@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    @Autowired private AppointmentRepository repo;
    @Autowired private PatientRepository patientRepo;

    @PostMapping
    public Appointment book(@RequestParam Long patientId, @RequestBody Appointment a) {
        Patient p = patientRepo.findById(patientId).orElseThrow();
        a.setPatient(p);
        return repo.save(a);
    }

    @GetMapping
    public List<Appointment> all() {
        return repo.findAll();
    }
}
