using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Test
{
    [TestClass]
    public class SchoolBagTest
    {
        [TestMethod]
        public void TestAdd()
        {
            var sc = new stubCalculator();
            var sb = new Production.SchoolBag(sc);

            Assert.AreEqual(4, sb.Add(2));
            Assert.AreEqual(9, sb.Add(3));
        }
    }
}
