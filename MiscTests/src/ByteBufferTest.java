/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.nio.*;


public class ByteBufferTest {
    public static void main(String[] arg){
        ByteBuffer buf= ByteBuffer.allocate(30);
        for (int i=0;i<buf.capacity();i++)
            buf.put((byte) (i+10));
        
       
        System.out.println(buf.capacity()+" "+ buf.get(3)+" "+ buf.position(8)+" "+buf.put((byte)123));
        
        for(int i=0;i<buf.capacity();i++)
            System.out.println(buf.get(i));
    }
    
}
