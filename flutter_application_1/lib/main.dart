import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
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
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('img/eiffel_tower.jpg'), 
            fit: BoxFit.cover,
          ),
        ),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
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
              onPressed: () {
                
              },
              style: ElevatedButton.styleFrom(
                primary: Colors.white,
                onPrimary: Colors.black,
                shape: StadiumBorder(),
                padding: EdgeInsets.symmetric(horizontal: 120, vertical: 20),
              ),
            ),
            TextButton(
              child: Text('No tienes cuenta? Registrate'),
              onPressed: () {
                
              },
              style: TextButton.styleFrom(
                primary: Colors.white,
              ),
            ),
          ],
        ),
      ),
    );
  }
}