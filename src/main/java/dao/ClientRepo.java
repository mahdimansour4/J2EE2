package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClientRepo {
    private Connection cnx;
    public ClientRepo() throws Exception {
        cnx = DbConnection.getCnx();
    }

    public void ajouterClient(Client c) throws Exception {
        String sql = "INSERT INTO `client`(`nom`, `prenom`, `numTel`) VALUES (?,?,?)";
        PreparedStatement ps = cnx.prepareStatement(sql);
        ps.setString(1, c.getNom());
        ps.setString(2, c.getPrenom());
        ps.setInt(3, c.getNumTel());
        ps.executeUpdate();
    }

    public Client rechercherClient(int id) throws Exception {
        String sql = "SELECT * FROM `client` WHERE `id` = " + id;
        Statement st = cnx.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Client c = new Client();
        while (rs.next()) {
            c.setId(rs.getInt(1));
            c.setNom(rs.getString(2));
            c.setPrenom(rs.getString(3));
            c.setNumTel(rs.getInt(4));
        }
        return c;
    }
}
