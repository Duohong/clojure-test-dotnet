using System;

namespace Production
{
    public class SchoolBag
    {
        private ICalculator mCalculator;

        //public SchoolBag()
        //    : this (new Calculator())
        //{ }

        public SchoolBag(ICalculator calculator)
        {
            mCalculator = calculator;
        }

        public int Add(int a)
        {
            mCalculator.Add(a);
            return mCalculator.Add(a);
        }

        //public int Clear()
        //{
        //    return mCalculator.Clear();
        //}

        public static int Add(int a, int b)
        {
            return Calculator.Add(a, b);
        }
    }
}
