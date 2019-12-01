package cn.matianhe.tankwar;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public static Clip  backSound=null;
    public static AudioInputStream backSoundLoad=null;
    public static Clip  bombSound=null;
    public static AudioInputStream bombSoundLoad=null;
    public static Clip fireSound=null;
    public static AudioInputStream fireSoundLoad=null;
    static {
        try {//��ʼ������Ч
            backSoundLoad = AudioSystem.getAudioInputStream(Sound.class.getClassLoader().getResource("images/start.wav"));
            backSound = AudioSystem.getClip();
            backSound.open(backSoundLoad);
            backSound.start();
            backSound.stop();
            backSound.setMicrosecondPosition(0);
            
            //��ը
            bombSoundLoad=AudioSystem.getAudioInputStream(Sound.class.getClassLoader().getResource("images/blast.wav"));
            bombSound=AudioSystem.getClip();
            bombSound.open(bombSoundLoad);
            bombSound.start();
            bombSound.stop();
            bombSound.setMicrosecondPosition(0);
          
            
            //����
            fireSoundLoad=AudioSystem.getAudioInputStream(Sound.class.getClassLoader().getResource("images/fire.wav"));
            fireSound=AudioSystem.getClip();
            fireSound.open(fireSoundLoad);
            fireSound.start();
            fireSound.stop();
            fireSound.setMicrosecondPosition(0);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void doBack(){
    	
        backSound.loop(3);//��������
       
        	
             
    }
    
    public static void bombMusic() {
    	 bombSound.loop(1);//����һ��
    	
    }
    
    public static void fireMusic() {
    	 fireSound.loop(1);//����һ��
    }
}
