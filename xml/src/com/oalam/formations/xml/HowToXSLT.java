/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oalam.formations.xml;

/**
 *
 * @author bailett
 */
// jdk1.4.1
import javax.xml.transform.*;
import java.net.*;
import java.io.*;

public class HowToXSLT {
public static void main(String[] args) {
  try {

    TransformerFactory tFactory = TransformerFactory.newInstance();

    Transformer transformer =
      tFactory.newTransformer
         (new javax.xml.transform.stream.StreamSource
            ("howto.xsl"));

    transformer.transform
      (new javax.xml.transform.stream.StreamSource
            ("howto.xml"),
       new javax.xml.transform.stream.StreamResult
            ( new FileOutputStream("howto.html")));
    }
  catch (Exception e) {
    e.printStackTrace( );
    }
  }
}