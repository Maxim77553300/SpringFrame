package shumkovspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//       // Music music = context.getBean("musicBean", Music.class);
//
//       // MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        boolean comparison = firstusicPlayer == secondMusicPlayer;
//
//        System.out.println(firstusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstusicPlayer.setVolume(10);
//
//        System.out.println(firstusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//
//        System.out.println(comparison);
//        firstusicPlayer.playMusic();
//
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);


//
//        context.close();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//       Music music = context.getBean("musicBean",Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music1 = context.getBean("rockMusic",RockMusic.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//
//        musicPlayer1.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);

        context.close();
        System.out.println();
        System.out.println();
        System.out.println("jjjj");

    }
}
