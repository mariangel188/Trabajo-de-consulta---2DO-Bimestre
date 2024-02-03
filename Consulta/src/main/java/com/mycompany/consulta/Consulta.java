/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.consulta;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class Consulta {

    public static void main(String[] args) {
        System.out.println("Proceso iniciado");
        
        Observable<String> frutasObservable = Observable.just("Fresa", "Manzana", "Uva", "Mandarina", "Banana");

        frutasObservable
                .map(fruta -> fruta.toUpperCase()) // Multiplicamos cada número por 2
                .filter(fruta -> fruta.startsWith("M")) // Filtramos solo los números divisibles por 3
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(String fruta) {
                        System.out.println("Fruta obtenida: " + fruta);
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Proceso listo y completo");
                    }
                });
    }
}
