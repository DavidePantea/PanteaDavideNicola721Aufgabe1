import java.time.LocalDateTime;

public class Diagnostiker {
    public Diagnostiker(int id, String patient, String symptom, String diagnose, String datum, String krankenHaus) {
        this.id = id;
        this.patient = patient;
        this.symptom = symptom;
        this.diagnose = diagnose;
        this.datum = datum;
        this.krankenHaus = krankenHaus;
    }

    private int id;
    private String patient;
    private String symptom;
    private String diagnose;
    private String datum;
    private String krankenHaus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getKrankenHaus() {
        return krankenHaus;
    }

    public void setKrankenHaus(String krankenHaus) {
        this.krankenHaus = krankenHaus;
    }




}
