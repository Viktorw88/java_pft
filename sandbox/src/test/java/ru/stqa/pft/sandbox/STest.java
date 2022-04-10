package ru.stqa.pft.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class STest {



    @Test
    public void testArea() {
      S s = new S(5);
      int x = 10;
      Assertions.assertEquals(s.area(), 25.0);
      assertEquals(x, 10);
      int y = 9;
      assertTrue(y < 11);

    }

  }



