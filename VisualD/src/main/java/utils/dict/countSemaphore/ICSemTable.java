package utils.dict.countSemaphore;

import controller.MyException;

import java.util.Map;

public interface ICSemTable <V> {
    int put (V v) throws MyException;
    int getAddress();

    V getValue(int address) throws MyException;
    boolean isDefined(int address);
    void update(int address, V value);

    void setContent(Map<Integer, V> map);
    Map<Integer,V> getContent();
}