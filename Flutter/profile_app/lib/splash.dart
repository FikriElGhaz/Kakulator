import 'dart:async';

import 'package:flutter/material.dart';
import 'package:profile_app/main.dart';

class Splash extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    Timer(
        Duration(seconds: 3),
        () => {
              Navigator.pushReplacement(
                  context, MaterialPageRoute(builder: (context) => MyApp()))
            });

    return MaterialApp(
        home: Scaffold(
            body: Container(
      child: Center(child: Text('Splash')),
    )));
  }
}
