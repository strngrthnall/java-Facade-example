package media.library.service;


import media.library.model.*;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4Codec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OGGCodec();
        }
    }
}
