package final1;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "Nemnem");
        member.print();
        member.changeData("myId2", "Nemnem2");
        member.print();
    }
}
