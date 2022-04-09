public abstract class Compte {

    String MotDePasse;
    Utilisateur proprietaire;

    protected Compte(Utilisateur user, String MDP) {
        this.proprietaire = user;
        this.MotDePasse = MDP;
    }
}
