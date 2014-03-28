package com.sample.adapter;

public interface RAConnection

{

   /**

    * write

    * @return String

    */

   public String write();


   /**

    * write

    * @param name A name

    * @return String

    */

   public String write(String name);


   /**

    * Close

    */

   public void close();

}

