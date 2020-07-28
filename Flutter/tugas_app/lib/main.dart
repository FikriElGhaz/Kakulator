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
                      'Indomie',
                      textAlign: TextAlign.center,
                    ),
                  ),
                ),
              ),
              Padding(
                padding: const EdgeInsets.all(30.0),
                child: Text(
                    'Indomie is produced by Indofood, the pioneer of instant noodles in Indonesia and is one of the largest instant noodles manufacturers in the world. Indomie comes in many varieties from the classic soup flavours such as Chicken, Vegetable, and Chicken Curry, to our most popular flavour Indomie Mi Goreng. '),
              ),
              Row(
                children: <Widget>[
                  Padding(
                      padding: EdgeInsets.only(left: 30.0),
                      child: CircleAvatar(
                          backgroundImage: NetworkImage(
                              'https://pbs.twimg.com/media/Eb77SbMWkAALuSY.jpg'))),
                  Column(
                    children: <Widget>[
                      Padding(
                        padding: EdgeInsets.only(left: 10.0),
                        child: Image.network(
                            'https://www.kreditpintar.com/wp-content/uploads/2019/07/gceoXx7gi.png',
                            height: 50,
                            width: 50.0),
                      ),
                      Padding(
                          padding: EdgeInsets.only(
                            left: 10.0,
                          ),
                          child: Text(
                            '"Baguus Banget"',
                            style: TextStyle(fontSize: 13.0),
                          ))
                    ],
                  )
                ],
              )
            ],
          )),
    );
  }
}
