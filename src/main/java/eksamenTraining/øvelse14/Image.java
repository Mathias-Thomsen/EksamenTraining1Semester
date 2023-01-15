package eksamenTraining.øvelse14;

public class Image {
    private String fileName;
    private double width;
    private double height;



    public Image(String fileName, double width, double height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }


    public boolean isKnownFileType(String fileName) {

        String [] file = fileName.split("\\.");
        String fileEnds = file[1];

        switch (fileEnds) {
            case "gif", "jpeg", "jpg", "png", "webp", "bmp" -> {
                return true;
            }
        }
        return false;
    }

    public boolean isPortrait() {
        return (height > width);
    }

    public boolean isLandscape() {
        return (height < width);
    }





    public static void main(String[] args) {
        Image image1 = new Image("dog.webp", 45, 13.4);

        System.out.println(image1.isKnownFileType(image1.fileName));
        System.out.println(image1.isPortrait());
        System.out.println(image1.isLandscape());

    }


}
