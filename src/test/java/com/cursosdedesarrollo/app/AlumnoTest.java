package com.cursosdedesarrollo.app;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AlumnoTest {
    @Test
    public void objetoAlumnoNoEsNullAlUsarConstructorSinParametros(){
        Alumno a = new Alumno();
        assertNotNull(a);
    }
    @Test
    public void objetoAlumnoNoEsNullAlUsarConstructorConParametros(){
        Alumno a = new Alumno(0,"Iñaki","Atlethic Kalea");
        assertNotNull(a);
        assertEquals(new Integer(0),a.getId());
        assertEquals("Iñaki",a.getNombre());
        assertEquals("Atlethic Kalea",a.getDireccion());
    }
}
