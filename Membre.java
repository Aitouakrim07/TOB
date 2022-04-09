public class Membre implements Utilisateur {

    private String Nom;
    private String Prenom;
    private String Sexe;
    private String Adresse;
    private String Email;
    private String Telephone;
    private String DateDeNaissance;
    private String MotDePasse;
    private CarteBancaire CarteBancaire;

    public Membre(String Nom, String Prenom, String DateDeNaissance, CarteBancaire CarteBancaire){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.DateDeNaissance = DateDeNaissance;
        this.CarteBancaire = CarteBancaire;
    }

    @Override
    public String getNom() {
        return Nom;
    }

    @Override
    public String getPrenom() {
        return Prenom;
    }

    public String getSexe() {
        return Sexe;
    }

    public String getAdresse() {
        return Adresse;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public String getTelephone() {
        return Telephone;
    }

    public String getDateDeNaissance() {
        return DateDeNaissance;
    }

    @Override
    public void setNom(String NouveauNom) {
        Nom = NouveauNom;
    }

    @Override
    public void setPrenom(String NouveauPrenom) {
        Prenom = NouveauPrenom;
    }

    public void setSexe(String NouveauSexe) {
        Sexe = NouveauSexe;
    }

    public void setAdresse(String NouvelleAdresse) {
        Adresse = NouvelleAdresse;
    }

    @Override
    public void setEmail(String NouvelEmail) {
        Email = NouvelEmail;
    }

    @Override
    public void setTelephone(String NouveauNumero) {
        Telephone = NouveauNumero;
    }

    public void setDateDeNaissance(String NouvelleDateDeNaissance) {
        DateDeNaissance = NouvelleDateDeNaissance;
    }

    @Override
    public void setMotDePasse(String NouveauMotDePasse) {
        MotDePasse = NouveauMotDePasse;
    }

    public CarteBancaire getCarteBancaire() {
        return CarteBancaire;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public void setCarteBancaire(CarteBancaire carteBancaire) {
        CarteBancaire = carteBancaire;
    }
}
