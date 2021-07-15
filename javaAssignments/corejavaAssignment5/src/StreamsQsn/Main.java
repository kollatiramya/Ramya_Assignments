package StreamsQsn;
import java.util.stream.Collectors;  
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fru = Arrays.asList(
			new Fruit("apple",20,50,"red"),
		    new Fruit("mango",500,100,"yellow"),
		    new Fruit("orange",300,300,"orange"),
		    new Fruit("guava",600,150,"green"),
		    new Fruit("banana",50,1000,"yellow"),
		    new Fruit("strawberry",30,300,"red"));
		
		System.out.println("1.calories <100 sorted in descending order");
		fru.stream().filter(p -> p.getCalories() < 100).sorted(Comparator.comparing(Fruit::getCalories).reversed())
        .forEach(System.out::println);
       
		System.out.println("2.according to fruit color");
		 fru.stream().sorted(Comparator.comparing(Fruit::getColor))
         .forEach(System.out::println);
	   
		System.out.println("3.only red color sorted on price ascending order");
		fru.stream().filter(p -> p.getColor().equals("red")).sorted(Comparator.comparing(Fruit::getPrice))
        .forEach(System.out::println);
		
		
				List<News> News = Arrays.asList(
						new News(1,"ramya","anusha","budget"),
						new News(1,"ramya","chinna","buget"),
						new News(2,"anusha","ramya","i am happy to assign the budget"),
						new News(2,"anusha","chinna","i am happy"));
			
		System.out.println("4.Find out the newsId which has received maximum comments");
				int  p=News.stream()
						.min((p1,p2)-> {
							return (int) p1.getNewsId()+p2.getNewsId();
							}).get().getNewsId();
					 System.out.println(p);
					 
		System.out.println("5.Find out how many times the word 'budget' arrived in user comments all news");
					 News.stream()
						.filter(t->t.comment.contains("budget"))
						.forEach(t->System.out.println(t)); 
					 
		System.out.println("6.Find out which user has posted maximum comments");
					 String  n=News.stream()
						.max((p1,p2)-> {
							return (int) p1.getCommentByUser().compareTo(p2.getCommentByUser());
							}).get().getCommentByUser();
					 	System.out.println(n);
					 	
		System.out.println("7.Display commentByUser wise number of comments");
					 News.stream()
						.sorted((p1,p2)->p1.getCommentByUser().compareTo(p2.getCommentByUser()))
						.collect(Collectors.toList())
						.forEach(t->System.out.println(t.commentByUser+"="+t.comment));
						
			  Trader ramya = new Trader("ramya", "andhra");
				        Trader anusha = new Trader("anusha","delhi");
				        Trader chinna = new Trader("chinna","indore");
				        Trader vicky = new Trader("vicky","pune");
				        Trader dolly = new Trader("dolly","pune");
				      
			  List<Transaction> transactions = Arrays.asList(
				                new Transaction(vicky, 2001, 216), 
				                new Transaction(ramya, 2006, 550),
				                new Transaction(ramya, 2001, 500),
				                new Transaction(anusha, 2006, 660),	
				                new Transaction(anusha, 2006, 700),
				                new Transaction(dolly, 2020, 150),
				                new Transaction(chinna, 2006, 920));
	     System.out.println("8.Find all transactions from year 2001 and sort them by value (small to high)");
				        List<Transaction> tr2001 = transactions.stream()
				                                               .filter(transaction -> transaction.getYear() == 2001)
				                                               .sorted(comparing(Transaction::getValue))
				                                               .collect(toList());
				        System.out.println(tr2001);
				        
		 System.out.println("9.What are all the unique cities where the traders work");
				        List<String> cities = 
				            transactions.stream()
				                        .map(transaction -> transaction.getTrader().getCity())
				                        .distinct()
				                        .collect(toList());
				        System.out.println(cities);

		 System.out.println("10.Find all traders from pune and sort them by name");
				        
				        List<Trader> traders = 
				            transactions.stream()
				                        .map(Transaction::getTrader)
				                        .filter(trader -> trader.getCity().equals("pune"))
				                        .distinct()
				                        .sorted(comparing(Trader::getName))
				                        .collect(toList());
				        System.out.println(traders);
				        
				        
		 System.out.println("11.Return a string of all traders’ names sorted alphabetically");
				        
				        String traderStr = 
				            transactions.stream()
				                        .map(transaction -> transaction.getTrader().getName())
				                        .distinct()
				                        .sorted()
				                        .reduce("", (n1, n2) -> n1 + n2);
				        System.out.println(traderStr);
				        
	    System.out.println("12.Are there any trader based in indore");
				        
				        boolean BhemavaramBased =
				            transactions.stream()
				                        .anyMatch(transaction -> transaction.getTrader()
				                                                            .getCity()
				                                                            .equals("Bhemavaram")
				                                 );
				        System.out.println(BhemavaramBased);
				        
	    System.out.println("13.print all transactions living in delhi");
				        
				        boolean indoreBased =
				                transactions.stream()
				                            .anyMatch(transaction -> transaction.getTrader()
				                                                                .getCity()
				                                                                .equals("indore")
				                                     );
				            System.out.println(indoreBased);
				        
				       
				        
	   System.out.println("14.What's the highest value in all the transactions");
				        int highestValue = 
				            transactions.stream()
				                        .map(Transaction::getValue)
				                        .reduce(0, Integer::max);
				        System.out.println(highestValue);   
				        
	  System.out.println("15.What's the lowest value in all the transactions");
				        int lowestValue = 
				                transactions.stream()
				                            .map(Transaction::getValue)
				                            .reduce(550, Integer::min);
				            System.out.println(lowestValue);      
				    }
				

			}
