import java.util.*;
public class browserhistorysimulator {
   private  LinkedList <String>  ll =new LinkedList<>();
   private  ListIterator<String> litr=ll.listIterator();
   private  String currPage=null;
    void visitPage(String url){
        while(litr.hasNext()){
            litr.next();
            litr.remove();
        }
        litr.add(url);
        currPage=url;
        System.out.println("Visited :"+url);
    }
    void goBack(){
        if(litr.hasPrevious()){
            currPage=litr.previous();
            System.out.println("Back to : "+currPage);
        }
        else{
            System.out.println("No previous page exists.");
        }
    }
    void goForward(){
        if(litr.hasNext()){
            currPage=litr.next();
            System.out.println("Forward to : "+currPage);
        }
        else{
            System.out.println("No forward page Exists");
        }
    }
    void showCurrentPage(){
        if(currPage==null){
         System.out.println("No page visited yet.");
        }
        else{
     System.out.println("Current Page : "+currPage);
    }}
    public static void main(String[] args){
        browserhistorysimulator browser=new browserhistorysimulator();
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("*************************");
        System.out.println("Mini Project - Browser History Simulation");
        System.out.println("*************************");
System.out.println("\n---------Browser Menu--------");
System.out.println("1.Visit new Page");
System.out.println("2.Go Back");
System.out.println("3.Go Forward");
System.out.println("4.Show Current Page");
System.out.println("5.Exit");


System.out.println("Enter your Choice");
int choice =sc.nextInt();
sc.nextLine();
switch(choice){
    case 1:
        System.out.println("Enter URL:");
        String url=sc.nextLine();
        browser.visitPage(url);
        break;
    case 2:
        browser.goBack();
        break;
    case 3:
        browser.goForward();
        break;
    case 4:
        browser.showCurrentPage();
        break;
    case 5:
        System.out.println("Existing Browser.....");
        return;
    default:
        System.out.println("Invalid choice.... please") ; 
}
}
}}
