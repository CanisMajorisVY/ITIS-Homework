package Structures;

/**
 * Created by Mihail on 16.02.2017.
 */
interface Map<T>{
    void add(String key, T value);
    T remove(String key);  //вместо void может быть boolean, object
    T get(String key);
    void set(String key, T object);

//----------------------------------------------------------------------------------
//
//    void removeAll();
//    String[] getKeys();
//    Object[] getValues();
//    int size();

}
