package dp.observer;

/**
 * This class maintains a reference to a ConcreteSubject object, stores state
 * that should stay consistent with the subject's and implements the Observer
 * updating interface to keep its state consistent with the subject's.
 *
 * @version 1.0 @created 26-juin-2012 16:14:00
 */
public class FeedReader extends Observer {

    private String observerState;
    private NewsFeed subject;

    public String getObserverState() {
        return observerState;
    }

    
    
    /**
     *
     * @param subject
     */
    public FeedReader(NewsFeed subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("get news = " + observerState);
    }
}