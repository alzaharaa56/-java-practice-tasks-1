public class Task25 {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

if (isAsleep) {
return false;
}



if (isMorning) {
return isMom;
}



return true;
    }
}
