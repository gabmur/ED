using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
           // Console.Write("Primer numero");
            //string stringPrimerNumero = Console.ReadLine();
            //int primerNumero = int.Parse(stringPrimerNumero);

            //Console.Write("Segundo  numero");
            //string stringSegundoNumero = Console.ReadLine();
            //int segundoNumero = int.Parse(stringSegundoNumero);
            //int suma = primerNumero + segundoNumero;

           
            //Console.WriteLine("la suma de ambos numeros es: "+suma);

            decimal primerNumero = readDecimal("Primer numero");
            decimal segundoNumero = readDecimal("Segundo numero");
            decimal suma = primerNumero + segundoNumero;
            Console.WriteLine("suma=" + suma);
        }
        private static decimal readDecimal(string label){
            Console.Write(label);
            string stringDecimal = Console.ReadLine();
            return decimal.Parse(stringDecimal);
        }
    }
}
