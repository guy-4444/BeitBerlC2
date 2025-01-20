package stepDetector;

public class MainScreen {

    public static void start() {

        StepDetector sd = new StepDetector(protocolSteps);
        sd.start();

    }

    private static Protocol_Steps protocolSteps = new Protocol_Steps() {
        @Override
        public void step(int steps) {
            updateUI("" + steps);
        }

        @Override
        public void yemaniteStep() {
            updateUI("yemaniteStep");
        }
    };

    private static void updateUI(String str) {
        System.out.println("Text View updated with " + str);
    }

}





