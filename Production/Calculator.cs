using System;

namespace Production
{
    public class Calculator
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
