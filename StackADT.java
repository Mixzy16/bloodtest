/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtest;

/**
 *
 * @author micha
 */
public interface StackADT<T> {
    void push(T item);
    T pop();
    boolean isEmpty();
}
