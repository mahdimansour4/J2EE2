package presentation;

import dao.Client;
import metier.GestionClient;

public class TestClient {
    public static void main(String[] args) {
        try{
            GestionClient gc = new GestionClient();
            Client c1 = new Client(0,"M","M",06);
            Client c2 = new Client(0,"A","A",07);
            Client c3 = new Client(0,"B","B",05);
            gc.addClient(c1);
            gc.addClient(c2);
            gc.addClient(c3);
            System.out.print(gc.searchClient(2));
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
