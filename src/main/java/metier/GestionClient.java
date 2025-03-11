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

}
