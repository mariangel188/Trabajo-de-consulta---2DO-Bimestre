
package com.mycompany.consulta;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class Consulta {

    public static void main(String[] args) {
        System.out.println("Proceso iniciado");
        
        Observable<String> frutasObservable = Observable.just("Fresa", "Manzana", "Uva", "Mandarina", "Banana");

        frutasObservable
                .map(fruta -> fruta.toUpperCase()) 
                .filter(fruta -> fruta.startsWith("M")) 
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
