enum WeekDay{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
class EnumEx{
    public static void main(String[] args){
        WeekDay day=WeekDay.Monday;
        System.out.println(day);
        for(WeekDay wd:WeekDay.values()){
            System.out.println(wd);
        }
    }
}