package shumkovspring;


import org.springframework.stereotype.Component;


public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "A ti takoy muzchina s borodoi";
    }
}
