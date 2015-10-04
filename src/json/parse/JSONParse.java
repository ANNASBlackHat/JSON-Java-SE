/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.parse;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ANNAS
 */
public class JSONParse {

    JSONObject jsonObject;
    private static final String jsonFilePath = "E:\\LATIHAN\\Java\\JSON Parse\\src\\json\\parse\\data.json";
    
    public static void main(String[] args) {
        JSONParser jsonParse = new JSONParser();
        try {
            FileReader fileReader = new FileReader(jsonFilePath);
            JSONObject jsonObject = (JSONObject)jsonParse.parse(fileReader);
            String siteName = (String)jsonObject.get("Site Name");
            System.out.println("Site Name : "+siteName);
            long members = (long)jsonObject.get("Members");
            System.out.println("Members : "+members);
            String url = (String)jsonObject.get("URL");
            System.out.println("URL : "+url);
            JSONArray names = (JSONArray)jsonObject.get("Names");
            Iterator i = names.iterator();
            while(i.hasNext()){
                System.out.println("- "+i.next());
            }
        } catch (IOException | ParseException e) {
            System.out.println("Error "+e);
        }
    }
    
}
