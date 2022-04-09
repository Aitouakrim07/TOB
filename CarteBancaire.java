public class CarteBancaire {

    private String proprietaire;
    private String numeroCB;
    private String cryptoVisuel;
    /**
     * Construire une carte bancaire à la base de
     * @param proprietaire : nom et prenom du propriétaire de la carte
     * @param numeroCB : numéro de la carte
     * @param cvc : cryptogramme visuel
     */
    public CarteBancaire(String proprietaire, String numeroCB, String cvc) {
        this.proprietaire = proprietaire;
        this.numeroCB = numeroCB;
        this.cryptoVisuel = cvc;
    }

}
