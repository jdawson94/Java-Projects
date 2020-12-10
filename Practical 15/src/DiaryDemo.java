public class DiaryDemo {

    public static void main(String[] args) {
        Diary jobList = new Diary();

        Job washCar = new Job("Wash Car",6);
        Job washPlates = new Job("Wash Plates",9);
        Job paintWall = new Job ("Paint Wall",2);
        Job cleanShelf = new Job ("Clean Shelf",8);
        Job mowLawn = new Job ("Mow Lawn",7);

        jobList.addJob(washCar);
        jobList.addJob(washPlates);
        jobList.addJob(paintWall);
        jobList.addJob(cleanShelf);
        jobList.addJob(mowLawn);

        jobList.printDiary();

        jobList.searchDiary("Wash");

        jobList.sortDiary();
        jobList.printDiary();

        washPlates.markCompleted();
        jobList.purgeDiary();
        jobList.printDiary();
    }
}
