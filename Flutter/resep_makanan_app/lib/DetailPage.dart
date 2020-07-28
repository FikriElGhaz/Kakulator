import 'package:flutter/material.dart';

class DetailPage extends StatelessWidget {
  final String itemJudul;
  final String itemSub;
  final String itemImage;
  final String itemResep;

  const DetailPage(
      {Key key, this.itemJudul, this.itemSub, this.itemImage, this.itemResep})
      : super(key: key);

  goBack(BuildContext context) {
    Navigator.pop(context);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.green,
          title: Text(
            'Resep ' + itemJudul,
            style: TextStyle(color: Colors.white),
          ),
        ),
        body: Stack(
          children: <Widget>[
            Image.asset(itemImage),
            Container(
              width: 500.0,
              height: 500.0,
              margin: EdgeInsets.only(top: 200.0),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(20.0),
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(left: 20.0, top: 220.0),
              child: Text(
                itemJudul,
                style: TextStyle(
                    color: Colors.green,
                    fontSize: 20.0,
                    fontWeight: FontWeight.bold),
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(left: 20.0, top: 250.0),
              child: Text(
                itemSub,
                style: TextStyle(
                  color: Colors.black54,
                  fontSize: 14.0,
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(left: 20.0, top: 300.0),
              child: Text(
                'Bahan Bahan',
                style: TextStyle(
                    color: Colors.orange,
                    fontSize: 16.0,
                    fontWeight: FontWeight.bold),
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(left: 20.0, top: 320.0),
              child: Text(
                '''1. Sayur
2.Cabe
3.Tomat
4.Garam
5.Gula
                ''',
                style: TextStyle(
                  color: Colors.black54,
                  fontSize: 14.0,
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(left: 20.0, top: 410.0),
              child: Text(
                'Cara Masak',
                style: TextStyle(
                    color: Colors.orange,
                    fontSize: 16.0,
                    fontWeight: FontWeight.bold),
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(left: 20.0, top: 430.0),
              child: Text(
                '''1.Masukan Bahan
2.Campur bahan
3.Nyalakan Api
4.Tunggu sampai matang
5.Jadi
                ''',
                style: TextStyle(
                  color: Colors.black54,
                  fontSize: 14.0,
                ),
              ),
            ),
          ],
        ));
  }
}
