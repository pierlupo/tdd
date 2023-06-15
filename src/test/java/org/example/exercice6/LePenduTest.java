package org.example.exercice6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
    public class LePenduTest {

    @Mock
    private Igenerateur lePendu;

    @Test
    void testWin() throws Exception {
        lePendu = new LePendu();

            Mockito.when(lePendu.testWin()).thenReturn(motATrouve);

            Assertions.assertTrue(lePendu.testWin());
        }
    }

