/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    URL ur = new URL("http://www."+inputLine+".com");
    InputStream inputur = ur.openStream();
    InputStreamReader inputreader = new InputStreamReader(inputur);
    BufferedReader buffered = new BufferedReader(inputreader);
    String[] save = new String[5];
    for(int i = 0;i <= 4; i++){
        save[i] = buffered.readLine();//一行一行读取，读完一行会自动转到下一行
        System.out.println(save[i]);
    }

    for (int i = 4; i >= 0; i--){
        System.out.println(save[i]);
    }

  }
}

//note
//openStream()中open小写
//System.out.println中 System开头要大写
/*在url的读取中，skeleton是：
import java.IO.*;
import java.net.*;

class className{
  public static void main(String[] arg) throws Exception{
      URL ur = new URL("http://......");
      inputStream input = ur.openStream();//需要注意url要有openstream这个步骤
      inputStreamReader inputreader = new inputStreamReader(input);
      BufferedReader buffered = new BufferedReader(inputreader);
      System.out.println(buffered.readLine());

  }
}