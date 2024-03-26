import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false, // Oculta el banner de debug
      title: 'Ready2Go',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: LoginScreen(),
    );
  }
}

class LoginScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        // Usamos un Container para ocupar todo el espacio
        width: double
            .infinity, // Ancho infinito para ocupar todo el espacio horizontal
        height: double
            .infinity, // Alto infinito para ocupar todo el espacio vertical
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('img/eiffel_tower.jpg'),
            fit: BoxFit
                .cover, // Ajustamos la imagen para que cubra todo el espacio
          ),
        ),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: <Widget>[
            Text(
              'Ready2Go',
              style: TextStyle(
                color: Colors.white,
                fontSize: 48,
                fontWeight: FontWeight.bold,
              ),
            ),
            SizedBox(height: 200),
            ElevatedButton(
              child: Text('Iniciar Sesión'),
              onPressed: () {},
              style: ElevatedButton.styleFrom(
                foregroundColor: Colors.black,
                backgroundColor: Colors.white,
                shape: StadiumBorder(),
                padding: EdgeInsets.symmetric(horizontal: 120, vertical: 20),
              ),
            ),
            TextButton(
              child: Text('No tienes cuenta? Registrate'),
              onPressed: () {},
              style: TextButton.styleFrom(
                foregroundColor: Colors.white,
              ),
            ),
          ],
        ),
      ),
    );
  }
}
