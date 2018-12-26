package bank41;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;
	MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}
	
	@Override
	public void join(String id, String name, 
			String ssn, String pass) {
		MemberBean memberBean = new MemberBean();
		memberBean.setId(id);
		memberBean.setName(name);
		memberBean.setSsn(ssn);
		memberBean.setPass(pass);
		members[count] = memberBean;
		count++;
	}

	@Override
	public MemberBean[] list() {
		return members;
	}

	@Override
	public MemberBean find(String id) {
		MemberBean memberBean = new MemberBean();
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)){
				memberBean = members[i];
			}
		}
		
		return memberBean;
	}

	@Override
	public boolean login(String id, String pass) {
		boolean ok = false;
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id) && 
					members[i].getPass().equals(pass)) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(String id, String pass, String newpass) {
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				members[i].setPass(newpass);
				break;
			}		
		} 
	}

	@Override
	public void delete(String id, String pass) {
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				
				System.out.println("값 : "+members[i]);
				System.err.println("카운터: "+count);
				break;
			}
		}
		
	}
	
	

}
