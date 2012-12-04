/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.streams;

import java.io.*;

/**
 *
 * @author HumanBooster
 */
public class FileCopier {

    static long binaryCopy(String srcFileName, String destFileName) {

        long start = System.nanoTime();
        try (
                FileInputStream fis = new FileInputStream(srcFileName);
                FileOutputStream fos = new FileOutputStream(destFileName);) {

            int b = 0;

            while ((b = fis.read()) != -1) {
                fos.write(b);
            }


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        return System.nanoTime() - start;
    }

    static long bufferedBinaryCopy(String srcFileName, String destFileName) {

        long start = System.nanoTime();

        try (
                BufferedInputStream bis = new BufferedInputStream(
                        new FileInputStream(srcFileName));
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(destFileName));) {
            int b = 0;

            while ((b = bis.read()) != -1) {
                bos.write(b);
            }


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return System.nanoTime() - start;
    }

    public static void main(String[] args) {

       
        long simpleCopyTime = binaryCopy("c\\worspace\\test.txt, ","c\\worspace\\test2.txt");
        long bufferedCopyTime = bufferedBinaryCopy("c\\worspace\\test.txt", "c\\worspace\\test2.txt");
        
        System.out.println("simpleCopyTime = " + simpleCopyTime);
        System.out.println("bufferedCopyTime = " + bufferedCopyTime);
    
}
}

