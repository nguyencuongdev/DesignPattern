package OBserverPattern;

import java.util.Objects;

public class YoutubeNotification extends Observer{
    public YoutubeNotification(Subject subject)
    {
        this.subject = subject;
        subject.AttachObserver(this);
    }

    @Override
    public void notification(Objects ar) {
        try {
            VideoData video = (VideoData) this.subject;
            System.out.format("\nNotify all subscribers via EMAIL with new data" +
                    "\n\tName: %s" +
                    "\n\tDescription: %s" +
                    "\n\tFile name: %s", video.getTitle(), video.getDescription(), video.getFileName());
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
}
