using System;

namespace Production
{
    public interface ICalculator
    {
        int Add(int a);
    }

    public class Calculator : ICalculator
    {
        private int mMemory;

        public Calculator()
            : this (0)
        { }

        public Calculator(int memory)
        {
            mMemory = memory;
        }

        public int Add(int a)
        {
            mMemory += a;
            return mMemory;
        }

        public int Clear()
        {
            mMemory = 0;
            return mMemory;
        }

        public static int Add(int a, int b)
        {
            return a + b;
        }
    }
}
