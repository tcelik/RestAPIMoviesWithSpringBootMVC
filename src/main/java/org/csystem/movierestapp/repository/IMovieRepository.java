package org.csystem.movierestapp.repository;

import org.csystem.movierestapp.entity.MovieInfo;
import org.csystem.repository.IRepository;

//extends Dao template for specific abstract methods
public interface IMovieRepository extends IRepository<MovieInfo, Long> { //seni Movie ile açıyorum, metotlarına bak.
    //ister override edersin. İstersen etme.
    //IMovieRepository işin busines kısmı.
    //Genel template' anlaşmasın  uyuyor
    //Bu anlaşmayı uygulayan sınıf buradaki anlaşmalar ve genel anlaşmanın tüm metotlarını compile time'da yazmak zorunda/
    //Amaç: Dinamik türün metotları çağrılır, tam bu noktada framework işin businesini bize bırakıyor


    //Soru: Bu yazılmasa olurmuydu?evet
    //Ama diğeri bir template, burada Movie'ye ilişkin repository katmanı.
    //Movie'ye özel projeye özel abstract metotlar.

    //1. Ver bana bir isim içinde geçen tüm filmleri getireyim.
    Iterable<MovieInfo> findByName(String name);
    Iterable<MovieInfo> findByYear(int year);

    //Database'indeki 1990 start, 2000 end aralığındaki fimleri getirir misin demenin javacası.
    Iterable<MovieInfo> findByYears(int start, int end);

    //Şuanda biz dao katmanı yazıyoruz.Database'e erişip birşey getiren aslında resultset dönen ondan bir arraylist elde ediyoruz
    //list is iterable olduğu için doğrudan atanabilir.
    Iterable<MovieInfo> findByDirector(String director);

    //Bu anlaşmaya implemente edecek dao instance nesnesi buradakileri ve template'i yazmak zorunda.


    //Laf aramızda: Dao nesnesini biz almıyoruz. Dependency injection ile spring boot alıyor new yapıyor aslında.
    //Runtime'da aldığı bizim yazdığımız sınıf olduğuna göre dinamik türün metotları önce çağrılır der java dolayısıyla
    //bizim yazdığımız metotlar çağrılıyor bu durumda biz işin businesi'ini kurgulamış oluyoruz.
}
