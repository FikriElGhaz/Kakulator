import 'package:flutter/material.dart';
import 'package:resep_makanan_app/DetailPage.dart';

void main() {
  runApp(MaterialApp(debugShowCheckedModeBanner: false, home: MyApp()));
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.green,
        title: Text('Resep Makanan'),
      ),
      body: _PageList(),
    );
  }
}

final baseTextStyle = const TextStyle(color: Colors.white, fontFamily: 'arial');
final bigHeaderTextStyle =
    baseTextStyle.copyWith(fontSize: 24.0, fontWeight: FontWeight.bold);
final descTextStyle =
    baseTextStyle.copyWith(fontSize: 16.0, fontWeight: FontWeight.w400);
final footerTextStyle =
    baseTextStyle.copyWith(fontSize: 14.0, fontWeight: FontWeight.w400);

class _PageList extends StatefulWidget {
  @override
  __PageStateListState createState() => __PageStateListState();
}

class __PageStateListState extends State<_PageList> {
  List<String> namaResep = [
    'Nasi Goreng',
    'Soto Lamongan',
    'Soto Babat',
    'Pecel Lele',
    'Bakso',
    'Mie Ayam',
    'Rendang',
    'Sate',
    'Klepon',
    'Mie Aceh'
  ];

  List<String> deskResep = [
    'Resep sederhana Nasi Goreng ala Rumahan dengan bahan yang Mudah',
    'Resep membuat soto asal Lamongan, enak auto pindah ke Lamongan!',
    'Resep masak Soto Babat untuk 4 porsi, enak dan mudah',
    'Resep mudah masak Pecel Lele yang kriuk dan enak',
    'Resep buat bakso bulat bukan kotak yang enak dan mudah',
    'Resep membuat mie ayam, dengan bahan ayam dan mie pastinya',
    'Resep rendang dari padang yang ueeenaak dan empuk',
    'Resep sate ayam dengan bumbu kacang, dijamin bikin ketagihan',
    'Resep klepon yg viral karna tdk islami tpi itu Hoax, Ini enak kok!',
    'Resep mie asal aceh dijamin gampang dan ueeenaak pol',
  ];

  List<String> gambar = [
    'assets/images/nasi_goreng.jpg',
    'assets/images/soto_lamongan.jpg',
    'assets/images/soto_babat.jpg',
    'assets/images/pecel_lele.jpg',
    'assets/images/bakso.jpg',
    'assets/images/mie_ayam.jpg',
    'assets/images/rendang.jpg',
    'assets/images/sate.jpg',
    'assets/images/klepon.jpg',
    'assets/images/mie_aceh.jpg',
  ];

  @override
  Widget build(BuildContext context) {
    return Container(
      child: ListView.builder(
        itemCount: namaResep.length,
        itemBuilder: (BuildContext context, int index) {
          final title = namaResep[index].toString();
          final subTitle = deskResep[index].toString();
          final img = gambar[index].toString();
          return Container(
            height: 200.0,
            padding: EdgeInsets.all(8.0),
            child: GestureDetector(
                child: Stack(
                  children: <Widget>[
                    backgroundImage(img),
                    Container(
                        child: topContent(
                      title,
                      subTitle,
                    ))
                  ],
                ),
                onTap: () {
                  Navigator.push(
                      context,
                      MaterialPageRoute(
                          builder: (context) => DetailPage(
                                itemJudul: title,
                                itemSub: subTitle,
                                itemImage: img,
                              )));
                }),
          );
        },
      ),
    );
  }

  backgroundImage(String gambar) {
    return new Container(
      decoration: BoxDecoration(
          borderRadius: BorderRadius.circular(20.0),
          image: DecorationImage(
              fit: BoxFit.fill,
              colorFilter: ColorFilter.mode(
                  Colors.black.withOpacity(0.5), BlendMode.luminosity),
              image: AssetImage(gambar))),
    );
  }

  topContent(String title, String subTitle) {
    return new Container(
        child: Padding(
      padding: EdgeInsets.all(20.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisAlignment: MainAxisAlignment.end,
        mainAxisSize: MainAxisSize.max,
        children: <Widget>[
          Text(
            title,
            style: bigHeaderTextStyle,
          ),
          Text(
            subTitle,
            style: descTextStyle,
          ),
        ],
      ),
    ));
  }
}
