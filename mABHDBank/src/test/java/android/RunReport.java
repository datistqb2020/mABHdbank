package android;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunReport {
    @Test
    public void generateDemoReport() throws IOException {
        File reportOutputDirectory = new File("target/mABHDBankRP");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("reports/cucumber.json");

        String buildNumber = "1";
        String projectName = "KHCN_booking_flower-02";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setBuildNumber(buildNumber);

        configuration.addClassifications("Browser", "Firefox");
        configuration.addClassifications("Branch", "release/1.0");
        configuration.setSortingMethod(SortingMethod.NATURAL);
        configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
        configuration.addPresentationModes(PresentationMode.PARALLEL_TESTING);
        configuration.setQualifier("sample", "Chrome 80, mobile");
        // points to the demo trends which is not used for other tests
        configuration.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
