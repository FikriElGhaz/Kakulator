package com.fikri.apple.muslimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    String[] namaNabi = {"Nabi Adam As",
            "Nabi Idris As",
            "Nabi Nuh As",
            "Nabi Hud As",
            "Nabi Soleh As",
            "Nabi Ibrahim As",
            "Nabi Luth As",
            "Nabi Ismail As",
            "Nabi Ishaq As",
            "Nabi Yakub As",
            "Nabi Yusuf As",
            "Nabi Ayub As",
            "Nabi Syu'aib As",
            "Nabi Musa As",
            "Nabi Harun As",
            "Nabi Zulkifli As",
            "Nabi Daud As",
            "Nabi Sulaiman As",
            "Nabi Ilyas As",
            "Nabi Ilyasa As",
            "Nabi Yunus As",
            "Nabi Zakaria As",
            "Nabi Yahya",
            "Nabi Isa As",
            "Nabi Muhammad SAW"};

    String[] kisahNabi = {"Nabi Adam AS adalah manusia dan nabi pertama. Beliau diciptakan dari tanah. Awalnya, Nabi Adam AS tinggal di surga sendirian. Lalu, Allah menciptakan seorang perempuan bernama Hawa untuk menjadi pasangannya. Suatu saat mereka berbuat kesalahan di surga, dengan memakan buah khuldi, satu-satunya buah yang dilarang Allah untuk dikonsumsi. Karena godaan dari syaitan, maka Nabi Adam AS dan Hawa melanggar larangan-Nya. Mereka bertaubat dan Allah SWT memaafkannya, namun mereka harus diturunkan ke bumi.\n" +
            "\n" +
            "Tahun/Zaman\n" +
            "Nabi Adam hidup di bumi pada tahun 5872–4942 sebelum masehi atau selama 930 tahun.\n" +
            "\n" +
            "Mukjizat\n" +
            "Setiap nabi dan rasul biasanya memiliki mukjizat tertentu atas izin Allah SWT. Mukjizat Nabi Adam AS adalah sebagai manusia dan khalifah pertama di bumi.\n" +
            "\n" +
            "Silsilah Kenabian\n" +
            "Nabi Adam AS tidak memiliki silsilah kenabian, sebab beliau adalah manusia sekaligus nabi pertama.",

            "Nabi Idris adalah seorang nabi yang mendapatkan keistimewaan dari Allah SWT. Beliau diperkirakan lahir di daerah Irak dan melakukan dakwah kepada kaum Bani Qabil dan Memfis. Namun ada pula yang menyebutnya lahir di Mesir. Nabi Idris adalah seorang manusia yang sangat pandai dan mempunyai kecerdasan dalam berbagai ilmu, seperti menulis, berhitung, ilmu perbintangan, ilmu alam, ilmu kesehatan, menjahit serta memakai baju, dan sebagainya. Beliau termasuk nabi yang tidak wafat di bumi, melainkan saat diangkat ke langit sebagai manusia pilihan Allah.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Idris AS diperkirakan hidup di bumi pada zaman 4533 – 4188 sebelum masehi atau 345 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Karena Nabi Idris AS bisa menulis, mukjizat yang dimilikinya adalah sebagai manusia pertama yang menulis dengan pena.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 6 dari Nabi Adam AS. Garis keturunannya adalah dari Adam AS, Syits, Anusy, Qinan, Mihlail, Yarid, dan Idris AS.",

            "Nabi Nuh AS adalah nabi dan rasul pertama yang diperintahkan oleh Allah untuk menuntun para kaumnya ke jalan yang benar dari penyimpangan besar. Beliau juga mendapat gelar Uluz Azmi, berkat kesabaran dan ketabahannya yang luar biasa dalam menghadapi kaumnya.\n" +
                    "\n" +
                    "Beliau mempunyai 4 orang anak. Bahkan istri dan anaknya yang bernama Kan’an tidak mempercayai ajaran lurusnya dari Allah SWT, kemudian menjadi musuhnya. Akibat dari ulah para kaum yang tidak mempercayai ajaran Allah dan selalu membangkangnya, maka Allah memberikan azab berupa musibah tsunami besar yang menewaskan semuanya, kecuali Nabi Nuh AS dan para pengikutnya.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Nuh AS diriwayatkan hidup di bumi pada tahun 3993 – 3043 sebelum masehi atau 950 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Allah memerintahkan Nabi Nuh AS untuk membuat sebuah kapal besar. Beliau mengikuti perintah Allah tersebut dan menaikinya bersama para pengikutnya. Beliau dan para pengikutnya pun selamat dari bencana tsunami dahsyat yang ditimpakan Allah SWT sebagai peringatan.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Nabi Nuh AS adalah keturunan ke 9 Nabi Adam AS. Garis keturunannya dimulai dari Adam AS, Syits, Anusy, Qinan, Mihlail, Yaris, Idris AS, Matusyalih, Lamak, dan Nuh AS.",

            "Nabi Hud AS berasal dari suku ‘Aad yang hidup di daerah jazirah Arab. Suku tersebut menyembah berhala yang disebut dengan Shamud, Shada dan Al Haba. Mereka semua tidak mengenal adanya Tuhan dan menyembah berhala karena kepercayaan. Kaum ‘Aad selalu berfoya-foya dan mengabaikan peringatan dari Nabi Hud untuk menyembah Allah SWT.\n" +
                    "\n" +
                    "Akibat dari kekafiran kaum Hud, Allah mendatangkan azab berupa musibah kekeringan pada tanah yang terkenal subur tersebut. Akan tetapi, suku ‘Aad tidak bertaubat, sehingga Allah menurunkan azab kedua berupa badai yang membinasakan mereka.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Hud diperkirakan hidup di dunia pada tahun 2450 – 2320 sebelum masehi atau 130 tahun lamanya.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau dan para pengikutnya diberikan keselamatan oleh Allah SWT atas bencana badai yang menimpa suku ‘Aad. Kemudian, beliau berhijrah ke Hadramaut dan wafat disana.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 8 dari Nabi Nuh AS. Garis keturunannya dimulai dari Nabi Nuh AS, Iram, ‘Aush, ‘Ad, Al Khulud, Rabah, Abdullah dan Nabi Hud AS.",

            "Nabi Shalih AS adalah seorang nabi dan rasul yang diutus untuk berdakwah kepada kaum Tsamud yang berada di daerah Oman. Namun, kaum tersebut tidak mempercayai ajaran dari Nabi Shalih dan terus membangkang. Meskipun mereka telah melihat mukjizat yang diberikan oleh Allah kepada Nabi Shalih AS, tetap saja kaum Tsamud ingkar. Kemudian, datanglah azab dari Allah melalui Malaikat Jibril yang membinasakan mereka.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Shalih AS diperkirakan hidup pada tahun 2150 – 2080 sebelum masehi atau 70 tahun lamanya.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Allah memberikan mukjizat kepada Nabi Shalih AS berupa munculnya unta betina dari celah batu. Tapi, kaum Tsamud membunuh hewan tersebut dan mengingkari ajaran beliau.\n" +
                    "\n" +
                    "Silsihah Kenabian\n" +
                    "Nabi Shalih AS adalah keturunan ke 10 Nabi Nuh AS. Garis keturunannya dari Nabi Nuh AS, Sam, Iram, Amir, Tsamud, Hadzir, Ubaid, Masah, Asif, Ubaid dan Nabi Shalih AS.",

            "Nabi Ibrahim AS juga termasuk nabi dan rasul yang mendapat gelar Ulul Azmi. Beliau hidup di zaman Raja Namrud yang mempunyai kebijakan untuk membunuh semua bayi laki-laki yang baru lahir. Selain itu, raja tersebut menyembah berhala, bahkan kedua orang tuanya adalah pembuat berhala tersebut. Beliau juga mendapat ujian karena belum dikaruniai anak setelah menikah dengan Sarah, kemudian istrinya tersebut memintanya untuk menikahi seorang budak bernama Hajar. Tak cukup sampai disitu, beliau juga mendapat ujian untuk menyembelih anaknya yang bernama Ismail. Karena ketaatannya tersebut, Allah mengganti Ismail dengan seekor domba. Kisah inilah yang menjadi awal dari Idul Adha.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup di bumi pada zaman 1997 – 1822 sebelum masehi atau 175 tahun lamanya.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Mukjizat yang dimiliki oleh Nabi Ibrahim adalah selamatnya beliau dari hukuman berupa dibakar hidup-hidup oleh Raja Namrud.\n" +
                    "\n" +
                    "Silsiah Kenabian\n" +
                    "Nabi Ibrahim AS merupakan keturunan ke 10 Nabi Nuh AS dengan garis berbeda dari Nabi Shalih AS. Dimulai dari Nabi Nuh AS, Sam, Arfakhsyad, Shalih, Abir, Falij, Ra’u, Saruj, Nahur, Tarakh dan Ibrahim AS.",

            "Kisah Nabi Luth AS ini terkenal dengan kemungkaran kaumnya di daerah Sodom, Yordania. Mereka melakukan perbuatan tak beradab dengan maraknya homoseksual dan lesbian. Nabi Luth AS pun telah memperingatkan kaumnya tersebut untuk meninggalkan perbuatan tercela dan kembali ke jalan yang benar. Namun, tak ada yang mempedulikan dan justru mencelanya. Beliau mendapat ujian bahwa istrinya juga termasuk orang yang mengingkarinya.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Luth AS hidup pada zaman 1950 – 1870 sebelum masehi atau 80 tahun lamanya.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau dan para pengikutnya dilindungi oleh Allah SWT dari azab yang diturunkan untuk kaum Sodom.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keponakan dari Nabi Ibrahim AS. Garis keturunan dimulai dari Nuh AS, Sam, Arfakhsyad, Shalih, Bir, Falij, Ra’u, Saruj, Nahur, Tarakh, Haran dan Luth AS.",

            "Nabi Ismail AS merupakan keturunan langsung dari Nabi Ibrahin AS dengan istri keduanya yang berstatus budak, yakni Hajar. Suatu hari, Hajar diutus untuk pergi ke Mekkah yang saat itu hanya berupa padang pasir tandus. Ia kehabisan air susu dan berlari dari bukit Shafa hingga Marwah untuk mencari air. Atas izin Allah, ia mendapatkan sumber air yang terkenal sebagai air zam-zam. Nabi Ismail AS juga pernah hampir disembelih oleh ayahnya sendiri, atas petunjuk Allah SWT. Karena keduanya sangat sabar dan taat, maka sembelihan itu diganti dengan domba. Keduanya juga berperan dalam pembangunan Ka’bah di Mekkah.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Ismail hidup pada zaman 1911 – 1774 sebelum masehi atau selama 137 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Keluarnya mata air zam-zam ketika ibunya berjuang mencari air dari bukit Shafa hingga Marwah dan menjadi manusia pertama yang melaksanakan ibadah haji.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah anak kandung Nabi Ibrahim AS dengan Hajar.",

            "Nabi Ishaq AS merupakan saudara tiri dari Nabi Ismail AS dari istri pertama Nabi Ibrahim AS. Beliau bersama Nabi Ismail AS menjadi penerus dakwah sang Ayah kepada kaum-kaumnya. Suatu hari Nabi Ishaq AS belum juga menikah, namun sang ayah menyuruhnya untuk tidak menikah dengan kaum Kana’an yang ingkar. Akhirnya, beliau menikah dengan perempuan dari negeri Harran.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 1897 – 1717 sebelum masehi atau selama 180 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Nabi Ishaq AS diberi ujian dengan mempunyai istri yang mandul. Tapi beliau tetap bersabar dan akhirnya diberi keturunan yang kembar.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau merupakan anak kandung dari Nabi Ibrahin AS dari istrinya Sarah.",

            "Nabi Ya’qub mempunyai saudara kembar bernama Aish. Saudaranya itu pernah merasa iri dengannya dan mengancam akan membunuhnya. Beliau kemudian mengungsi ke Harran. Setelahnya, beliau menikah dan memiliki 4 orang istri. Dari keempat istrinya tersebut, beliau dikaruniai 12 orang anak dan menjadi awal dari peradaban kaum Bani Israil.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 1837 – 1690 sebelum masehi, atau 147 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau memiliki 12 anak yang banyak diantara keturunan-keturunannya menjadi nabi dan rasul.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah anak kandung dari Nabi Ishaq AS.",

            "Nabi Yusuf AS dikenal akan ketampanannya. Bahkan diriwayatkan beliau menjadi manusia tertampan di dunia. Banyak wanita yang tergoda dengannya, termasuk istri dari tuannya. Namun, beliau selalu menolak semua wanita tersebut. Beliau juga pernah hampir dibunuh oleh saudara-saudara kandungnya yang merasa iri akan kasih sayang dari sang Ayah.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Yusuf AS hidup pada zaman 1745 – 1635 sebelum masehi atau 110 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau adalah penafsir mimpi yang ulung. Bahkan raja pernah meminta bantuannya untuk mengartikan mimpi tersebut.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau merupakan anak kandung dari Nabi Ya’qub AS.",

            "Nabi Ayyub AS dikatakan sebagai teladan dari kesabaran. Beliau adalah manusia yang paling sabar ketika Allah SWT mengujinya dengan harta, keluarga, dan penyakit. Beliau menderita penyakit kronis dalam waktu yang lama.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup di zaman 1540 – 1420 sebelum masehi atau 120 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Allah memerintahkan beliau untuk menghentakkan kakinya di tanah dan muncullah pancaran air. Air tersebut menyembuhkan penyakitnya.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 5 Nabi Ishaq. Garis keturunannya mulai dari Ishaq AS, Al Aish, Rum, Tawakh, Amush dan Ayyub AS.",

            "Nabi Syu’aib tinggal di daerah Gunung Sinai yang dihuni oleh kaum Madyan. Kaum tersebut terkenal karena perbuatan curangnya dalam menakar timbangan dan menyembah berhala. Nabi Syu’aib kemudian berdoa agar menurunkan azab pada mereka. Azab pertama adalah cuaca yang sangat panas, lalu Allah mendatangkan awan yang sangat gelap dan menurunkan petir yang menyambar serta gempa bumi pada kaum tersebut.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 1600 – 1490 sebelum masehi atau 110 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Allah SWT mengabulkan doanya untuk memberikan azab yang membinasakan kaum Madyan.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau merupakan keturunan keempat Nabi Ibrahim AS. Garis keturunannya mulai dari Ibrahim AS, Madyan, Yasykur, Mikail, dan Syu’aib AS.",

            "Nabi Musa AS hidup di Mesir pada zaman Raja Fir’aun yang dikenal sombong dan mengaku dirinya sebagai Tuhan. Sewaktu masih bayi, Nabi Musa AS dihanyutkan ke Sungai Nil dan ditemukan oleh istri Fir’aun. Setelah dewasa, Nabi Musa AS menerima wahyu dan mukjizat dari Allah berupa tongkat dan tangan yang berseri-seri. Para pengikut Fir’aun pada akhirnya menjadi pengikut Nabi Musa AS dan membuat Fir’aun murka.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Musa AS hidup pada zaman 1527 – 1407 sebelum masehi atau 120 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Tongkat Nabi Musa AS bisa menjadi ular dan ketika beliau dikejar Fir’aun, tongkat tersebut dapat membelah Laut Merah dan menyelamatkannya. Serta diberi kitab Taurat.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 5 Nabi Ya’qub AS. Dimulai dari Ya’qub AS, Lawi, Azar, Qahats, Imran dan Musa AS.",

            "Nabi Harun AS merupakan saudara kandung dari Nabi Musa AS. Beliau turut mendampingi Nabi Musa AS dalam berdakwah. Pada zamannya tersebut terkenal dengan kaum Bani Israil yang menyembah patung sapi emas bernama Samiri.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 1531 – 1408 sebelum masehi atau 123 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau diberi kecakapan oleh Allah SWT dalam hal berpidato dan berdakwah.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 5 Nabi Ya’qub AS dan kakak kandung Nabi Musa AS.",

            "Nabi Zulkifli AS adalah seorang raja yang bijaksana, baik hati, dan tidak sombong. Suatu hari, syaitan ingin mengujinya dan menyamar untuk membuatnya marah. Namun beliau berhasil menahan amarah. Diceritakan juga ada pemberontakan dan beliau meminta rakyatnya untuk berperang. Tapi tidak ada yang mau berperang dan meminta Nabi Zulkifli AS untuk berdoa kepada Allah agar menang dan tidak mati.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 1500 – 1425 sebelum masehi atau 75 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Mempunyai sifat yang penuh kesabaran dan kedermawanan.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah anak kandung dari Nabi Ayyub AS.",

            "Nabi Daud AS merupakan salah satu nabi yang mendapatkan wahyu berupa kitab bernama Zabur. Beliau sangat fasih membaca kitab tersebut. Beliau juga adalah seorang raja di Israel yang mampu mengalahkan Jalut (prajurit Flistin).\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 1063 – 963 sebelum masehi atau 100 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Nabi Daud AS mempunyai kemampuan untuk membengkokkan dan melunakkan besi atas izin Allah.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 11 Nabi Ishaq AS. Dimulai dari Ishaq AS, Yahudza, Farish, Hashrun, Aram, Aminadab, Hasyun, Salmun, Bu’az, Uwaibid, Isya, dan Daud AS.",

            "Nabi Sulaiman AS dikenal sebagai seorang raja yang cerdas. Beliau juga melakukan dakwah kepada kaum Bani Israil. Satu dari sekian banyak keistimewaan dari Nabi Sulaiman adalah kuasanya atas hewan dan bangsa jin.\n" +
                    "\n" +
                    "Beliau pun dapat membangun istana megah dan benteng berkat bantuan dari kelebihannya mendapatkan tembaga cair dari perut bumi.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Nabi Sulaiman AS hidup pada zaman 989 – 923 sebelum masehi atau 66 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau dapat berkomunikasi dengan binatang dan jin untuk melakukan semua perintahnya.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah anak kandung Nabi Daud AS.",

            "Nabi Ilyas AS adalah salah satu nabi yang juga berdakwah terhadap kaum Bani Israil. Namun mereka mengingkari dan menghina beliau. Allah menurunkan musibah berupa kekeringan panjang dan membuat kaum tersebut sadar. Akan tetapi, ketika keadaan sudah kembali seperti semula, mereka kembali ingkar kepada Allah. Kemudian Allah menurunkan bencana gempa bumi.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 910 – 850 sebelum masehi atau 60 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Nabi Ilyas AS tetap bersabar ketika Bani Israil selalu mengejek beliau.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 4 Nabi Harun AS. Dimulai dari Harun AS, Alzar, Fanhash, Yasin dan Ilyas AS.",

            "Nabi Ilyasa’ AS dapat disebut sebagai anak angkat dari Nabi Ilyas AS. Dahulu, Nabi Ilyas AS membantu menyembuhkan penyakitnya. Beliau pun kemudian mengikuti ayah angkatnya dan meneruskan dakwah di daerah Yordania. Kaumnya disana sempat mengikuti ajarannya, namun kembali menjadi manusia sesat. Kemudian Allah menurunkan bencana kekeringan.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 885-795 sebelum masehi atau 90 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau mendapatkan keistimewaan dengan mampu menghidupkan orang yang meninggal atas izin Allah SWT.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau merupakan keturunan ke 4 Nabi Yusuf AS. Dimulai dari Yusuf AS, Ifrayim, Syutlim, Akhtub, dan Ilyasa’ AS.",

            "Kisah Nabi Yunus AS ini terkenal karena beliau ditelan oleh ikan paus di lautan. Hal ini berawal ketika beliau mengembara dari kaum Ninawa. Beliau merasa putus asa dan menumpang ke sebuah kapal. Saat itu kapal berguncang dan harus mengurangi penumpang. Nabi Yunus AS selalu terpilih undian dan beliau melemparkan diri ke laut. Kemudian ikan paus menelannya.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 820 – 750 sebelum masehi atau 70 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau selamat dari perut ikan paus karena terus memohon ampun dan berzikir kepada Allah selama 40 hari.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 4 Nabi Yusuf AS. Dimulai dari Yusuf AS, Bunyamin, Abumatta, Matta, dan Yunus AS.",

            "Nabi Zakariya AS menginginkan seorang anak dalam kehidupannya, beliau menunggu sangat lama. Suatu hari ada seorang janda yang menyerahkan anak perempuannya bernama Maryam kepada beliau. Beliau tetap memohon kepada Allah untuk diberikan anak. Allah pun mengabulkannya. Artikel terkait ada disini.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 91 SM – 31 Masehi atau 122 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau terus memohon dan bersabar ketika belum mendapatkan keturunan, karena istrinya mandul.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau merupakan keturunan ke 16 dari Nabi Sulaiman AS.",

            "Nabi Yahya AS pernah menentang pernikahan antara penguasa Palestina dengan keponakannya, karena bertentangan dengan kitab Taurat dan Zabur. Namun, sang penguasa dan keponakannya tersebut merasa murka dan membunuh beliau dalam usia yang masih muda.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 1 – 31 Masehi atau 30 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Beliau mempunyai sifat yang baik, tidak sombong, dan selalu hormat pada orang tuanya.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah anak kandung dari Nabi Zakariya AS.",

            "Nabi Isa AS dikenal sebagai nabi yang tidak memiliki ayah. Beliau lahir dari perempuan perawan bernama Maryam. Nabi Isa AS juga dijuluki sebagai Ulul Azmi. Di masa hidupnya, beliau mendapatkan banyak cobaan. Beliau pun diutus sebagai nabi dan rasul untuk berdakwah kepada kaum Bani Israil. Namun, orang-orang kafir tersebut justru ingin membunuhnya dengan cara disalib. Akan tetapi, mereka gagal dan orang yang disalib tersebut hanya menyerupai Nabi Isa AS, karena beliau telah diangkat oleh Allah SWT.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 1 sebelum masehi – 32 masehi atau 33 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Nabi Isa AS mempunyai banyak mukjizat, yaitu dapat berbicara sewaktu bayi, menyembuhkan penyakit, memberi nyawa pada burung dari tanah liat, membangkitkan orang meninggal, dan meminta makanan dari surga.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Beliau adalah keturunan ke 17 Nabi Sulaiman AS.",

            "Nabi Muhammad SAW adalah manusia yang menjadi nabi dan rasul terakhir. Beliau menjadi anak yatim piatu di usia 6 tahun. Beliau juga termasuk Ulul Azmi karena ketabahan dan kesabaran atas semua ujian yang diberikan. Belum lagi beliau juga harus berkonflik dengan pamannya sendiri yang menjadi orang yang ingkar terhadap ajaran Allah SWT. Suatu hari Nabi Muhammad SAW dilamar oleh seorang wanita kaya bernama Khadijah yang usianya terpaut 15 tahun lebih tua dari beliau. Beliau akhirnya menikahi wanita tersebut karena kemuliaannya.\n" +
                    "\n" +
                    "Tahun/Zaman\n" +
                    "Beliau hidup pada zaman 570 – 632 masehi atau 62 tahun.\n" +
                    "\n" +
                    "Mukjizat\n" +
                    "Nabi Muhammad SAW menjadi rasul yang diutus untuk seluruh umat manusia yang ada di bumi. Beliau mendapatkan mukjizat terbesar berupa kitab suci Al Qur’an sebagai petunjuk dan pedoman hidup manusia.\n" +
                    "\n" +
                    "Silsilah Kenabian\n" +
                    "Dari ayah maupun ibunya, beliau memiliki garis keturunan dari Nabi Ismail AS."};

    String[] fotoNabi = {"https://muffingraphics.com/wp-content/uploads/2018/11/nabi-adam.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-idris.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-nuh.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-hud.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-shalih.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-ibrahim.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-luth.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-ismail.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-ishaq.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-yaqub.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-yusuf.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-ayyub.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-syuaib.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-musa.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-harun.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-zulkifli.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-daud.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-sulaiman.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-ilyas.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-ilyasa.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-yunus.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-zakariya.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-yahya.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-isa.jpg",
            "https://muffingraphics.com/wp-content/uploads/2018/11/nabi-muhammad.jpg"};

    String[] namaSahabat = {"Abu Bakar",
    "Umar bin Khattab",
    "Khalid bin Walid",
    "Hamzah bin ‘Abdul Muththalib",
    "Bilal bin Rabah",
    "Anas bin Malik",
    "Zaid bin Haritsah",
    "Mush’ab bin ‘Umair"};

    String[] ceritaSahabat = {"Abdullah bin Abu Quhafah (bahasa Arab: عبد الله بن أبي قحافة\u200E; 572 – 23 Agustus 634/21 Jumadil Akhir 13 H) atau yang lebih dikenal dengan Abu Bakar Ash-Shiddiq (bahasa Arab: أبو بكر الصديق\u200E), adalah salah satu pemeluk Islam awal, salah satu sahabat utama Nabi, dan khalifah pertama sepeninggal Nabi Muhammad mangkat. Melalui putrinya, 'Aisyah, Abu Bakar merupakan ayah mertua Nabi Muhammad. Ash-Shiddiq yang merupakan julukan Nabi Muhammad kepada Abu Bakar merupakan salah satu gelar yang paling melekat padanya. Bersama ketiga penerusnya, Abu Bakar dimasukkan ke dalam kelompok Khulafaur Rasyidin.\n" +
            "\n" +
            "Sebagai pemeluk awal Islam, Abu Bakar telah mengambil berbagai peran besar. Melalui ajakannya, Abu Bakar berhasil mengislamkan banyak orang yang di kemudian hari menjadi tokoh-tokoh penting dalam sejarah Islam, di antaranya adalah 'Utsman bin 'Affan yang kemudian menjadi khalifah ketiga. Abu Bakar juga turut serta dalam berbagai perang seperti Perang Badar (624 M/2 H) dan Perang Uhud (625 M/3 H). Kedekatan dan kesetiaannya pada Nabi Muhammad merupakan satu hal yang sangat melekat pada diri Abu Bakar, utamanya terlihat saat mendampingi Nabi Muhammad hijrah ke Madinah dan kepatuhannya dalam menerima keputusan Nabi dalam Perjanjian Hudaibiyah, meski banyak sahabat Nabi kala itu tidak menyepakati perjanjian tersebut karena dipandang berat sebelah.\n" +
            "\n" +
            "Abu Bakar dinyatakan sebagai khalifah sepeninggal Nabi Muhammad, menjadikannya sebagai khalifah pertama umat Islam. Masa kekuasaannya yang singkat dipusatkan pada pemadaman pemberontakan suku-suku Arab yang menolak tunduk pada Abu Bakar. Dalam banyak hal, Abu Bakar berusaha mengeluarkan kebijakan yang tidak berbeda dengan Nabi Muhammad, seperti penolakannya untuk mencopot Khalid bin Walid dari kedudukannya sebagai panglima.",

            "Umar bin Khattab (bahasa Arab: عمر بن الخطاب\u200E; sekitar 584  – 3 November 644) adalah khalifah kedua yang berkuasa pada tahun 634 sampai 644. Dia juga digolongkan sebagai salah satu Khulafaur Rasyidin. 'Umar merupakan salah satu sahabat utama Nabi Muhammad dan juga merupakan ayah dari Hafshah, istri Nabi Muhammad.\n" +
            "\n" +
            "Dalam sudut pandang Sunni, 'Umar termasuk salah satu pemimpin yang hebat dan suri teladan dalam masalah keislaman[6] dan beberapa hadits menyebutkan dirinya sebagai sahabat Nabi paling utama setelah Abu Bakar.[7][8] 'Umar memiliki julukan yang diberikan oleh Nabi Muhammad yaitu Al-Faruq yang berarti orang yang bisa memisahkan antara kebenaran dan kebatilan. Namun di sisi lain, 'Umar cenderung dipandang negatif dalam perspektif Syi'ah.[9]\n" +
            "\n" +
            "Pada masa kepemimpinannya, kekhalifahan menjadi salah satu kekuatan besar baru di wilayah Timur Tengah. Selain menaklukan Kekaisaran Sasaniyah yang sudah melemah hanya dalam kurun waktu dua tahun (642–644), 'Umar berhasil mengambil alih kepemimpinan dua pertiga wilayah Kekaisaran Romawi Timur.[10] Perluasan wilayah ini juga diikuti berbagai pembaharuan. Dalam bidang pemerintahan dan politik, departemen khusus dibentuk sebagai tempat masyarakat dapat mengadu mengenai para pejabat dan negara. Pembentukan Baitul Mal menjadi salah satu pembaharuan 'Umar dalam bidang ekonomi. Segala capaiannya menjadikan 'Umar sebagai salah satu khalifah paling berpengaruh sepanjang sejarah.",

    "Nama lengkap Khalid adalah Khalid bin Walid bin Abdullah bin Umar bin Makhzum Al Quraisyi. Beliau memiliki gelar Saifullah Al Maslul (pedang Allah yang terhunus). Umur Khalid bin Walid adalah sektar 13 tahun lebih muda dari pada Rasulullah Shallallahu’alaihiwasallam.\n" +
            "\n" +
            "Khalid berasal dari bani Makhzum dan merupakan kelompok yang mempunyai tugas-tugas penting. Jika terjadi peperangan, bani Makhzum lah yang mengurus gudang senjata berupa alat perang, kuda-kuda perang, dan lainnya.\n" +
            "\n" +
            "Sebelum masuk islam, Khalid bin Walid merupakan panglima perang pasukan Quraisy. Salah satu perang yang beliau menangkan adalah perang melawan kaum muslimin pada perang uhud.\n" +
            "\n" +
            "Khalid kemudian masuk islam pada tahun ke 8 Hijriyah saat terjadinya gencatan senjata yang disepakati dalam perjanjian Hudaibiyah.\n" +
            "Meskipun Khalid bin Walid terlibat pada ratusan pertempuran yang menghasilkan banyak bekas luka pada tubuhnya, namun beliau tidak meninggal di medan perang, tempat yang sangat beliau inginkan untuk syahid.\n" +
            "\n" +
            "Allah mentakdirkan beliau meninggal diatas kasur pada tahun 21 Hijriyah di kota Homs, Suriah.",

    "Beliau merupakan paman Nabi yang memiliki lengkap Hamzah bin Abdul Muththalib bin Hasyim bin Abdu Manaf. Hamzah memiliki julukan sebagai Singa Allah.\n" +
            "Hamzah terbunuh dan syahid pada perang Uhud. Ketika perang Uhud berlangusng, Hamzah berperang bagaikan singa yang sedang mengamuk. Beliau dengan gagah berani dan tak terkalahkan menerobos ketengah-tengah pasukan musuh.\n" +
            "\n" +
            "Pasukan musyrikin tercerai berai bagaikan daun-daun kering yang berterbangan terkena angin.\n" +
            "\n" +
            "Yang Membunuh Hamzah adalah seorang budak bernama Wahsyi bin Harb. Dia memiliki tugas khusus unutk membunuh Hamzah.\n" +
            "\n" +
            "Yang menyuruh Wahsy adalah majikannya yang bernama Jubair bin Muth’im. Jubair memiliki paman bernama Thu’aimah bin Adi yang terbunuh dalam perang Badar. Wahsy dijanjikan akan dimerdekakan kalau berhasil membunuh Hamzah sebagai paman Nabi Muhammad.",

    "Bilal bin Rabah (Arab: بلال بن رباح, sekitar 580–640 Masehi; Bilal al-Habsyi, Bilal bin Riyah, Ibnu Rabah) adalah seorang budak berkulit hitam dari Habsyah (sekarang Ethiopia) yang masuk Islam ketika masih diperbudak. Setelah majikannya mengetahui bahwa Bilal masuk Islam, maka Bilal disiksa terus menerus setiap harinya, guna mengembalikan keyakinannya agar tidak memeluk Islam. Tetapi Bilal tidak mau kembali kepada kekafirannya dan tetap melantunkan \"Ahadun Ahad, Ahadun Ahad...\". Pada akhirnya Bilal dimerdekakan oleh Abu Bakar, dan menjadi salah seorang sahabat nabi.\n" +
            "\n" +
            "Dalam sebuah hadits diceritakan bahwa rasulullah pernah mendengar suara terompah Bilal di surga. Ketika hukum syariat adzan diperintahkan oleh Allah, maka orang yang pertama kali disuruh oleh rasulullah untuk mengumandangkan adzan adalah Bilal bin Rabah, ia dipilih karena suaranya sangat merdu dan lantang. Ia dikenal sebagai muazin pertama dalam Islam.",

    "Anas bin Malik adalah pembantu Rasulullah yang diberikan oleh ibunya, Ghumaisho’ ketika masih kecil. Sebelumnya beliau telah ditalqin syahadat oleh ibunya. Saat itu Anas masih berusia 10 tahun.\n" +
            "\n" +
            "Anas bin Malik ikut nabi Muhammad hingga Rasulullah wafat. Kondisi ini sangat dimanfaatkan Anas untuk menimba ilmu dan belajar kehidupan langsung dengan Rasul.\n" +
            "Karena kedekatan beliau dengan Rasulullah, Anas bin Malik termasuk tiga sahabat yang paling banyak meriwayatkan hadits, yaitu sebanyak 2.286 hadits.\n" +
            "\n" +
            "Beliau secara langsung dido’akan oleh Rasulullah yang dijelaskan dalam hadits yang diriwayatkan Bukhori dan Muslim yang isinya agar Allah banyakkan hartanya, banyakkan anaknya, panjangkan umurnya, dan ampuni dosanya.",

    "Zaid bin Haritsah awalnya adalah budak dari Khadijah sebelum beliau menikah dengan Nabi Muhammad. Ketika setelah menikah, kemudian Zaid dihadiahkan untuk Muhammad sebelum menjadi nabi dan rasul.\n" +
            "\n" +
            "Haritsah merupakan kepala salah satu kepala suku yang pada saat itu mengalami kalah perang. Kemudian Zaid yang djadikan tawanan perang akhirnya dijual belikan hingga sampai ke tangan Khadijah.\n" +
            "\n" +
            "Singkatnya, setelah membangun sukunya kembali, Haritsah mencari Zaid dan kemudian diketahui beliau berada dalam genggaman Nabi Muhammad.\n" +
            "\n" +
            "Haritsah kemudian menemui Nabi dan bermaksud menebus anakanya. Tapi Nabi memberikan pilihan kepada Zaid, apabila dia memilih ayahnya maka akan dibebaskan tanpa sepeser pun.\n" +
            "\n" +
            "Tidak disangka Zaid lebih memilih Nabi Muhammad dibandingkan ayahnya karena keindahan akhlaq Nabi.\n" +
            "\n" +
            "Akhirnya, Haritsah sejak saat itu menitipkan Zaid kepada Nabi Muhammad dan kemudian Nabi Muhammad mengubah nama Zaid menjadi Zaid bin Muhammad.\n" +
            "\n",

    "Mus’ab bin Umair adalah pemuda Quraisy yang memiki nama lengkap Mush’ab bin Umair binHasyim bin Abdu Manaf bin Abdud Daar bin Qushay bin Kilab Al Abdari. Beliau lahir 14 tahun setelah Nabi Muhammad lahir.\n" +
            "\n" +
            "Mush’ab adalah pemuda yang tampan dan parlente karena berasal dari keluarga kaya dan terpandang. Pakaiannya adalah pakaian terbaik saat itu, dan aroma parfumnya kental sehingga ketika Mush’ab lewat aroma parfumnya masih tertinggal.\n" +
            "\n" +
            "Di tengah kehdupan jahiliyah, Mush’ab mampu memebdakan mana yang haq dan mana yang batil. Mush’ab dengan sadar memeluk islam dan mendatangi Nabi Muhammad di rumah Al Arqam.\n" +
            "\n" +
            "Mushab merupakan duta besar islam pertama yang dikirim oleh Rasulullah ke Madinah untuk mengajari penduduk Madinah yang telah memeluk islam. Selain itu juga menyiapkan Madinah sebagai tempat hijrah Rasulullah dan kaum muslimin."};

    String[] fotoSahabat = {"https://cdn2.tstatic.net/jogja/foto/bank/images/kisah-abu-bakar.jpg",
    "http://www.mbc.net/mediaObject/OMAR/1920x1080/1920x1080-d/original/1920x1080-d.jpg",
    "https://suaramuslim.net/wp-content/uploads/2017/08/Kisah-Khalid-Bin-Walid-Si-Pedang-Allah-Yang-Terhunus.jpg",
    "https://i0.wp.com/satujam.com/wp-content/uploads/2017/01/Syetan-Lari-Ketakutan-Ketika-Melihat-Khalifah-Umar-bin-Khattab.jpg?fit=663%2C382&ssl=1",
    "https://www.islampos.com/wp-content/uploads/2017/02/adzan-nabawi.jpg",
    "https://nikmatislam.com/wp-content/uploads/2017/01/doa-dalam-kesulitan-e1545718178420-640x320.jpg",
    "https://laziswahdah.org/wp-content/uploads/2016/10/Usamah-bin-Zaid-1024x576.jpg",
    "https://i1.wp.com/minanews.net/wp-content/uploads/2017/08/mushab.jpg?fit=550%2C300&ssl=1"};

    String[] namaWali = {"Sunan Gresik",
    "Sunan Ampel",
    "Sunan Bonang",
    "Sunan Derajat",
    "Sunan Kudus",
    "Sunan Giri",
    "Sunan Kaliajaga",
    "Sunan Muria",
    "Sunan Gunung Jati"};

    String[] ceritaWali = {"Maulana Malik Ibrahim di lahirkan di Campa (Kamboja), ayahnya bernama Barakat Zainul Alam yaitu seorang ulama besar di  Maghrib.  Maulan Malik Ibrahim ini di sebut sebagai Sunan Gresik atau Syakh Maghribi atau Makhdum Ibrahim al-Samarqandi, dan orang jawa biasa menyebutnya sebagai Asmaraqandi.\n" +
            "\n" +
            "Maulana Malik Ibrahim merupakan orang pertama yang menyebar luaskan agama Islam di tanah Jawa, dan merupakan wali senior di antara para walisongo yang lainnya. Dengan di temani oleh beberapa sahabatnya beliau datang pertama kali di Desa Sembolo yang sekarang adalah Desa Laren kecamatan Manyar, 9 kilometer dari arah utara kota Gresik.\n" +
            "Sebelum masuk ke tanah Jawa, Maulana Malik Ibrahim bermukim di Champa (Dalam legenda disebut sebagai negeri Chermain atau Cermin) selama 13 tahun. Beliau menikahi putri raja yang memberinya dua putra, yaitu Raden Rahmat (Sunan Ampel) dan Rasyid Ali Murtadha (Raden Santri). Setelah dirasa cukup berdakwah di negeri tersebut beliau hijrah di pulau Jawa yaitu di Gresik.\n" +
            "\n" +
            "Setelah mendarat di kota Gresik, beliau memilih tempat  di sebuah Desa bernama Laren. Di desa itulah tepatnya pada tahun 801 H/ 1329 M beliau menjalankan misi dakwah ajaran agama Islam. Selain itu, beliau juga membuka toko di Desa Romo (3 km sebelah barat kota Gresik). Dengan memperkenalkan barang-barang bawaanya.\n" +
            "\n" +
            "Islamisasi Jawa, aktivitas pertama yang di lakukan oleh Maulan Malik Ibrahim adalah berdagang dengan membuka warung yang menyediakan kebutuhan pokok dengan harga murah. Selain itu secara khusus beliau menawarkan diri sebagai tabib untuk mengobati masyarakat secara gratis. Maulan Malik Ibarahim saat itu juga mengajarkan tentang bercocok tanam.\n" +
            "\n" +
            "Beliau merangkul masyarakat bawah yang di sisihkan oleh komunitas Hindu. Pendekatan yang di lakukan adalah dengan pergaulan dan berdagang. Dengan adanya budi bahasa yang ramah senantiasa di perlihatkannya dalam pergaulan sehari-hari, beliau tidak menantang kepercayaan penduduk asli, melainkan hanya memperlihatkan keindahan dan kebaikan agama Islam.\n" +
            "\n" +
            "Berkat keramah tamahannya banyak masyarakat yang tertarik untuk masuk dalam agama Islam. Setelah cukup mapan Maulana Malik Ibrahim melakukan kunjungan ke Ibu kota Majapahit di Trowulan, meskipun raja tidak masuk Islam, namun raja menerimanya dengan baik, bahkan memberikan sebidang tanah di pinggiran kota Gresik yang sekarang di sebut sebagai Gapura.",

    "Nama asli dari sunan Ampel adalah Raden Rahmat. Pada umumnya sunan Ampel di anggap sebagai wali sesepuh oleh para wali lainnya. Pesantrennya berada di Ampel Denta Surabaya, juga merupakan salah satu penyebaran ajaran agama Islam tertua di Jawa. Beliau menikah dengan Dewi Condrowati yang bergelar Nyai Ageng Manila.\n" +
            "\n" +
            "Dewi Condrowati ini merupakan putri dari adipati Tuban yaitu Arya Teja, selain itu beliau juga menikah dengan Dewi Karimah binti Ki Kembang Kuning. Dari pernikahannya dengan Dewi Condrowati berputra-putri Raden Makhdum Ibrahim (Sunan Bonang), Siti Syari’ah, Raden Qasim (Sunan Derajat), Sunan Sedayu, Siti Mutma’innah, dan Siti Hafsah.\n" +
            "\n" +
            "Sedangkan pernikahannya dengan Dewi Karimah berputra-putri Dewi Murtasiyah yang juga merupakan istri dari Sunan Giri, Dewi Murtasimah (Dewi Asyiqah) yang juga merupakan istri dari Raden Fatah, Raden Husamuddin (Sunan Lamongan), Raden Zaenal Abidin (Sunan Demak), Pangeran Tumapel dan Raden Faqih (Sunan Ampel 2).\n" +
            "\n" +
            "Sunan Ampel datang ke pulau Jawa pada tahun 1443,  untuk menemui bibinya Dwarawati, ia merupakan seorang putri Champa yang menikah dengan raja Majapahit yang bernama Prabu Kertawijaya. Dakwah sunan Ampel yang di kenalkan kepada masyarakatnya di kenal dengan sebutan Moh Limo.\n" +
            "Moh Limo yang di maksud adalah Moh Mabok (tidak mau minum minuman keras), Moh Main (tidak mau judi, togel, taruhan), Moh Madon (tidak mau zina, lesbian, homo), Moh Madat (tidak mau mencuri), Moh Maling (tidak mau mencuri, korupsi, dan lain sebagainya). Dakwah Sunan Ampel ini bertujuan untuk memperbaiki kerusakan akhlaq di tengah masyarakat saat itu.\n" +
            "\n" +
            "Pada tahun 1479 M, Sunan Ampel mendirikan masjid Agung Demak, dan yang menjadi penerus untuk melanjutkan dakwahnya di kota Demak adalah Raden Zaenal Abidin yang di kenal sebagai sunan Demak, Raden Zaenal Abidin merupakan putra sunan Ampel dari Dewi Karimah.",

    "Sunan Bonang di lahirkan pada tahun 1465 dengan nama asli yaitu Raden Maulana Makhdum Ibrahim, beliau putra sunan Ampel dengan Nyai Ageng Manila. Bonang merupakan sebuah nama Desa di kabupaten Rembang.  Nama sunan Bonang ada yang menyebutnya dari  Bong Ang yang sesuai dengan marga Bong seperti nama ayahnya Bong Swi Hoo alias Sunan Ampel.\n" +
            "\n" +
            "Setelah selesai menimba ilmu, beliau kembali lagi ke Tuban  dan kemudian mendirikan pesantren di tanah kelahiran ibunya tersebut. Saat itu masyarakat Tuban sangat menyukai hiburan, oleh karena itu cara berdakwah sunan Bonang salah satunya adalah dengan membuat alat musik tradisional yaitu gamelan untuk menarik hati masyarakat agar tertarik untuk belajar agama Islam.\n" +
            " \n" +
            "Selain menjadikan pesantren di Tuban sebagai basis wilayah dakwah, beliau juga menyebarkan Islam dengan cara berkeliling. Sunan Bonang selain menyebarkan ajaran agama Islam dengan gamelan, beliau juga menggunakan cara dakwah dengan adanya karya sastra yang berupa carangan paweyangan dan suluk serta tembang tamsil.\n" +
            "\n" +
            "Sunan Bonang berdakwah dengan menggunakan kesenian alat musik tradisional adalah untuk menarik hati dan simpatik masyarakat. Menurut beliau cara berdakwah dengan alat musik tradisional merupakan cara yang tepat, sehingga beliau juga mempelajari kesenian Jawa salah satunya adalah Bonang (alat musik yang di pukul menimbulkan suara merdu).\n" +
            "\n" +
            "Setiap kali sunan Bonang membunyikan alat musik tersebut banyak masyarakat berdatangan untuk mendengar dan menyaksikan, setelah masyarakat tertarik hati dan simpati kemudian beliau menyisipkan ajaran agama Islam kepada masyarakat.\n" +
            "\n" +
            "Dengan keahlian seni dan sastranya, sunan Bonang mengajarkan dan menyebar luaskan ajaran Islam dengan lantunan tembang-tembang yang mengandung nilai-nilai ke Islaman, sehingga tanpa terasa penduduk sudah mempelajari ajaran Islam dengan senang hati dan tanpa paksaan. Salah satu tembang dari  sunan Bonang  yang fenomenal adalah tembang “Tombo Ati”.",

    "Sunan Derajat mempunyai nama kecil syarifuddin atau Raden Qasim yang juga merupakan putra bungsu sunan Ampel dengan Nyai Ageng Manila, dan beliau juga merupakan saudara dari sunan Bonang. Sunan Derajat di kenal dengan kecerdasannya, beliau menyebar luaskan ajaran agama Islam di Desa Paciran Lamongan.\n" +
            "\n" +
            "Dakwah yang di lakukan oleh Sunan Derajat pada mulanya di lakukan atas perintah ayahnya, yaitu berdakwah di pesisir pantai Gresik, hingga akhirnya beliau menetap di Lamongan. Untuk menempati tempat tersebut Raden Qasim di antar sunan Bonang dengan tujuan meminta izin sultan Demak untuk menempati wilayah tersebut.\n" +
            "\n" +
            "Sultan Demak tidak hanya mengizinkannya untuk tinggal namun memberikan tanahnya pada tahun 1486 H. Sunan Derajat di kenal sebagai penyebar agama Islam yang memiliki jiwa sosial tinggi dan sangat memperhatikan nasib kaum fakir miskin, selain itu beliau mengutamakan pada kesejahteraan sosial masyarakat.\n" +
            "\n" +
            "Setelah memberikan perhatian penuh, barulah kemudian beliau memberikan pemahaman ajaran agama Islam yang berkaitan tentang adanya empati dan etos kerja yang berupa kedermawanan, pengentasan kemiskinan, usaha menciptakan kemakmuran, solidaritas serta gotong royong.  Cara dakwah yang beliau lakukan banyak menggunakan ajaran luhur dan tradisional lokal.",

    "Sunan Kudus sejatinya bukanlah merupakan penduduk asli Kudus, beliau berasal dan lahir dari Quds negeri palestina, yang kemudian bersama kakek dan ayahnya untuk hijrah ke tanah Jawa. Dalam cerita lain sunan Kudus merupakan pendatang dari daerah Jipang Panolan yang merupakan daerah di sebelah utara Blora.\n" +
            "\n" +
            "Sunan Kudus juga merupakan senopati hebat dari kerjaan Demak, ketika beliau menjabat sebagai senopati kerajaan Majapahit di taklukannya. Kesuksesan mengalahkan majapahit membuat posisi Ja’far Shadiq semakin kuat, namun kemudian ia meninggalkan Demak karena ingin hidup merdeka dan mendedikasikan seluruh hidupnya untuk menyebar luaskan agama Islam.\n" +
            "\n" +
            "Dalam menyebarkan ajaran agama Islam sunan Kudus memang banyak berguru dan belajar ilmu agama kepada sunan Kalijaga, sehingga metode dakwah sunan Kudus tidak jauh beda dengan sunan Kali Jaga, yang menekankan pada budaya kearifan lokal  dengan mengapresiasi budaya masyarakat setempat.\n" +
            "\n" +
            "Sosok sunan Kudus di kenal karena telah memberikan pondasi pengajaran keagamaan dan kebudayaan yang toleran. Beberapa nilai toleransi yang di perlihatkan sunan Kudus kepada masyarakatnya adalah tidak boleh menyembelih sapi kepada para pengikutnya, karena saat itu sapi di anggap sebagai hewan suci. Sehingga, ajaran agama Islam dari sunan Kudus ini menekankan pada toleransi beragama.",

    "Sunan Giri merupakan putra dari Maulana Ishaq dengan Dewi Sekardadu yaitu putri dari Menak Sembuyu penguasa wilayah Balambangan pada masa akhir kerajaan Majaphit. Namun, sayang kelahirannya di anggap sebagai sebuah kutukan oleh ayahnya Dewi Sekardadu, sehingga, ia di paksa oleh ayahnya untuk membuang anaknya dengan menghanyutkannya ke laut.\n" +
            "\n" +
            "Setelah Cukup Dewasa, Joko Samudra di bawa ibu angkatnya ke Ampel Denta untuk belajar agama kepada Sunan Ampel. Tak selang beberapa lama mengajarnya sunan Ampel mengetahui Identitas dari Sunan Giri tersebut, dan kemudian Sunan Ampel mengirimkan sunan Giri bersama juga dengan sunan Bonang untuk mendalami agama Islam di wilayah Pasai.\n" +
            "\n" +
            "Cara Dakwah yang di lakukan oleh Sunan Giri adalah dengan menciptakan unsur lagu dan permainan dengan memasukkan beberapa unsur-unsur agamis, hal ini beliau lakukan untuk mendekatkan ajaran agama Islam khususnya untuk anak-anak.\n" +
            "\n" +
            "Sunan Giri menciptakan tembang dolanan yang di kenal dengan jelungan bukanlah sekadar nyanyian dan tertawa belaka, namun dari semua itu terdapat pelajaran yang luar biasa terkait dengan ketauhidan.",

    "Raden Said merupakan seseorang yang peduli dan dekat terhadap rakyat jelata, hal ini dibuktikan ketika beliau membela rakyat jelata di masa sulit. Saat itu pemerintah sangat membutuhkan dana besar untuk mengatasi roda pemerintahan, sehingga rakyat jelata mau tidak mau harus membayar pajak yang tinggi untuk hal tersebut.\n" +
            "\n" +
            "Saat itulah, sunan Kalijaga berpikir harus membantu rakyat jelata. Namun, tanpa berpikir panjang Raden Said melakukan perbuatan tidak terpuji demi menolong rakyat jelata. Beliau mencuri hasil bumi yang tersimpan di gudang ayahnya. Hasil bumi tersebut merupakan hasil upeti rakyat jelata yang akan di setorkan kepada pemerintahan pusat.",

    "Nama Sunan Muria di ambil dari tempat tinggal terakhirnya yaitu di lereng Gunung Muria, yakni 18 kilometer ke utara kota Kudus. Sunan Muria mempunyai peran penting dalam menyebarkan ajaran agama Islam di sekitar Gunung Muria. Dalam menyebarkan agama Islam beliau meniru cara ayahnya, yaitu menyebarkan ajaran agama dengan halus.\n" +
            "\n" +
            "Namun, berbeda dengan ayahnya, dalam menyebarkan dakwahnya Raden Umar Sahid (Sunan Muria) lebih senang berdakwah di daerah terpencil dan jauh dari pusat kota. Tempat tinggal beliau berada di puncak Gunung Muria yang bernama Colo, di tempat tersebut beliau berinteraksi dengan rakyat jelata, dan mengajarkan cara bercocok tanam, berdagang serta melaut.\n" +
            "\n" +
            "Sunan Muria dalam menyebarkan agama Islam  tetap  mempertahankan kesenian gamelan serta wayang sebagai alat dakwah. Beliau menciptakan beberapa tembang untuk mengamalkan ajaran Islam. Dengan cara inilah sunan Muria di kenal sebagai sunan yang suka berdakwah topo ngeli. Sunan Muria juga di kenal sebagai pribadi yang mampu memecahkan berbagai macam masalah.\n" +
            "\n" +
            "Dengan gayanya yang moderat dalam berdakwah ini mengikuti jejak ayahnya menyelusup lewat berbagi  tradisi kebudayaan Jawa. Seperti halnya adanya adat kenduri pada hari tertentu setelah kematian yang kemudian di ganti dengan nelung dino sampai nyewu yang tak di haramkannya,  Tradisi membakar menyan atau sesaji di ganti dengan berdo’a dan bersholawat.",

    "Sunan Gunung Jati memiliki nama asli Syarif Hidayatullah. Di usianya yang menginjak 20 tahun sunan Gunung Jati telah di tinggal oleh ayahnya. Setelah di tinggal ayahnya beliau di daulat untuk menjadi Raja Mesir untuk menggantikan ayahnya, namun beliau menolaknya dan memilih untuk menyebarkan ajaran agama Islam ke tanah Jawa bersama ibunya.\n" +
            "\n" +
            "Sebelum Sunan Gunung Jati dan ibunya Syaifah Muda’imah datang ke Jawa Barat tahun 1475 Masehi, mereka terlebih dahulu singgah di Gujarat dan Pasai, guna untuk memperdalam ilmu agamanya. Kedatangannya sambut gembira oleh Pangeran Cakrabuana beserta keluarganya.\n" +
            "\n" +
            "Dalam menyebarkan Islam, Sunan Gunung Jati tidak sendiri, beliau di bantu oleh para wali lainnya. mereka biasanya bermusyawarah di masjid Demak. Karena pergaulannya dengan para wali dan sultan Demak, menjadikan sunan Gunung Jati mendirikan Kesultanan Pakungwati, yang kemudian ia memprokamirkan dirinya sebagai raja dan mendapat gelar sultan.\n" +
            "\n" +
            "Dengan adanya kesultanan, Cirebon tidak lagi mengirimkan upeti kepada pajajaran. Kesultanan pakungwati semakin besar dengan bergabungnya perwira dan prajurit pilihan, terlebih lagi adanya perluasan pelabuhan Muara Jati, yang membuat perdagangan semakin pesat terutama dengan Negara China.\n" +
            "\n" +
            "Jalinan Cirebon dan China semakin erat, dalam dakwahnya tersebut beliau mengajarkan ilmu shalat kepada rakyat China, dengan memberitahukan bahwa setiap melakukan gerakan sholat merupakan terapi pijat ringan atau biasa yang disebut dengan akupuntur, ilmu pengobatan tersebut di perolah saat beliau mengembara ilmu di China."};

    String[] fotoWali = {"https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Gresik-700x507.png",
    "https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Ampel-700x561.png",
    "https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Bonang-700x493.png",
    "https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Drajat-700x545.png",
    "https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Kudus-700x465.png",
    "https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Giri.png",
    "https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Kalijaga-700x607.png",
    "https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Muria-700x506.png",
    "https://thegorbalsla.com/wp-content/uploads/2018/11/Sunan-Gunung-Jati-700x552.png"};

    String[] namaIlmuan = {"Al-Jazari",
    "Ibnu al-Haytham",
    "Al-Idrisi",
    "Banu Musa Bersaudara",
    "Al-Zahrawi",
    "Abbas ibnu Firnas",
    "Ibnu Sina"};

    String[] ceritaIlmuan = {"Di tahun 1100 an, sebuah jam yang sangat tidak biasa dan unik, dibuat oleh Al-Jazari, seorang insinyur dan matematikawan asal Turki.\n" +
            "\n" +
            "Ini adalah sebuah jam besar yang tampilan luarnya berbentuk gajah yang menopang berbagai ornamen yang disebut-sebut sebagai perpaduan berbagai budaya. Penemuan jam gajah ini digadang-gadang sebagai karya robotik pertama di dunia.",

    "Seorang ilmuwan Arab Muslim bernama Ibnu al-Haytham adalah seorang yang punya kontribusi besar di dunia optik, astronomi, serta matematika. Ia bahkan disebut sebagai bapak optik. Tak hanya itu, di dunia barat dia juga dikenal luas hingga memiliki nama barat bernama Alhazen.\n" +
            "\n" +
            "Kontribusi besarnya adalah eksperimen serta studinya soal cahaya. Ia berteori soal cahaya bergerak dalam garis lurus dan dibedakan oleh objek yang ter-refleksikan oleh sinar tersebut.\n" +
            "\n" +
            "Ialah yang memperbaiki konsep 'camera obscura' atau lubang jarum yang awalnya ditemukan Tiongkok, di mana cahaya bergerak pada garis lurus dan membentuk gambar yang terbalik pada retina.",

    "Al-Idrisi adalah seorang geografer dan kartografer yang lahir di Ceuta, Afrika Utara. Selama hidup ia tinggal di Palermo, Sisilia, Italia, dan menorehkan prestasi di sana.\n" +
            "\n" +
            "Di sekitar abad ke 12, ia memproduksi sebuah peta dunia dengan deskripsi yang paling lengkap dan rumit. Peta tersebut dianggap sebagai yang paling hebat di abad pertengahan.\n" +
            "\n" +
            "Jadilah peta Al-Idrisi adalah yang peta yang digunakan secara luas oleh para pelancong selama beberapa abad ke depan. Bagaimana tidak, deskripsi rinci tentang Afrika dan Timur jauh pun lengkap di sana. Terlebih lagi penjelasan lengkap tentang wilayah utara Kristen dan wilayah Islam juga dijelaskan dengan baik.",

    "Sebuah buku berjudul \"Book of Ingenious Device\" atau Buku Perangkat Terampil, adalah sebuah buku yang lahir di tahun 850, ditulis oleh 3 bersaudara dari Iran bernama Banu Musa bersaudara.\n" +
            "\n" +
            "Banu Musa yang terdiri dari Ahmad, Muhammad, dan Hasan bin Musa ibnu Shakir ini menulis buku tentang banyak sekali ilustrasi tentang perangkat mekanik, termasuk yang paling populer adalah automata atau berbagai mesin otomatis.\n" +
            "\n" +
            "Berbagai hal seperti perangkat otomatis sistem fail-safe, engkol otomatis, katup otomatis, siphon dobel konsentris, serta saluran dengan ujung bengkok yang mampu menuang cairan berbeda. Selain itu, masih ada fountain otomatis, organ bertenaga air, serta dispenser air.",

    "Al-Zahrawi adalah seorang fisikawan dan ahli bedah dari Andalusia. Ia merupakan ahli bedah terbaik di abad pertengahan, dan disebut sebagai bapak ahli bedah. Ia menulis Kitab al-Tasrif yang membahas tentang praktik medis.\n" +
            "\n" +
            "Ia pun berkontribusi besar dalam dunia bedah di aspek prosedur dan instrumen. Prestasinya pun diadaptasi oleh budaya barat maupun timur dalam periode modern. Berbagai penemuannya bahkan masih digunakan hingga sekarang.\n" +
            "\n" +
            "Berbagai penemuan tersebut antara lain jarum suntik, forcep atau alat berbentuk tang yang digunakan untuk operasi, kait dan jarum bedah, serta pisau bedah tulang belakang dan pisau bedah lithotomy.",

    "Abbas ibnu Firnas adalah seorang ilmuwan asal Andalusia. Di samping berbagai penemuannya seperti jam air dan juga batu baca yang merupakan lensa yang diletakkan di atas buku agar kita bisa membaca dengan jelas, ibnu Firnas jauh lebih dikenal dunia karena mencoba untuk terbang.\n" +
            "\n" +
            "Tujuh abad setelah kematian Firnas, sejarawan Maroko bernama Al-Maqqari menulis sebuah deskripsi tentang Firnas. Di situ tertulis bahwa Firnas mencoba terbang dengan menutupi dirinya dengan bulu dan menempelkan sayap di tubuhnya. Lalu, dia menjatuhkan diri dari ketinggian.\n" +
            "\n" +
            "Dengan hanya menggunakan glider dengan mekanisme yang misterius, dia berhasil terbang dengan jarak yang masuk akal dan dia mendarat dengan selamat. Masalahnya hanya punggungnya sangat sakit, yang akhirnya diketahui karena ia lupa memberi mekanisme layaknya ekor di burung pada tubuhnya.\n" +
            "\n" +
            "Nama ibnu Farnas diabadikan oleh NASA sebagai salah satu nama kawah di Bulan, serta jadi nama bandara di Baghdad.",

    "Ibnu Sina atau dikenal di dunia barat dengan nama Avicenna, mungkin adalah nama ilmuwan terbesar dalam dunia Islam. Dia adalah seorang polimatik di mana ia menguasai ilmu fisika, astronomi, filsafat, dan beberapa lainnya.\n" +
            "\n" +
            "Ia sendiri paling terkenal dalam dunia medis, dan dinobatkan sebagai bapak medis modern.\n" +
            "\n" +
            "Deretan karya yang ia bukukan adalah The Book of Healing, yang merupakan ensiklopedi filosofis dan ilmiah, serta The Canon of Medicine yang merupakan ensiklopedi medis.\n" +
            "\n" +
            "Buku The Canon of Medicine sendiri merupakan buku wajib di kampus-kampus era medieval dan digunakan hingga abad ke 17. Bahkan beberapa universitas papan atas masih menggunakannya hingga sekarang.\n" +
            "\n" +
            "Dalam bidang filsafat, ia juga menulis soal filosofi Islam dengan subjek ilmu pengetahuan seperti logika, filosofi moral, dan juga metafisika."};

    String[] fotoIlmuan = {"https://cdns.klimg.com/merdeka.com/i/w/news/2019/06/03/1084352/paging/540x270/al-jazari.jpg",
    "https://cdns.klimg.com/merdeka.com/i/w/news/2019/06/03/1084352/paging/540x270/ibnu-al-haytham.jpg",
    "https://cdns.klimg.com/merdeka.com/i/w/news/2019/06/03/1084352/paging/540x270/al-idrisi.jpg",
    "https://cdns.klimg.com/merdeka.com/i/w/news/2019/06/03/1084352/paging/540x270/banu-musa-bersaudara.jpg",
    "https://cdns.klimg.com/merdeka.com/i/w/news/2019/06/03/1084352/paging/540x270/al-zahrawi.jpg",
    "https://cdns.klimg.com/merdeka.com/i/w/news/2019/06/03/1084352/paging/540x270/abbas-ibnu-firnas.jpg",
    "https://cdns.klimg.com/merdeka.com/i/w/news/2019/06/03/1084352/paging/540x270/ibnu-sina.jpg"};

    String idList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final Intent intent = getIntent();
        idList = intent.getStringExtra("putId");


        listView = findViewById(R.id.listView);

        CostomListviewAdapter costomListviewAdapter = new CostomListviewAdapter();
        listView.setAdapter(costomListviewAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("tesclick", "okeokeoke");
                Intent intent2 = new Intent(ListActivity.this, DetailActivity.class);
                switch (idList) {
                    case "1":
                        intent2.putExtra("putNamaNabi", namaNabi[position]);
                        intent2.putExtra("putCeritaNabi", kisahNabi[position]);
                        intent2.putExtra("putFotoNabi", fotoNabi[position]);
                        intent2.putExtra("putId","1");
                        startActivity(intent2);
                        break;
                    case "2":
                        intent2.putExtra("putNamaSahabat", namaSahabat[position]);
                        intent2.putExtra("putCeritaSahabat", ceritaSahabat[position]);
                        intent2.putExtra("putFotoSahabat", fotoSahabat[position]);
                        intent2.putExtra("putId","2");
                        startActivity(intent2);
                        break;
                    case "3":
                        intent2.putExtra("putNamaWali", namaWali[position]);
                        intent2.putExtra("putCeritaWali", ceritaWali[position]);
                        intent2.putExtra("putFotoWali", fotoWali[position]);
                        intent2.putExtra("putId","3");
                        startActivity(intent2);
                        break;
                    case "4":
                        intent2.putExtra("putNamaIlmuan", namaIlmuan[position]);
                        intent2.putExtra("putCeritaIlmuan", ceritaIlmuan[position]);
                        intent2.putExtra("putFotoIlmuan", fotoIlmuan[position]);
                        intent2.putExtra("putId","4");
                        startActivity(intent2);


                        break;
                }
            }
        });
    }





    private class CostomListviewAdapter extends BaseAdapter {
        int leghtClick;
        @Override
        public int getCount() {

            switch (idList) {
                case "1":
                    leghtClick =  namaNabi.length;
                    break;
                case "2":
                    leghtClick =  namaSahabat.length;
                    break;
                case "3":
                    leghtClick =  namaWali.length;
                    break;
                case "4":
                    leghtClick =  namaIlmuan.length;
                    break;
            }

            return leghtClick;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.item_row, null);
            ImageView imageMuslim = convertView.findViewById(R.id.fotoMuslim);
            TextView namaMuslim = convertView.findViewById(R.id.namaMuslim);
            Log.d("cekID", idList.toString());
            switch (idList) {
                case "1":
                    Picasso.get().load(fotoNabi[position]).into(imageMuslim);
                    namaMuslim.setText(namaNabi[position]);
                    break;
                case "2":
                    Picasso.get().load(fotoSahabat[position]).into(imageMuslim);
                    namaMuslim.setText(namaSahabat[position]);
                    break;
                case "3":
                    Picasso.get().load(fotoWali[position]).into(imageMuslim);
                    namaMuslim.setText(namaWali[position]);
                    break;
                case "4":
                    Picasso.get().load(fotoIlmuan[position]).into(imageMuslim);
                    namaMuslim.setText(namaIlmuan[position]);
                    break;
            }



            return convertView;

        }
    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }


        return super.onOptionsItemSelected(item);


    }
}
