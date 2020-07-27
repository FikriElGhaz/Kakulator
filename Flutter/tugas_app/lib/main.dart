import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
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
      theme: ThemeData(primaryColor: Colors.lightBlueAccent),
      home: Scaffold(
          backgroundColor: Colors.white,
          appBar: AppBar(
            title: Text(
              'Flutter Produk',
              style: TextStyle(color: Colors.white),
            ),
          ),
          body: Column(
            children: <Widget>[
              Image.network(
                'https://shop.kosera.co.id/wp-content/uploads/2020/04/INDOMIE-GORENG.png',
                height: 200.0,
                width: 200.0,
              ),
              Padding(
                padding: const EdgeInsets.only(left: 20.0, right: 200.0),
                child: Card(
                  child: ListTile(
                    title: Text(
                      'Rp 3.000',
                      textAlign: TextAlign.center,
                    ),
                  ),
                ),
              ),
              SizedBox(
                height: 10.0,
              ),
              Padding(
                padding: const EdgeInsets.only(left: 20.0, right: 200.0),
                child: Card(
                  child: ListTile(
                    title: Text(
                      'Rp 3.000',
                      textAlign: TextAlign.center,
                    ),
                  ),
                ),
              ),
              Padding(
                padding: const EdgeInsets.all(30.0),
                child: Text(
                    'Indomie is produced by Indofood, the pioneer of instant noodles in Indonesia and is one of the largest instant noodles manufacturers in the world. Indomie comes in many varieties from the classic soup flavours such as Chicken, Vegetable, and Chicken Curry, to our most popular flavour Indomie Mi Goreng. Available in over 80 countries around the world such as Australia, New Zealand, USA, Canada, throughout Asia, Africa, Europe and Middle Eastern countries. With over 20 billion packs sold annually, it’s no wonder that Indomie is flavour, favoured by the world.'),
              ),
              Row(
                children: <Widget>[CircleAvatar()],
              )
            ],
          )),
    );
  }
}
