public class Administrateur implements Utilisateur {

    private String Nom;
    private String Prenom;
    private String Email;
    private String Telephone;
    private String MotDePasse;


    public Administrateur(String Nom, String Prenom){
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    @Override
    public String getNom() {
        return Nom;
    }

    @Override
    public String getPrenom() {
        return Prenom;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public String getTelephone() {
        return Telephone;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    @Override
    public void setNom(String NouveauNom) {
        Nom = NouveauNom;
    }

    @Override
    public void setPrenom(String NouveauPrenom) {
        Prenom = NouveauPrenom;
    }

    @Override
    public void setEmail(String NouvelEmail) {
        Email = NouvelEmail;
    }

    @Override
    public void setTelephone(String NouveauNumero) {
        Telephone = NouveauNumero;
    }

    @Override
    public void setMotDePasse(String NouveauMotDePasse) {
        MotDePasse = NouveauMotDePasse;
    }

}
