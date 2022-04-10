package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;
import org.testng.Assert;


  public class S2Test {



    @Test
    public void testArea() {
      S s = new S(5);
      int x = 10;
      Assert.assertEquals(s.area(), 25.0);
      Assert.assertEquals(x, 10);
      int y = 9;
      Assert.assertTrue(y < 11);

    }

  }






