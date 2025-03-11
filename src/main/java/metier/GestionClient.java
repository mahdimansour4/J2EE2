package metier;


import dao.ClientRepo;
import dao.Client;

public class GestionClient {
    private ClientRepo clientRepo;

    public GestionClient() throws Exception {
        clientRepo = new ClientRepo();
    }

    public void addClient(Client c) throws Exception {
        clientRepo.ajouterClient(c);
    }

    public Client searchClient(int id) throws Exception {
        return clientRepo.rechercherClient(id);
    }
    public void updateClient(Client c) throws Exception {
        clientRepo.modifierClient(c);
    }
    public void deleteClient(int id) throws Exception {
        clientRepo.supprimerClient(id);
    }
    public void listClient() throws Exception {
        clientRepo.listerClient();
    }

}
