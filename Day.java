public enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THRUSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int daynum;

    Day(int daynum){
        this.daynum = daynum;
    }

    public int getDayNum(){
        return this.daynum;
    }
}
