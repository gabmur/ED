using NUnit.Framework;
using System;
namespace CVector
{
    [TestFixture]
    public class VectorTest
    {
        [Test]
        public void BinarySearch()
        {
            Assert.AreEqual(-1, Vector.BinarySearch(new int[] { 45 }, 33));
            Assert.AreEqual(5, Vector.BinarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 6)); 
            Assert.AreEqual(1, Vector.BinarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2));
            Assert.AreEqual(-1, Vector.BinarySearch(new int[] { 45 }, 33));
            Assert.AreEqual(-1, Vector.BinarySearch(new int[] { 45 }, 33));

        }
    }
}
