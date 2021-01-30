package kata_3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author jorge
 */
public class HistogramDisplay extends ApplicationFrame{
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma", 
                                                       "Dominios", 
                                                       "Nº de emails", 
                                                       dataSet, 
                                                       PlotOrientation.VERTICAL, 
                                                       false, 
                                                       false, 
                                                       rootPaneCheckingEnabled);
        return chart;
    }
    
    public DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(2, "", "gmail.com");
        dataSet.addValue(7, "", "ulpgc.es");
        dataSet.addValue(3, "", "outlook.com");
        dataSet.addValue(1, "", "alu.ulpgc.es");
        return dataSet;
    }
}
