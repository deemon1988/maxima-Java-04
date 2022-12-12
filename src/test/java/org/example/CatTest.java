package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CatTest
{
    private Cat murzik;

    @Before
    public void prepare() throws Exception {
        murzik = new Cat("Мурзик",10, true);
    }
@Test
    public void shouldNameBeMurzik() throws Exception {

        assertEquals("Мурзик", murzik.getName());

    }
@Test
public void shouldWeightbe10() throws Exception {

    assertEquals(10, murzik.getWeight());
}
}
