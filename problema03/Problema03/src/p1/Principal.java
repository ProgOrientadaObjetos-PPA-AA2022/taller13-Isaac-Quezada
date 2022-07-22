/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;
import p3.DominioGobierno;
import p3.DominioOutlook;
import p3.DominioUTPL;
import p3.DominioYahoo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();
        
        DominioGmail dominio = new DominioGmail();
        dominio.establecerDominio("gmail.com");
        Correo c = new Correo();
        c.establecerDominio(dominio);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        
        DominioGobierno dominio1 = new DominioGobierno();
        dominio1.establecerDominio("edu.ec");
        Correo c1 = new Correo();
        c1.establecerDominio(dominio1);
        c1.establecerUserName(e.obtenerUserName());
        c1.establecerCorreo();
        
        DominioOutlook dominio3 = new DominioOutlook();
        dominio3.establecerDominio("Outlook.com");
        Correo c2 = new Correo();
        c2.establecerDominio(dominio3);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        
        DominioUTPL dominio4 = new DominioUTPL();
        dominio4.establecerDominio("utpl.edu.ec");
        Correo c4 = new Correo();
        c4.establecerDominio(dominio4);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        
        DominioYahoo dominio5 = new DominioYahoo();
        dominio5.establecerDominio("utpl.edu.ec");
        Correo c5 = new Correo();
        c5.establecerDominio(dominio5);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();
        
        lista.add(c);
        lista.add(c1);
        lista.add(c2);
        lista.add(c4);
        lista.add(c5);
        
        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
           
    }
}
