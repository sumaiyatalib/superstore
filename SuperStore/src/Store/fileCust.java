/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hii
 */
public class fileCust {

    public fileCust() {
    }

    void addFile(ArrayList<Product> li, int id) throws FileNotFoundException {

        File f = new File("customers/" + id + ".txt");
        PrintWriter w = new PrintWriter(f);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        w.println("Date"+dateFormat.format(date));
        
        for (int i = 0; i < li.size(); i++) {

            w.println(li.get(i).getId());
            w.println(li.get(i).getName());
            w.println(li.get(i).getPrice());
            w.println(li.get(i).getStock());
            w.println(li.get(i).getType());
            w.println(li.get(i).getSubtype());
            w.println();
            System.out.println(li.get(i));
        }
        w.close();
    }

}
