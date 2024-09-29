package dao;

import db.DbConnect;
import model.Musica;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MusicaDao {

    Connection connection;

    public MusicaDao() throws ClassNotFoundException, SQLException {
        connection = DbConnect.getConnection();
    }

    public void addMusica(Musica musica) throws SQLException {
        try {

            PreparedStatement pst = connection.prepareStatement("insert into musica(nome, estiloMusical) values(?,?)");
            pst.setString(1, musica.getNome());
            pst.setString(2, musica.getEstiloMusical());

            pst.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Musica> getAllMusicas() throws  SQLException {
        List<Musica> musicas = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from musica");

            while (rs.next()) {
                Musica musica = new Musica();

                musica.setID(rs.getInt("id"));
                musica.setNome(rs.getString("nome"));
                musica.setEstiloMusical(rs.getString("estiloMusical"));

                musicas.add(musica);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return musicas;
    }
}
