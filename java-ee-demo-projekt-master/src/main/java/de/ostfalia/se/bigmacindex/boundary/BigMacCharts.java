package de.ostfalia.se.bigmacindex.boundary;

import de.ostfalia.se.bigmacindex.control.BigMacService;
import de.ostfalia.se.bigmacindex.entity.BigMacIndex;
import org.primefaces.component.linechart.LineChart;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.line.LineChartDataSet;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class BigMacCharts implements Serializable {

    @Inject
    BigMacService bms;

//    @PostConstruct
//    public void init() {
//        createLineModel();
//    }

    private LineChartModel lineModel;

//    public void createLineModel() {
//        lineModel = new LineChartModel();
//        ChartData data = new ChartData();
//
//        LineChartDataSet dataSet = new LineChartDataSet();
//        List<BigMacIndex> values = bms.getAll();
//        dataSet.setData(values);
//        dataSet.setFill(false);
//        dataSet.setLabel("My First Dataset");
//        dataSet.setBorderColor("rgb(75, 192, 192)");
//        dataSet.setLineTension(0.1);
//        data.addChartDataSet(dataSet);
//
//        List<String> labels = new ArrayList<>();
//        labels.add("January");
//        labels.add("February");
//        labels.add("March");
//        labels.add("April");
//        labels.add("May");
//        labels.add("June");
//        labels.add("July");
//        data.setLabels(labels);
//
//        //Options
//        LineChartOptions options = new LineChartOptions();
//        Title title = new Title();
//        title.setDisplay(true);
//        title.setText("Line Chart");
//        options.setTitle(title);
//
//        lineModel.setOptions(options);
//        lineModel.setData(data);
//    }



}
