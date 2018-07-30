using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Test
{
    [TestClass]
    public class StubCalculatorTest
    {
        [TestMethod]
        public void TestAdd()
        {
            var sc = new stubCalculator();

            Assert.AreEqual(4, sc.Add(2));
            Assert.AreEqual(9, sc.Add(3));
        }
    }
}
