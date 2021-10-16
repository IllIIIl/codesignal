int centuryFromYear(int year) {
    if(year >= 100 && year % 100 != 0){
        int century = (year / 100) + 1;
        return century;
    }else if(year >= 100 && year % 100 == 0){
        int century = (year / 100);
        return century;
    }else{
        int century = 1;
        return century;
    }
}