public class App {
    public static void main(String[] args) throws Exception {
        // Run the GUI creation on the Event Dispatch Thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimpleGUI.createAndShowGUI();
            }
        });
    }
}