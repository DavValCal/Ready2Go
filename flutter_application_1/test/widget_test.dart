//import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:flutter_application_1/main.dart'; // Asegúrate de que el nombre del paquete sea correcto.

void main() {
  testWidgets('Login and Register buttons are present', (WidgetTester tester) async {
    // Build our app and trigger a frame.
    await tester.pumpWidget(MyApp());

    // Verify that our buttons are present.
    expect(find.text('Iniciar Sesion'), findsOneWidget);
    expect(find.text('No tienes cuenta? Registrate'), findsOneWidget);
  });
}
