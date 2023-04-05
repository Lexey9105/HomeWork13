public class HomeWork13 {
    public static void main (String [] args){
        Author venYerofeyev=new Author("Ерофеев","Венедикт");
        Book mskPetushki=new  Book("Москва-Петушки",venYerofeyev,1970);

        mskPetushki.setPublisher(1988);
        System.out.println("mskPetushki.getpublisher() = " + mskPetushki.getPublisher());

        Author Andreyev=new Author("Андреев","Леонид");
        Book judasIscariot=new Book("Иуда Искариот",Andreyev,1907);

        System.out.println("mskPetushki.getWriter() = " + mskPetushki.getAuthor());

        System.out.println(venYerofeyev.toString());
        System.out.println(mskPetushki.toString());
        System.out.println(Andreyev.toString());
        System.out.println(judasIscariot.toString());
    }
}
