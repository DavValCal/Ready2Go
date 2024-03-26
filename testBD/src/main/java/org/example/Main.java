package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Configurar la conexión a la base de datos
        String url = "jdbc:postgresql://localhost:5432/appadminuser";
        String usuario = "appadminuser";
        String contraseña = "supersecurepass";

        // Definir los valores del nuevo usuario
        String name = "Juan";
        String surname = "Pérez";
        String urlImg = "http://example.com/image.jpg";
        String email = "juan@example.com";
        String password = "password123";
        boolean passwordValidated = true;
        String token = "token123";
        String oauthPlatform = "OAuth";
        String city = "Ciudad";
        String country = "País";
        int userID = 1; // La referencia a la lista de amigos, en este caso asumimos 1

        // Crear la conexión
        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            // Preparar la sentencia SQL
            String sql = "INSERT INTO Users (name, surname, urlImg, email, password, passwordValidated, token, oauthPlatform, city, country, userID) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, urlImg);
            statement.setString(4, email);
            statement.setString(5, password);
            statement.setBoolean(6, passwordValidated);
            statement.setString(7, token);
            statement.setString(8, oauthPlatform);
            statement.setString(9, city);
            statement.setString(10, country);
            statement.setInt(11, userID);

            // Ejecutar la sentencia SQL
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Nuevo usuario insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el nuevo usuario.");
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar el nuevo usuario: " + e.getMessage());
        }
    }
}