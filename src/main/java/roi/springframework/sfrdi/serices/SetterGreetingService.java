package roi.springframework.sfrdi.serices;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
