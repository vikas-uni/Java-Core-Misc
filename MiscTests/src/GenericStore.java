/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class GenericStore <T>{
    private T ob;
      public void setObject(T object){
        this.ob=object;
      }
      
      public T getObject(){
        return ob;
      }
    
}
