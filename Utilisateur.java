public interface Utilisateur {

    String getNom();
    String getPrenom();
    String getEmail();
    String getTelephone();

    void setNom(String NouveauNom);
    void setPrenom(String NouveauPrenom);
    void setEmail(String NouvelEmail);
    void setTelephone(String NouveauNumero);
    void setMotDePasse(String NouveauMotDePasse);

}
