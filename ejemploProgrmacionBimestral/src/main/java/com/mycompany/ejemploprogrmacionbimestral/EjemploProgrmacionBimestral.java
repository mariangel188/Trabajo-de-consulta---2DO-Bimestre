package com.mycompany.ejemploprogrmacionbimestral;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class EjemploProgrmacionBimestral {

    public static void main(String[] args) {
        System.out.println("Programa iniciado");
        String[] frutas = {"Banana", "Fresa", "Manzana", "Uva","Mandarina"};
        
        Observable<String> frutasObservable = Observable.fromArray(frutas);
        
        frutasObservable
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.computation())
            .map(fruta -> fruta.toUpperCase())
            .filter(fruta -> fruta.startsWith("M"))
            .subscribe(
                fruta -> System.out.println("Fruta obtenida: " + fruta),
                Throwable::printStackTrace,
                () -> System.out.println("Proceso listo y completo")
            );
    }
}