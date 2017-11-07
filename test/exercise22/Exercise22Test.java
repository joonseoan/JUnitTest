/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise22;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan
 */
public class Exercise22Test {
    
  
  @Test
  public void makeChangeFor87(){
    try{
      String expectedValue = "87 cents requires 3 quarters, 1 dime";
      String testValue = Exercise22.makeChange(87);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  
  @Test
  public void makeChangeFor2(){
    try{
      String expectedValue = "Cannot calculate change.";
      String testValue = Exercise22.makeChange(2);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  @Test
  public void makeChangeFor0(){
    try{
      String expectedValue = "Cannot calculate change.";
      String testValue = Exercise22.makeChange(0);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  @Test
  public void makeChangeFor100(){
    try{
      String expectedValue = "Cannot calculate change.";
      String testValue = Exercise22.makeChange(100);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  @Test
  public void makeChangeFor1(){
    try{
      String expectedValue = "Cannot calculate change.";
      String testValue = Exercise22.makeChange(1);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  
  @Test
  public void makeChangeFor99(){
    try{
      String expectedValue = "Cannot calculate change.";
      String testValue = Exercise22.makeChange(99);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  @Test
  public void makeChangeFor40(){
    try{
      String expectedValue = "40 cents requires 1 quarter, 1 dime, 1 nickel";
      String testValue = Exercise22.makeChange(40);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  @Test
  public void makeChangeFor98(){
    try{
      String expectedValue = "Cannot calculate change.";
      String testValue = Exercise22.makeChange(98);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
   @Test
  public void makeChangeFor71(){
    try{
      String expectedValue = "71 cents requires 2 quarters, 2 dimes";
      String testValue = Exercise22.makeChange(71);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  @Test
  public void makeChangeFor92(){
    try{
      String expectedValue = "92 cents requires 3 quarters, 1 dime, 1 nickel";
      String testValue = Exercise22.makeChange(92);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  
  @Test
  public void makeChangeFor4(){
    try{
      String expectedValue = "4 cents requires 1 nickel";
      String testValue = Exercise22.makeChange(4);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  
  @Test
  public void makeChangeFor27(){
    try{
      String expectedValue = "27 cents requires 1 quarter";
      String testValue = Exercise22.makeChange(27);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  
  @Test
  public void makeChangeFor8(){
    try{
      String expectedValue = "8 cents requires 1 dime";
      String testValue = Exercise22.makeChange(8);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  
  @Test
  public void makeChangeFor19(){
    try{
      String expectedValue = "19 cents requires 2 dimes";
      String testValue = Exercise22.makeChange(19);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  
  @Test
  public void makeChangeFor52(){
    try{
      String expectedValue = "52 cents requires 2 quarters";
      String testValue = Exercise22.makeChange(52);
      if (expectedValue.equals(testValue)){
        assert true;
      }else{
        assert false;
      }
    }catch(Exception e){
      assert false;
    }
  }
  
  @Test
  public void makeChangeFor101(){
    try{      
      String testValue = Exercise22.makeChange(101);      
      assert false;      
      }
    catch(BadChangeException e){
      assert true;
    }
    catch(Exception ex){
      assert false;
    }
  }
  
  @Test
  public void makeChangeForNeg1(){
    try{      
      String testValue = Exercise22.makeChange(-1);      
      assert false;      
      }
    catch(BadChangeException e){
      assertTrue(true);
    }
    catch(Exception ex){
      assertTrue(false);
    }
  }

  
   @Test
    public void changeFor49() {
        try {
            String expectedValue = "49 cents requires 2 quarters";
            String testValue = Exercise22.makeChange(49);

            if (expectedValue.equals(testValue)) {
                assert true;
            } else {
                assert false;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void changeFor17() {
        try {
            String expectedValue = "17 cents requires 1 dime, 1 nickel";
            String testValue = Exercise22.makeChange(17);

            if (expectedValue.equals(testValue)) {
                assert true;
            } else {
                assert false;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void changeFor94() {
        try {
            String expectedValue = "94 cents requires 3 quarters, 2 dimes";
            String testValue = Exercise22.makeChange(94);

            if (expectedValue.equals(testValue)) {
                assert true;
            } else {
                assert false;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void changeFor30() {
        try {
            String expectedValue = "30 cents requires 1 quarter, 1 nickel";
            String testValue = Exercise22.makeChange(30);

            if (expectedValue.equals(testValue)) {
                assert true;
            } else {
                assert false;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void changeFor54() {
        try {
            String expectedValue = "54 cents requires 2 quarters, 1 nickel";
            String testValue = Exercise22.makeChange(54);

            if (expectedValue.equals(testValue)) {
                assert true;
            } else {
                assert false;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void changeFor69() {
        try {
            String expectedValue = "69 cents requires 2 quarters, 2 dimes";
            String testValue = Exercise22.makeChange(69);

            if (expectedValue.equals(testValue)) {
                assert true;
            } else {
                assert false;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void changeFor8() {
        try {
            String expectedValue = "8 cents requires 1 dime";
            String testValue = Exercise22.makeChange(8);

            if (expectedValue.equals(testValue)) {
                assert true;
            } else {
                assert false;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void changeFor82() {
        try {
            assertEquals("Check for 82 cents", 
                         "82 cents requires 3 quarters, 1 nickel",
                         Exercise22.makeChange(82));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void changeFor21() {
        try {
          assertEquals("Check for 21 cents",
                       "21 cents requires 2 dimes", 
                       Exercise22.makeChange(21));
        } catch (Exception e) {
            fail();
        }
    }
    
}
