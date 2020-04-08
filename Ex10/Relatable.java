public interface Relatable {
        
   // this (object calling isLargerThan) and^M
   // other must be instances of the same class^M
   // returns 1, 0, -1 if this is greater^M
   // than, equal to, or less than other^M
   public int isLargerThan(Relatable other);
   
}
