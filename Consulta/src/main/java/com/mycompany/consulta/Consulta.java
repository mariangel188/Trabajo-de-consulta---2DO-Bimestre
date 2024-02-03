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
        
        // Creamos un Observable con una lista de números
        Observable<String> frutasObservable = Observable.just("Fresa", "Manzana", "Uva", "Mandarina", "Banana");

        // Aplicamos operadores para transformar y filtrar los números
        frutasObservable
                .map(fruta -> fruta.toUpperCase()) // Multiplicamos cada número por 2
                .filter(fruta -> fruta.startsWith("M")) // Filtramos solo los números divisibles por 3
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        // No necesitamos implementar nada aquí para este ejemplo
                    }

                    @Override
                    public void onNext(String fruta) {
                        // Imprimimos los números transformados y filtrados
                        System.out.println("Fruta obtenida: " + fruta);
                    }

                    @Override
                    public void onError(Throwable e) {
                        // Manejamos errores si ocurren
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        // Se llama cuando el Observable ha terminado de emitir todos los elementos
                        System.out.println("Proceso listo y completo");
                    }
                });
    }
}
