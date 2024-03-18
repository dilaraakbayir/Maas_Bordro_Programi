package com.dilara;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOku {
    public void dosyaOku() {
    BufferedReader br;
    {
        try {
            br = new BufferedReader(new FileReader("src/main/resources/personel.txt"));
            String str=br.readLine();
            System.out.println(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }



}
