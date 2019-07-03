# resemble-java
Java fork of <a href="https://github.com/Huddle/Resemble.js" target="_blank">Resemble.js</a> javascript library.

# Image Comparison
- Compare two images giving a difference score 
- create an image with a visual difference in different way
- Preprocess util to background crop, resize, etc

# Usage

```java
        File imgFile1 = new File("1.jpg");
        File imgFile2 = new File("2.jpg");
        //Crop if needed
        BufferedImage img1 = ImageUtils.cropWhiteBackground(ImageUtils.readImage(imgFile1), 50);
        BufferedImage img2 = ImageUtils.cropWhiteBackground(ImageUtils.readImage(imgFile2), 50);
        
        //ignore antialiasing between two images (different qualities for example)
        ResembleAnalysisOptions options = ResembleAnaylsisOptionsTemplates.ignoringAntialiasing();
        
        ResembleAnalysisResults results = new ResembleAnalysis(options).analyseImages(img1, img2);
        
        ResembleParserData dataResult = ResembleParser.parse(results.getOutputImage());

        ImageWindow.show(results.getOutputImage(), "Results",
                String.format("File 1: '%s'\n" +
                        "File 2: '%s'\n\n" +
                        "Info: %s\n\n" +
                        "Output image:\n%s\n\n" +
                        "Options:\n%s\n\n" +
                        "Mismatch percentage: %.2f %%\n" +
                        "Analysis time: %d miliseconds\n" +
                        "Difference bounds: %s",
                        imgFile1, imgFile2, dataResult, results.getOutputImage(), options,
                        results.getMismatchPercentage(), results.getAnalysisTime().toMillis(),
                        results.getDiffBounds())
```

New Features:
- Resize the two images before compare them (allowing different size and quality images comparison)
- Add templating for comparison using the thresolds available the ResembleJS Demo page http://rsmbl.github.io/Resemble.js/
- Make threshold customizable
