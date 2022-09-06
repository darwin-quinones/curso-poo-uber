class Card extends Payment{
    Integer number ;
    Integer cvv;
    String date;


    public Card(Integer id, Integer number, Integer cvv, String Date){
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = Date;
        
    }

}
