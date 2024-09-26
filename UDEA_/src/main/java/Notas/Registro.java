package Notas;

import javax.xml.transform.dom.DOMLocator;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Registro {

    //atributos
    Scanner sc = new Scanner(System.in);
    String[] estudiantes;
    int cantidad;
    int[] tiempos;
    double[] notas;
    double promedio, promedioTiempo, notaMayor, notaMenor;

    //metodos
    public void cantidad() {
        System.out.println("ingresar cantidad de estudiantes: ");
        cantidad = sc.nextInt();
    }

    public String[] ingresoEstudiantes() {
        estudiantes = new String[cantidad];
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("ingresar nombre del estudiante: ");
            estudiantes[i] = sc.next();
        }
        return estudiantes;
    }

    public double[] ingresoNotas() {
        notas = new double[cantidad];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingresar nota: ");
            notas[i] = sc.nextDouble();
        }
        return notas;
    }

    public int[] ingresoTiempos(){
        tiempos = new int[cantidad];
        for (int i = 0; i < tiempos.length; i++) {
            System.out.println("ingresar tiempo: ");
            tiempos[i] = sc.nextInt();
        }
        return tiempos;
    }

    public double promedioNotas(){
        double[] not = ingresoNotas();
        double acum = 0;
        for (int i = 0; i < not.length; i++) {
            acum = acum + not[i];
        }
        promedio = acum / cantidad;
        return promedio;
    }

    public double promedioTiempo(){
        int[] tiempo = ingresoTiempos();
        double acum = 0;
        for (int i = 0; i < tiempo.length; i++) {
            acum = acum + tiempo[i];
        }
        promedioTiempo = acum / cantidad;
        return promedioTiempo;
    }

    public double notaMayor(){
        double[] notas = ingresoNotas();
        notaMayor = 0;
        for (int i = 0; i < notas.length; i++){
            if(notaMayor < notas[i]){
                notaMayor = notas[i];
            }
        }
        return notaMayor;
    }
    public double notaMenor(){
        double[] notas = ingresoNotas();
        notaMenor = 5.1;
        for (int i = 0; i < notas.length; i++){
            if(notaMenor > notas[i]){
                notaMenor = notas[i];
            }
        }
        return notaMenor;
    }

}
