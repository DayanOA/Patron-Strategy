/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerStrategia;

/**
 *
 * @author Tonny
 */
public class Cliente {

    public static void main(String[] args) {

        Contexto contexto = new Contexto(new AES());
        contexto.ciframiento("Hola a todos", Interfaces.AES);

        contexto = new Contexto(new DES());
        contexto.ciframiento("esta es la clase de", Interfaces.DES);

        contexto = new Contexto(new TresDES());
        contexto.ciframiento("Arquitectura de Software", Interfaces.TRESDES);

        contexto = new Contexto(new RSA());
        contexto.ciframiento("con el profesor", Interfaces.RSA);

        contexto = new Contexto(new ElGamal());
        contexto.ciframiento("Jorge Camargo", Interfaces.ELGAMAL);

    }

}
