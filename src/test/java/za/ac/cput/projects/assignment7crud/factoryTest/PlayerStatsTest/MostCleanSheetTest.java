package za.ac.cput.projects.assignment7crud.factoryTest.PlayerStatsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.assignment7crud.domains.PlayerStats.MostCleanSheets;
import za.ac.cput.projects.assignment7crud.factory.PlayerStatsFactory.MostCleanSheetsFactory;

public class MostCleanSheetTest  {
    MostCleanSheets cleanSheet;



    @Test
    public void createMostCleanSheet(){
        cleanSheet = MostCleanSheetsFactory.createMostCleanSheets(10, 20);
        Assert.assertEquals(cleanSheet.getNumOfCleanSheets(), cleanSheet.getNumOfCleanSheets());
        System.out.println(cleanSheet.toString());

    }
}
