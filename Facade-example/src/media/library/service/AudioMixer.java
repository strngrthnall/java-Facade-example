package media.library.service;

import java.io.File;

import media.library.model.VideoFile;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}

