package CalcApp;


/**
* CalcApp/CalcOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calc.idl
* Thursday, August 6, 2020 at 10:23:49 PM Nepal Time
*/

public interface CalcOperations 
{
  float sum (float a, float b);
  float div (float a, float b) throws CalcApp.CalcPackage.DivisionByZero;
  float mul (float a, float b);
  float sub (float a, float b);
} // interface CalcOperations
