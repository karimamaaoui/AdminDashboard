/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author user
 */
public class DashboardController implements Initializable {

    @FXML
     private PieChart pileChart;
    @FXML
    private LineChart<?, ?> lineChart;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inLineChart();
        iniPieChart();
    }    
    
    
    private void inLineChart(){
        XYChart.Series series=new XYChart.Series();
        series.getData().add(new XYChart.Data("Monday",8));
        series.getData().add(new XYChart.Data("Tuesdat",12));
        series.getData().add(new XYChart.Data("Wednesday",10));
        series.getData().add(new XYChart.Data("Thursday",15));
        series.getData().add(new XYChart.Data("Friday",12));
        series.getData().add(new XYChart.Data("Saturday",5));
        lineChart.getData().addAll(series);
        lineChart.lookup(".chart-plot-background").setStyle(".-fx-background-color:transparent;");
        series.getNode().setStyle("-fx-stroke: #FFD6DC");
        
    }
    
    private void iniPieChart(){
        ObservableList <PieChart.Data> pieChartData =FXCollections.observableArrayList(
        new PieChart.Data("Android", 15),
        new PieChart.Data("JavaFX", 38),
        new PieChart.Data("Java Swing", 18),
        new PieChart.Data("React Native", 2)
        );
        pileChart.setData(pieChartData);
    }
}
