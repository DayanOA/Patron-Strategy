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
public class Contexto {

    private ICiframiento iCiframiento;
    private LlavePrivada llavePrivada;
    private LLavePublica llavePublica;

    public Contexto(ICiframiento iCiframiento) {
        this.iCiframiento = iCiframiento;
    }

    public void ciframiento(String texto, String Cifrar) {

        switch (Cifrar) {
            case Interfaces.AES: {
                try {
                    System.out.println("*** Cifrado en AES ***");
                    System.out.println("Texto: \n" + texto);
                    llavePrivada = (LlavePrivada) this.iCiframiento;
                    System.out.println("Cifrado:");
                    llavePrivada.setLlavePrivada(iCiframiento.EncriptarLlave(texto));
                    System.out.println(llavePrivada.getLlavePrivada());
                    System.out.println("");
                } catch (Exception e) {
                    System.out.println("Problema" + e);
                }
                break;
            }
            case Interfaces.DES: {
                try {
                    System.out.println("*** Cifrado em DES ***");
                    System.out.println("Texto: \n" + texto);
                    llavePrivada = (LlavePrivada) this.iCiframiento;
                    System.out.println("Cifrado:");
                    llavePrivada.setLlavePrivada(iCiframiento.EncriptarLlave(texto));
                    System.out.println(llavePrivada.getLlavePrivada());
                    System.out.println("");
                } catch (Exception e) {
                    System.out.println("Problema" + e);
                }
                break;
            }
            case Interfaces.TRESDES: {
                try {
                    System.out.println(" *** Cifrado en 3DES ***");
                    System.out.println("Texto: \n" + texto);
                    llavePrivada = (LlavePrivada) this.iCiframiento;
                    llavePrivada.setLlavePrivada(iCiframiento.EncriptarLlave(texto));
                    System.out.println("Cifrado:");
                    System.out.println(llavePrivada.getLlavePrivada());
                    System.out.println("");
                } catch (Exception e) {
                }
                break;
            }
            case Interfaces.RSA: {
                try {
                    System.out.println(" *** Cifrado en RSA ***");
                    System.out.println("Texto: \n" + texto);
                    llavePublica = (LLavePublica) this.iCiframiento;
                    System.out.println("Cifrado:");
                    System.out.println(llavePublica.EncriptarLlave(texto));
                    System.out.println("");
                } catch (Exception e) {
                }
                break;
            }
            case Interfaces.ELGAMAL: {
                try {
                    System.out.println(" *** Cifrado en ElGamal ***");
                    System.out.println("Texto: \n" + texto);
                    llavePublica = (LLavePublica) this.iCiframiento;
                    System.out.println("Cifrado:");
                    System.out.println(llavePublica.EncriptarLlave(texto));
                    System.out.println("");
                } catch (Exception e) {
                } 
                break;
            }
            default: {
                System.out.println("No coincide");
            }
        }

    }
}
