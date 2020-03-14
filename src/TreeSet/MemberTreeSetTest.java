package TreeSet;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(300,"lee");
		Member memberKim = new Member(100,"kim");
		Member memberPark = new Member(200, "park");
		
		manager.addMember(memberPark);
		manager.addMember(memberKim);
		manager.addMember(memberLee);
		
		manager.showAllMember();
	}
	
}
