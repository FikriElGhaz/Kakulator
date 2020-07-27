import 'package:flutter/material.dart';
import 'package:profile_app/splash.dart';

void main() {
  runApp(Splash());
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(primaryColor: Colors.pinkAccent),
      home: Scaffold(
        backgroundColor: Colors.white,
        appBar: AppBar(
          title:
              Text('My Profil', style: TextStyle(fontWeight: FontWeight.bold)),
          centerTitle: true,
        ),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: <Widget>[
           Image.asset('assets/images/ig.png', width: 100.0, height: 100.0,),
            SizedBox(
              height: 30.0,
            ),
            Text(
              'Udin',
              style: TextStyle(fontSize: 16.0, fontWeight: FontWeight.bold),
            ),
            SizedBox(
              height: 30.0,
            ),
            Padding(
              padding: const EdgeInsets.all(24.0),
              child: Card(
                elevation: 16.0,
                child: ListTile(
                  title: Text(
                    'udinkeren@gmail.com',
                    textAlign: TextAlign.center,
                  ),
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(24.0),
              child: Card(
                elevation: 16.0,
                child: ListTile(
                  title: Text(
                    '0813-1234-9371',
                    textAlign: TextAlign.center,
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
