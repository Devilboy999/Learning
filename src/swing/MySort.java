package swing;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class MySort {
    public static void main(String[] args){
        Vector<Vector<String>> data = new Vector<>();
        Vector<MySort> da = new Vector<>();
        Vector<String> row = new Vector<>();
        row.add("venl");
        row.add("Anblyst");
        data.add(row);
        row = new Vector<>();
        row.add("Rama Rao");
        row.add("Analyst");
        data.add(row);
        System.out.println(row);
        System.out.println(data);
        Collections.sort(data,new Comparator<Vector<String>>(){
            @Override  public int compare(Vector<String> v1, Vector<String> v2) {
                System.out.println(v1.get(0));
                System.out.println(v2.get(0));
                return v1.get(0).compareTo(v2.get(0)); //If you order by 2nd element in row
            }});
        System.out.println(data);
    }


}
