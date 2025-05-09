package application.model;

import application.controller.Controller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
class DestillatTest {


    private Destillat d;
    private Fad f;
    private Batch b1, b2, b3;
    private BatchMængde bm1, bm2, bm3;


    @BeforeEach
    void setUp() {
        f = new Fad(100, "TestLeverandør", false, Fadtype.EXBOURBON, Træsort.EGETRÆ, 1);
        // Opret Destillat objekt
        d = new Destillat(LocalDateTime.of(2022, 1, 1, 2, 2), f); // Fad kan være null her

        b1 = new Batch("Malt1", "Sort1", "Mark1", 100, 40.0, "ingen", Rygemateriale.GLØD);
        b2 = new Batch("Malt2", "Sort2", "Mark2", 100, 50.0, "ingen", Rygemateriale.GLØD);
        b3 = new Batch("Malt3", "Sort3", "Mark3", 100, 42.0, "ingen", Rygemateriale.GLØD);
        // Opret BatchMængde objekter
        bm1 = new BatchMængde(50, d, b1);
        bm2 = new BatchMængde(30, d, b2);
        bm3 = new BatchMængde(10, d, b3);
        // Tilføj BatchMængderne til Destillat
        d.addBatchMængde(bm1);
        d.addBatchMængde(bm2);
        d.addBatchMængde(bm3);

    }

    @Test
    void getBatchMængder() {
    }

    @Test
    void addBatchMængde() {
    }

    @Test
    void removeBatchMængde() {
    }

    @Test
    void getDestillatMængder() {
    }

    @Test
    void createDestillatMængde() {
    }

    @Test
    void removeDestillatMængde() {
    }

    @Test
    void beregnalkoholprocent() {

    }

    @Test
    void getSamletMængde() {
    }

    @Test
    void getDatoForPåfyldning() {
    }

    @Test
    void getFad() {
    }

    @Test
    void testToString() {
    }
}