package dp.observer;

/**
 * This class stores the state of interest to ConcreteObserver objects and sends
 * notification to its observers when its state changes.
 *
 * @version 1.0 @created 26-juin-2012 16:14:00
 */
public class NewsFeed extends Subject {

    private String subjectState;


    public String getSubjectState() {
        return subjectState;
    }


    public void setSubjectState(String newVal) {
        subjectState = newVal;
        notifyObservers();
    }
}