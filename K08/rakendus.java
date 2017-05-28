


public class rakendus{

	public static void main(String [] arg){
		double alus = 20;
		double korgus = 23;
		double kKorgus = 23;
		pyramiid p3 = new pyramiid(alus, korgus, kKorgus);
		System.out.println(p3.pohjaPindala() + " - Pohjapindala " + p3.kuljePindala() + " - Kuljepindala " + p3.ruumala() + " - Ruumala");
		
	}
}
//scl enable rh-maven33 bash
//mvn package
//java -Dserver.port=4545 -jar target/app1.jar
//http://greeny.cs.tlu.ee:4545/tervita?eesnimi=Juku