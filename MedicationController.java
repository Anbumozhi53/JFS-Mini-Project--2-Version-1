@RestController
@RequestMapping("/api/medications")
public class MedicationController {
    @Autowired private MedicationRepository repo;
    @Autowired private PatientRepository patientRepo;

    @PostMapping
    public Medication add(@RequestParam Long patientId, @RequestBody Medication m) {
        Patient p = patientRepo.findById(patientId).orElseThrow();
        m.setPatient(p);
        return repo.save(m);
    }

    @GetMapping
    public List<Medication> all() {
        return repo.findAll();
    }
}
