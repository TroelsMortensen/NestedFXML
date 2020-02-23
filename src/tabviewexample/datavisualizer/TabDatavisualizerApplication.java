package tabviewexample.datavisualizer;

import javafx.application.Application;
import javafx.stage.Stage;
import tabviewexample.datavisualizer.model.DataModel;
import tabviewexample.datavisualizer.model.Model;
import tabviewexample.datavisualizer.core.ViewHandler;
import tabviewexample.datavisualizer.core.ViewModelFactory;

import java.util.Random;

public class TabDatavisualizerApplication extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        Model m = new DataModel();
        ViewModelFactory vmf = new ViewModelFactory(m);
        ViewHandler vh = new ViewHandler(stage, vmf);
        vh.start();

        runAutoUpdate((DataModel) m);
    }

    private void runAutoUpdate(DataModel m) {
        Thread thread = new Thread(() -> {
            Random r = new Random();
            while (true) {
                m.recalculateData();
                try {
                    Thread.sleep(r.nextInt(10000) + 5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // setting daemon, meaning the thread will terminate, when the JavaFX app is closed.
        thread.setDaemon(true);
        thread.start() ;
    }

    @Override
    public void stop() throws Exception {

    }
}
